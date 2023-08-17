package model.services;

import model.entites.Aluguelcarro;
import model.entites.Invoice;

public class RentalServices {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private BrazilTaxService taxServices;

	public RentalServices(Double pricePerHour, Double pricePerDay, BrazilTaxService taxServices) {

		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxServices = taxServices;
	}
	
	public void processInvoice(Aluguelcarro aluguelCarro) {
		
		aluguelCarro.setInvoice(new Invoice(50.0, 10.0));
	}
	
}
