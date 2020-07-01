package org.restop.sample;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Label extends PanacheEntity {

    public String key;
    public String value;

    public Label() {
    }
}
