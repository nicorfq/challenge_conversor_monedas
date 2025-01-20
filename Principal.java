import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int seleccionConversion = 0;
        String menu = """
                =============== Conversor Monedas ==============
                Seleccione el número de la conversión deseada:
                1) Dolar (USD) --> Real Brasil (BRL)
                2) Dolar (USD) --> Peso Argentino (ARS)
                3) Dolar (USD) --> Peso Colombiano (COP)
                4) Dolar (USD) --> Peso Chileno (CLP)
                5) Real Brasil (BRL)     --> Dolar (USD)
                6) Peso Argentino (ARS)  --> Dolar (USD)
                7) Peso Colombiano (COP) --> Dolar (USD)
                8) Peso Chileno (CLP)    --> Dolar (USD)
                9) Salir
                ================================================
                """;
        Scanner seleccionOpcionConversion = new Scanner(System.in);
        Moneda miMoneda = new Moneda();

        System.out.println("Convertir una moneda (si/no) : ");
        Scanner tecladoPrimerIntento = new Scanner(System.in);
        String primerIntento = tecladoPrimerIntento.nextLine();

        switch (primerIntento){
            case "si":
                System.out.println("Bienvenido!\n");
                while (seleccionConversion != 9) {

                    System.out.println(menu);
                    seleccionConversion = seleccionOpcionConversion.nextInt();

                    switch (seleccionConversion){
                        case 1, 2, 3, 4, 5, 6, 7, 8:
                            miMoneda.muestraMoneda(seleccionConversion);

                            System.out.println("Convertir moneda nuevamente? (si/no) :");
                            String nuevoIntento = tecladoPrimerIntento.nextLine();
                            if (Objects.equals(nuevoIntento, "si")) {
                                System.out.println("\n");
                            }else if (Objects.equals(nuevoIntento, "no")) {
                                System.out.println("no - Gracias por utilizar el servicio!");
                                seleccionConversion = 9;
                            } else {
                                System.out.println("Gracias por utilizar el servicio!");
                                seleccionConversion = 9;
                            }
                            break;

                        case 9:
                            System.out.println("Gracias por utilizar el servicio!");
                            System.out.println("================================================");
                            break;

                        default:
                            System.out.println("*** Opción no válida ***");
                            System.out.println(" ");
                    }
                }
            break;
            case "no":
                System.out.println("no - Gracias por utilizar el servicio!");
                break;
        }

//        while (seleccionConversion != 9) {
//            System.out.println(menu);
//            seleccionConversion = seleccionOpcionConversion.nextInt();
//
//            switch (seleccionConversion){
//                case 1, 2, 3, 4, 5, 6, 7, 8:
//                    miMoneda.muestraMoneda(seleccionConversion);
//                    break;
//
//                case 9:
//                    System.out.println("Gracias por utilizar el servicio");
//                    System.out.println("================================================");
//                    break;
//
//                default:
//                    System.out.println("*** Opción no válida ***");
//                    System.out.println(" ");
//            }
//        }

    }
}
