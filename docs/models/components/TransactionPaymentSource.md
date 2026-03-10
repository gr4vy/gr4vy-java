# TransactionPaymentSource

The way payment method information made it to this transaction.

## Example Usage

```java
import com.gr4vy.sdk.models.components.TransactionPaymentSource;

TransactionPaymentSource value = TransactionPaymentSource.ECOMMERCE;

// Open enum: use .of() to create instances from custom string values
TransactionPaymentSource custom = TransactionPaymentSource.of("custom_value");
```


## Values

| Name           | Value          |
| -------------- | -------------- |
| `ECOMMERCE`    | ecommerce      |
| `MOTO`         | moto           |
| `RECURRING`    | recurring      |
| `INSTALLMENT`  | installment    |
| `CARD_ON_FILE` | card_on_file   |