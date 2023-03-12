import java.text.DecimalFormat;

public class Num3 {

	public static void main(String[] args) {
		
		int contador = 0;
		Double total = 0.00;
		DecimalFormat df = new DecimalFormat("#.00");
		
        for (int i = 1; i <= 5; i++) {
			
			Double velocidade = MyIO.readDouble("Insira a velocidade do veiculo numero " +i+ ":");
			
			if (velocidade > 60)
			   contador++;			
		}
        
        total = (double)contador * 150;
        
        MyIO.println("O numero de veiculos multados foi de: " +contador);
        MyIO.println("O total arrecadado com a multa desses veiculos foi de: " +df.format(total));
        
	}

}
