import javax.lang.model.element.Name;

public class Employee {
    int eno =111;
    String ename = "AAA";
    float esal = 5000.0f;
    String eaddr ="Hyd";

    public void getEmpDetails() {
        System.out.println("Employee Detail");
        System.out.println("----");
        System.out.println("Employee Number : "+eno);
        System.out.println("Employee Name : "+ename);
        System.out.println("Employee Sallary : "+esal);
        System.out.println("Employee address :"+ eaddr);
    }
}

class Student {
    String sid = "s-111";
    String sname ="Vipin";
    String squal = "Msc.Mathematics";
    String smobile = "91-9459407771";
    String semail = "Vipin@gmail.com";
    String saddr = "anything is here";
    public void getStudentDetils(){
        System.out.println("Student Detail");
        System.out.println("----------------");
        System.out.println("Student id :"+ sid);
        System.out.println("Student name :"+ sname);
        System.out.println("Student Qualification" + squal);
        System.out.println("Student phone number :" + smobile);
        System.out.println("Student email :" + semail );
        System.out.println("Student address :" + saddr);
        System.out.println("All Detail are here");
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Student std = new Student();
        std.getStudentDetils();
        System.out.println();
        Employee emp = new Employee();
        emp.getEmpDetails();
    }
}
