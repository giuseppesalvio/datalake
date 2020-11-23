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
    `personaVita`.`T200_CODCLI` AS `codiceCliente`,
    `polizaVita`.`T022_NUM_POLIZZA` AS `numpolizza`,
    0 AS `lastMovimento`,
    (SELECT
         SUM(`vttab024`.`T024_PREMIO_RATA`)
     FROM
         `vttab024`
     WHERE
             `vttab024`.`T024_NUM_POLIZZA` = `polizaVita`.`T022_NUM_POLIZZA`) AS `somma`,
    'Vita' AS `VitaDanni`
FROM
    (((((((`com_com_masterdata` `masterD`
        JOIN `com_com_identificationdata` `identification` ON (`masterD`.`ECID` = `identification`.`ECID`))
        LEFT JOIN `com_com_naturalperson` `naturalP` ON (`naturalP`.`ECID` = `masterD`.`ECID`))
        LEFT JOIN `com_com_legalperson` `legalP` ON (`legalP`.`ECID` = `masterD`.`ECID`))
        JOIN `com_com_postaladdresses` `address` ON (`masterD`.`ECID` = `address`.`ecid`))
        JOIN `com_meta_territory` `ter` ON (`address`.`territoryid` = `ter`.`id`))
        LEFT JOIN `vttab200` `personaVita` ON (`personaVita`.`T200_CODCOMMANDER` = `masterD`.`ECID`))
        LEFT JOIN `vttab022` `polizaVita` ON (`polizaVita`.`T022_COD_CONTR` = `personaVita`.`T200_CODCLI`))