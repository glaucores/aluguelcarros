package model.entites;

import java.time.LocalDateTime;

public class Aluguelcarro {

	private LocalDateTime Star;
	private LocalDateTime finish;
	
	private veiculos veiculos;
	private Invoice invoice;
	
	
	public Aluguelcarro() {
		
	}


	public Aluguelcarro(LocalDateTime star, LocalDateTime finish, veiculos veiculos, Invoice invoice) {

		Star = star;
		this.finish = finish;
		this.veiculos = veiculos;
		this.invoice = invoice;
	}


	public LocalDateTime getStar() {
		return Star;
	}


	public void setStar(LocalDateTime star) {
		Star = star;
	}


	public LocalDateTime getFinish() {
		return finish;
	}


	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}


	public veiculos getVeiculos() {
		return veiculos;
	}


	public void setVeiculos(veiculos veiculos) {
		this.veiculos = veiculos;
	}


	public Invoice getInvoice() {
		return invoice;
	}


	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	
	
}
