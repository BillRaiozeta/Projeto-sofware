package Entidade;

public class POO {

public static void main(String[] args) {


	Carro civic =new Carro();
	civic.fabricante="Honda";
	civic.modelo="Civic";
	civic.placa="EUB-6530";
	civic.ano=2022;
	civic.cor="Preta";
	
	Carro kicks= new Carro();
	kicks.fabricante= "Nissan";
	kicks.modelo="Kicks SV";
	kicks.placa="kicks SV";
	kicks.ano=2023;
	kicks.cor="prata";
			
    
}
public class Carro {
	String fabricante;
	String modelo;
	int ano;
	String placa;
	String cor;
}