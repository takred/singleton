package takred.character;

import java.util.UUID;

public interface Character {

    int getGold();

    Character minusGold(int gold);

    Character plusGold(int gold);

    UUID getId();
}
