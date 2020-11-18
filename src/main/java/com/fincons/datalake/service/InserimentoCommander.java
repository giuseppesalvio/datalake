package com.fincons.datalake.service;

import com.fincons.datalake.entity.*;
import com.fincons.datalake.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

import static com.fincons.datalake.service.Constant.CF;
import static com.fincons.datalake.service.Constant.PIVA;
import static com.fincons.datalake.service.InserimentoVita.IMPRESA_SRL;

@Service
public class InserimentoCommander {
    private static final Timestamp CREATEDATE = Timestamp.valueOf("2010-01-01 10:10:10.0");
    private static final Timestamp UPDATEDATE = Timestamp.valueOf("2010-10-10 10:10:10.0");
    @Autowired
    private ComComNaturalPersonRepository comComNaturalPersonRepository;
    @Autowired
    private ComComLegalPersonRepository comComLegalPersonRepository;
    @Autowired
    private ComComMasterDataRepository comComMasterDataRepository;
    @Autowired
    private ComComIdentificationDataRepository comComIdentificationDataRepository;
    @Autowired
    private ComComPridentificationsRepository comComPridentificationsRepository;
    @Autowired
    private ComComPostalAddressesRepository comComPostalAddressesRepository;
    @Autowired
    private ComMetaTerritoryRepository comMetaTerritoryRepository;

    public int pf() {
        int ecid = getEcid();
        Integer metaTerritoryId = getCodice(comMetaTerritoryRepository);
        Integer comComPostalAddressesId = getCodice(comComPostalAddressesRepository);
        Integer comComPrIdentificationsId = getCodice(comComPridentificationsRepository);
        Integer productRoleId = 1;

        comComNaturalPersonRepository.save(getPersonaFisica(ecid));
        comComMasterDataRepository.save(getMasterData(ecid));//non serve
        comComIdentificationDataRepository.save(getIdentificationDataFisica(ecid));

        comMetaTerritoryRepository.save(getMetaTerritory(metaTerritoryId, ecid));
        comComPostalAddressesRepository.save(getPostalAddresses(comComPostalAddressesId, ecid, metaTerritoryId));
        comComPridentificationsRepository.save(getPrIdentifications(comComPrIdentificationsId, ecid, productRoleId, comComPostalAddressesId));

        return ecid;
    }

    public int pg() {
        int ecid = getEcid();
        Integer metaTerritoryId = getCodice(comMetaTerritoryRepository);
        Integer comComPostalAddressesId = getCodice(comComPostalAddressesRepository);
        Integer comComPrIdentificationsId = getCodice(comComPridentificationsRepository);
        Integer productRoleId = 1;

        comComLegalPersonRepository.save(getPersonaGiuridica(ecid));
        comComMasterDataRepository.save(getMasterData(ecid)); //non serve
        comComIdentificationDataRepository.save(getIdentificationDataGiuridica(ecid));

        comMetaTerritoryRepository.save(getMetaTerritory(metaTerritoryId, ecid));
        comComPostalAddressesRepository.save(getPostalAddresses(comComPostalAddressesId, ecid, metaTerritoryId));
        comComPridentificationsRepository.save(getPrIdentifications(comComPrIdentificationsId, ecid, productRoleId, comComPostalAddressesId));

        return ecid;
    }

    private ComComPridentificationsEntity getPrIdentifications(Integer comComPrIdentificationsId, int ecid, Integer productRoleId, Integer comComPostalAddressesId) {
        return ComComPridentificationsEntity.builder()
                .legacyidentificationid(comComPrIdentificationsId)
                .productroleid(0)
                .entityid(0)
                .id(0) // = comcomPostalAddresses.id dominio
                .idversion(0)
                .createdate(CREATEDATE)
                .updatedate(UPDATEDATE)
                .version(0)
                .build();
    }

    private ComComPostaladdressesEntity getPostalAddresses(Integer comComPostalAddressesId, int ecid, Integer metaTerritoryId) {
        return ComComPostaladdressesEntity.builder()
                .id(comComPostalAddressesId)
                .ecid(ecid)
                .territoryid(metaTerritoryId)
                .build();
    }

    private ComMetaTerritoryEntity getMetaTerritory(Integer metaTerritoryId, int ecid) {
        return ComMetaTerritoryEntity.builder()
                .id(metaTerritoryId)
                .additionalcode1("additionalcode1 " + ecid)
                .additionalcode2("additionalcode2 " + ecid)
                .additionalcode3("additionalcode3 " + ecid)
                .additionalcode4("additionalcode4 " + ecid)
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
        if (ecid == null)
            ecid = 1;
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
