public class Example {
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }
}
class Test1 {
    public static void main(String[] args) {
        Example emp = new Example();
        emp.setEno(1111);
        emp.setEsal(18000.0f);
        emp.setEaddr("Mohali");
        emp.setEname("vipin");
        System.out.println(emp.getEno());
        System.out.println(emp.getEaddr());
        System.out.println(emp.getEname());
        System.out.println(emp.getEsal());
    }
}

