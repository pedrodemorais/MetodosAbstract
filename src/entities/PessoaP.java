package entities;

public abstract class PessoaP {
	private String nomePessoa;
	private Double rendaAnual;
	protected Double valorImposto;

	public PessoaP() {

	}

	public PessoaP(String nomePessoa, Double rendaAnual) {
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
