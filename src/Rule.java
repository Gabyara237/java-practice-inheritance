public class Rule {
    String text = "empty rule";
    boolean optional = false;

    public  Rule(){}

    public Rule(String text) {
        this.text = text;
    }

    public Rule(String text, boolean optional) {
        this.text = text;
        this.optional = optional;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        return text;
    }
}
