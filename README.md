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
	    <version>0.16.5</version>
	</dependency>
```

## Getting Started

To make your first API call, you will need to [request](https://gr4vy.com) a
Gr4vy instance to be set up. Please contact our sales team for a demo. Please ensure 
that you have the latest version of com.squareup.okhttp3

Once you have been set up with a Gr4vy account you will need to head over to the
**Integrations** panel and generate a private key. We recommend storing this key
in a secure location but in this code sample we simply read the file from disk.

Import Gr4vy:
```java
import com.gr4vy.sdk.*;
import com.gr4vy.api.model.*;
```

Call the API:
```java
	Gr4vyClient gr4vyClient = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem");

	try {
		Buyers result = gr4vyClient.listBuyers(null, null, null);
		System.out.println(result);
	} catch (Gr4vyException e) {
		System.err.println("Exception when calling BuyersApi#listBuyers");
		System.err.println("Status code: " + e.getCode());
		System.err.println("Reason: " + e.getResponseBody());
		System.err.println("Response headers: " + e.getResponseHeaders());
	}
```

## Environment

The SDK defaults the environment to "sandbox", to send transactions to production, set the environment in `Gr4vyClient`:

```java

Gr4vyClient gr4vyClient = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem", "sandbox");

Gr4vyClient gr4vyClient = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem", "production");

```

## Multi merchant

In a multi-merchant environment, the merchant account ID can be set after the SDK has been initialized.

```java
gr4vyClient.setMerchantAccountId("my-account-id"); // defaults to `default`
```

## Gr4vy Embed

To create a token for Gr4vy Embed, call the `client.getEmbedToken(embed)`
function with the amount, currency, and optional checkout session and optional buyer information for Gr4vy
Embed.

```java
	Gr4vyClient client = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem");
			
	Map<String, Object> embed = new HashMap<String, Object>();
	embed.put("amount", 1299);
	embed.put("currency", "USD");

	String token = client.getEmbedToken(embed);
```

You can now pass this token to your frontend where it can be used to
authenticate Gr4vy Embed.

The `buyer_id` and/or `buyer_external_identifier` fields can be used to allow
the token to pull in previously stored payment methods for a user. A buyer
needs to be created before it can be used in this way.

```java
	Gr4vyClient gr4vyClient = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem");
	
	BuyerRequest buyer = new BuyerRequest();
	buyer.setDisplayName("Tester T.");
	try {
		Buyer result = gr4vyClient.newBuyer(buyer);
		System.out.println(result);
	} catch (ApiException e) {
		
	}
```

## Initialization

The client can be initialized with the Gr4vy ID (`gr4vyId`) and the location of your
private key string.

```java
  Gr4vyClient gr4vyClient = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem");
```

Alternatively, instead of the `gr4vyId` it can be initialized with the `baseUrl`
of the server to use directly.

```java
  Gr4vyClient gr4vyClient = new Gr4vyClient("acme", "private_key.pem");
  gr4vyClient.setHost("https://api.acme.gr4vy.app")
```

Your API private key can be created in your admin panel on the **Integrations**
tab.


## Making API calls

This library conveniently maps every API path to a seperate function. For
example, `GET /buyers?limit=100` would be:

```java
	String search = null;
	Integer limit = 100;
	String cursor = null;
	Buyers response = client.listBuyers(search, limit, cursor);
```

To create, the API requires a request object for that resource that is conventiently
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
