package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.npc.ghost.Blinky;
import org.junit.jupiter.api.Test;
import java.util.*;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.sprite.Sprite;

import static org.assertj.core.api.Assertions.assertThat;

public class NPCTest {
    Map<Direction, Sprite> spriteMap = new HashMap<>();
    Blinky blinky = new Blinky(spriteMap);

    @Test
    void testBlinky() {
        assertThat(blinky.getSprite()).isEqualTo(spriteMap.get(Direction.NORTH));
    }
}
