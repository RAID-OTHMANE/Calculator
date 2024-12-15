public class Calculator {

    // Méthode d'addition statique
    public static int add(int opG, int opD) {
        return opG + opD;
    }

    // Méthode de division statique
    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new IllegalArgumentException("Division par zéro non autorisée");
        }
        return opG / opD;
    }
}
