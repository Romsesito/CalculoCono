import java.util.Scanner;

public class Cono {
    private double punto1X, punto1Y, punto1Z;
    private double punto2X, punto2Y, punto2Z;
    private double punto3X, punto3Y, punto3Z;
    private double altura;
    private double radio;

    public void ingresarPuntos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas de la punta del cono:");
        System.out.print("Punto 1 - Eje X: ");
        punto1X = scanner.nextDouble();
        System.out.print("Punto 1 - Eje Y: ");
        punto1Y = scanner.nextDouble();
        System.out.print("Punto 1 - Eje Z: ");
        punto1Z = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del borde del círculo del cono:");
        System.out.print("Punto 2 - Eje X: ");
        punto2X = scanner.nextDouble();
        System.out.print("Punto 2 - Eje Y: ");
        punto2Y = scanner.nextDouble();
        System.out.print("Punto 2 - Eje Z: ");
        punto2Z = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del centro del círculo:");
        System.out.print("Punto 3 - Eje X: ");
        punto3X = scanner.nextDouble();
        System.out.print("Punto 3 - Eje Y: ");
        punto3Y = scanner.nextDouble();
        System.out.print("Punto 3 - Eje Z: ");
        punto3Z = scanner.nextDouble();

        altura = calcularDistancia(punto1X, punto1Y, punto1Z, punto3X, punto3Y, punto3Z);

        radio = calcularDistancia(punto2X, punto2Y, punto2Z, punto3X, punto3Y, punto3Z);
    }

    public void mostrarDatos() {
        System.out.println("Datos guardados:");
        System.out.println("Punto 1: (" + punto1X + ", " + punto1Y + ", " + punto1Z + ")");
        System.out.println("Punto 2: (" + punto2X + ", " + punto2Y + ", " + punto2Z + ")");
        System.out.println("Punto 3: (" + punto3X + ", " + punto3Y + ", " + punto3Z + ")");
        System.out.println("Altura: " + altura);
        System.out.println("Radio: " + radio);
        System.out.println();
        System.out.println("=================");
    }

    private double calcularDistancia(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
    }

    public double calcularVolumen() {
        double volumen = Calculo.calcularVolumenCono(radio, altura);
        System.out.println("Volumen del cono: " + volumen);
        return volumen;
    }

    public double calcularG() {
        double g = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        return g;
    }

    public void calcularAreas() {
        double AB = Math.PI * Math.pow(radio, 2);
        double g = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
        double AL = Math.PI * radio * g;
        double AS = AB + AL;

        System.out.println("Área superficial (AS): " + AS);
    }
}
