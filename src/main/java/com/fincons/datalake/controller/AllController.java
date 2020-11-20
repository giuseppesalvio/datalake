package com.fincons.datalake.controller;

import com.fincons.datalake.service.InserimentoCommander;
import com.fincons.datalake.service.InserimentoDanni;
import com.fincons.datalake.service.InserimentoVita;
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

    @GetMapping("/riempiDb")
    public void riempiDb(@RequestParam int end){
        for (int i = 1; i < end; i++) {
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
        Integer ecidContraente = inserimentoCommander.pf();
        inserimentoVita.pf(ecidContraente);
        inserimentoDanni.pf(ecidContraente);
    }
}
