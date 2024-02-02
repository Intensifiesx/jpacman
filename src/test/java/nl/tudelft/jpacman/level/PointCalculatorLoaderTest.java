package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.points.PointCalculatorLoader;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointCalculatorLoaderTest {
    private final PointCalculatorLoader pointCalculatorLoader = new PointCalculatorLoader();

    public PointCalculatorLoader getPointCalculatorLoader() {
        return pointCalculatorLoader;
    }

    @Test
    void testLoad() {
        assertThat(getPointCalculatorLoader().load()).isNotNull();
    }
}
