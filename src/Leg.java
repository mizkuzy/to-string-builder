import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Leg {

    private String legField1;
    private String legField2;

    public Leg(String legField1, String legField2) {
        this.legField1 = legField1;
        this.legField2 = legField2;
    }

    public String getLegField1() {
        return legField1;
    }

    public void setLegField1(String legField1) {
        this.legField1 = legField1;
    }

    public String getLegField2() {
        return legField2;
    }

    public void setLegField2(String legField2) {
        this.legField2 = legField2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.NO_FIELD_NAMES_STYLE)
                .append("f1", legField1)
                .append("f2", legField2)
                .toString();
    }
}
