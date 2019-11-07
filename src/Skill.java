public class Skill {
    private String name;
    private String rating;

    public Skill() {
    }

    public Skill(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return (name + ", " + rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(int rating) {
        switch (rating) {
            case 1: this.rating = "Fundamental"; break;
            case 2: this.rating = "Novice"; break;
            case 3: this.rating = "Intermediate"; break;
            case 4: this.rating = "Advanced"; break;
            case 5: this.rating = "Expert"; break;
        }
    }
}
