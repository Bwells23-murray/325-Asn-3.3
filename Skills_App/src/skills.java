abstract class skills {
    protected String name; // variables 
    protected String type;
    protected int skillLevel;

    public skills(String name, String type, int skillLevel) { //constructor 
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    public String getName() { //getters
        return name;        
    }

    public String getType() {
        return type;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setName(String n) { // setters
        name = n; 
    }

    public void setType(String t) {
        type = t;
    } 

    public void setSkillLevel(int sL) {
        skillLevel = sL;
    }


    abstract void identifySkill(); // abstact method
}
