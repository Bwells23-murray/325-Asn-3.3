public class HardSkills extends skills {

    public HardSkills(String name, String type, int skillLevel) {
        super(name, type, skillLevel);
    }

    @Override
     void identifySkill() { 
        
        System.out.println(name + " of " + type + " skills is level: " + skillLevel);
    }


    
}
