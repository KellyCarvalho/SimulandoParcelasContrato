package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contrato {
	
	private int numero;
	protected static Date dataInicio;
	private Date dataFinal;
	private PaypallService paypallService;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Contrato() {
		super();
	}
	public Contrato(int numero, Date dataInicio,PaypallService paypallService) {
		
		this.numero = numero;
		this.dataInicio=dataInicio;
        this.paypallService = paypallService;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Contrato: "+numero+"\n");
		sb.append("Data de Início: "+sdf.format(dataInicio)+"\n");
		sb.append("Valores: "+"\n");
		sb.append(paypallService);
		return sb.toString();
	}
	
	
	
	

}
