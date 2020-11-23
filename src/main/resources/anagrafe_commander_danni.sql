SELECT
    `masterD`.`ECID` AS `ECID`,
    `identification`.`IDENTIFICATION` AS `IDENTIFICATION`,
    `naturalP`.`NAME` AS `NAME`,
    `naturalP`.`SURNAME` AS `SURNAME`,
    `legalP`.`DENOMINATION` AS `DENOMINATION`,
    `address`.`territoryid` AS `territoryid`,
    `ter`.`id` AS `id`,
    `ter`.`adminarea1` AS `adminarea1`,
    `ter`.`adminarea2` AS `adminarea2`,
    `ter`.`adminarea3` AS `adminarea3`,
    `ter`.`adminarea4` AS `adminarea4`,
    0 AS `codiceCliente`,
    `polizaDanni`.`CNUMPOLIZZA` AS `numpolizza`,
    (SELECT
         MAX(`pcmovimento`.`IDMOVIMENTO`)
     FROM
         `pcmovimento`
     WHERE
             `pcmovimento`.`IDPOLIZZA` = `polizaDanni`.`IDPOLIZZA`) AS `lastMovimento`,
    (SELECT
         SUM(`pgtitolo`.`NIMPORTO`)
     FROM
         `pgtitolo`
     WHERE
             `pgtitolo`.`IDTITOLO` IN (SELECT
                                           `pcmovimento`.`IDGRUPPOTITOLI`
                                       FROM
                                           `pcmovimento`
                                       WHERE
                                               `pcmovimento`.`IDMOVIMENTO` IN (SELECT
                                                                                   `pcmovimento`.`IDMOVIMENTO`
                                                                               FROM
                                                                                   `pcmovimento`
                                                                               WHERE
                                                                                       `pcmovimento`.`IDPOLIZZA` = `polizaDanni`.`IDPOLIZZA`))) AS `somma`,
    'Danni' AS `VitaDanni`
FROM
    ((((((((((`com_com_masterdata` `masterD`
        JOIN `com_com_identificationdata` `identification` ON (`masterD`.`ECID` = `identification`.`ECID`))
        LEFT JOIN `com_com_naturalperson` `naturalP` ON (`naturalP`.`ECID` = `masterD`.`ECID`))
        LEFT JOIN `com_com_legalperson` `legalP` ON (`legalP`.`ECID` = `masterD`.`ECID`))
        JOIN `com_com_postaladdresses` `address` ON (`masterD`.`ECID` = `address`.`ecid`))
        JOIN `com_meta_territory` `ter` ON (`address`.`territoryid` = `ter`.`id`))
        JOIN `padatisingoli` `datisingoli` ON (`datisingoli`.`NECID` = `masterD`.`ECID`))
        JOIN `pasoggettolock` `soggetto` ON (`soggetto`.`IDDATISINGOLI` = `datisingoli`.`IDDATISINGOLI`))
        JOIN `pcruolo` `ruolo` ON (`ruolo`.`idsoggettolock` = `soggetto`.`IDSOGGETTOLOCK`))
        JOIN `pcpolizzaruolo` `polizaruolo` ON (`polizaruolo`.`IDRUOLO` = `ruolo`.`idruolo`))
        JOIN `pcpolizza` `polizaDanni` ON (`polizaruolo`.`IDPOLIZZA` = `polizaDanni`.`IDPOLIZZA`))