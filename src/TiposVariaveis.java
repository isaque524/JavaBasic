public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salario = 1000.57;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // conversao implicita
        short numeroCurto2 = (short) numeroNormal; // conversao explicita
        // short numeroCurto2 = numeroNormal; // erro de compilacao, conversao implicita
        // nao funciona para o contrario

        int numero = 5;
        numero = 10;

        final double PI = 3.14; // constante, valor nao pode ser alterado

        System.out.println(numero);

    }

}
