# Gr4vy SDK for Java

Gr4vy provides any of your payment integrations through one unified API. For
more details, visit [gr4vy.com](https://gr4vy.com).

## Installation

```java

```

## Getting Started

To make your first API call, you will need to [request](https://gr4vy.com) a
Gr4vy instance to be set up. Please contact our sales team for a demo.

Once you have been set up with a Gr4vy account you will need to head over to the
**Integrations** panel and generate a private key. We recommend storing this key
in a secure location but in this code sample we simply read the file from disk.

```java

```

## Gr4vy Embed

To create a token for Gr4vy Embed, call the `client.GetEmbedToken(embed)`
function with the amount, currency, and optional buyer information for Gr4vy
Embed.

```java

```

You can now pass this token to your frontend where it can be used to
authenticate Gr4vy Embed.

The `buyer_id` and/or `buyer_external_identifier` fields can be used to allow
the token to pull in previously stored payment methods for a user. A buyer
needs to be created before it can be used in this way.

```java

```

## Initialization

The client can be initialized with the Gr4vy ID (`gr4vyId`) and the private key
string.

```java
  
```

Alternatively, instead of the `gr4vyId` it can be initialized with the `baseUrl`
of the server to use directly.

```java
  
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
