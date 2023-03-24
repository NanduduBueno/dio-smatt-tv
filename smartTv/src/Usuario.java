public class Usuario {
    public static void main(String[] argds) {
        SmartTv smartTv= new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(smartTv.canal);

        smartTv.mudarCanal(7);  

        System.out.println(smartTv.canal);

        System.out.println("Volume atual: " + smartTv.volume);
         
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status " + smartTv.ligada);
        
    }
    
}
