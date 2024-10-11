import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        APIService apiService = new APIService();
        ConversorMoneda conversor = new ConversorMoneda(apiService);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1) Dolar => Peso argentino");
            System.out.println("2) Peso argentino => Dolar");
            System.out.println("3) Dolar => Real brasileño");
            System.out.println("4) Real brasileño => Dolar");
            System.out.println("5) Dolar => Peso colombiano");
            System.out.println("6) Peso Colombiano => Dolar");
            System.out.println("7) Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad en dólares:");
                    double dolares = scanner.nextDouble();
                    System.out.println("Resultado: " + conversor.convertirDolarAPesoArgentino(dolares));
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en pesos argentinos:");
                    double pesosArg = scanner.nextDouble();
                    System.out.println("Resultado: " + conversor.convertirPesoArgentinoADolar(pesosArg));
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en dólares:");
                    double dolaresToReal = scanner.nextDouble();
                    System.out.println("Resultado: " + conversor.convertirDolarAReal(dolaresToReal));
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en reales:");
                    double reales = scanner.nextDouble();
                    System.out.println("Resultado: " + conversor.convertirRealADolar(reales));
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad en dólares:");
                    double dolaresToPesoCol = scanner.nextDouble();
                    System.out.println("Resultado: " + conversor.convertirDolarAPesoColombiano(dolaresToPesoCol));
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad en pesos colombianos:");
                    double pesosCol = scanner.nextDouble();
                    System.out.println("Resultado: " + conversor.convertirPesoColombianoADolar(pesosCol));
                    break;
                case 7:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();

    }
}
