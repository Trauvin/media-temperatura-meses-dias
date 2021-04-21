package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Temperature;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Temperature> list = new ArrayList<>();
		
		System.out.print("Quantos meses serão analisados? ");
		int n = sc.nextInt();
		
		int days = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Qual o nome do mês #" + (i+1) + ": ");
			sc.nextLine();
			String month = sc.nextLine();
			
			System.out.print("Quantos dias serão analisados? ");
			days = sc.nextInt();
			
			for (int j=0; j<days; j++) {
				System.out.print("Digite a temperatura do dia #" + (j+1) + ": " );
				
				double temp = sc.nextDouble();
				
				int daysMonth = (j+1);
				
				list.add(new Temperature(month, temp, daysMonth));
			}
			
			
		}
		
		for (Temperature t : list) {
			System.out.println(t);
		}
		
		double sum = 0.0;
		for (Temperature temp : list) {
			sum += temp.getTemp();
		}
		
		double avg = sum / (days * n);
		
		System.out.printf("A média de temperatura dos meses foi: %.2f C", avg);
		
		sc.close();
	}

}
