package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nomi_cognomi", schema = "datalakearca", catalog = "")
public class NomiCognomiEntity {
    private int id;
    private String nome;
    private String cognome;
    private int usato;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NOME")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "COGNOME")
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Basic
    @Column(name = "USATO")
    public int getUsato() {
        return usato;
    }

    public void setUsato(int usato) {
        this.usato = usato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NomiCognomiEntity that = (NomiCognomiEntity) o;
        return id == that.id &&
                usato == that.usato &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(cognome, that.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome, usato);
    }
}
