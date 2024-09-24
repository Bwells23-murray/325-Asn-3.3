public class HardSkills extends skills {

    public HardSkills(String name, String type, int skillLevel) { // constructor for the class
        super(name, type, skillLevel);
    }

    @Override // overridng the abstract method 
     void identifySkill() { 
        
        System.out.println(name + " of " + type + " skills is level: " + skillLevel);
    }


    
}
