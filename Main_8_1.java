import java.util.Scanner;

public class Main_8_1 {



    public static void main(String[] args) {
        Hora r = new  Hora (11, 30); // las 11,30
        System.out.println("r");
        for (int i = 1; i <= 61; i++) { //incrementamos 61 minutos
            r.inc();

        }
        System.out.println("r");
        System.out.println("escriba una hora");
        int hora = new Scanner(System.in).nextInt();
        boolean cambio = r.setHora(hora); //cambiamos la hora
        if (cambio) {
            System.out.println("r");
        } else {
            System.out.println("la hora no se pudo cambiar");

        }
                    }
}
