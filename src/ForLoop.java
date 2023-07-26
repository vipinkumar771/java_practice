public class ForLoop {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            if(i == 5){
                System.out.println("Inside loop, Before break statement");
                break;
            }
            System.out.println(i);
        }
    }
}
