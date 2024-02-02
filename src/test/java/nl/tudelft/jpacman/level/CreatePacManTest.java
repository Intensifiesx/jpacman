package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreatePacManTest {
    private final PacManSprites pacManSprites = new PacManSprites();

    @Test
    void createPacMan() {
        Player player = new Player(pacManSprites.getPacmanSprites(), pacManSprites.getPacManDeathAnimation());
        assertThat(player.getScore()).isEqualTo(0);
        assertThat(player.getSprite()).isEqualTo(pacManSprites.getPacmanSprites().get(0));
    }
}
