public class Champion {
    protected final String name;
    protected int HP;
    protected int ATT;
    protected int level;
    protected int XP;
    protected int DEFF;

    public Champion(String name) {
        this.name = name;
        this.level = 1;
        this.XP = 0;
    }

    public Champion(String name, int level, int XP, int DEFF, int HP, int ATT) {
        this.name = name;
        this.level = level;
        this.XP = XP;
        this.DEFF = DEFF;
        this.HP = HP;
        this.ATT = ATT;
    }

    protected void setHP(int HP) {
        int maxXP = level * 10;
        XP += maxXP;
        this.HP = HP;
    }
}

class Tank extends Champion {
    public Tank(String name) {
        super(name);
        this.ATT =
    }
    public Tank(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}

class Mage extends Champion {
    public Mage(String name) {
        super(name);

    }

    public Mage(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}

class Healer extends Champion {
    public Healer(String name) {
        super(name);
    }
    public Healer(String name, int level, int XP) {
        super(name, level, XP);

    }
}

class Assassin extends Champion {
    public Assassin(String name, int level, int XP) {
        super(name, level, XP);

    }
}

class Fighter extends Champion {
    public Fighter(String name, int level, int XP) {
        super(name, level, XP);

    }
}