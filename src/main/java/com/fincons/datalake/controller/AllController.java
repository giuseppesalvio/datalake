package com.fincons.datalake.controller;

import com.fincons.datalake.service.InserimentoDanni;
import com.fincons.datalake.service.InserimentoVita;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AllController {

    private InserimentoVita inserimentoVita;
    private InserimentoDanni inserimentoDanni;

    @GetMapping("/riempiDb")
    public void riempiDb(){
        // FISICA
        for (int i = 1; i < 11; i++) {
            Integer ecidContraente = inserimentoVita.pf();
            inserimentoDanni.pf(ecidContraente);
        }

        // GIURIDICA
        for (int i = 11; i < 21; i++) {
            inserimentoVita.pg();
        }
    }
}
