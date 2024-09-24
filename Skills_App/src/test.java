public class test {
    public static void main(String[] args) throws Exception {
        TalentSkills talent = new TalentSkills("orangaization", "Talent", 9);
        HardSkills hard = new HardSkills("programming", "Hard", 7);
        SoftSkills soft = new SoftSkills("communication", "Soft", 4);
        GiftSkills gift = new GiftSkills("mercy", "Virtues", 6);
        
        talent.identifySkill();
        hard.identifySkill();
        soft.identifySkill();
        gift.identifySkill();

    }


}
