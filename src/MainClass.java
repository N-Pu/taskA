

public class MainClass {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        String input = "fds4jvd43";
        subClass.parsToInt("4443");
        String result = SubClass.getString(input);
        System.out.println(result);
        System.out.println();
        SubClass subClass1 = new SubClass();
        subClass1.getNum(input, 1);

    }

}
