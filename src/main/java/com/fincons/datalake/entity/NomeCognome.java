package com.fincons.datalake.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class NomeCognome {
    private Integer id;
    private String nome;
    private String cognome;
    private Boolean usato;

}
