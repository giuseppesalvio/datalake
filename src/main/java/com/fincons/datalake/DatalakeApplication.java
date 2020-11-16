package com.fincons.datalake;

import com.fincons.datalake.repository.ComComNaturalPersonRepository;
import com.fincons.datalake.service.InserimentoAnagraficaCentrale;
import com.fincons.datalake.service.InserimentoVita;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatalakeApplication {

  public static void main(String[] args) {
    ApplicationContext applicationContext = SpringApplication.run(DatalakeApplication.class, args);

    InserimentoAnagraficaCentrale inserimentoAnagraficaCentrale =
        applicationContext.getBean(InserimentoAnagraficaCentrale.class);
    InserimentoVita inserimentoVita =
            applicationContext.getBean(InserimentoVita.class);
    ComComNaturalPersonRepository comComNaturalPersonRepository = applicationContext.getBean(ComComNaturalPersonRepository.class);

    // FISICA
    for (int i = 1; i < 11; i++) {
      inserimentoVita.pf();
    }

    // GIURIDICA
    for (int i = 11; i < 21; i++) {
      inserimentoVita.pg();
    }

  }

}
