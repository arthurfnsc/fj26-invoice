package br.com.caelum.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {

    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private Long id;

    private String username;
    private String password;

    public final Long getId() {
        return this.id;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getPassword() {
        return this.password;
    }

    public final void setUsername(final String username) {
        this.username = username;
    }

    public final void setPassword(final String password) {
        this.password = password;
    }
}
