package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "com_com_pridentifications", schema = "datalake", catalog = "")
public class ComComPridentificationsEntity {
    private int legacyidentificationid;
    private int productroleid;
    private int entityid;
    private int id;
    private int idversion;
    private Timestamp createdate;
    private Timestamp updatedate;
    private int version;
    private String username;

    @Id
    @Column(name = "LEGACYIDENTIFICATIONID")
    public int getLegacyidentificationid() {
        return legacyidentificationid;
    }

    public void setLegacyidentificationid(int legacyidentificationid) {
        this.legacyidentificationid = legacyidentificationid;
    }

    @Basic
    @Column(name = "PRODUCTROLEID")
    public int getProductroleid() {
        return productroleid;
    }

    public void setProductroleid(int productroleid) {
        this.productroleid = productroleid;
    }

    @Basic
    @Column(name = "ENTITYID")
    public int getEntityid() {
        return entityid;
    }

    public void setEntityid(int entityid) {
        this.entityid = entityid;
    }

    @Basic
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IDVERSION")
    public int getIdversion() {
        return idversion;
    }

    public void setIdversion(int idversion) {
        this.idversion = idversion;
    }

    @Basic
    @Column(name = "CREATEDATE")
    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    @Basic
    @Column(name = "UPDATEDATE")
    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    @Basic
    @Column(name = "VERSION")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComComPridentificationsEntity that = (ComComPridentificationsEntity) o;

        if (legacyidentificationid != that.legacyidentificationid) return false;
        if (productroleid != that.productroleid) return false;
        if (entityid != that.entityid) return false;
        if (id != that.id) return false;
        if (idversion != that.idversion) return false;
        if (version != that.version) return false;
        if (createdate != null ? !createdate.equals(that.createdate) : that.createdate != null) return false;
        if (updatedate != null ? !updatedate.equals(that.updatedate) : that.updatedate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = legacyidentificationid;
        result = 31 * result + productroleid;
        result = 31 * result + entityid;
        result = 31 * result + id;
        result = 31 * result + idversion;
        result = 31 * result + (createdate != null ? createdate.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }
}
