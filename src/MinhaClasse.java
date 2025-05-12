public class MinhaClasse {

    public static void main(String[] args) {
        String PrimeiroNome = "Isaque";
        String UltimoNome = "Silva";
        String NomeCompleto = PrimeiroNomeUltimoNome(PrimeiroNome, UltimoNome);
        System.out.println("Nome Completo: " + NomeCompleto);
    }

    public static String PrimeiroNomeUltimoNome(String PrimeiroNome, String UltimoNome) {
        return PrimeiroNome.concat(" ").concat(UltimoNome);
    }

}