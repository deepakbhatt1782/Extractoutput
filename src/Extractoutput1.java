public class Extractoutput1 {
    static String name = " I want to get £200, so that I can buy my $item";
    public static void main(String[] args){
    String digits = name.replaceAll("[^0-9]","");
    String alphabets= name.replaceAll("[^a-zA-Z]","");
    String characters= name.replaceAll("[^£$]","");



    System.out.println(digits);
    System.out.println(alphabets);
    System.out.println(characters);



    }

    }


