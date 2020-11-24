package com.fincons.datalake.service;

import com.fincons.datalake.entity.Cognome;
import com.fincons.datalake.entity.Nome;
import com.fincons.datalake.entity.NomeCognome;
import com.fincons.datalake.repository.CognomeRepository;
import com.fincons.datalake.repository.NomeCognomeRepository;
import com.fincons.datalake.repository.NomeRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratoreNomiCognomiServiceTest {
    @InjectMocks
    private GeneratoreNomiCognomiService generatoreNomiCognomiService;
    @Mock
    private NomeRepository nomeRepository;
    @Mock
    private CognomeRepository cognomeRepository;
    @Mock
    private NomeCognomeRepository nomeCognomeRepository;

    @Test
    public void svuotaRiempiTabellaNomeCognomeDB() {
        List<Nome> listaNomi = Arrays.asList(new Nome("mario"), new Nome("giacomo"));
        List<Cognome> listaCognomi = Arrays.asList(new Cognome("rossi"), new Cognome("verdi"));
        when(nomeRepository.selectAll()).thenReturn(listaNomi);
        when(cognomeRepository.selectAll()).thenReturn(listaCognomi);

        generatoreNomiCognomiService.svuotaRiempiTabellaNomeCognomeDB();

        verify(nomeCognomeRepository).svuota();
        verify(nomeCognomeRepository).inserisci(listaNomi, listaCognomi);
    }

    @Test
    public void recuperaNomeCognomeNonUtilizzati() {
        NomeCognome nomeCognomeNonUtilizzato = NomeCognome.builder()
                .id(1)
                .nome("giacomo")
                .cognome("verdi")
                .build();
        when(nomeCognomeRepository.primoNomeCognomeNonUtilizzato()).thenReturn(nomeCognomeNonUtilizzato);

        NomeCognome nomeCognomeRecuperato =  generatoreNomiCognomiService.recuperaNomeCognomeNonUtilizzato();

        Assertions.assertThat(nomeCognomeRecuperato).isEqualToComparingFieldByField(nomeCognomeNonUtilizzato);
        verify(nomeCognomeRepository).aggiornaFlagUsato(nomeCognomeNonUtilizzato.getId());
    }


}
