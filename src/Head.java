import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Head {

    private String fieldHed1;
    private String fieldHed2;

    public Head(String fieldHed1, String fieldHed2) {
        this.fieldHed1 = fieldHed1;
        this.fieldHed2 = fieldHed2;
    }

    public String getFieldHed1() {
        return fieldHed1;
    }

    public void setFieldHed1(String fieldHed1) {
        this.fieldHed1 = fieldHed1;
    }

    public String getFieldHed2() {
        return fieldHed2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
                .append("f1",fieldHed1)
                .append("f2",fieldHed2)
                .toString();
    }

    public void setFieldHed2(String fieldHed2) {

        this.fieldHed2 = fieldHed2;
    }
}
