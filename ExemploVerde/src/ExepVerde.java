import java.util.Scanner;

public class ExepVerde {

    public static void main(String[] args) {
        
        String linha;
        
        do {
            linha = MyIO.readLine(); 
            if (!linha.equals("FIM")) { 
            	int maiusculas = 0;
                for (int i = 0; i < linha.length(); i++) {
                    char letra = linha.charAt(i);
                    if (Character.isUpperCase(letra)) {
                        maiusculas++;
                    }    
                }
                MyIO.println(maiusculas);
            }
        } while (!linha.equals("FIM")); 
    }
}