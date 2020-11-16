package com.fincons.datalake.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

@Embeddable
@Data
public class Vttab201EntityPk implements Serializable {
  private int t201Codsoc;
  private int t201Codcli;

  public Vttab201EntityPk() {}

  public Vttab201EntityPk(int t201Codsoc, int t201Codcli) {
    this.t201Codsoc = t201Codsoc;
    this.t201Codcli = t201Codcli;
  }

  @Column(name = "T201_CODSOC")
  @Id
  public int getT201Codsoc() {
    return t201Codsoc;
  }

  public void setT201Codsoc(int t201Codsoc) {
    this.t201Codsoc = t201Codsoc;
  }

  @Column(name = "T201_CODCLI")
  @Id
  public int getT201Codcli() {
    return t201Codcli;
  }

  public void setT201Codcli(int t201Codcli) {
    this.t201Codcli = t201Codcli;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vttab201EntityPk that = (Vttab201EntityPk) o;
    return t201Codsoc == that.t201Codsoc && t201Codcli == that.t201Codcli;
  }

  @Override
  public int hashCode() {
    return Objects.hash(t201Codsoc, t201Codcli);
  }
}
