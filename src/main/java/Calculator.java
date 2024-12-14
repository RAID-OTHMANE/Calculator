public class Calculator {
    public int add(int opG, int opD) {
        return opG + opD;
    }

    public int divide(int opG, int opD) {
        if (opD == 0) {
            throw new IllegalArgumentException("Division par zéro non autorisée");
        }
        return opG / opD;
    }

}
