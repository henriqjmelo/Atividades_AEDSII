
public class Exec3 {

	public static void main(String[] args) {
      
		String palavra = MyIO.readLine("Insira uma palavra para ser invertida: ");
		MyIO.println("Sua palavra eh: " +palavra);
		int tamanho = palavra.length();
		MyIO.print("A palavra " +palavra+ " criptografada fica: ");
		
		
		for (int i = tamanho - 1; i >= 0; i--) {
		   MyIO.print(palavra.charAt(i));
		}
			
	}

}
