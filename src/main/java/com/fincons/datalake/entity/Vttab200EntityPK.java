package com.fincons.datalake.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Vttab200EntityPK implements Serializable {
    private int t200Codcli;
    private int t200Codsoc;

    @Column(name = "T200_CODCLI")
    @Id
    public int getT200Codcli() {
        return t200Codcli;
    }

    public void setT200Codcli(int t200Codcli) {
        this.t200Codcli = t200Codcli;
    }

    @Column(name = "T200_CODSOC")
    @Id
    public int getT200Codsoc() {
        return t200Codsoc;
    }

    public void setT200Codsoc(int t200Codsoc) {
        this.t200Codsoc = t200Codsoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vttab200EntityPK that = (Vttab200EntityPK) o;
        return t200Codcli == that.t200Codcli &&
                t200Codsoc == that.t200Codsoc;
    }

    @Override
    public int hashCode() {
        return Objects.hash(t200Codcli, t200Codsoc);
    }
}
