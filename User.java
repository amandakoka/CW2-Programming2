public class User {
    // User attributes
    private String name;
    private int age;
    private double weight;
    private String goals; // change to list <String>

    /* User constructors so we can store user information
    * Initialises objects
    * Called when an object of a class is created
    */
    public User(String name, int age, double weight, String goals) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goals = goals;
    }

    // Name getter and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Age getter and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Weight getter and setters
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Goals getter and setters
    public String getGoals() {
        return goals;
    }
    public void setGoals(String goals) {
        this.goals = goals;
    }
}
