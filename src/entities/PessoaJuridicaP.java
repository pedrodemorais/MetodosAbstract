package entities;

public class PessoaJuridicaP extends ContribuinteP {

	private int numeroDeFuncionarios;

	public PessoaJuridicaP(String nomePessoa, Double rendaAnual, int numeroDeFuncionarios) {
		super(nomePessoa, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		
		
		if(getNumeroDeFuncionarios()<10) {
			valorImposto= getRendaAnual()*0.16;
			
			
		}else {
			valorImposto= getRendaAnual()*0.14;
			
		}
		return valorImposto ;
	}

}
