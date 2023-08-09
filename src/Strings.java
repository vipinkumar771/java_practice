public class Strings {
    public static void main(String args[]) {
        // Concatenation

        String fristName ="vipin";
        String lastName = "kumar";
        String fullName = fristName + " " + lastName;
        System.out.println(fullName);
        // length()
        System.out.println(fullName.length());
        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
