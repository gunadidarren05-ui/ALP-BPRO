public class Champion {
    protected final String name;
    protected int HP;
    protected int ATT;
    protected int DEFF;
    protected int level;
    protected int XP;
    
    //Create new char
    public Champion(String name, int HP, int ATT, int DEFF) {
        this.name = name;
        this.HP = HP;
        this.ATT = ATT;
        this.DEFF = DEFF;
        this.level = 1;
        this.XP = 0;
    }

    // Existing Char
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
        super(name, 150, 6, 8);
    }
    public Tank(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}

class Mage extends Champion {
    
    public Mage(String name) {
        super(name, 60, 13, 2);
    }

    public Mage(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}

class Healer extends Champion {
    public Healer(String name) {
        super(name, 80, 7, 3);
    }
    public Healer(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
        
    }
}

class Assassin extends Champion {
    public Assassin(String name) {
        super(name, 70, 14, 2);
    }

    public Assassin(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }

    }
}

class Fighter extends Champion {

    public Fighter(String name) {
        super(name, 100, 10, 5);
    }
    
    public Fighter(String name, int level, int XP, int DEFF, int HP, int ATT) {
        super(name, level, XP, DEFF, HP, ATT);
    }
}


