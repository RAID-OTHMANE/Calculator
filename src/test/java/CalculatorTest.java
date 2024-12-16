import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    // Test pour vérifier l'exception dans 'add' (dépassement de capacité)
    @Test
    public void testAddOverflow() {
        assertThatThrownBy(() -> Calculator.add(Integer.MAX_VALUE, 1))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Dépassement de capacité pour un entier");
    }

    // Test pour vérifier l'exception dans 'divide' (division par zéro)
    @Test
    public void testDivideByZero() {
        assertThatThrownBy(() -> Calculator.divide(5, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Division par zéro non autorisée");
    }
}
