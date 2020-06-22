package takred.character;

import java.util.UUID;

public class Hero implements Character {

    private final int gold;
    private final UUID id;

    public Hero() {
        this.gold = 0;
        this.id = UUID.randomUUID();
    }

    public Hero(int gold, UUID id) {
        this.gold = gold;
        this.id = id;
    }

    public Hero(Character character) {
        this.gold = character.getGold();
        this.id = character.getId();
    }


    public int getGold() {
        return gold;
    }

    public Character minusGold(int gold) {
        return new Hero(this.gold - gold, this.id);
    }

    public Character plusGold(int gold) {
        return new Hero(this.gold + gold, this.id);
    }

    public UUID getId() {
        return this.id;
    }
}
