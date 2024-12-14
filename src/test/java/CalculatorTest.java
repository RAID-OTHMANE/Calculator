import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    // Méthode exécutée avant chaque test
    @BeforeEach
    public void setUp() {
        calculator = new Calculator(); // Initialisation
        System.out.println("Initialisation du Calculator");
    }

    // Méthode exécutée après chaque test
    @AfterEach
    public void tearDown() {
        calculator = null; // Nettoyage
        System.out.println("Nettoyage du Calculator");
    }

    @Test
    public void testDivideByZero() {
        assertThatThrownBy(() -> calculator.divide(5, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Division par zéro non autorisée");
    }

    @Test
    public void testDivisionValide() {
        int result = calculator.divide(10, 2);
        assertThat(result).isEqualTo(5);
    }
}
