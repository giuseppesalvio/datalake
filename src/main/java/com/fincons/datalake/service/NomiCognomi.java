package com.fincons.datalake.service;

import com.fincons.datalake.entity.*;
import com.fincons.datalake.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NomiCognomi {
  @Autowired NomiCognomiRepository nomiCognomiRepository;
  @Autowired NomiRepository nomiRepository;
  @Autowired CognomiRepository cognomiRepository;

  public void riempiTabellaNomiCognomi() {
    nomiCognomiRepository.deleteAll();
    int id = 1;
    Iterable<NomiEntity> listaNomi = nomiRepository.findAll();
    for (NomiEntity nome : listaNomi) {
      Iterable<CognomiEntity> listaCognomi = cognomiRepository.findAll();
      for (CognomiEntity cognome : listaCognomi) {
        id++;
        NomiCognomiEntity nomeCognome = NomiCognomiEntity.builder().id(id).nome(nome.getNome()).cognome(cognome.getCognome()).build();
        System.out.println("-------"+ nomeCognome.getId() +"----------------------"+nomeCognome.getNome() + "------" + nomeCognome.getCognome());
        nomiCognomiRepository.save(nomeCognome);
      }
    }
  }

  public NomiCognomiEntity getRandomName() {
    NomiCognomiEntity randomName = nomiCognomiRepository.getRandom();
    randomName.setUsato(1);
    nomiCognomiRepository.save(randomName);
    return randomName;
  }

}
