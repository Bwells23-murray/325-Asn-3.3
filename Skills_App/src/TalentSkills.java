public class TalentSkills extends skills {

    public TalentSkills(String name, String type, int skillLevel) {
        super(name, type, skillLevel);
    }


    @Override
     void identifySkill() { 
        
        System.out.println(name + " of " + type + " skills is level: " + skillLevel);
    }

}
