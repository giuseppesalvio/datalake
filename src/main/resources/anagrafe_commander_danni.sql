select masterD.ECID,
       identification.IDENTIFICATION,
       naturalP.NAME,
       naturalP.SURNAME,
       legalP.DENOMINATION,
       address.territoryid,
       ter.id,
       adminarea1,
       ter.adminarea2,
       ter.adminarea3,
       ter.adminarea4
        ,
       polizaDanni.cnumpolizza,
       (select max(idmovimento) from pcmovimento where idpolizza = polizaDanni.idpolizza) lastMovimento,
       (select SUM(NIMPORTO)
        from pgtitolo
        where idtitolo in
              (
                  select idgruppotitoli
                  from pcmovimento
                  where idmovimento in (
                      select idmovimento
                      from pcmovimento
                      where idpolizza = polizaDanni.idpolizza)
              ))                                                                          importoTitolo
from com_com_masterdata as masterD
         inner join com_com_identificationdata as identification on masterD.ECID = identification.ECID
         left join com_com_naturalperson as naturalP on naturalP.ECID = masterD.ECID
         left join com_com_legalperson as legalP on legalP.ECID = masterD.ECID
         inner join com_com_postaladdresses address on masterD.ECID = address.ECID
         inner join com_meta_territory ter on address.territoryid = ter.id
         inner join padatisingoli datisingoli on datisingoli.necid = masterD.ECID
         inner join pasoggettolock soggetto on soggetto.iddatisingoli = datisingoli.iddatisingoli
         inner join pcruolo ruolo on ruolo.idsoggettolock = soggetto.idsoggettolock
         inner join pcpolizzaruolo polizaruolo on polizaruolo.idruolo = ruolo.idruolo
         inner join pcpolizza polizaDanni on polizaruolo.idpolizza = polizaDanni.idpolizza