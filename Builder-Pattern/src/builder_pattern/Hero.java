package builder_pattern;

public final class Hero {
    private final Profession profession;
    private final String name;
    private final HairType hairType;
    private final HairColor hairColor;
    private final Armor armor;
    private final Weapon weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {

        var stringBuilder = new StringBuilder();
        stringBuilder.append("This is a ")
                .append(profession)
                .append(" named ")
                .append(name);
        if (hairColor != null || hairType != null) {
            stringBuilder.append(" with ");
            if (hairColor != null) {
                stringBuilder.append(hairColor).append(' ');
            }
            if (hairType != null) {
                stringBuilder.append(hairType).append(' ');
            }
            stringBuilder.append(hairType != HairType.BALD ? "hair" : "head");
        }
        if (armor != null) {
            stringBuilder.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            stringBuilder.append(" and wielding a ").append(weapon);
        }
        stringBuilder.append('.');
        return stringBuilder.toString();
    }

    public static class Builder {
        private final Profession profession;
        private final String name;
        private HairType hairType;
        private HairColor hairColor;
        private Armor armor;
        private Weapon weapon;

        public Builder(Profession profession, String name) {
            if (profession == null || name == null) {
                throw new IllegalArgumentException("profession and name can not be null");
            }
            this.profession = profession;
            this.name = name;
        }

        public Builder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
