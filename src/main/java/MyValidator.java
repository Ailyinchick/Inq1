import javax.validation.*;

public class MyValidator implements ConstraintValidator<CheckBrakets, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s != null) return true;
        else return false;
    }

    @Override
    public void initialize(CheckBrakets constraintAnnotation) {

    }
}
