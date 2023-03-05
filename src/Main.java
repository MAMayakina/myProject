public class Main {
    public static void main(String[] args) {

        String myString = "Это,,моя,строка,,,,";

        //String[] split(String regex, int limit);
        String[] splitStrings = myString.split(",");

        for (String string : splitStrings) {
            System.out.println(string);
        }


        //String substring(int beginIndex,int endIndex);
        System.out.println(myString.substring(9));
        System.out.println(myString.substring(9, 15));
    }
}