package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pcruolo", schema = "datalake", catalog = "")
public class PcruoloEntity {
    private int idruolo;
    private Integer cruolo;
    private Integer idsoggettolock;

    @Id
    @Column(name = "IDRUOLO")
    public int getIdruolo() {
        return idruolo;
    }

    public void setIdruolo(int idruolo) {
        this.idruolo = idruolo;
    }

    @Basic
    @Column(name = "CRUOLO")
    public Integer getCruolo() {
        return cruolo;
    }

    public void setCruolo(Integer cruolo) {
        this.cruolo = cruolo;
    }

    @Basic
    @Column(name = "IDSOGGETTOLOCK")
    public Integer getIdsoggettolock() {
        return idsoggettolock;
    }

    public void setIdsoggettolock(Integer idsoggettolock) {
        this.idsoggettolock = idsoggettolock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PcruoloEntity that = (PcruoloEntity) o;

        if (idruolo != that.idruolo) return false;
        if (cruolo != null ? !cruolo.equals(that.cruolo) : that.cruolo != null) return false;
        if (idsoggettolock != null ? !idsoggettolock.equals(that.idsoggettolock) : that.idsoggettolock != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idruolo;
        result = 31 * result + (cruolo != null ? cruolo.hashCode() : 0);
        result = 31 * result + (idsoggettolock != null ? idsoggettolock.hashCode() : 0);
        return result;
    }
}
