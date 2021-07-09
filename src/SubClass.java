public class SubClass {


    public static int getNum(CharSequence input, int a) {
        StringBuilder stringBuilder2 = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            char j = input.charAt(i);
            if (j > 47 && j < 58) {
                a = Integer.parseInt(String.valueOf(j));
                break;

            }
        }
        System.out.println(a);
        return a;
    }


    public static String getString(CharSequence input) {
        StringBuilder stringBuilder = new StringBuilder(input.length()); // длинна строки
        for (int i = 0; i < input.length(); i++) {
            char j = input.charAt(i);
            char k = input.charAt(i);
            if (64 < k && k < 123) {
                stringBuilder.append(k);
            }
            if (j > 47 && j < 58) {
                Object a = stringBuilder.append(j);
                //a = Integer.parseInt(j);
            }

        }
        return (stringBuilder.toString());
    }

    public void parsToInt(String j) {
        int foo = Integer.parseInt(j);
    }




}
