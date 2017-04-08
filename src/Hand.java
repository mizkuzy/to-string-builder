import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Hand {

    private String fieldHand1;
    private String fieldHand2;

    public Hand(String fieldHand1, String fieldHand2) {
        this.fieldHand1 = fieldHand1;
        this.fieldHand2 = fieldHand2;
    }

    public String getFieldHand1() {
        return fieldHand1;
    }

    public void setFieldHand1(String fieldHand1) {
        this.fieldHand1 = fieldHand1;
    }

    public String getFieldHand2() {
        return fieldHand2;
    }

    public void setFieldHand2(String fieldHand2) {
        this.fieldHand2 = fieldHand2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append("f1", fieldHand1)
                .append("f2",fieldHand2)
                .toString();
    }
}
