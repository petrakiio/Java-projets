import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class arquivos{
    public static void main(String[] args) {
        try {
            File arquivo = new File("password-wordlist.txt");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
