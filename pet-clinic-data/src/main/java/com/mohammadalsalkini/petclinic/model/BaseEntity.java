package com.mohammadalsalkini.petclinic.model;

import java.io.Serializable;

/**
 * @author Mohammad Alsalkini
 * @project pet-clinic
 * @created 17.04.2020 - 17:42
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
