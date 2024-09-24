public class SoftSkills extends skills {

public SoftSkills(String name, String type, int skillLevel) { // constructor for the class
    super(name, type, skillLevel);
}


    @Override                  // overriding the abstract method
     void identifySkill() { 
        
        System.out.println(name + " of " + type + " skills is level: " + skillLevel);
    }

}
