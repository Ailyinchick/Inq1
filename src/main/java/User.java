import javax.validation.constraints.*;

public class User {
    @CheckBrakets(message = "field")
    private String name;

    public User() {
    }

    @CheckBrakets(message = "method")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
