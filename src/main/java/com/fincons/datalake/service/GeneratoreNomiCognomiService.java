package com.fincons.datalake.service;

import com.fincons.datalake.entity.NomeCognome;
import com.fincons.datalake.repository.CognomeRepository;
import com.fincons.datalake.repository.NomeCognomeRepository;
import com.fincons.datalake.repository.NomeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GeneratoreNomiCognomiService {

    private NomeRepository nomeRepository;
    private CognomeRepository cognomeRepository;
    private NomeCognomeRepository nomeCognomeRepository;

    public void svuotaRiempiTabellaNomeCognomeDB() {
        nomeCognomeRepository.svuota();
        nomeCognomeRepository.inserisci(nomeRepository.selectAll(), cognomeRepository.selectAll());
    }

    public NomeCognome recuperaNomeCognomeNonUtilizzato() {
        NomeCognome nomeCognomeNonUtilizzato = nomeCognomeRepository.primoNomeCognomeNonUtilizzato();
        nomeCognomeRepository.aggiornaFlagUsato(nomeCognomeNonUtilizzato.getId());
        return nomeCognomeNonUtilizzato;
    }
}
