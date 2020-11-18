package com.fincons.datalake.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PcversioneEntityPK implements Serializable {
    private int idpolizza;
    private int nverinizio;
    private int nverfine;
    private int idpvgestione;
    private int etipocoass;

    @Column(name = "IDPOLIZZA")
    @Id
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Column(name = "NVERINIZIO")
    @Id
    public int getNverinizio() {
        return nverinizio;
    }

    public void setNverinizio(int nverinizio) {
        this.nverinizio = nverinizio;
    }

    @Column(name = "NVERFINE")
    @Id
    public int getNverfine() {
        return nverfine;
    }

    public void setNverfine(int nverfine) {
        this.nverfine = nverfine;
    }

    @Column(name = "IDPVGESTIONE")
    @Id
    public int getIdpvgestione() {
        return idpvgestione;
    }

    public void setIdpvgestione(int idpvgestione) {
        this.idpvgestione = idpvgestione;
    }

    @Column(name = "ETIPOCOASS")
    @Id
    public int getEtipocoass() {
        return etipocoass;
    }

    public void setEtipocoass(int etipocoass) {
        this.etipocoass = etipocoass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcversioneEntityPK that = (PcversioneEntityPK) o;

        if (idpolizza != that.idpolizza) return false;
        if (nverinizio != that.nverinizio) return false;
        if (nverfine != that.nverfine) return false;
        if (idpvgestione != that.idpvgestione) return false;
        if (etipocoass != that.etipocoass) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpolizza;
        result = 31 * result + nverinizio;
        result = 31 * result + nverfine;
        result = 31 * result + idpvgestione;
        result = 31 * result + etipocoass;
        return result;
    }
}
