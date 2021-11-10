# Gr4vy SDK for Java

Gr4vy provides any of your payment integrations through one unified API. For
more details, visit [gr4vy.com](https://gr4vy.com).

## Installation

```java
<dependency>
    <groupId>com.gr4vy</groupId>
    <artifactId>gr4vy_sdk</artifactId>
    <version>0.1.0</version>
</dependency>
```

## Getting Started

To make your first API call, you will need to [request](https://gr4vy.com) a
Gr4vy instance to be set up. Please contact our sales team for a demo.

Once you have been set up with a Gr4vy account you will need to head over to the
**Integrations** panel and generate a private key. We recommend storing this key
in a secure location but in this code sample we simply read the file from disk.

Import Gr4vy:
```java
import com.gr4vy.sdk.*;
import com.gr4vy.api.ApiException;
import com.gr4vy.api.model.*;
import com.gr4vy.api.openapi.BuyersApi;
```

Call the API:
```java
	Gr4vyClient gr4vyClient = new Gr4vyClient("[YOUR_GR4VY_ID]", "private_key.pem");
	BuyersApi apiInstance = new BuyersApi(gr4vyClient.getClient());

	try {
		Buyers result = apiInstance.listBuyers("", 20, "");
		System.out.println(result);
	} catch (ApiException e) {
		System.err.println("Exception when calling BuyersApi#listBuyers");
		System.err.println("Status code: " + e.getCode());
		System.err.println("Reason: " + e.getResponseBody());
		System.err.println("Response headers: " + e.getResponseHeaders());
	}
```

## Gr4vy Embed

To create a token for Gr4vy Embed, call the `client.getEmbedToken(embed)`
function with the amount, currency, and optional buyer information for Gr4vy
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
	BuyersApi apiInstance = new BuyersApi(gr4vyClient.getClient());
	BuyerRequest buyer = new BuyerRequest();
	buyer.setDisplayName("Tester T.");
	try {
		Buyer result = apiInstance.addBuyer(buyer);
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
  
```

To create, the API requires a request object for that resource that is conventiently
named `Gr4vy<Resource>Request`.  To update, the API requires a request object
for that resource that is named `Gr4vy<Resource>Update`.

For example, to create a buyer you will need to pass a `Gr4vyBuyerRequest` object to
the `AddBuyer` method.

```java
  
```

So to update a buyer you will need to pass in the `Gr4vyBuyerUpdate` to the
`UpdateBuyer` method.

```java
  
```

## Response

Every resolved API call returns the requested resource, a `*http.Response`
object from the "net/http" package and an `error` object.


```java
  
```

## Logging & Debugging

The SDK makes it easy possible to the requests and responses to the console.

```java
  
```

This will output the request parameters and response to the console as follows.

```sh

```

## Development

### Adding new APIs

To add new APIs, run the following command to update the models and APIs based
on the API spec.

```sh
./openapi-generator-generate.sh
```

Next, update `sdk_<object_name>.go` to bind any new APIs or remove any APIs that are no
longer available.

Run the tests to ensure the changes do not break any existing tests.

```sh
mvn test
```

### Publishing



## License

This library is released under the [MIT License](LICENSE).
