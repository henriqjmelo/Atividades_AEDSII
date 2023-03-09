import java.util.Random;

public class Exec2 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][4];
		
		Random rand = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
	       for (int j = 0; j < matriz[0].length; j++) {
	    	   matriz[i][i] = rand.nextInt(101);
	          }
	       }
	
		int maior = matriz [0][0];
		int menor = matriz [0][0];
		int linhaMaior = 0, colunaMaior = 0, linhaMenor = 0, colunaMenor = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }
			}
		}
		
		MyIO.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            MyIO.println();
        }
        MyIO.println("O maior elemento da matriz informada eh " + maior);
        MyIO.println("Sua posicao eh: [" + linhaMaior + ", " + colunaMaior + "]");
        MyIO.println("O menor elemento da matriz informada eh " + menor);
        MyIO.println("Sua posica"
        		+ "o eh: [" + linhaMenor + ", " + colunaMenor + "]");
		
		
	}
	}

