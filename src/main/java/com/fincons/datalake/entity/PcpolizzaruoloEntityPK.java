package com.fincons.datalake.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PcpolizzaruoloEntityPK implements Serializable {
    private int idpolizza;
    private int idruolo;

    @Column(name = "IDPOLIZZA")
    @Id
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Column(name = "IDRUOLO")
    @Id
    public int getIdruolo() {
        return idruolo;
    }

    public void setIdruolo(int idruolo) {
        this.idruolo = idruolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcpolizzaruoloEntityPK that = (PcpolizzaruoloEntityPK) o;

        if (idpolizza != that.idpolizza) return false;
        if (idruolo != that.idruolo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpolizza;
        result = 31 * result + idruolo;
        return result;
    }
}
