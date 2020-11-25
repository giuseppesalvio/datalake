select 'com_com_identificationdata',count(*) from datalakearca.com_com_identificationdata union
select 'com_com_legalperson',count(*) from datalakearca.com_com_legalperson union
select 'com_com_masterdata',count(*) from datalakearca.com_com_masterdata union
select 'com_com_naturalperson',count(*) from datalakearca.com_com_naturalperson union
select 'padatisingoli',count(*) from datalakearca.padatisingoli union
select 'paindirizzo',count(*) from datalakearca.paindirizzo union
select 'pasoggetto',count(*) from datalakearca.pasoggetto union
select 'pasoggettolock',count(*) from datalakearca.pasoggettolock union
select 'pcmovimento',count(*) from datalakearca.pcmovimento union
select 'pcpolizza',count(*) from datalakearca.pcpolizza union
select 'pcpolizzaruolo',count(*) from datalakearca.pcpolizzaruolo union
select 'pcversione',count(*) from datalakearca.pcversione union
select 'pgtitolo',count(*) from datalakearca.pgtitolo union
select 'vttab022',count(*) from datalakearca.vttab022 union
select 'vttab024',count(*) from datalakearca.vttab024 union
select 'vttab200',count(*) from datalakearca.vttab200 union
select 'vttab201',count(*) from datalakearca.vttab201 union
SELECT 'nomi rimasti' , count(*) FROM datalakearca.nomi_cognomi where usato = 0;
;