
DROP TABLE IF EXISTS PADATISINGOLI;
CREATE TABLE PADATISINGOLI
          (
              IDDATISINGOLI             DECIMAL(18, 0) PRIMARY KEY,
              CPARTITAIVA               VARCHAR(11)    NULL,
              CDENOMINAZIONE            VARCHAR(150)   NULL,
              CNOME                     VARCHAR(150)   NULL,
              CCOGNOME                  VARCHAR(150)   NULL,
              IDPROFESSIONE             DECIMAL(18, 0) NULL,
              EPRIVACY                  DECIMAL(5, 0)  NULL,
              DCONSENSOPRIVACY          DATE           NULL,
              ESTATOCIVILE              DECIMAL(10, 0) NULL,
              CCITTADINANZA             VARCHAR(3)     NULL,
              IDSETTOREATTIVITA         DECIMAL(18, 0) NULL,
              IDFORMASOC                DECIMAL(18, 0) NULL,
              ESTATOANTITERRORIS        DECIMAL(5, 0)  NULL,
              IDSOTTOGRUPPO             DECIMAL(18, 0) NULL,
              IDGRUPPO                  DECIMAL(18, 0) NULL,
              DINGRESSOINITALIA         DATE           NULL,
              ETIPOCLIENTE              DECIMAL(5, 0)  NULL,
              CCONTOCLIENTE             VARCHAR(30)    NULL,
              CCONTOFORNITORE           VARCHAR(30)    NULL,
              NPERCRITENACC             DECIMAL(9, 6)  NULL,
              IDCODATECO                DECIMAL(18, 0) NULL,
              CORIGINALSURNAME          VARCHAR(150)   NULL,
              CORIGINALNAME             VARCHAR(150)   NULL,
              CORIGCOMPANYNAME          VARCHAR(150)   NULL,
              NPUBLICSHARE              DECIMAL(9, 6)  NULL,
              NWORKERSHARE              DECIMAL(9, 6)  NULL,
              CSECTORNOTE               VARCHAR(255)   NULL,
              BGROUP                    DECIMAL(1, 0)  NULL,
              IDGROUPTYPE               DECIMAL(18, 0) NULL,
              CCOMMERCIALNAME           VARCHAR(150)   NULL,
              EFRANCHISINGQUAL          DECIMAL(18, 0) NULL,
              BPOLITICALLYEXP           DECIMAL(1, 0)  NULL,
              BINREGISTRATION           DECIMAL(1, 0)  NULL,
              EMATRIMONIALARRANG        DECIMAL(18, 0) NULL,
              DCOUNTERTERRORISM         DATE           NULL,
              CBIRTHNAME                VARCHAR(150)   NULL,
              NSALAREDWORKERS           DECIMAL(6, 0)  NULL,
              BVARIABLECAPITAL          DECIMAL(1, 0)  NULL,
              NSHARECAPITAL             DECIMAL(17, 3) NULL,
              IDCURRENCY                DECIMAL(5, 0)  NULL,
              ECODFAMIGLIA              DECIMAL(5, 0)  NULL,
              CNDG                      VARCHAR(30)    NULL,
              CRAMOATTIVITA             VARCHAR(50)    NULL,
              CSUBGRPATTIVITA           VARCHAR(50)    NULL,
              CCODATECO                 VARCHAR(50)    NULL,
              DISCRIZIONEREGIMPRESE     DATE           NULL,
              DINIZIOATTIVITAREGIMPRESE DATE           NULL,
              NFATTURATO                DECIMAL(16, 2) NULL,
              NDIPENDENTI               DECIMAL(10, 0) NULL,
              NRETRIBUZIONI2010         DECIMAL(16, 2) NULL,
              NECID                     DECIMAL(18, 0) NULL,
              CCODSAECOMMANDER          VARCHAR(50)    NULL
          );
