package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pasoggettolock", schema = "datalake", catalog = "")
public class PasoggettolockEntity {
    private int idsoggettolock;
    private Integer idsoggetto;
    private Date dmodifica;
    private Integer iddatisingoli;
    private Integer idresidenza;
    private Integer iduser;
    private Date dchiusura;
    private Timestamp tins;
    private Integer idresidence;

    @Id
    @Column(name = "IDSOGGETTOLOCK")
    public int getIdsoggettolock() {
        return idsoggettolock;
    }

    public void setIdsoggettolock(int idsoggettolock) {
        this.idsoggettolock = idsoggettolock;
    }

    @Basic
    @Column(name = "IDSOGGETTO")
    public Integer getIdsoggetto() {
        return idsoggetto;
    }

    public void setIdsoggetto(Integer idsoggetto) {
        this.idsoggetto = idsoggetto;
    }

    @Basic
    @Column(name = "DMODIFICA")
    public Date getDmodifica() {
        return dmodifica;
    }

    public void setDmodifica(Date dmodifica) {
        this.dmodifica = dmodifica;
    }

    @Basic
    @Column(name = "IDDATISINGOLI")
    public Integer getIddatisingoli() {
        return iddatisingoli;
    }

    public void setIddatisingoli(Integer iddatisingoli) {
        this.iddatisingoli = iddatisingoli;
    }

    @Basic
    @Column(name = "IDRESIDENZA")
    public Integer getIdresidenza() {
        return idresidenza;
    }

    public void setIdresidenza(Integer idresidenza) {
        this.idresidenza = idresidenza;
    }

    @Basic
    @Column(name = "IDUSER")
    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    @Basic
    @Column(name = "DCHIUSURA")
    public Date getDchiusura() {
        return dchiusura;
    }

    public void setDchiusura(Date dchiusura) {
        this.dchiusura = dchiusura;
    }

    @Basic
    @Column(name = "TINS")
    public Timestamp getTins() {
        return tins;
    }

    public void setTins(Timestamp tins) {
        this.tins = tins;
    }

    @Basic
    @Column(name = "IDRESIDENCE")
    public Integer getIdresidence() {
        return idresidence;
    }

    public void setIdresidence(Integer idresidence) {
        this.idresidence = idresidence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasoggettolockEntity that = (PasoggettolockEntity) o;

        if (idsoggettolock != that.idsoggettolock) return false;
        if (idsoggetto != null ? !idsoggetto.equals(that.idsoggetto) : that.idsoggetto != null) return false;
        if (dmodifica != null ? !dmodifica.equals(that.dmodifica) : that.dmodifica != null) return false;
        if (iddatisingoli != null ? !iddatisingoli.equals(that.iddatisingoli) : that.iddatisingoli != null)
            return false;
        if (idresidenza != null ? !idresidenza.equals(that.idresidenza) : that.idresidenza != null) return false;
        if (iduser != null ? !iduser.equals(that.iduser) : that.iduser != null) return false;
        if (dchiusura != null ? !dchiusura.equals(that.dchiusura) : that.dchiusura != null) return false;
        if (tins != null ? !tins.equals(that.tins) : that.tins != null) return false;
        if (idresidence != null ? !idresidence.equals(that.idresidence) : that.idresidence != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idsoggettolock;
        result = 31 * result + (idsoggetto != null ? idsoggetto.hashCode() : 0);
        result = 31 * result + (dmodifica != null ? dmodifica.hashCode() : 0);
        result = 31 * result + (iddatisingoli != null ? iddatisingoli.hashCode() : 0);
        result = 31 * result + (idresidenza != null ? idresidenza.hashCode() : 0);
        result = 31 * result + (iduser != null ? iduser.hashCode() : 0);
        result = 31 * result + (dchiusura != null ? dchiusura.hashCode() : 0);
        result = 31 * result + (tins != null ? tins.hashCode() : 0);
        result = 31 * result + (idresidence != null ? idresidence.hashCode() : 0);
        return result;
    }
}
