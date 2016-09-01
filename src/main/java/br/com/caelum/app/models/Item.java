package br.com.caelum.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Item implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private Long id;

    @ManyToOne
    private Invoice invoice;

    @ManyToOne
    private Product product;

    private Integer quantity;

    private Double price;

    public Long getId() {
        return this.id;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public Double getPrice() {
        return this.price;
    }

    public Product getProduct() {
        return this.product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Double getTotal() {

        if ((this.quantity != null) && (this.price != null)) {
            return this.quantity * this.price;
        }

        return null;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setInvoice(final Invoice invoice) {
        this.invoice = invoice;
    }

    public void setPrice(final Double price) {
        this.price = price;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }
}
