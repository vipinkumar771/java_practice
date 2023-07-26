public class BiggestNumber {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 50;
        if(a > b){
            if(b<c){
                System.out.println(a + " is the biggest Number");
            }else{
                System.out.println(b + "is the biggest Number");
            }
        }
        else if (b < c ){
            if(c<a){
                System.out.println(a + "is the biggest Number");
            }else{
                System.out.println(c + "is the biggest Number");
            }
        }
        else if (c<a){
            if (a<b){
                System.out.println(b + " is biggest Number");
            }else {
                System.out.println(a + " is biggest Number");
            }
        }
        else{
            System.out.println("All are same");
        }

    }
}
