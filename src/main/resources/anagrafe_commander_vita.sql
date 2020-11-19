select masterD.ECID , identification.IDENTIFICATION ,naturalP.NAME,naturalP.SURNAME,legalP.DENOMINATION,address.territoryid,ter.id,adminarea1,ter.adminarea2,ter.adminarea3,ter.adminarea4,personaVita.T200_CODCLI,polizaVita.T022_NUM_POLIZZA
from com_com_masterdata as masterD
         inner join com_com_identificationdata as identification on masterD.ECID = identification.ECID
         left join com_com_naturalperson as naturalP on naturalP.ECID = masterD.ECID
         left join com_com_legalperson as legalP on legalP.ECID = masterD.ECID
         inner join com_com_postaladdresses address on masterD.ECID = address.ECID
         inner join com_meta_territory ter on address.territoryid = ter.id
         left join vttab200 personaVita on personaVita.T200_CODCOMMANDER = masterD.ECID
         left join vttab022 polizaVita on polizaVita.`T022_COD_CONTR` = personaVita.T200_CODCLI