import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, -2, -4",
            "0, 0, 0",
            "-1, -2, -3"
    })
    public void testAddParametre(int opG, int opD, int resultatAttendu) {
        // Appel de la méthode add avec les paramètres opG et opD
        int result = Calculator.add(opG, opD);

        // Vérification du résultat attendu
        assertThat(result).isEqualTo(resultatAttendu);
    }
}
