package Strings;

public class StirngRotation {
                                                                                                                  static void main() {

        String s1= "abcd";
        String s2= "bcda";

        if(s1.length()==s2.length() &&  (s1+s1).contains(s2)){

            System.out.println("rotations");
        }else{
            System.out.println("not in rotations");
        }

    }
}
