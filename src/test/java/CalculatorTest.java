import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void testEnsembleChiffresPositive() {
        Set<Integer> result = Calculator.ensembleChiffres(7679);
        assertThat(result).containsExactlyInAnyOrder(6, 7, 9); // Réponse attendue : {6, 7, 9}
    }

    @Test
    public void testEnsembleChiffresNegative() {
        Set<Integer> result = Calculator.ensembleChiffres(-11);
        assertThat(result).containsExactly(1); // Réponse attendue : {1}
    }

    @Test
    public void testEnsembleChiffresZero() {
        Set<Integer> result = Calculator.ensembleChiffres(0);
        assertThat(result).containsExactly(0); // Réponse attendue : {0}
    }
}
