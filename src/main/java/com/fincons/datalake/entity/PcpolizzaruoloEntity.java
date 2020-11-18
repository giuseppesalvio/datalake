package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pcpolizzaruolo", schema = "datalake", catalog = "")
@IdClass(PcpolizzaruoloEntityPK.class)
public class PcpolizzaruoloEntity {
    private int idpolizza;
    private int idruolo;
    private int nverinizio;
    private Integer nverfine;
    private BigInteger bbene;

    @Id
    @Column(name = "IDPOLIZZA")
    public int getIdpolizza() {
        return idpolizza;
    }

    public void setIdpolizza(int idpolizza) {
        this.idpolizza = idpolizza;
    }

    @Id
    @Column(name = "IDRUOLO")
    public int getIdruolo() {
        return idruolo;
    }

    public void setIdruolo(int idruolo) {
        this.idruolo = idruolo;
    }

    @Basic
    @Column(name = "NVERINIZIO")
    public int getNverinizio() {
        return nverinizio;
    }

    public void setNverinizio(int nverinizio) {
        this.nverinizio = nverinizio;
    }

    @Basic
    @Column(name = "NVERFINE")
    public Integer getNverfine() {
        return nverfine;
    }

    public void setNverfine(Integer nverfine) {
        this.nverfine = nverfine;
    }

    @Basic
    @Column(name = "BBENE")
    public BigInteger getBbene() {
        return bbene;
    }

    public void setBbene(BigInteger bbene) {
        this.bbene = bbene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcpolizzaruoloEntity that = (PcpolizzaruoloEntity) o;

        if (idpolizza != that.idpolizza) return false;
        if (idruolo != that.idruolo) return false;
        if (nverinizio != that.nverinizio) return false;
        if (nverfine != null ? !nverfine.equals(that.nverfine) : that.nverfine != null) return false;
        if (bbene != null ? !bbene.equals(that.bbene) : that.bbene != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpolizza;
        result = 31 * result + idruolo;
        result = 31 * result + nverinizio;
        result = 31 * result + (nverfine != null ? nverfine.hashCode() : 0);
        result = 31 * result + (bbene != null ? bbene.hashCode() : 0);
        return result;
    }
}
