package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisicaP;
import entities.PessoaJuridicaP;
import entities.PessoaP;

public class ProgramP {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<PessoaP> list = new ArrayList<>();
		int numOfPayers;
		int NumberOfEmployees;
		char pjOurPf;
		String namePessoa;
		Double anualIncome;
		Double HealthExpenditures;

		System.out.print("Enter the number of tax payers:");
		numOfPayers = input.nextInt();

		for (short i = 0; i < numOfPayers; i++) {
			
			System.out.println("Tax payer #" + (i + 1) + " data:");

			System.out.print("Individual or company (i/c)?");
			pjOurPf = input.next().charAt(0);
			
			System.out.print("Name: "+ input.nextLine());
			namePessoa = input.nextLine();
			
			System.out.print("Anual income: ");
			anualIncome = input.nextDouble();
			
			if (pjOurPf == 'i') {
				
				System.out.print("Health expenditures: ");
				HealthExpenditures = input.nextDouble();
				PessoaP pessoa = new PessoaFisicaP(namePessoa, anualIncome, HealthExpenditures);
				list.add(pessoa);

			} else if (pjOurPf == 'c') {
				System.out.print("Number of employees: ");
				NumberOfEmployees = input.nextInt();
				PessoaP pessoa = new PessoaJuridicaP(namePessoa, anualIncome, NumberOfEmployees);	
				list.add(pessoa);
				
						} else

				break;

		}

		
		Double sum=0.0;		
		System.out.println("TAXES PAID:");
		
		for(PessoaP x: list) {
				Double total = x.calcularImposto();
				System.out.println(" $ "+String.format("%.2f", x));
				sum+=total;
			}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		input.close();

	}

}
