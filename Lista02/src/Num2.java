import java.text.DecimalFormat;

public class Num2 {

	public static void main(String[] args) {
		
	    Double total = 0.00;
	    Double media = 0.00;
	    int contador = 0;
	    DecimalFormat df = new DecimalFormat("#.00");

		for (int i = 1; i <= 3; i++) {
			
			Double nota = MyIO.readDouble("Insira a nota numero " +i+ " do aluno: ");
			total += nota;
			contador++;			
		}
		
		media = total / contador;
		
		if (media < 4 && media > 0) {
			MyIO.println("Aluno Reprovado!");
			MyIO.println("Media total das notas: " +df.format(media));
		}
		else if (media >= 4 && media < 6) {
			MyIO.println("Necesario fazer exame especial!");
			MyIO.println("Media total das notas: " +df.format(media));
		}
		else if (media >= 6 && media <= 10) {
			MyIO.println("Aluo Aprovado!");
			MyIO.println("Media total das notas: " +df.format(media));
		}
		else if (media < 0) {
			MyIO.println("Media total das notas: " +df.format(media)+ " esta errada porque eh um numero negativo.");
		}
		else {
			MyIO.println("Media total das notas: " +df.format(media)+ " esta errada porque passou de 10.");
		}
		
		
	}

}
