package model.dominio;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tab_indicadores")
public class Indicadores {

	/* CHAVE PRIMÁRIA */
	@Id
	private int id;

	/* DADOS GERENCIAIS */

	/* TAG Única */
	private String info = "ColetaSTFC_InformacoesGerenciais_Autorizacao";
	private Date Ano; /* Mês de Referência da Coleta */
	private Date Mes; /* Ano de Referência da Coleta */
	private int tipoArquivo; /*
								 * Informa se o arquivo e uma carga mensal ou carga de retificação: Carga Mensal
								 * = 0, Carga de Retificadora = 1
								 */
	private String identificador = "SGQ20130001"; /* Valor único que não muda "SGQ20130001" */

	/* TAG Única */
	private String outorgaCNPJ; /* Somente números, sem máscara */

	/* DADOS DA COLETA SGQ */
	private String nivelColeta; /*
								 * Valores Possíveis: "NivelColeta_Municipio" e "NivelColeta_UnidadeFederativa
								 */

	private String unidadeColeta; /* Representa o código do Municipio da Coleta - Será inserido pelo usuário */
	private int periodoColeta = 4; /*
									 * Único valor possível é "4", representando o período da Coleta do tipo Mensal
									 */

	/*----------------------------------------------------------------------------------------------------------------*/

	/* ACESSOS EM SERVIÇO */

	/* AST - Acesso em Serviço por Tecnologia */
	private String astSemFioTerrestre058;
	private String astSatelite059;
	private String astMetalico060;
	private String astOutros061;
	private String astFibraOpticaFtth062;
	
	/* ASC - Acesso em Serviço por Classe de Assinante */
	private String ascResidencialPadrao063;
	private String ascResidencialAice064;
	private String ascNaoResidencial065;
	private String ascTronco066;

	/* ASO - Acesso em Serviço por Tipo de Oferta */
	private String asoSTFC067;
	private String asoSTFC_SCM068;
	private String asoSTFC_TV069;
	private String asoSTFC_SMP070;
	private String asoSTFC_SCM_TV071;
	private String asoSTFC_SCM_SMP072;
	private String asoSTFC_TV_SMP073;
	private String asoSTFC_SCM_TV_SMP074;

	/* ASP - Acesso em Serviço por Tipo de Serviço */
	private String aspPlanoBasico075;
	private String aspPasoo076;
	private String aspPlanoAlternativo077;

	/* ASF - Acesso em Serviço por Forma de Pagamento */
	private String asfPosPago078;
	private String asfPrePago079;
	private String asfMisto080;

	/*----------------------------------------------------------------------------------------------------------------*/

	/* MINUTAGEM */

	/* MLOCAIS */
	private String mLocaisMinutosLocaisFixoOnNet084;
	private String mLocaisMinutosLocaisFixoOffNet085;
	private String mLocaisMinutosLocaisFixoMovel086;

	/* MLDN */
	private String mldnMinutosLdnFixoFixo087;
	private String mldnMinutosLdnFixoMovel088;
	private String mldnMinutosLdnMovelFixo089;
	private String mldnMinutosLdnMovelMovel090;

	/* MLDI */
	private String mldiMinutosLdiOrigemFixo091;
	private String mldiMinutosLdiOrigemMovel092;

	/*----------------------------------------------------------------------------------------------------------------*/

	/* FORÇA DE TRABALHO */

	/* FTT */
	private String fttPropria093;
	private String fttTerceiros094;
	private String fttDealers095;

	/* FTCRM */
	private String ftcrmPropria096;
	private String ftcrmTerceiros097;

	/* FTREDE */
	private String ftredePropria098;
	private String ftredeTerceiros099;

	/*----------------------------------------------------------------------------------------------------------------*/

	/* DOCUMENTOS DE COBRANÇA */

	/* DCEM */
	private String dcemLDN081;
	private String dcemLDI082;

	/*----------------------------------------------------------------------------------------------------------------*/

	/* USO DE RECURSOS DE NUMERAÇÃO */

