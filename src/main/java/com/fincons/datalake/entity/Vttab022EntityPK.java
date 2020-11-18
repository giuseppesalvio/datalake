package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Vttab022EntityPK implements Serializable {
    private int t022Codsoc;
    private String t022Categoria;
    private String t022Agenzia;
    private int t022NumColl;
    private int t022NumPolizza;

    @Column(name = "T022_CODSOC")
    @Id
    public int getT022Codsoc() {
        return t022Codsoc;
    }

    public void setT022Codsoc(int t022Codsoc) {
        this.t022Codsoc = t022Codsoc;
    }

    @Column(name = "T022_CATEGORIA")
    @Id
    public String getT022Categoria() {
        return t022Categoria;
    }

    public void setT022Categoria(String t022Categoria) {
        this.t022Categoria = t022Categoria;
    }

    @Column(name = "T022_AGENZIA")
    @Id
    public String getT022Agenzia() {
        return t022Agenzia;
    }

    public void setT022Agenzia(String t022Agenzia) {
        this.t022Agenzia = t022Agenzia;
    }

    @Column(name = "T022_NUM_COLL")
    @Id
    public int getT022NumColl() {
        return t022NumColl;
    }

    public void setT022NumColl(int t022NumColl) {
        this.t022NumColl = t022NumColl;
    }

    @Column(name = "T022_NUM_POLIZZA")
    @Id
    public int getT022NumPolizza() {
        return t022NumPolizza;
    }

    public void setT022NumPolizza(int t022NumPolizza) {
        this.t022NumPolizza = t022NumPolizza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab022EntityPK that = (Vttab022EntityPK) o;
        return t022Codsoc == that.t022Codsoc &&
                t022NumColl == that.t022NumColl &&
                t022NumPolizza == that.t022NumPolizza &&
                Objects.equals(t022Categoria, that.t022Categoria) &&
                Objects.equals(t022Agenzia, that.t022Agenzia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t022Codsoc, t022Categoria, t022Agenzia, t022NumColl, t022NumPolizza);
    }
}
