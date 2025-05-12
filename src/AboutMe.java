import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ", tenho " + idade + " anos e minha altura é "
                + altura + "cm");
    }


     public static void main(String[] args) throws Exception {
         int numero1 = 1; String numero2 = "2";
          System.out.println(numero1+numero2); }
}
