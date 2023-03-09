public class Exec1 {

	public static void main(String[] args) {
	
		MyIO.println("---------- Sistema para correcao de provas -----------");
		String gabarito = MyIO.readString("Insira o gabarito das 8 questoes: ").substring(0, 8);
		int aprovado = 0;
		
		for (int i = 0; i < 10; i++) {
			MyIO.println("");
			int numAluno = MyIO.readInt("Insira o numero do aluno ");
		    String gabaritoAlun = MyIO.readString("Insira o gabarito do aluno: ").substring(0, 8);
		    int acertos = 0;
			int erros = 0;
		    
		    for (int j = 0; j < 8; j++) {
		    		
		    	if (gabarito.charAt(j) == gabaritoAlun.charAt(j))
		    	 acertos ++;
		    	else 
		    	 erros ++;
		    }  
		    
		   MyIO.println("Quantidade de acertos do aluno " +numAluno+ " eh de: " + acertos);
		   MyIO.println("Quantidade de erros do aluno " +numAluno+ " eh de: " + erros);
		   if (acertos >= 5) {
			   MyIO.println("O aluno numero " +numAluno+ " foi aprovado!");
			   aprovado ++;
		   }
		   else
			   MyIO.println("O aluno numero " +numAluno+ " foi reprovado!");
		}
		
		double taxaAprov = 0;	
		taxaAprov = (aprovado * 100)/10;		
		MyIO.println("A taxa de aprovados da turma eh de: " +taxaAprov+ "%");
	}
}
