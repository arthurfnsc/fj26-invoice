package br.com.caelum.app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Invoice implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private Long id;

    private String cnpj;

    @Temporal(TemporalType.DATE)
    private Calendar date = Calendar.getInstance();

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "invoice")
    private List<Item> items = new ArrayList<>();

    public void addItem(final Item item) {
        this.items.add(item);
    }

    public final String getCnpj() {
        return this.cnpj;
    }

    public final Calendar getDate() {
        return this.date;
    }

    public final Long getId() {
        return this.id;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final void setCnpj(final String cnpj) {
        this.cnpj = cnpj;
    }

    public final void setDate(final Calendar date) {
        this.date = date;
    }

    public final void setId(final Long id) {
        this.id = id;
    }

    public final void setItems(final List<Item> items) {
        this.items = items;
    }
}
