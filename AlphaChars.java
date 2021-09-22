package Mentoring.interview;

public class AlphaChars {

    public static void main(String[] args) {

        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";

        String alph ="";
        String nums = "";
        String chars = "";

        for (int i = 0; i < given.length() ; i++) {

            char each = given.charAt(i);

            if (Character.isAlphabetic(each)) {
                alph+=each+" ";

            }else if (Character.isDigit(each)) {
                nums+=each+" ";
            }else {
                chars+=each+" ";
            }

        }

        System.out.println(alph+" ");
        System.out.println(nums+" ");
        System.out.println(chars+" ");

    }


}
