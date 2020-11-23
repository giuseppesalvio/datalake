SELECT
    `a`.`ECID` AS `Ecid`,
    `a`.`IDENTIFICATION` AS `Identification`,
    `a`.`NAME` AS `name`,
    `a`.`SURNAME` AS `surname`,
    `a`.`DENOMINATION` AS `denomination`,
    `a`.`adminarea1` AS `adminarea1`,
    `a`.`adminarea2` AS `adminarea2`,
    `a`.`adminarea3` AS `adminarea3`,
    `a`.`adminarea4` AS `adminarea4`,
    `a`.`numpolizza` AS `numPolizza`,
    `a`.`somma` AS `somma`,
    `a`.`VitaDanni` AS `VitaDanni`
FROM
    (SELECT
         `anagraficheVita`.`ECID` AS `ECID`,
         `anagraficheVita`.`IDENTIFICATION` AS `IDENTIFICATION`,
         `anagraficheVita`.`NAME` AS `NAME`,
         `anagraficheVita`.`SURNAME` AS `SURNAME`,
         `anagraficheVita`.`DENOMINATION` AS `DENOMINATION`,
         `anagraficheVita`.`territoryid` AS `territoryid`,
         `anagraficheVita`.`id` AS `id`,
         `anagraficheVita`.`adminarea1` AS `adminarea1`,
         `anagraficheVita`.`adminarea2` AS `adminarea2`,
         `anagraficheVita`.`adminarea3` AS `adminarea3`,
         `anagraficheVita`.`adminarea4` AS `adminarea4`,
         `anagraficheVita`.`codiceCliente` AS `codiceCliente`,
         `anagraficheVita`.`numpolizza` AS `numpolizza`,
         `anagraficheVita`.`lastMovimento` AS `lastMovimento`,
         `anagraficheVita`.`somma` AS `somma`,
         `anagraficheVita`.`VitaDanni` AS `VitaDanni`
     FROM
         `datalakearca`.`anagraficheVita` UNION SELECT
                                                    `anagraficheDanni`.`ECID` AS `ECID`,
                                                    `anagraficheDanni`.`IDENTIFICATION` AS `IDENTIFICATION`,
                                                    `anagraficheDanni`.`NAME` AS `NAME`,
                                                    `anagraficheDanni`.`SURNAME` AS `SURNAME`,
                                                    `anagraficheDanni`.`DENOMINATION` AS `DENOMINATION`,
                                                    `anagraficheDanni`.`territoryid` AS `territoryid`,
                                                    `anagraficheDanni`.`id` AS `id`,
                                                    `anagraficheDanni`.`adminarea1` AS `adminarea1`,
                                                    `anagraficheDanni`.`adminarea2` AS `adminarea2`,
                                                    `anagraficheDanni`.`adminarea3` AS `adminarea3`,
                                                    `anagraficheDanni`.`adminarea4` AS `adminarea4`,
                                                    `anagraficheDanni`.`codiceCliente` AS `codiceCliente`,
                                                    `anagraficheDanni`.`numpolizza` AS `numpolizza`,
                                                    `anagraficheDanni`.`lastMovimento` AS `lastMovimento`,
                                                    `anagraficheDanni`.`somma` AS `somma`,
                                                    `anagraficheDanni`.`VitaDanni` AS `VitaDanni`
     FROM
         `datalakearca`.`anagraficheDanni`) `a`
ORDER BY `a`.`ECID`