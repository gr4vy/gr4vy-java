# Gr4vy SDK for Java

Gr4vy provides any of your payment integrations through one unified API. For
more details, visit [gr4vy.com](https://gr4vy.com).

## Installation

Add the jitpack.io repository to your pom.xml:
```java
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
```
Add the `gr4vy-java` dependency to your pom.xml:
```java
  	<dependency>
	    <groupId>com.github.gr4vy</groupId>
	    <artifactId>gr4vy-java</artifactId>
	    <version>0.31.0</version>
	</dependency>
```

## Getting Started

To make your first API call, you will need to [request](https://gr4vy.com) a
Gr4vy instance to be set up. Please contact our sales team for a demo. Please ensure 
that you have the latest version of com.squareup.okhttp3.

Once you have been set up with a Gr4vy account you will need to head over to the
**Integrations** panel and generate a private key. We recommend storing this key
in a secure location but in this code sample we simply read the file from disk.

Due to a restriction in Java 17+ the EC public key must first be generated from the private key by running:
```
openssl ec -in private_key.pem -pubout -out public_key.pem
``` 

Import Gr4vy:
```java
import com.gr4vy.sdk.*;
import com.gr4vy.api.model.*;
```

Call the API:
```java
	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]")
				.privateKeyLocation("private_key.pem")
				.publicKeyLocation("public_key.pem")
				.build();

	try {
		Buyers result = gr4vyClient.listBuyers(null, null, null);
		System.out.println(result);
	} catch (Gr4vyException e) {
		System.err.println("Exception when calling Gr4vyClient#listBuyers");
		System.err.println("Status code: " + e.getCode());
		System.err.println("Reason: " + e.getResponseBody());
		System.err.println("Response headers: " + e.getResponseHeaders());
	}
```

## Environment

The SDK defaults the environment to "sandbox", to send transactions to production, set the environment in `Gr4vyClient`:

```java

	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]")
				.privateKeyLocation("private_key.pem")
				.publicKeyLocation("public_key.pem")
				.environment("sandbox")
				.build();

	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]")
				.privateKeyLocation("private_key.pem")
				.publicKeyLocation("public_key.pem")
				.environment("production")
				.build();

```

## Multi merchant

In a multi-merchant environment, the merchant account ID can be set after the SDK has been initialized.

```java
	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]")
				.privateKeyLocation("private_key.pem")
				.publicKeyLocation("public_key.pem")
				.merchantAccountId("default")
				.build();
```

## Gr4vy Embed

To create a token for Gr4vy Embed, call the `client.getEmbedToken(embed)`
function with the amount, currency, and optional checkout session and optional buyer information for Gr4vy
Embed.

```java
	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]")
				.privateKeyLocation("private_key.pem")
				.publicKeyLocation("public_key.pem")
				.build();
			
	Map<String, Object> embed = new HashMap<String, Object>();
	embed.put("amount", 1299);
	embed.put("currency", "USD");

	String token = client.getEmbedToken(embed);
```

You can now pass this token to your front-end where it can be used to
authenticate Gr4vy Embed.

The `buyer_id` and/or `buyer_external_identifier` fields can be used to allow
the token to pull in previously stored payment methods for a user. A buyer
needs to be created before it can be used in this way.

```java
	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]")
				.privateKeyLocation("private_key.pem")
				.publicKeyLocation("public_key.pem")
				.build();
	
	BuyerRequest buyer = new BuyerRequest();
	buyer.setDisplayName("Tester T.");
	try {
		Buyer result = gr4vyClient.newBuyer(buyer);
		System.out.println(result);
	} catch (ApiException e) {
		
	}
```

## Builder

The Gr4vy client can be initialized with the `Gr4vyClient.Builder`.
The following fields can be optionally set using the builder:

```java
  	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]") // required
				.privateKeyLocation("private_key.pem") // conditional
				.privateKeyString("-----BEGIN PRIVATE KEY-----\n...") // conditional
				.publicKeyLocation("public_key.pem") // conditional
				.publicKeyString("-----BEGIN PUBLIC KEY-----\n...") // conditional
				.environment("sandbox") // optional, defaults to sandbox
				.host(null) // optional - allows setting a custom host
				.client(null) // optional - allows setting the http client
				.merchantAccountId("default") // optional, defaults to default
				.connectTimeout(Duration.ofSeconds(10)) // optional, defaults to 10s
				.writeTimeout(Duration.ofSeconds(10)) // optional, defaults to 10s
				.readTimeout(Duration.ofSeconds(30)) // optional, defaults to 30s
				.build();
```

## Setting Private Key

Your API private key can be created in your admin panel on the **Integrations**
tab.

There are three methods of setting the private key when using the SDK:

1. Setting the `privateKeyLocation`, which is a path to the location of the pem file
	e.g. 
	```java
		Gr4vyClient client = new Gr4vyClient.Builder()
			.gr4vyId("[YOUR_GR4VY_ID]")
			.privateKeyLocation("./path/to/private_key.pem")
			.build();
	```
2. Setting the `privateKeyString` to the value of the private key
	e.g. 
	```java
		Gr4vyClient client = new Gr4vyClient.Builder()
			.gr4vyId("[YOUR_GR4VY_ID]")
			.privateKeyString("-----BEGIN PRIVATE KEY-----\n...")
			.build();
	```
3. Setting the environment variable `PRIVATE_KEY`


## Making API calls

This library conveniently maps every API path to a separate function. For
example, `GET /buyers?limit=2` would be:

```java
	Map<String, Object> params = new HashMap<String, Object>();
    params.put("limit", 2);
	Buyers response = client.listBuyers(params);
```

To create, the API requires a request object for that resource that is conveniently
named `<Resource>Request`.  To update, the API requires a request object
for that resource that is named `<Resource>Update`.

For example, to create a buyer you will need to pass a `BuyerRequest` object to
the `addBuyer` method.

```java
	BuyerRequest buyer = new BuyerRequest();
	buyer.setDisplayName("Tester T.");
	Buyer result = client.addBuyer(buyer);
```

So to update a buyer you will need to pass in the `BuyerUpdate` object to the
`updateBuyer` method.

```java
	BuyerUpdate buyer = new BuyerUpdate();
	buyer.setDisplayName("Tester T.");
	Buyer result = client.updateBuyer(buyerId, buyer);
```

## Generating an API Token for calls outside the SDK

You can also use the SDK to generate a stand-alone API Token by calling the `getToken` method:

```java
	Gr4vyClient client = new Gr4vyClient.Builder()
			.gr4vyId("[YOUR_GR4VY_ID]")
			.privateKeyString("-----BEGIN PRIVATE KEY-----\n...")
			.build();
	String[] scopes = {"*.read", "*.write"};
	String token = client.getToken(scopes);
```

## Development

### Updating models

To update API models, run the following command:

```sh
./openapi-generator-generate.sh
```

Run the tests to ensure the changes do not break any existing tests.

```sh
mvn test
```

### Publishing

This library is published using Maven.

## License

This library is released under the [MIT License](LICENSE).
