public class TalentSkills extends skills {

    public TalentSkills(String name, String type, int skillLevel) { // consructor for the class
        super(name, type, skillLevel);
    }


    @Override // overriding the abstract method
     void identifySkill() { 
        
        System.out.println(name + " of " + type + " skills is level: " + skillLevel);
    }

}
