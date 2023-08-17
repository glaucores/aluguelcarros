package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entites.Aluguelcarro;
import model.entites.veiculos;
import model.services.BrazilTaxService;
import model.services.RentalServices;

public class Program {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);	

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy.HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro:");
		String carModel = sc.nextLine();
		System.out.println("Retirada (dd/MM/yyyy hh:mm):");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm):");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		Aluguelcarro arc = new Aluguelcarro(start, finish, new veiculos (carModel), null);
		
		System.out.println("Entre com o preço por hora");
		double pricePerHour = sc.nextDouble();
		System.out.println("Entre com o preço por dia");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalServices.processInvoice(arc);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento Basico:" + arc.getInvoice().getBasicPayment());
		System.out.println("Imposto:" + arc.getInvoice().getTax());
		
		sc.close();
	}

}
