package metodos.exercitando;

public class Usuario {
    public static void main(String[] args) {
        /*
        Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
        1. Ela tenha as características: ligada (boolean), canal (int) e volume (int);
        2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
        3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
        4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.
        */

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada: " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
}
