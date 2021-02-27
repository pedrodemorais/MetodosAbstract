package entities;

public abstract class ContribuinteP {
	private String nomePessoa;
	private Double rendaAnual;
	protected Double valorImposto;

	public ContribuinteP() {

	}

	public ContribuinteP(String nomePessoa, Double rendaAnual) {
		this.nomePessoa = nomePessoa;
		this.rendaAnual = rendaAnual;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	abstract public Double calcularImposto();

}
