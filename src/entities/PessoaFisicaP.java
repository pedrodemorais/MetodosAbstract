package entities;

public class PessoaFisicaP extends ContribuinteP {

	private Double gastoSaude;

	public PessoaFisicaP() {

	}

	public PessoaFisicaP(String nomePessoa, Double rendaAnual, Double gastoSaude) {
		super(nomePessoa, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public PessoaFisicaP(Double gastoSaude) {
		super();
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public final Double calcularImposto() {
		
		if (getRendaAnual() < 20000.00) {
			valorImposto = getRendaAnual() * 0.15 - (getGastoSaude() * 0.5);

		} else {
			valorImposto = getRendaAnual() * 0.25 - (getGastoSaude() * 0.5);

		}
		return valorImposto;
	}

}
