package com.fincons.datalake.controller;

import com.fincons.datalake.entity.NomeCognome;
import com.fincons.datalake.service.GeneratoreNomiCognomiService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AllControllerTest {

    @Mock
    private GeneratoreNomiCognomiService generatoreNomiCognomiService;
    @InjectMocks
    private AllController allController;

    @Test
    public void riempiTabellaNomeCognome() {
        allController.riempiTabellaNomeCognome();

        verify(generatoreNomiCognomiService).svuotaRiempiTabellaNomeCognomeDB();
    }

    @Test
    public  void generaNomeCognome () {
        NomeCognome nomeCognome = NomeCognome.builder().nome("mario").cognome("rossi").build();
        when(generatoreNomiCognomiService.recuperaNomeCognomeNonUtilizzato()).thenReturn(nomeCognome);

        NomeCognome nomeCognomeRisultatoOperazione = allController.generaNomeCognome();

        Assertions.assertThat(nomeCognomeRisultatoOperazione).isEqualTo(nomeCognome);
    }
}
