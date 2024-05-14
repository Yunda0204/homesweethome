package exam03;

public class Engineer extends Employee {
    private String skillset;

    public Engineer(String name) {
        super(name);
    }

    public String getSkillset() {
        return skillset;
    }

    public void setSkillset(String skillset) {
        this.skillset = skillset;
    }
}
