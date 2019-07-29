public class BracketValue {
    @CheckBrakets(message = "field")
    String value;

    public BracketValue() {
    }

    @CheckBrakets(message = "method")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
