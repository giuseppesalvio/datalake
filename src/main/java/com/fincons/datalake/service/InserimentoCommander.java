package com.fincons.datalake.service;

import com.fincons.datalake.entity.*;
import com.fincons.datalake.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.fincons.datalake.service.Constant.*;

@Service
public class InserimentoCommander {
  @Autowired private ComComNaturalPersonRepository comComNaturalPersonRepository;
  @Autowired private ComComLegalPersonRepository comComLegalPersonRepository;
  @Autowired private ComComMasterDataRepository comComMasterDataRepository;
  @Autowired private ComComIdentificationDataRepository comComIdentificationDataRepository;
  @Autowired private ComComPostalAddressesRepository comComPostalAddressesRepository;
  @Autowired private ComMetaTerritoryRepository comMetaTerritoryRepository;

  public int pf(NomiCognomiEntity nomeCognome) {
    int ecid = getEcid();
    Integer metaTerritoryId = getCodice(comMetaTerritoryRepository);
    Integer comComPostalAddressesId = getCodice(comComPostalAddressesRepository);

    comComNaturalPersonRepository.save(getPersonaFisica(ecid,nomeCognome));
    comComMasterDataRepository.save(getMasterData(ecid));
    comComIdentificationDataRepository.save(getIdentificationDataFisica(ecid));

    comMetaTerritoryRepository.save(getMetaTerritory(metaTerritoryId, ecid));
    comComPostalAddressesRepository.save(
        getPostalAddresses(comComPostalAddressesId, ecid, metaTerritoryId));
    return ecid;
  }

  public int pg() {
    int ecid = getEcid();
    Integer metaTerritoryId = getCodice(comMetaTerritoryRepository);
    Integer comComPostalAddressesId = getCodice(comComPostalAddressesRepository);

    comComLegalPersonRepository.save(getPersonaGiuridica(ecid));
    comComMasterDataRepository.save(getMasterData(ecid)); // non serve
    comComIdentificationDataRepository.save(getIdentificationDataGiuridica(ecid));

    comMetaTerritoryRepository.save(getMetaTerritory(metaTerritoryId, ecid));
    comComPostalAddressesRepository.save(
        getPostalAddresses(comComPostalAddressesId, ecid, metaTerritoryId));
    return ecid;
  }

  private ComComPostaladdressesEntity getPostalAddresses(
      Integer comComPostalAddressesId, int ecid, Integer metaTerritoryId) {
    return ComComPostaladdressesEntity.builder()
        .id(comComPostalAddressesId)
        .ecid(ecid)
        .territoryid(metaTerritoryId)
        .build();
  }

  private ComMetaTerritoryEntity getMetaTerritory(Integer metaTerritoryId, int ecid) {
    return ComMetaTerritoryEntity.builder()
        .id(metaTerritoryId)
        .adminarea1(NAZIONE)
        .adminarea2(CITTA)
        .adminarea3(CITTA)
        .adminarea4(VIA + ecid)
        .build();
  }

  private Integer getCodice(FindMaxIdInterface repository) {
    Integer temp = repository.findMaxId();
    if (temp == null) {
      return 1111;
    }
    return temp + 1;
  }

  private Integer getEcid() {
    Integer ecid = comComMasterDataRepository.findMaxEcid();
    if (ecid == null) ecid = 1;
    else {
      ecid = ecid + 1;
    }
    return ecid;
  }

  private static ComComIdentificationdataEntity getIdentificationDataFisica(int ecid) {
    return ComComIdentificationdataEntity.builder()
        .id(ecid)
        .ecid(ecid)
        .identificationtypecode(1)
        .identification(CF + ecid)
        .build();
  }

  private static ComComIdentificationdataEntity getIdentificationDataGiuridica(int ecid) {
    return ComComIdentificationdataEntity.builder()
        .id(ecid)
        .ecid(ecid)
        .identificationtypecode(2)
        .identification(PIVA + ecid)
        .build();
  }

  private static ComComMasterdataEntity getMasterData(int ecid) {
    return ComComMasterdataEntity.builder().ecid(ecid).build();
  }

  private static ComComLegalpersonEntity getPersonaGiuridica(int ecid) {
    return ComComLegalpersonEntity.builder()
        .id(ecid)
        .ecid(ecid)
        .denomination(IMPRESA_SRL + ecid)
        .build();
  }

  private static ComComNaturalpersonEntity getPersonaFisica(int ecid, NomiCognomiEntity nomeCognome) {
    return ComComNaturalpersonEntity.builder()
        .id(ecid)
        .ecid(ecid)
        .name(nomeCognome.getNome())
        .surname(nomeCognome.getCognome())
        .build();
  }
}
