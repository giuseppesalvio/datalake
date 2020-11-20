package com.fincons.datalake.controller;

import com.fincons.datalake.service.InserimentoCommander;
import com.fincons.datalake.service.InserimentoDanni;
import com.fincons.datalake.service.InserimentoVita;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AllController {

    public static final int START_FOR_PF = 1;
    public static final int END_FOR_PF = 4;
    public static final int START_FOR_PG = 11;
    public static final int END_FOR_PG = 21;
    private InserimentoVita inserimentoVita;
    private InserimentoDanni inserimentoDanni;
    private InserimentoCommander inserimentoCommander;

    @GetMapping("/riempiDb")
    public void riempiDb(){
        // FISICA
        for (int i = START_FOR_PF; i < END_FOR_PF; i++) {
            Integer ecidContraente = inserimentoCommander.pf();
            inserimentoVita.pf(ecidContraente);
            inserimentoDanni.pf(ecidContraente);
        }

        // GIURIDICA
        for (int i = START_FOR_PG; i < END_FOR_PG; i++) {
            Integer ecidContraente = inserimentoCommander.pg();
            inserimentoVita.pg(ecidContraente);
            inserimentoDanni.pg(ecidContraente);
        }
    }
}