DROP TABLE IF EXISTS  PAINDIRIZZO;
CREATE TABLE PAINDIRIZZO
          (
              IDINDIRIZZO       DECIMAL(18, 0) PRIMARY KEY,
              CPROVINCIA        VARCHAR(4)     NULL,
              CCAP              VARCHAR(5)     NULL,
              IDTOPONIMO        DECIMAL(18, 0) NULL,
              CSIGLANAZIONE     VARCHAR(3)     NULL,
              CNUMEROCIVICO     VARCHAR(50)    NULL,
              CCOMUNE           VARCHAR(50)    NULL,
              CINDIRIZZO        VARCHAR(150)   NULL,
              CFRAZIONE         VARCHAR(50)    NULL,
              CPRESSO           VARCHAR(50)    NULL,
              BFORZATOINDIRIZZO DECIMAL(1, 0)  NULL,
              BNORMALIZZATO     DECIMAL(1, 0)  NULL,
              CCAB              VARCHAR(6)     NULL,
              BPRINCIPALE       DECIMAL(1, 0)  NULL,
              CCODICE           VARCHAR(10)    NULL,
              CLATITUDINE       VARCHAR(30)    NULL,
              CLONGITUDINE      VARCHAR(30)    NULL,
              CCODEDETTAGLIO    VARCHAR(6)     NULL,
              CCODICEISTAT      VARCHAR(6)     NULL,
              CCOMUNEESTERO     VARCHAR(150)   NULL
          );
		  DROP TABLE IF EXISTS  PASOGGETTO;
		  CREATE TABLE PASOGGETTO
          (
              IDSOGGETTO        DECIMAL(18, 0) NOT NULL,
              IDCOMPAGNIA       DECIMAL(18, 0) NULL,
              EGIURIDICOFISICO  DECIMAL(5, 0)  NULL,
              ETIPOSOGGETTO     DECIMAL(5, 0)  NULL,
              IDDATISINGOLI     DECIMAL(18, 0) NOT NULL,
              IDRESIDENZA       DECIMAL(18, 0) NULL,
              CCODICEFISCALE    VARCHAR(16)    NULL,
              ESESSO            DECIMAL(5, 0)  NULL,
              DNASCITA          DATE           NULL,
              CNAZIONENASCITA   VARCHAR(3)     NULL,
              CPROVINCIANASCITA VARCHAR(4)     NULL,
              ECANALEACQ        DECIMAL(5, 0)  NULL,
              IDUSERINS         DECIMAL(18, 0) NULL,
              IDUSERAGG         DECIMAL(18, 0) NULL,
              TAGG              TIMESTAMP(6)   NULL,
              TINS              TIMESTAMP(6)   NULL,
              IDTITOLOONORIFICO DECIMAL(18, 0) NULL,
              BESENZIONEIMPOSTE DECIMAL(1, 0)  NULL,
              IDULTIMAFOTO      DECIMAL(18, 0) NULL,
              ETIPOANAGRAFICA   DECIMAL(5, 0)  NULL,
              CLOCALITANASCITA  VARCHAR(50)    NULL,
              DAPERTURASOCIETA  DATE           NULL,
              CNUMCARPETTA      VARCHAR(18)    NULL,
              BMIGRATO          DECIMAL(1, 0)  NULL,
              IDTITOLOSTUDIO    DECIMAL(18, 0) NULL,
              BALTRAANAG        DECIMAL(1, 0)  NULL,
              CCODICECONSORZIO  VARCHAR(6)     NULL,
              IDLINGUA          DECIMAL(18, 0) NULL,
              DDECESSO          DATE           NULL,
              IDRESIDENCE       DECIMAL(18, 0) NULL,
              IDBIRTHADDRESS    DECIMAL(18, 0) NULL,
              CLOCKREASON       VARCHAR(255)   NULL,
              BFORZATOCF        DECIMAL(1, 0)  NULL,
              PRIMARY KEY (IDSOGGETTO,
                           IDDATISINGOLI
                  )
          );
		  DROP TABLE IF EXISTS  PASOGGETTOLOCK;
		  CREATE TABLE PASOGGETTOLOCK
          (
              IDSOGGETTOLOCK DECIMAL(18, 0) PRIMARY KEY,
              IDSOGGETTO     DECIMAL(18, 0) NULL,
              DMODIFICA      DATE           NULL,
              IDDATISINGOLI  DECIMAL(18, 0) NULL,
              IDRESIDENZA    DECIMAL(18, 0) NULL,
              IDUSER         DECIMAL(18, 0) NULL,
              DCHIUSURA      DATE           NULL,
              TINS           TIMESTAMP(6)   NULL,
              IDRESIDENCE    DECIMAL(18, 0) NULL
          );
		  DROP TABLE IF EXISTS PCMOVIMENTO;
		  CREATE TABLE PCMOVIMENTO
          (
              IDMOVIMENTO       DECIMAL(18, 0) NOT NULL,
              NVERSIONE         DECIMAL(18, 0) NOT NULL,
              BTEMPORANEO       DECIMAL(1, 0)  NOT NULL,
              CDESCRIZIONE      VARCHAR(100)   NOT NULL,
              DEFFETTO          DATE           NOT NULL,
              DSCADENZA         DATE           NULL,
              DEMISSIONE        DATE           NOT NULL,
              IDPOLIZZA         DECIMAL(18, 0) NOT NULL,
              IDCAUSALE         DECIMAL(18, 0) NOT NULL,
              IDGRUPPOTITOLI    DECIMAL(18, 0) NULL,
              NNUMEROAPPENDICE  DECIMAL(5, 0)  NULL,
              CNOTE             VARCHAR(255)   NULL,
              ESTATO            DECIMAL(18, 0) NULL,
              IDUSER            DECIMAL(18, 0) NULL,
              DOPERAZIONE       TIMESTAMP(6)   NULL,
              BANNULLATO        DECIMAL(1, 0)  NULL,
              ESTATOAUT         DECIMAL(5, 0)  NULL,
              CORAEFFETTO       VARCHAR(5)     NULL,
              BMIGRATO          DECIMAL(1, 0)  NULL,
              ECATEGORIA        DECIMAL(5, 0)  NULL,
              ESOTTOSTATO       DECIMAL(18, 0) NULL,
              IDCOMPAGNIA       DECIMAL(18, 0) NULL,
              ESTATOREGOLAZIONE DECIMAL(18, 0) NULL,
              IDMOVREGOLAZIONE  DECIMAL(18, 0) NULL,
              DSTORNO           DATE           NULL,
              IDMOVANNULLATO    DECIMAL(18, 0) NULL,
              BAUTODEROGATO     DECIMAL(1, 0)  NULL,
              EAPPFEDFISCALE    DECIMAL(18, 0) NULL,
              EPROVENIENZA      DECIMAL(18, 0) NULL,
              IDCURRENCY        DECIMAL(5, 0)  NULL,
              DEXCHANGE         DATE           NULL,
              NEXCHANGERATE     DECIMAL(18, 6) NULL,
              DCARICO           DATE           NULL,
              DCARICOSTORNO     DATE           NULL,
              IDCAUSALESTORNO   DECIMAL(18, 0) NULL,
              BSUPPLETTIVO      DECIMAL(1, 0)  NULL,
              TEMISSIONEMOV     TIMESTAMP(6)   NULL,
              PRIMARY KEY (
                           IDMOVIMENTO,
                           NVERSIONE,
                           BTEMPORANEO,
                           CDESCRIZIONE,
                           DEFFETTO,
                           DEMISSIONE,
                           IDPOLIZZA,
                           IDCAUSALE
                  )
          );
		  DROP TABLE IF EXISTS PCPOLIZZA;
		  CREATE TABLE PCPOLIZZA
          (
              IDPOLIZZA           DECIMAL(18, 0) NOT NULL,
              EMOTIVOANNULPROP    DECIMAL(5, 0)  NULL,
              DEMISSIONE          DATE           NULL,
              EMOTIVOCREAZIONE    DECIMAL(5, 0)  NOT NULL,
              CDESCRIZIONE        VARCHAR(100)   NOT NULL,
              BPOLIZZA            DECIMAL(1, 0)  NOT NULL,
              CNUMPROPOSTA        VARCHAR(16)    NULL,
              CNUMPOLIZZA         VARCHAR(25)    NULL,
              DFINEVALPROP        DATE           NOT NULL,
              IDPRODOTTO          DECIMAL(10, 0) NULL,
              IDDIVISA            DECIMAL(5, 0)  NOT NULL,
              IDPVPRODUZIONE      DECIMAL(18, 0) NOT NULL,
              IDUSERINS           DECIMAL(18, 0) NOT NULL,
              DINS                TIMESTAMP(6)   NULL,
              IDUSERAGG           DECIMAL(18, 0) NOT NULL,
              DAGG                TIMESTAMP(6)   NULL,
              DANNULLAMENTO       DATE           NULL,
              BACCORPARATA        DECIMAL(1, 0)  NULL,
              DEFFETTOORIGINALE   DATE           NULL,
              BPROVVPREC          DECIMAL(1, 0)  NULL,
              DPROPOSTA           DATE           NULL,
              EMOTIVOSOST         DECIMAL(5, 0)  NULL,
              BDANNI              DECIMAL(1, 0)  NOT NULL,
              BVITA               DECIMAL(1, 0)  NOT NULL,
              DSCADENZAORIGINALE  DATE           NULL,
              BMIGRATA            DECIMAL(1, 0)  NULL,
              EUSOIMPOSTA         DECIMAL(5, 0)  NULL,
              IDCOMPAGNIA         DECIMAL(18, 0) NULL,
              DBLOCCOQUIET        DATE           NULL,
              CCODICERAMOTECNICO  VARCHAR(6)     NULL,
              DTRASFLEGALE        DATE           NULL,
              DTRASFAGENZIA       DATE           NULL,
              CNUMAPPLICAZIONE    VARCHAR(25)    NULL,
              ETIPOPOLIZZA        DECIMAL(5, 0)  NULL,
              BMODELLO            DECIMAL(1, 0)  NULL,
              NMAXVERSIONE        DECIMAL(18, 0) NULL,
              ECATEGORIA          DECIMAL(5, 0)  NULL,
              DEFFETTOCORRENTE    DATE           NULL,
              DSCADENZACORRENTE   DATE           NULL,
              IDPVGESTCORRENTE    DECIMAL(18, 0) NULL,
              IDMOTSOSTITUZIONE   DECIMAL(18, 0) NULL,
              DUSCITAESPOSIZIONE  DATE           NULL,
              EPROVENIENZA        DECIMAL(5, 0)  NULL,
              NGGDISDETTA         DECIMAL(5, 0)  NULL,
              DINVIOCOMANNULLO    DATE           NULL,
              IDPASSAUTORIZZ      DECIMAL(18, 0) NULL,
              CNOTE               VARCHAR(255)   NULL,
              DBLOCCOOPERATIVITA  DATE           NULL,
              CNUMLOTTO           VARCHAR(25)    NULL,
              CNUMFINANZIAMENTO   VARCHAR(25)    NULL,
              CNUMQUOTE           VARCHAR(25)    NULL,
              IDCONTEXT           DECIMAL(18, 0) NULL,
              CLOCKCODE           VARCHAR(6)     NULL,
              NCPRATIO            DECIMAL(18, 6) NULL,
              DUPDCPRATIO         DATE           NULL,
              BPRIVACYCOMMERCIALE DECIMAL(1, 0)  NULL,
              PRIMARY KEY (
                           IDPOLIZZA/*,
                           EMOTIVOCREAZIONE,
                           CDESCRIZIONE,
                           BPOLIZZA,
                           DFINEVALPROP,
                           IDDIVISA,
                           IDPVPRODUZIONE,
                           IDUSERINS,
                           IDUSERAGG,
                           BDANNI,
                           BVITA*/
                  )
          );
		  DROP TABLE IF EXISTS  PCPOLIZZARUOLO;
		  CREATE TABLE PCPOLIZZARUOLO
          (
              IDPOLIZZA  DECIMAL(18, 0) NOT NULL,
              IDRUOLO    DECIMAL(18, 0) NOT NULL,
              NVERINIZIO DECIMAL(18, 0) NOT NULL,
              NVERFINE   DECIMAL(18, 0) NULL,
              BBENE      DECIMAL(1, 0)  NULL,
              PRIMARY KEY (IDPOLIZZA, IDRUOLO)
          );
		  DROP TABLE IF EXISTS PCVERSIONE;
		  CREATE TABLE PCVERSIONE
          (
              IDPOLIZZA          DECIMAL(18, 0) NOT NULL,
              NVERINIZIO         DECIMAL(18, 0) NOT NULL,
              NVERFINE           DECIMAL(18, 0) NOT NULL,
              DSCADREGOLAZIONE   DATE           NULL,
              BREGOLAZIONE       DECIMAL(1, 0)  NULL,
              BINDICIZZAZIONE    DECIMAL(1, 0)  NULL,
              IDPRODUTTORE       DECIMAL(18, 0) NULL,
              IDPVGESTIONE       DECIMAL(18, 0) NOT NULL,
              IDCONVENZIONE      DECIMAL(5, 0)  NULL,
              NPERCNOSTRA        DECIMAL(6, 2)  NULL,
              ETIPOCOASS         DECIMAL(5, 0)  NOT NULL,
              DEFFETTOPOLIZZA    DATE           NULL,
              DSCADENZAPOLIZZA   DATE           NULL,
              IDFRAZ             DECIMAL(5, 0)  NULL,
              NFREQRESCINDIBILTA DECIMAL(5, 0)  NULL,
              IDFILIALE          DECIMAL(18, 0) NULL,
              IDTIPOREGPREMIO    DECIMAL(5, 0)  NULL,
              NGIORNIREGOLAZIONE DECIMAL(5, 0)  NULL,
              IDRECAPITO         DECIMAL(18, 0) NULL,
              DTARIFFA           DATE           NULL,
              CORAEFFETTOCOP     VARCHAR(5)     NULL,
              BINCASSOCOASS100   DECIMAL(1, 0)  NULL,
              NVALOREINDICE      DECIMAL(6, 2)  NULL,
              IDFRAZPROROGA      DECIMAL(5, 0)  NULL,
              IDFRAZREGOLAZ      DECIMAL(5, 0)  NULL,
              DRESCINDIBILITA    DATE           NULL,
              BRIASS             DECIMAL(1, 0)  NULL,
              NGGPREMIO          DECIMAL(5, 0)  NULL,
              NPERCINTFRAZ       DECIMAL(6, 2)  NULL,
              NPROROGHETOTALI    DECIMAL(5, 0)  NULL,
              BRIMBORSOIMPOSTE   DECIMAL(1, 0)  NULL,
              NDIRITTIPR         DECIMAL(17, 3) NULL,
              NDIRITTIRS         DECIMAL(17, 3) NULL,
              NPERCPROVVDIRITTI  DECIMAL(6, 2)  NULL,
              IDVERSIONE         DECIMAL(5, 0)  NULL,
              BTACITORINNOVO     DECIMAL(1, 0)  NULL,
              BPROROGA           DECIMAL(1, 0)  NULL,
              BVINCOLO           DECIMAL(1, 0)  NULL,
              BRISCHIOCOMUNE     DECIMAL(1, 0)  NULL,
              BCOASSINDIRETTA    DECIMAL(1, 0)  NULL,
              BSECONDORISCHIO    DECIMAL(1, 0)  NULL,
              BCOMPAGNIEESTERE   DECIMAL(1, 0)  NULL,
              IDTIPOINDICIZZ     DECIMAL(5, 0)  NULL,
              BLPS               DECIMAL(1, 0)  NULL,
              EPLAFONAPREMIO     DECIMAL(5, 0)  NULL,
              BDIRITTI           DECIMAL(1, 0)  NULL,
              BCOMPLEMENTARE     DECIMAL(1, 0)  NULL,
              EREGPROVVATTIVE    DECIMAL(5, 0)  NULL,
              EREGPROVVPASSIVE   DECIMAL(5, 0)  NULL,
              DSCADREGOLAZRICDOC DATE           NULL,
              NPREMIOMINREGOLAZ  DECIMAL(17, 3) NULL,
              NPERCPREMIOREGOLAZ DECIMAL(6, 2)  NULL,
              DRICDOCREGOLAZ     DATE           NULL,
              NPERCPREMINREGOLAZ DECIMAL(6, 2)  NULL,
              NPERCSCONTO        DECIMAL(6, 2)  NULL,
              NPERCSCONTO2       DECIMAL(6, 2)  NULL,
              NIMPSCONTO         DECIMAL(17, 3) NULL,
              NIMPSCONTO2        DECIMAL(17, 3) NULL,
              EMODOINSERSCONTO   DECIMAL(5, 0)  NULL,
              EMODOINSERSCONTO2  DECIMAL(5, 0)  NULL,
              BINTERROMPICATENA  DECIMAL(1, 0)  NULL,
              CCODICESEDE        VARCHAR(18)    NULL,
              NPERCSCONTOEFF     DECIMAL(6, 2)  NULL,
              NIMPSCONTOEFF      DECIMAL(17, 3) NULL,
              NIMPTOTIMPONIBILE  DECIMAL(17, 3) NULL,
              NIMPTOTLORDO       DECIMAL(17, 3) NULL,
              CCODICECAMPAGNA    VARCHAR(6)     NULL,
              DCAMBIO            DATE           NULL,
              NTASSOCAMBIO       DECIMAL(18, 6) NULL,
              NPERCACC           DECIMAL(6, 2)  NULL,
              NIMPTOTNETTO       DECIMAL(17, 3) NULL,
              NIMPTOTINTFRAZ     DECIMAL(17, 3) NULL,
              NIMPTOTIMPOSTE     DECIMAL(17, 3) NULL,
              NIMPSSN            DECIMAL(17, 3) NULL,
              IDCOUPON           DECIMAL(18, 0) NULL,
              NGGMORA            DECIMAL(5, 0)  NULL,
              EPROVENIENZAPROP   DECIMAL(18, 0) NULL,
              IDADDRESS          DECIMAL(18, 0) NULL,
              IDPARTNER          DECIMAL(18, 0) NULL,
              IDPARTNERAGENCY    DECIMAL(18, 0) NULL,
              PRIMARY KEY (IDPOLIZZA,
                           NVERINIZIO,
                           NVERFINE,
                           IDPVGESTIONE,
                           ETIPOCOASS)
          );
		  DROP TABLE IF EXISTS PGTITOLO;
		  CREATE TABLE PGTITOLO
          (
              IDTITOLO           DECIMAL(18, 0) PRIMARY KEY,
              BTITOLOAPPORTO     DECIMAL(1, 0)  NULL DEFAULT 0,
              ESTATOPAGAMENTO    DECIMAL(18, 0) NULL,
              DATTILEGALI        DATE           NULL,
              NIMPORTOPROVV      DECIMAL(17, 3) NULL,
              CNUMPOLIZZA        VARCHAR(25)    NULL,
              BPROPOSTA          DECIMAL(1, 0)  NULL DEFAULT 0,
              ESTATO             DECIMAL(18, 0) NULL,
              NIMPORTO           DECIMAL(17, 3) NULL,
              DSCADENZA          DATE           NULL,
              BINCASSO100        DECIMAL(1, 0)  NULL DEFAULT 0,
              DEFFETTO           DATE           NULL,
              NIMPORTOTOTALE     DECIMAL(17, 3) NULL,
              ECARICOSOTTOTIPO   DECIMAL(18, 0) NULL,
              NAPPENDICE         DECIMAL(5, 0)  NULL,
              CNUMPROPOSTA       VARCHAR(16)    NULL,
              DEMISSIONE         DATE           NULL,
              DBOLLATO           DATE           NULL,
              ECARICOTIPO        DECIMAL(18, 0) NULL,
              DCARICO            DATE           NULL,
              IDCOMPAGNIA        DECIMAL(18, 0) NULL,
              IDNODO             DECIMAL(18, 0) NULL,
              IDCAUSALE          DECIMAL(18, 0) NULL,
              IDDIVISA           DECIMAL(5, 0)  NULL,
              IDCONTORB          DECIMAL(18, 0) NULL,
              IDPAGAMENTO        DECIMAL(18, 0) NULL,
              IDPRODOTTO         DECIMAL(10, 0) NULL,
              IDCONTRAENTE       DECIMAL(18, 0) NULL,
              IDASSICURATO       DECIMAL(18, 0) NULL,
              BSTORNATO          DECIMAL(1, 0)  NULL DEFAULT 0,
              IDMOTIVOANNULLO    DECIMAL(18, 0) NULL,
              BSUPPLETIVO        DECIMAL(1, 0)  NULL DEFAULT 0,
              BINVIATOCOGE       DECIMAL(1, 0)  NULL DEFAULT 0,
              IDGRUPPOTITOLI     DECIMAL(18, 0) NULL,
              IDTITOLOCOLLEGATO  DECIMAL(18, 0) NULL,
              BGRUPPOTITOLI      DECIMAL(1, 0)  NULL DEFAULT 0,
              IDNODOSECONDARIO   DECIMAL(18, 0) NULL,
              IDFILIALE          DECIMAL(18, 0) NULL,
              BPRINCIPALE        DECIMAL(1, 0)  NULL DEFAULT 0,
              BPROVVPREC         DECIMAL(1, 0)  NULL DEFAULT 0,
              ETIPOCOASS         DECIMAL(18, 0) NULL,
              NSOPRAVVENIENZA    DECIMAL(17, 3) NULL,
              IDPRODUTTORE       DECIMAL(18, 0) NULL,
              CNUMSINISTRO       VARCHAR(25)    NULL,
              CNUMRECUPERO       VARCHAR(20)    NULL,
              IDUSERINS          DECIMAL(18, 0) NULL,
              IDUSERMOD          DECIMAL(18, 0) NULL,
              DINS               TIMESTAMP(6)   NULL,
              DMOD               TIMESTAMP(6)   NULL,
              CPROVRESCONTRAENTE VARCHAR(4)     NULL,
              DNOTIFICA          TIMESTAMP(6)   NULL,
              IDSOGGETTORECUPERO DECIMAL(18, 0) NULL,
              BALTRIONERI        DECIMAL(1, 0)  NULL DEFAULT 0,
              NIMPORTOTOTQUOTE   DECIMAL(17, 3) NULL,
              NPERCNOSTRA        DECIMAL(6, 2)  NULL,
              DCOMPETENZARIASS   DATE           NULL,
              IDNODOGESTIONE     DECIMAL(18, 0) NULL,
              BEMESSODIREZIONE   DECIMAL(1, 0)  NULL DEFAULT 0,
              NIMPORTOSPESE      DECIMAL(17, 3) NULL,
              IDNODOINCASSO      DECIMAL(18, 0) NULL,
              DINCASSO           DATE           NULL,
              BMIGRATO           DECIMAL(1, 0)  NULL DEFAULT 0,
              CNOTE              VARCHAR(2000)  NULL,
              BRIPRISTINATO      DECIMAL(1, 0)  NULL DEFAULT 0,
              IDTITOLOSTORNATO   DECIMAL(18, 0) NULL,
              BRIASS             DECIMAL(1, 0)  NULL DEFAULT 0,
              DESIGIBILITA       DATE           NULL,
              BANNULLOCONTABILE  DECIMAL(1, 0)  NULL DEFAULT 0,
              CCODICEGESTIONE    VARCHAR(6)     NULL,
              DTRASFCONT         TIMESTAMP(6)   NULL,
              NIMPORTOFONDO      DECIMAL(17, 3) NULL,
              CNUMLIQUID         VARCHAR(20)    NULL,
              NLPSIMPORTO        DECIMAL(17, 3) NULL,
              CDESCAPPENDICE     VARCHAR(100)   NULL,
              DSTORNO            DATE           NULL,
              ETIPORAPPEL        DECIMAL(18, 0) NULL,
              ETIPOINCASSO       DECIMAL(18, 0) NULL,
              DANNULLO           DATE           NULL,
              EMODINCASSOCOASS   DECIMAL(18, 0) NULL,
              BRISERVAPREMI      DECIMAL(1, 0)  NULL DEFAULT 0,
              BESENTEIMPOSTE     DECIMAL(1, 0)  NULL DEFAULT 0,
              ECATEGORIAPRODOTTO DECIMAL(18, 0) NULL,
              DEFFETTIVOINCASSO  DATE           NULL,
              BVITA              DECIMAL(1, 0)  NULL DEFAULT 0,
              BAUTOESITATO       DECIMAL(1, 0)  NULL DEFAULT 0,
              DSISTEMAANNULLO    DATE           NULL,
              DDATACARICOSTORNO  DATE           NULL,
              IDFRAZ             DECIMAL(5, 0)  NULL,
              DDATAEFFETTOPOL    DATE           NULL,
              DDATASCADENZAPOL   DATE           NULL,
              ETIPORISERVAPREMI  DECIMAL(18, 0) NULL,
              DDATACAMBIO        DATE           NULL,
              NIMPTASSOCAMBIO    DECIMAL(20, 6) NULL DEFAULT 1.000000,
              IDCONTRAENTELOCK   DECIMAL(18, 0) NULL,
              IDASSICURATOLOCK   DECIMAL(18, 0) NULL,
              CSIGLANAZIONE      VARCHAR(3)     NULL,
              CPROVTASSAZIONE    VARCHAR(2)     NULL,
              IDMEANPAYMENTDATA  DECIMAL(18, 0) NULL,
              NPARTIALCOLLAMOUNT DECIMAL(17, 3) NULL,
              EREVERSEREASONDDO  DECIMAL(18, 0) NULL,
              EPROVENIENZA       DECIMAL(18, 0) NULL,
              ETIPODOCIVA        DECIMAL(18, 0) NULL DEFAULT 0,
              CNUMDOCIVA         VARCHAR(25)    NULL,
              CNUMPROTIVA        VARCHAR(25)    NULL,
              DINVOICE           DATE           NULL,
              CNUMDOCIVAANN      VARCHAR(25)    NULL,
              CNUMPROTIVAANN     VARCHAR(25)    NULL,
              IDCONTEXT          DECIMAL(18, 0) NULL,
              ECREDITCONTROL     DECIMAL(18, 0) NULL,
              ECOMMISSIONSTATUS  DECIMAL(18, 0) NULL,
              ECASHABLE          DECIMAL(18, 0) NULL DEFAULT 4,
              IDPAYERLOCK        DECIMAL(18, 0) NULL,
              NEXTRACOMMNET      DECIMAL(17, 3) NULL,
              NEXTRACOMMFEE      DECIMAL(17, 3) NULL,
              EMARKER            DECIMAL(18, 0) NULL,
              CMASTERPOLICY      VARCHAR(25)    NULL
          );
