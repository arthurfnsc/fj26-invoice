package br.com.caelum.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Product implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private Long id;

    private String name;

    private String description;

    private Double price;

    public final Long getId() {
        return this.id;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(final String description) {
        this.description = description;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final void setPrice(final Double price) {
        this.price = price;
    }
}
