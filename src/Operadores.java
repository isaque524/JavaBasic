public class Operadores {
    public static void main(String[] args) {
        boolean variavel1 = true;
        boolean variavel2 = false;

        if (variavel1 && (7 > 2)) {
            System.out.println("As duas variaveis sao verdadeiras");
        } else if (variavel1 || variavel2) {
            System.out.println("Uma das variaveis e verdadeira");
        } else {
            System.out.println("Nenhuma das variaveis e verdadeira");
        }

        System.out.println("fim do programa");

    }

}
