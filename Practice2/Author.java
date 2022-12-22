public class Author {
    private String name;
    private char gender;
    private String email;

    public Author(String name, char gender, String email)
    {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return name + ", gender: " + gender + ", email: " + email;
    }
}
