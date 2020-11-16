package com.fincons.datalake.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Vttab024EntityPK implements Serializable {
    private int t024Codsoc;
    private String t024Categoria;
    private String t024Agenzia;
    private int t024NumColl;
    private int t024NumPolizza;
    private short t024Posizione;

    @Column(name = "T024_CODSOC")
    @Id
    public int getT024Codsoc() {
        return t024Codsoc;
    }

    public void setT024Codsoc(int t024Codsoc) {
        this.t024Codsoc = t024Codsoc;
    }

    @Column(name = "T024_CATEGORIA")
    @Id
    public String getT024Categoria() {
        return t024Categoria;
    }

    public void setT024Categoria(String t024Categoria) {
        this.t024Categoria = t024Categoria;
    }

    @Column(name = "T024_AGENZIA")
    @Id
    public String getT024Agenzia() {
        return t024Agenzia;
    }

    public void setT024Agenzia(String t024Agenzia) {
        this.t024Agenzia = t024Agenzia;
    }

    @Column(name = "T024_NUM_COLL")
    @Id
    public int getT024NumColl() {
        return t024NumColl;
    }

    public void setT024NumColl(int t024NumColl) {
        this.t024NumColl = t024NumColl;
    }

    @Column(name = "T024_NUM_POLIZZA")
    @Id
    public int getT024NumPolizza() {
        return t024NumPolizza;
    }

    public void setT024NumPolizza(int t024NumPolizza) {
        this.t024NumPolizza = t024NumPolizza;
    }

    @Column(name = "T024_POSIZIONE")
    @Id
    public short getT024Posizione() {
        return t024Posizione;
    }

    public void setT024Posizione(short t024Posizione) {
        this.t024Posizione = t024Posizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab024EntityPK that = (Vttab024EntityPK) o;
        return t024Codsoc == that.t024Codsoc &&
                t024NumColl == that.t024NumColl &&
                t024NumPolizza == that.t024NumPolizza &&
                t024Posizione == that.t024Posizione &&
                Objects.equals(t024Categoria, that.t024Categoria) &&
                Objects.equals(t024Agenzia, that.t024Agenzia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t024Codsoc, t024Categoria, t024Agenzia, t024NumColl, t024NumPolizza, t024Posizione);
    }
}
