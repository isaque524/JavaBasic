package ExercicioTV;

public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        System.out.println("Volume atual? " + smartTv.volume);// inicialmente 25
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Canal atual? " + smartTv.canal);// inicialmente 1
        smartTv.mudarCanal(10);
        smartTv.aumentarCanal();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);// agora 11
        System.out.println("Volume atual? " + smartTv.volume); // agora 22

    }

}
