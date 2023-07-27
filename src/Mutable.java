public class Mutable {
    public static void main(String[] args) {
        String str1 = new String("DurgaSoft");
        String str2 = str1.concat("Tutorial");
        String str3 = str2.concat("Solution");
        System.out.println(str1); // DurgaSoft
        System.out.println(str2); // DurgaSoftTutorial
        System.out.println(str3); // DurgaSoftTutorialSolution
        System.out.println();
        StringBuffer sb1 = new StringBuffer("DurgaSoft");
        StringBuffer sb2 = sb1.append("Tutorial");
        StringBuffer sb3 = sb2.append("Solution");
        System.out.println();
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str1);
        System.out.println();
        System.out.println(sb1 == sb2);
        System.out.println(sb2 == sb3);
        System.out.println(sb3 == sb1);
    }
}
