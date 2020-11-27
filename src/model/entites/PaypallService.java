package model.entites;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PaypallService implements ServicoPagamento {
	
	public double juros;
	public double taxa;
	public double valor;
	public int parcelas;
	public String[] datas;
	Calendar c =  Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	

 public PaypallService(double valor, int parcelas) {
	
		this.valor = valor;
		this.parcelas = parcelas;
		datas = new String[parcelas];
		valor(valor,parcelas);
		calcularParcelas();
		
	}

public double valor(double valor,int parcelas) {
	 if(parcelas>1) {
		 juros = 2.0/100.0;
		 taxa = 1.0/100.0;
		 this.valor+=(valor*juros)+(valor*taxa);
		 return this.valor;
	 }else {
		 return this.valor;
	 } 
  }

public void calcularParcelas() {
		
	for(int i=0;i<parcelas;i++) {
		c.add(Calendar.MONTH, +i);
		double valorParaFormatar=0;
		DecimalFormat df = new DecimalFormat("#.##");
	if(i==1) {
		valorParaFormatar=valor(valor,i+1);
		this.datas[i]=sdf.format(c.getTime())+" - "+df.format(valorParaFormatar);
	}else {
		 valorParaFormatar=valor(valor,i);
		
		
		this.datas[i]=sdf.format(c.getTime())+" - "+df.format(valorParaFormatar);
	}
		
		
	}
	 
}


public double getValor() {
	return valor;
}





public String toString() {
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<datas.length;i++) {
		sb.append(datas[i]+"\n");
		
	}
	
	
	return sb.toString();
	
	
}












	

}
