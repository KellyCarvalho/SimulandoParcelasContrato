package application;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import model.entites.Contrato;
import model.entites.PaypallService;

public class Program {

	public static void main(String[] args) throws ParseException {
			
			Calendar c =  Calendar.getInstance();
			Scanner sc = new Scanner(System.in);
			
		
			Date dataInicio = c.getTime();
			
				System.out.println("Número do contrato");
			 	int numero = sc.nextInt();
	
			 	System.out.println("Informe o número de meses do contrato");
			 	int meses = sc.nextInt();
			 	System.out.println("Informe o valor do contrato");
			 	double valor = sc.nextDouble();
			 	
			 	Contrato contrato = new Contrato(numero,dataInicio,new PaypallService(Math.ceil(valor),meses));
			 	System.out.println("Dados do contrato: "+contrato);
			
		

	}

}
