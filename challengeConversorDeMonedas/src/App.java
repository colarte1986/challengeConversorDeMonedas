import java.util.Scanner;

import models.ConsultarCambio;
import models.Convertir;
import models.Menu;
import models.PairConversion;

public class App {
    public static void main(String[] args) throws Exception {

        int continuar = 0;
        double valorConvertir;

        Menu menu = new Menu();
        Scanner lectura = new Scanner(System.in);

        while (continuar != 7) {

            menu.generarMenu();

            System.out.println("Elija una opcion valida: ");
            System.out.println("*******************************");
            continuar = lectura.nextInt();
            if (continuar == 7) {
                System.out.println("Gracias!!");
                break;
            }
            System.out.println("Ingrese el valor que desea convertir: ");
            valorConvertir = lectura.nextDouble();
            PairConversion pairConversion = new PairConversion();
            ConsultarCambio consultarCambio = new ConsultarCambio();
            Convertir convertir = new Convertir();

            switch (continuar) {
                case 1:
                    pairConversion = consultarCambio.buscaCambio("USD", "ARS");
                    System.out.println("El valor " + valorConvertir + " [USD] corresponde al valor final de =>>> "
                            + convertir.convertir(valorConvertir, pairConversion.getConversion_rate()) + " [ARS]");
                    break;

                case 2:
                    pairConversion = consultarCambio.buscaCambio("ARS", "USD");
                    System.out.println("El valor " + valorConvertir + " [ARS] corresponde al valor final de =>>> "
                            + convertir.convertir(valorConvertir, pairConversion.getConversion_rate()) + " [USD]");
                    break;
                case 3:
                    pairConversion = consultarCambio.buscaCambio("USD", "BRL");
                    System.out.println("El valor " + valorConvertir + " [USD] corresponde al valor final de =>>> "
                            + convertir.convertir(valorConvertir, pairConversion.getConversion_rate()) + " [BRL]");

                    break;

                case 4:
                    pairConversion = consultarCambio.buscaCambio("BRL", "USD");
                    System.out.println("El valor " + valorConvertir + " [BRL] corresponde al valor final de =>>> "
                            + convertir.convertir(valorConvertir, pairConversion.getConversion_rate()) + " [USD]");

                    break;
                case 5:
                    pairConversion = consultarCambio.buscaCambio("USD", "COP");
                    System.out.println("El valor " + valorConvertir + " [USD] corresponde al valor final de =>>> "
                            + convertir.convertir(valorConvertir, pairConversion.getConversion_rate()) + " [COP]");

                    break;

                case 6:
                    pairConversion = consultarCambio.buscaCambio("COP", "USD");
                    System.out.println("El valor " + valorConvertir + " [COP] corresponde al valor final de =>>> "
                            + convertir.convertir(valorConvertir, pairConversion.getConversion_rate()) + " [USD]");

                    break;

                case 7:
                    break;


            }
        }

    }
}
