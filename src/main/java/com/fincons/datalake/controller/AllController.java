package com.fincons.datalake.controller;

import com.fincons.datalake.entity.CognomiEntity;
import com.fincons.datalake.entity.NomiCognomiEntity;
import com.fincons.datalake.entity.NomiEntity;
import com.fincons.datalake.repository.CognomiRepository;
import com.fincons.datalake.repository.NomiCognomiRepository;
import com.fincons.datalake.repository.NomiRepository;
import com.fincons.datalake.service.InserimentoCommander;
import com.fincons.datalake.service.InserimentoDanni;
import com.fincons.datalake.service.InserimentoVita;
import com.fincons.datalake.service.NomiCognomi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AllController {

    private InserimentoVita inserimentoVita;
    private InserimentoDanni inserimentoDanni;
    private InserimentoCommander inserimentoCommander;
    private NomiCognomi nomiCognomi;


    @GetMapping("/riempiDb")
    public void riempiDb(@RequestParam int end){
        for (int i = 0; i < end; i++) {
            System.out.println("[Start] - Inserimento "+i);
            inserisciAnagraficaFisica();
            System.out.println("[End-Ins-PF] - Inserimento PF "+i);
            inserisciAnagraficaGiuridica();
            System.out.println("[End] - Inserimento "+i);
        }
    }

    private void inserisciAnagraficaGiuridica() {
        Integer ecidContraente = inserimentoCommander.pg();
        inserimentoVita.pg(ecidContraente);
        inserimentoDanni.pg(ecidContraente);
    }

    private void inserisciAnagraficaFisica() {
        NomiCognomiEntity nomeCognome = nomiCognomi.getRandomName();
        Integer ecidContraente = inserimentoCommander.pf(nomeCognome);
        inserimentoVita.pf(ecidContraente,nomeCognome);
        inserimentoDanni.pf(ecidContraente,nomeCognome);
    }

    @GetMapping("/riempiTabellaNomiCognomi")
    public void riempiTabellaNomiCognomi(){
        nomiCognomi.riempiTabellaNomiCognomi();
    }
}
