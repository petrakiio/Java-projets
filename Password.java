import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Password {

    public static void verificarSenha(File arquivo, String senha) throws FileNotFoundException {
        Scanner scanner = new Scanner(arquivo);
        boolean encontrada = false;

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            if (linha.equals(senha)) {
                System.out.println("Sua senha está na wordlist!");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Sua senha NÃO está na wordlist. Mais segura 👍");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        File arquivo = new File("rockyou.txt");
        System.out.println("Me diga sua senha para verificarmos");
        String senha = entrada.next(); // senha que você quer verificar

        try {
            verificarSenha(arquivo, senha);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
