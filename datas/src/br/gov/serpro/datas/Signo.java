package br.gov.serpro.datas;

import java.time.LocalDate;

public class Signo {
	
	private String nome;
	private int mes;
	private int dia;

	public Signo(int mes, int dia) {
		this.mes = mes;
		this.dia = dia;
		obterSigno();
	}
	
	
	private String obterSigno() {
		if (mes ==1 && dia == 20 && mes ==2 && dia <19)
	        return this.nome ="aquarios";
	   else
	   if (mes==2 && dia>18 || mes==3 && dia<20)
	        return  this.nome ="peixes";
	   else
	   if (mes==3 && dia>19 || mes==4 && dia<21)
	        return this.nome = "áries";
	   else
	   if (mes==4 && dia>20 || mes==5 && dia<21)
	        return this.nome = "Touro";
	   else
	   if (mes==5 && dia>20 || mes==6 && dia<21)
	        return this.nome = "gêmeos";
	   else
	   if (mes==6 && dia>20 || mes==7 && dia<22)
	        return this.nome = "cancêr";
	   else
	   if (mes==7 && dia>21 || mes==8 && dia<23)
	        return this.nome = "leão";
	   else
	   if (mes==8 && dia>22 || mes==9 && dia<23)
	        return  this.nome ="virgem";
	   else
	   if (mes==9 && dia>22 || mes==10 && dia<23)
	        return this.nome ="libra";
	   else
	   if (mes==10 && dia>22 || mes==11 && dia<22)
	        return this.nome ="escorpião";
	   else
	   if (mes==11 && dia>21 || mes==12 && dia<22)
	        return this.nome ="sagitario";
	   else
	 //  (mes==12 && dia>21 || mes==1 && dia<22)
	        return this.nome ="capricornio";
		 
		 
		//return "erro";

	}


	@Override
	public String toString() {
		return  nome;
	}

}