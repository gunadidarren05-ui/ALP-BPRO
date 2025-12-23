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

    protected void setHP(int newXP) {
        int maxXP = level * 10;
        XP += newXP;    
        if (XP >= maxXP) {
            XP %= maxXP;
            level++;
        }
    }
}

// att = 10, HP = 1000, DEFF = 5

class Tank extends Champion {
    
    public Tank(String name) {
        super(name);
        this.HP = 150;
        this.ATT = 6;
        this.DEFF = 8;
    }
    public Tank(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }

    
}

class Mage extends Champion {
    
    public Mage(String name) {
        super(name);
        this.HP = 60;
        this.ATT = 13;
        this.DEFF = 2;
    }

    public Mage(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}

class Healer extends Champion {
    public Healer(String name) {
        super(name);
        this.HP = 80;
        this.ATT = 7;
        this.DEFF = 3;
    }
    public Healer(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
        
    }
}

class Assassin extends Champion {
    public Assassin(String name) {
        super(name);
        this.HP = 70;
        this.ATT = 14;
        this.DEFF = 2;
    }

    public Assassin(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }

    }
}

class Fighter extends Champion {

    public Fighter(String name) {
        super(name);
        this.HP = 100;
        this.ATT = 10;
        this.DEFF = 5;
    }
    
    public Fighter(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}
