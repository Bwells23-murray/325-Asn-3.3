public class test {
    public static void main(String[] args) throws Exception { // instances of the classes
        TalentSkills talent = new TalentSkills("orangaization", "Talent", 9);
        HardSkills hard = new HardSkills("programming", "Hard", 7);
        SoftSkills soft = new SoftSkills("communication", "Soft", 4);
        GiftSkills gift = new GiftSkills("mercy", "Virtues", 6);
        
        talent.identifySkill(); // calling the identify skill method for each class
        hard.identifySkill();
        soft.identifySkill();
        gift.identifySkill();

    }


}
