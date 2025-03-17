package poo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta janeiro =new Conta();
        Conta fevereiro =new Conta();
        
        janeiro.agua= 200;
        janeiro.luz = 300;
        janeiro.alimentacao =1000;
        
        fevereiro.agua=16;
        fevereiro.luz=1000;
        fevereiro.alimentacao=144;
        
        double gastoJan = janeiro.somaConta();
        double gastoFev = fevereiro.somaConta();
        
        if  (gastoJan > gastoFev) {System.out.println("O gasto de janeiro foi maior");
        }
        
        else if (gastoFev > gastoJan) {
        	System.out.print ("O gasto de fevereiro foi maior");
        }
 
	}

}
