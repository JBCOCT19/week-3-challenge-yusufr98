import java.util.ArrayList;

public class Employee {
    private String name;
    private String email;
    private ArrayList<Education> edu;
    private ArrayList<Work> works;
    private ArrayList<Skill> skills;

    public Employee() {
    }

    public Employee(String name, String email, ArrayList<Education> edu, ArrayList<Work> works, ArrayList<Skill> skills) {
        this.name = name;
        this.email = email;
        this.edu = edu;
        this.works = works;
        this.skills = skills;
    }

    @Override
    public String toString() {
        String str = (name + "\n" + email + "\n\n" + "\tEducation\n");
        for(Education e: edu){
            str += e.toString() + "\n";
        }
        str += ("\n" + "\tExperience\n");
        for(Work w: works){
            str += w.toString() + "\n";
        }
        str += "\tSkills\n";
        for(Skill s: skills){
            str += s.toString() + "\n";
        }
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEdu() {
        return edu;
    }

    public void setEdu(ArrayList<Education> edu) {
        this.edu = edu;
    }

    public ArrayList<Work> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Work> works) {
        this.works = works;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }
}
