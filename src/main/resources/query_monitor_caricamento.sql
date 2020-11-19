select 'com_com_identificationdata',count(*) from datalake.com_com_identificationdata union
select 'com_com_legalperson',count(*) from datalake.com_com_legalperson union
select 'com_com_masterdata',count(*) from datalake.com_com_masterdata union
select 'com_com_naturalperson',count(*) from datalake.com_com_naturalperson union
select 'padatisingoli',count(*) from datalake.padatisingoli union
select 'paindirizzo',count(*) from datalake.paindirizzo union
select 'pasoggetto',count(*) from datalake.pasoggetto union
select 'pasoggettolock',count(*) from datalake.pasoggettolock union
select 'pcmovimento',count(*) from datalake.pcmovimento union
select 'pcpolizza',count(*) from datalake.pcpolizza union
select 'pcpolizzaruolo',count(*) from datalake.pcpolizzaruolo union
select 'pcversione',count(*) from datalake.pcversione union
select 'pgtitolo',count(*) from datalake.pgtitolo union
select 'vttab022',count(*) from datalake.vttab022 union
select 'vttab024',count(*) from datalake.vttab024 union
select 'vttab200',count(*) from datalake.vttab200 union
select 'vttab201',count(*) from datalake.vttab201;