import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        Employee e = new Employee();
        System.out.print("Enter your name: ");
        e.setName(k.nextLine());
        System.out.print("Enter your email: ");
        e.setEmail(k.nextLine());

        boolean repeat = true;
        ArrayList<Education> edus = new ArrayList<>();
        do{
            Education education = new Education();
            System.out.print("Enter your degree type: ");
            education.setDegree(k.nextLine());
            System.out.print("Enter your major: ");
            education.setMajor(k.nextLine());
            System.out.print("Enter your University: ");
            education.setUni(k.nextLine());
            System.out.print("Enter your graduation year: ");
            education.setGradYear(k.nextLine());
            edus.add(education);
            System.out.print("Do you want to enter another educational achievement? ");
            String answer = k.nextLine();
            if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
                repeat = false;
            }
            if(education.getDegree().equals("") && education.getMajor().equals("") && education.getUni().equals("")){
                repeat = true;
                System.out.println("You must enter at least one education field!");
            }
        } while (repeat);
        e.setEdu(edus);

        repeat = true;
        ArrayList<Work> works = new ArrayList<>();
        do {
            Work work = new Work();
            System.out.print("Enter title for past work experience: ");
            work.setTitle(k.nextLine());
            System.out.print("Enter company where you worked: ");
            work.setCompany(k.nextLine());
            System.out.print("Enter the date when you started this postion: ");
            work.setStartDate(k.nextLine());
            System.out.print("Enter the end date of this postion: ");
            work.setEndDate(k.nextLine());
            System.out.print("Enter your responsibilities(separated by commas): ");
            String[] duties = k.nextLine().split(",");
            work.setDescription(duties);
            works.add(work);
            System.out.print("Do you want to enter more work experience? ");
            String answer = k.nextLine();
            if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
                repeat = false;
            }
            if(work.getTitle().equals("") && work.getCompany().equals("")){
                repeat = true;
                System.out.println("You must enter at least one previous work experience!");
            }
        } while(repeat);
        e.setWorks(works);

        repeat = true;
        ArrayList<Skill> skills = new ArrayList<>();
        do{
            Skill skill = new Skill();
            System.out.print("Enter a skill: ");
            skill.setName(k.nextLine());
            System.out.print("Enter your proficiency(1(low)-5(high)): ");
            skill.setRating(k.nextInt());
            k.nextLine();
            skills.add(skill);
            String answer="";
            if(skills.size()>=3) {
                System.out.print("Do you want to enter more skills? ");
                answer = k.nextLine();
            }
            if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
                repeat = false;
            }
        } while(repeat || skills.size()<3);
        e.setSkills(skills);
        System.out.println();
        System.out.println("=====================================================");
        System.out.println(e.toString());
    }
}
