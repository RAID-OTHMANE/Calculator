public class Calculator {
    public static int add(int opG, int opD) {
        long result = (long) opG + opD; // Utilisation de 'long' pour vérifier un dépassement
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Dépassement de capacité pour un entier");
        }
        return (int) result;
    }

    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new IllegalArgumentException("Division par zéro non autorisée");
        }
        return opG / opD;
    }
}