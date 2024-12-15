import java.util.HashSet;
import java.util.Set;

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
    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> result = new HashSet<>();
        String nombreStr = String.valueOf(Math.abs(pNombre)); // Convertir le nombre en positif (modulo -)

        for (char c : nombreStr.toCharArray()) { // Parcourir chaque caractère
            result.add(Character.getNumericValue(c)); // Ajouter les chiffres au Set
        }
        return result;
    }
}
