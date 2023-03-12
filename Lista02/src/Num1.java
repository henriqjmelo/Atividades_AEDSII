import java.text.DecimalFormat;

public class Num1 {

	public static void main(String[] args) {
		
		Double aumento = 0.00;
		Double total = 0.00;
	    DecimalFormat df = new DecimalFormat("#.00");
		Double salario = MyIO.readDouble("Insira o salario do funcionario: ");
		if (salario <= 1200) {
			aumento = (salario * 10)/100;
			total = salario + aumento;
			MyIO.println("O aumento equivalente a 10% do salario informado eh de:  " +df.format(aumento));
			MyIO.println("O salario mais o aumento eh equivalente a: R$:" +df.format(total));
		}
		
		else {
			aumento = (salario * 5)/100;
			total = salario + aumento;
			MyIO.println("O aumento equivalente a 5% do salario informado eh de:  " +df.format(aumento));
			MyIO.println("O salario mais o aumento eh equivalente a: R$:" +df.format(total));
		}
	
		
	}

}
