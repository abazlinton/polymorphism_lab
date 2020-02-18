Model an `OnlineAccount` used by a business to charge customers and keep track of transaction costs via `ReportingSoftware`. Different cards incur different costs imposed by the issuer

- `CreditCard`
- `DebitCards`
- `LoyaltyCard`

<hr>

- Perhaps one or more of these cards could inherit from a `PaymentCard`?    
- In order to have the flexibility to charge, and maintain a list of these different types of card, perhaps there should be a `IChargeable` Interface to support charging and logging transactions.

<hr>


### IChargeable

```java
    double getTransactionCost(double transactionAmount);
    void charge(double transactionAmount);
```

### PaymentCard
#### Abstract class `implements IChargeable`
- `cardNumber`
- `expiryDate`
- `securityNumber`
- `charges`
- Charging implies updating the list of `charges`

### CreditCard
#### Concrete class `extends PaymentCard`
- `customerRiskMultiplier`
- `creditLimit`

- Charging implies reducing the credit limit
- Should be able calculate transaction cost of 2% and account for `customerRiskMultiplier`

### DebitCard
#### Concrete class `extends PaymentCard`
- `sortCode`
- `accountNumber`

- Should be able calculate transaction cost of 1%
- Charging has no implementation (left to superclass)

### LoyaltyCard
#### Concrete class - no Superclass, `implements IChargeable`
- `vendor`
- `balance`

- Charging implies reducing the balance
- The transaction cost is zero

### OnlineAccount
#### Concrete class - no relation to other classes
- `name`
- `paymentMethods`
- `reportingSoftware`

- Should be able to `chargeCustomer` via a selected `paymentMethod` and tell the `reportingSoftware` to log the cost of the transaction




