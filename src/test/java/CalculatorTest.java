import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testDivideByZero() {
        // Appel direct de la méthode statique
        assertThatThrownBy(() -> Calculator.divide(5, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Division par zéro non autorisée");
    }

    @Test
    public void testDivisionValide() {
        // Test de la division statique
        int result = Calculator.divide(10, 2);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void testAddition() {
        // Test de l'addition statique
        int result = Calculator.add(3, 4);
        assertThat(result).isEqualTo(7);
    }
}
