public class GiftSkills extends skills {
 public GiftSkills(String name, String type, int skillLevel) { // constructor for the class
    super(name, type, skillLevel);
    }


    @Override       // overriding the abstact method
     void identifySkill() { 
        
        System.out.println(name + " of " + type + " skills is level: " + skillLevel);
    }

    
}
