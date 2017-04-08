public class ToStringDemonstrator {

    public static void main(String[] args) {
        Head head = new Head("fHead1", "fHead2");
        Leg leg = new Leg("fLeg1", "fLeg2");
        Hand hand = new Hand("fHand1", "fHand2");
        Person person = new Person(head, hand, leg);

        System.out.println("Class Person has multi-line style. " +
                "Class Head has default style. " +
                "Class Hand has simple style" +
                "Class Leg has no field names style");
        System.out.println(person);
    }
}
