public class Calculo {
    public static double calcularVolumenCono(double radio, double altura) {
        double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }

}
