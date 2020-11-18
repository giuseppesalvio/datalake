package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;


public class PasoggettoEntityPK implements Serializable {
    private int idsoggetto;
    private int iddatisingoli;

    @Column(name = "IDSOGGETTO")
    @Id
    public int getIdsoggetto() {
        return idsoggetto;
    }

    public void setIdsoggetto(int idsoggetto) {
        this.idsoggetto = idsoggetto;
    }

    @Column(name = "IDDATISINGOLI")
    @Id
    public int getIddatisingoli() {
        return iddatisingoli;
    }

    public void setIddatisingoli(int iddatisingoli) {
        this.iddatisingoli = iddatisingoli;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasoggettoEntityPK that = (PasoggettoEntityPK) o;

        if (idsoggetto != that.idsoggetto) return false;
        if (iddatisingoli != that.iddatisingoli) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsoggetto;
        result = 31 * result + iddatisingoli;
        return result;
    }
}
