import java.util.ArrayList;
import java.util.Arrays;

public class Work {
    private String company;
    private String title;
    private String startDate;
    private String endDate;
    private String[] description;

    public Work() {
    }

    public Work(String company, String title, String startDate, String endDate, String[] description) {
        this.company = company;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    @Override
    public String toString() {
        String str= (
                title + "\n" +
                company + ", " + startDate + " - " + endDate + "\n"
        );
        for(int i = 0; i<description.length; i++){
            str += ("- Duty " + (i+1) +", " + description[i] + "\n");
        }
        return str;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }
}
