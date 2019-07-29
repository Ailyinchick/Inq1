
import javax.validation.*;
import javax.validation.Validator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        User user = new User("");
        user.setName("asd");
        Set<ConstraintViolation<User>> violations = validator.validate(user);
        for (ConstraintViolation<User> violation: violations){
            System.out.println(violation.getMessage());
        }
    }
}
