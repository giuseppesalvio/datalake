package com.fincons.datalake.service;

import com.fincons.datalake.entity.*;
import com.fincons.datalake.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.fincons.datalake.service.Constant.CF;
import static com.fincons.datalake.service.Constant.PIVA;
import static com.fincons.datalake.service.InserimentoVita.IMPRESA_SRL;

@Service
public class InserimentoAnagraficaCentrale {
  @Autowired private ComComNaturalPersonRepository comComNaturalPersonRepository;
  @Autowired private ComComLegalPersonRepository comComLegalPersonRepository;
  @Autowired private ComComMasterDataRepository comComMasterDataRepository;
  @Autowired private ComComIdentificationDataRepository comComIdentificationDataRepository;

  public int pf() {
    int ecid = getEcid();
    comComNaturalPersonRepository.save(getPersonaFisica(ecid));
    comComMasterDataRepository.save(getMasterData(ecid));
    comComIdentificationDataRepository.save(getIdentificationDataFisica(ecid));
    return ecid;
  }

  public int pg() {
    int ecid = getEcid();
    comComLegalPersonRepository.save(getPersonaGiuridica(ecid));
    comComMasterDataRepository.save(getMasterData(ecid));
    comComIdentificationDataRepository.save(getIdentificationDataGiuridica(ecid));
    return ecid;
  }


  private Integer getEcid() {
    Integer ecid = comComMasterDataRepository.findMaxEcid();
    if(ecid==null)
      ecid = 1;
    else{
      ecid = ecid+1;
    }
    return ecid;
  }

  private static ComComIdentificationdataEntity getIdentificationDataFisica(int ecid) {
    return ComComIdentificationdataEntity.builder()
            .id(ecid)
            .ecid(ecid)
            .identificationtypecode(1)
            .identification(CF+ ecid)
            .build();
  }

  private static ComComIdentificationdataEntity getIdentificationDataGiuridica(int ecid) {
    return ComComIdentificationdataEntity.builder()
            .id(ecid)
            .ecid(ecid)
            .identificationtypecode(2)
            .identification(PIVA+ ecid)
            .build();
  }

  private static ComComMasterdataEntity getMasterData(int ecid) {
    return ComComMasterdataEntity.builder().ecid(ecid).build();
  }

  private static ComComLegalpersonEntity getPersonaGiuridica(int ecid) {
    return ComComLegalpersonEntity.builder().id(ecid).ecid(ecid).denomination(IMPRESA_SRL + ecid).build();
  }

  private static ComComNaturalpersonEntity getPersonaFisica(int ecid) {
    return ComComNaturalpersonEntity.builder()
            .id(ecid)
            .ecid(ecid)
            .name("Mario " + ecid)
            .surname("Rossi " + ecid)
            .build();
  }

}
