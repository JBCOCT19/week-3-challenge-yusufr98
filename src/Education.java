public class Education {
    private String degree;
    private String major;
    private String uni;
    private String gradYear;

    public Education() {
    }

    public Education(String degree, String major, String uni, String gradYear) {
        this.degree = degree;
        this.major = major;
        this.uni = uni;
        this.gradYear = gradYear;
    }

    @Override
    public String toString() {
        return (degree + " in " + major + ",\n" +
                uni + ", " + gradYear);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }
}
