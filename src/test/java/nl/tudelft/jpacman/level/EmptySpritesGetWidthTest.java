package nl.tudelft.jpacman.level;

import org.junit.jupiter.api.Test;
import nl.tudelft.jpacman.sprite.EmptySprite;

import static org.assertj.core.api.Assertions.assertThat;

public class EmptySpritesGetWidthTest {
    private final EmptySprite emptySprites = new EmptySprite();

    @Test
    void testEmptySpritesGetWidth() {
        assertThat(emptySprites.getWidth()).isEqualTo(0);
    }
}
