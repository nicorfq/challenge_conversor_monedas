import java.util.Scanner;

public class Moneda {

    String monedaEntrada;
    String monedaSalida;
    Scanner seleccionMontoConvertir = new Scanner(System.in);
    ConsultaAPI miConsulta = new ConsultaAPI();

    void muestraMoneda(int seleccionConversinon){
        switch (seleccionConversinon){
            case 1:
                monedaEntrada = "USD";
                monedaSalida = "BRL";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto1 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto1);
                break;
            case 2:
                monedaEntrada = "USD";
                monedaSalida = "ARS";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto2 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto2);
                break;
            case 3:
                monedaEntrada = "USD";
                monedaSalida = "COP";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto3 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto3);
                break;
            case 4:
                monedaEntrada = "USD";
                monedaSalida = "CLP";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto4 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto4);
                break;
            case 5:
                monedaEntrada = "BRL";
                monedaSalida = "USD";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto5 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto5);
                break;
            case 6:
                monedaEntrada = "ARS";
                monedaSalida = "USD";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto6 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto6);
                break;
            case 7:
                monedaEntrada = "COP";
                monedaSalida = "USD";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto7 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto7);
                break;
            case 8:
                monedaEntrada = "CLP";
                monedaSalida = "USD";
                System.out.println("Selección: " + monedaEntrada + " --> " + monedaSalida);
                System.out.println("Ingrese monto a convertir (utilice . para separar decimales) :");
                double seleccionMonto8 = seleccionMontoConvertir.nextDouble();
                miConsulta.muestraConsulta(monedaEntrada, monedaSalida, seleccionMonto8);
                break;
        }
    }
}
