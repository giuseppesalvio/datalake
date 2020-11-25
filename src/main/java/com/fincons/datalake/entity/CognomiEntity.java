package com.fincons.datalake.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cognomi", schema = "datalakearca", catalog = "")
public class CognomiEntity {
    private String cognome;

    @Id
    @Column(name = "cognome")
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CognomiEntity that = (CognomiEntity) o;
        return Objects.equals(cognome, that.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cognome);
    }
}
