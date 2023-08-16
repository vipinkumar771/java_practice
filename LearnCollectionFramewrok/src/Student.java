public class Student {
    String sid;
    String sname;
    String saddr;

    Student(String sid, String sname, String saddr){
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
    }
    public void getStudentDetails(){
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Student id : " + sid);
        System.out.println("Student Name : " + sname);
        System.out.println("Student Address : " + saddr);
    }

    public static void main(String[] args) {
        Student std = new Student("S-111", "AAA", "HYD");
        std.getStudentDetails();
    }
}
