package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.dao.IndicadoresDAO;
import model.dominio.Indicadores;

@ManagedBean(name = "indicadoresMB")
@RequestScoped
public class IndicadoresMB {

	private Indicadores i = new Indicadores();
	private IndicadoresDAO indicadoresdao = new IndicadoresDAO();

	public Indicadores getI() {
		return i;
	}

	public void setI(Indicadores i) {
		this.i = i;
	}

	public IndicadoresDAO getIndicadoresdao() {
		return indicadoresdao;
	}

	public void setIndicadoresdao(IndicadoresDAO indicadoresdao) {
		this.indicadoresdao = indicadoresdao;
	}

	public String SalvarIndicadores() {
		this.indicadoresdao.salvar(i);

		return "";
	}

}
