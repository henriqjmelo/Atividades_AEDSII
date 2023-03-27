public class ExepVerdeRec {

    public static void main(String[] args) {
        contarMaiusculas(MyIO.readLine());
    }
    
    public static void contarMaiusculas(String linha) {
        if (!linha.equals("FIM")) {
            int maiusculas = 0;
            for (int i = 0; i < linha.length(); i++) {
                char letra = linha.charAt(i);
                if (Character.isUpperCase(letra)) {
                    maiusculas++;
                }
            }
            MyIO.println(maiusculas);
            contarMaiusculas(MyIO.readLine());
        }
    }
}