	/* CAD */
	private String cadDesignados083;

	/*----------------------------------------------------------------------------------------------------------------*/

	/* GETTERS AND SETTERS */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getAno() {
		return Ano;
	}

	public void setAno(Date ano) {
		Ano = ano;
	}

	public Date getMes() {
		return Mes;
	}

	public void setMes(Date mes) {
		Mes = mes;
	}

	public int getTipoArquivo() {
		return tipoArquivo;
	}

	public void setTipoArquivo(int tipoArquivo) {
		this.tipoArquivo = tipoArquivo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getOutorgaCNPJ() {
		return outorgaCNPJ;
	}

	public void setOutorgaCNPJ(String outorgaCNPJ) {
		this.outorgaCNPJ = outorgaCNPJ;
	}

	public String getNivelColeta() {
		return nivelColeta;
	}

	public void setNivelColeta(String nivelColeta) {
		this.nivelColeta = nivelColeta;
	}

	public String getUnidadeColeta() {
		return unidadeColeta;
	}

	public void setUnidadeColeta(String unidadeColeta) {
		this.unidadeColeta = unidadeColeta;
	}

	public int getPeriodoColeta() {
		return periodoColeta;
	}

	public void setPeriodoColeta(int periodoColeta) {
		this.periodoColeta = periodoColeta;
	}

	public String getAstSemFioTerrestre058() {
		return astSemFioTerrestre058;
	}

	public void setAstSemFioTerrestre058(String astSemFioTerrestre058) {
		this.astSemFioTerrestre058 = astSemFioTerrestre058;
	}

	public String getAstSatelite059() {
		return astSatelite059;
	}

	public void setAstSatelite059(String astSatelite059) {
		this.astSatelite059 = astSatelite059;
	}

	public String getAstMetalico060() {
		return astMetalico060;
	}

	public void setAstMetalico060(String astMetalico060) {
		this.astMetalico060 = astMetalico060;
	}

	public String getAstOutros061() {
		return astOutros061;
	}

	public void setAstOutros061(String astOutros061) {
		this.astOutros061 = astOutros061;
	}

	public String getAstFibraOpticaFtth062() {
		return astFibraOpticaFtth062;
	}

	public void setAstFibraOpticaFtth062(String astFibraOpticaFtth062) {
		this.astFibraOpticaFtth062 = astFibraOpticaFtth062;
	}

	public String getAscResidencialPadrao063() {
		return ascResidencialPadrao063;
	}

	public void setAscResidencialPadrao063(String ascResidencialPadrao063) {
		this.ascResidencialPadrao063 = ascResidencialPadrao063;
	}

	public String getAscResidencialAice064() {
		return ascResidencialAice064;
	}

	public void setAscResidencialAice064(String ascResidencialAice064) {
		this.ascResidencialAice064 = ascResidencialAice064;
	}

	public String getAscNaoResidencial065() {
		return ascNaoResidencial065;
	}

	public void setAscNaoResidencial065(String ascNaoResidencial065) {
		this.ascNaoResidencial065 = ascNaoResidencial065;
	}

	public String getAscTronco066() {
		return ascTronco066;
	}

	public void setAscTronco066(String ascTronco066) {
		this.ascTronco066 = ascTronco066;
	}

	public String getAsoSTFC067() {
		return asoSTFC067;
	}

	public void setAsoSTFC067(String asoSTFC067) {
		this.asoSTFC067 = asoSTFC067;
	}

	public String getAsoSTFC_SCM068() {
		return asoSTFC_SCM068;
	}

	public void setAsoSTFC_SCM068(String asoSTFC_SCM068) {
		this.asoSTFC_SCM068 = asoSTFC_SCM068;
	}

	public String getAsoSTFC_TV069() {
		return asoSTFC_TV069;
	}

	public void setAsoSTFC_TV069(String asoSTFC_TV069) {
		this.asoSTFC_TV069 = asoSTFC_TV069;
	}

	public String getAsoSTFC_SMP070() {
		return asoSTFC_SMP070;
	}

	public void setAsoSTFC_SMP070(String asoSTFC_SMP070) {
		this.asoSTFC_SMP070 = asoSTFC_SMP070;
	}

	public String getAsoSTFC_SCM_TV071() {
		return asoSTFC_SCM_TV071;
	}

	public void setAsoSTFC_SCM_TV071(String asoSTFC_SCM_TV071) {
		this.asoSTFC_SCM_TV071 = asoSTFC_SCM_TV071;
	}

	public String getAsoSTFC_SCM_SMP072() {
		return asoSTFC_SCM_SMP072;
	}

	public void setAsoSTFC_SCM_SMP072(String asoSTFC_SCM_SMP072) {
		this.asoSTFC_SCM_SMP072 = asoSTFC_SCM_SMP072;
	}

	public String getAsoSTFC_TV_SMP073() {
		return asoSTFC_TV_SMP073;
	}

	public void setAsoSTFC_TV_SMP073(String asoSTFC_TV_SMP073) {
		this.asoSTFC_TV_SMP073 = asoSTFC_TV_SMP073;
	}

	public String getAsoSTFC_SCM_TV_SMP074() {
		return asoSTFC_SCM_TV_SMP074;
	}

	public void setAsoSTFC_SCM_TV_SMP074(String asoSTFC_SCM_TV_SMP074) {
		this.asoSTFC_SCM_TV_SMP074 = asoSTFC_SCM_TV_SMP074;
	}

	public String getAspPlanoBasico075() {
		return aspPlanoBasico075;
	}

	public void setAspPlanoBasico075(String aspPlanoBasico075) {
		this.aspPlanoBasico075 = aspPlanoBasico075;
	}

	public String getAspPasoo076() {
		return aspPasoo076;
	}

	public void setAspPasoo076(String aspPasoo076) {
		this.aspPasoo076 = aspPasoo076;
	}

	public String getAspPlanoAlternativo077() {
		return aspPlanoAlternativo077;
	}

	public void setAspPlanoAlternativo077(String aspPlanoAlternativo077) {
		this.aspPlanoAlternativo077 = aspPlanoAlternativo077;
	}

	public String getAsfPosPago078() {
		return asfPosPago078;
	}

	public void setAsfPosPago078(String asfPosPago078) {
		this.asfPosPago078 = asfPosPago078;
	}

	public String getAsfPrePago079() {
		return asfPrePago079;
	}

	public void setAsfPrePago079(String asfPrePago079) {
		this.asfPrePago079 = asfPrePago079;
	}

	public String getAsfMisto080() {
		return asfMisto080;
	}

	public void setAsfMisto080(String asfMisto080) {
		this.asfMisto080 = asfMisto080;
	}

	public String getmLocaisMinutosLocaisFixoOnNet084() {
		return mLocaisMinutosLocaisFixoOnNet084;
	}

	public void setmLocaisMinutosLocaisFixoOnNet084(String mLocaisMinutosLocaisFixoOnNet084) {
		this.mLocaisMinutosLocaisFixoOnNet084 = mLocaisMinutosLocaisFixoOnNet084;
	}

	public String getmLocaisMinutosLocaisFixoOffNet085() {
		return mLocaisMinutosLocaisFixoOffNet085;
	}

	public void setmLocaisMinutosLocaisFixoOffNet085(String mLocaisMinutosLocaisFixoOffNet085) {
		this.mLocaisMinutosLocaisFixoOffNet085 = mLocaisMinutosLocaisFixoOffNet085;
	}

	public String getmLocaisMinutosLocaisFixoMovel086() {
		return mLocaisMinutosLocaisFixoMovel086;
	}

	public void setmLocaisMinutosLocaisFixoMovel086(String mLocaisMinutosLocaisFixoMovel086) {
		this.mLocaisMinutosLocaisFixoMovel086 = mLocaisMinutosLocaisFixoMovel086;
	}

	public String getMldnMinutosLdnFixoFixo087() {
		return mldnMinutosLdnFixoFixo087;
	}

	public void setMldnMinutosLdnFixoFixo087(String mldnMinutosLdnFixoFixo087) {
		this.mldnMinutosLdnFixoFixo087 = mldnMinutosLdnFixoFixo087;
	}

	public String getMldnMinutosLdnFixoMovel088() {
		return mldnMinutosLdnFixoMovel088;
	}

	public void setMldnMinutosLdnFixoMovel088(String mldnMinutosLdnFixoMovel088) {
		this.mldnMinutosLdnFixoMovel088 = mldnMinutosLdnFixoMovel088;
	}

	public String getMldnMinutosLdnFixoMovelFixo089() {
		return mldnMinutosLdnMovelFixo089;
	}

	public void setMldnMinutosLdnFixoMovelFixo089(String mldnMinutosLdnFixoMovelFixo089) {
		this.mldnMinutosLdnMovelFixo089 = mldnMinutosLdnFixoMovelFixo089;
	}

	public String getMldnMinutosLdnMovelMovel090() {
		return mldnMinutosLdnMovelMovel090;
	}

	public void setMldnMinutosLdnMovelMovel090(String mldnMinutosLdnMovelMovel090) {
		this.mldnMinutosLdnMovelMovel090 = mldnMinutosLdnMovelMovel090;
	}

	public String getMldiMinutosLdiOrigemFixo091() {
		return mldiMinutosLdiOrigemFixo091;
	}

	public void setMldiMinutosLdiOrigemFixo091(String mldiMinutosLdiOrigemFixo091) {
		this.mldiMinutosLdiOrigemFixo091 = mldiMinutosLdiOrigemFixo091;
	}

	public String getMldiMinutosLdiOrigemMovel092() {
		return mldiMinutosLdiOrigemMovel092;
	}

	public void setMldiMinutosLdiOrigemMovel092(String mldiMinutosLdiOrigemMovel092) {
		this.mldiMinutosLdiOrigemMovel092 = mldiMinutosLdiOrigemMovel092;
	}

	public String getFttPropria093() {
		return fttPropria093;
	}

	public void setFttPropria093(String fttPropria093) {
		this.fttPropria093 = fttPropria093;
	}

	public String getFttTerceiros094() {
		return fttTerceiros094;
	}

	public void setFttTerceiros094(String fttTerceiros094) {
		this.fttTerceiros094 = fttTerceiros094;
	}

	public String getFttDealers095() {
		return fttDealers095;
	}

	public void setFttDealers095(String fttDealers095) {
		this.fttDealers095 = fttDealers095;
	}

	public String getFtcrmPropria096() {
		return ftcrmPropria096;
	}

	public void setFtcrmPropria096(String ftcrmPropria096) {
		this.ftcrmPropria096 = ftcrmPropria096;
	}

	public String getFtcrmTerceiros097() {
		return ftcrmTerceiros097;
	}

	public void setFtcrmTerceiros097(String ftcrmTerceiros097) {
		this.ftcrmTerceiros097 = ftcrmTerceiros097;
	}

	public String getFtredePropria098() {
		return ftredePropria098;
	}

	public void setFtredePropria098(String ftredePropria098) {
		this.ftredePropria098 = ftredePropria098;
	}

	public String getFtredeTerceiros099() {
		return ftredeTerceiros099;
	}

	public void setFtredeTerceiros099(String ftredeTerceiros099) {
		this.ftredeTerceiros099 = ftredeTerceiros099;
	}

	public String getDcemLDN081() {
		return dcemLDN081;
	}

	public void setDcemLDN081(String dcemLDN081) {
		this.dcemLDN081 = dcemLDN081;
	}

	public String getDcemLDI082() {
		return dcemLDI082;
	}

	public void setDcemLDI082(String dcemLDI082) {
		this.dcemLDI082 = dcemLDI082;
	}

	public String getCadDesignados083() {
		return cadDesignados083;
	}

	public void setCadDesignados083(String cadDesignados083) {
		this.cadDesignados083 = cadDesignados083;
	}

}
