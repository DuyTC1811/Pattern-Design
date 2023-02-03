package builder_pattern;

public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;
    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
