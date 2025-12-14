import java.util.Scanner;

public class Calc{
    //Uso de funções para aprendizado 
    public static int Calcular(int escolha,int n1,int n2){
        if (escolha == 1){
            return n1 + n2;
        }else if (escolha == 2){
            return n1 - n2;
        }else if (escolha == 3){
            return n1 / n2;
        }else if(escolha == 4){
            return n1 * n2;
        }else if(escolha == 6){
            return 6;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){
        System.out.println("Escolha uma operação:");
        System.out.println("1-Soma");
        System.out.println("2-Subitração");
        System.out.println("3-Divisão");
        System.out.println("4-Multiplicação");
        System.out.println("5-Media");
        System.out.println("6-Sair");
        int escolha = entrada.nextInt();
        if (escolha == 5){
            System.out.println("Diga os 3 valores:");
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();
        }else{
            System.out.println("Agora me diga o 1 numero:");
            int n1 = entrada.nextInt();
            System.out.println("Me diga o 2 numero:");
            int n2 = entrada.nextInt();
            int resultado = Calcular(escolha,n1,n2);
            if (resultado == 0){
                System.out.println("Sugira uma opção valida");
            }else if (resultado == 6){
                System.out.println("fechando..");
                break;
            }else{
                System.out.println("Resultado:"+resultado);
            }
            }
        }
        entrada.close();
    }
}