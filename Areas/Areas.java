import javax.swing.*;
import java.util.*;
public class Areas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: circulo");

        int figura = entrada.nextInt();
        switch (figura) {

            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

                System.out.println("El área del cuadrado es" + Math.pow(lado, 2));

                break;
            case 2:

                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la  base"));

                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El area del rectángulo es " + base * altura);

                break;

            case 3:

                base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("el area del triangulo es" + (base * altura / 2));

                break;

            case 4:

                int radio = Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));

                System.out.println("el radio del circulo es ");

                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));

                break;


            default:

                System.out.println("la opción no es correcta");
        }

        }

    }