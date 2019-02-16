package com.libertese.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name="veiculo_informacoes")
public class VeiculoInformacoes {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_VEICULO")
	@SequenceGenerator(name="SEQ_VEICULO", sequenceName="id_seq_veiculo", allocationSize=1)
	@Column(name="id_veiculo")
	private int id;

	@OneToOne
	@JoinColumn(name = "cotacao_id")
	private Cotacao cotacao;
	
	@Column
	private String placa;
	
	@Column
	private String chassi;
	
	@Column
	private String marca;
	
	@Column
	private int ano_modelo;
	
	@Column
	private String tipo_combustivel;
	
	@Column
	private String tipo_veiculo;
	
	@Column
	private boolean zero_km;
	
	@Column
	private boolean acidente;
	
	@Column
	private boolean brindado;

	
	public VeiculoInformacoes(Cotacao cotacao, String placa, String chassi, String marca, int ano_modelo,
			String tipo_combustivel, String tipo_veiculo, boolean zero_km, boolean acidente, boolean brindado) {
		super();
		this.cotacao = cotacao;
		this.placa = placa;
		this.chassi = chassi;
		this.marca = marca;
		this.ano_modelo = ano_modelo;
		this.tipo_combustivel = tipo_combustivel;
		this.tipo_veiculo = tipo_veiculo;
		this.zero_km = zero_km;
		this.acidente = acidente;
		this.brindado = brindado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cotacao getCotacao() {
		return cotacao;
	}

	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno_modelo() {
		return ano_modelo;
	}

	public void setAno_modelo(int ano_modelo) {
		this.ano_modelo = ano_modelo;
	}

	public String getTipo_combustivel() {
		return tipo_combustivel;
	}

	public void setTipo_combustivel(String tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}

	public String getTipo_veiculo() {
		return tipo_veiculo;
	}

	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}

	public boolean isZero_km() {
		return zero_km;
	}

	public void setZero_km(boolean zero_km) {
		this.zero_km = zero_km;
	}

	public boolean isAcidente() {
		return acidente;
	}

	public void setAcidente(boolean acidente) {
		this.acidente = acidente;
	}

	public boolean isBrindado() {
		return brindado;
	}

	public void setBrindado(boolean brindado) {
		this.brindado = brindado;
	}

}
