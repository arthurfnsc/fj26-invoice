package br.com.caelum.app.models;

public class Stock {

    private final Long amount;
    private final Product product;

    public Stock(final Long amount, final Product product) {

        this.product = product;
        this.amount = amount;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final Product getProduct() {
        return this.product;
    }
}
