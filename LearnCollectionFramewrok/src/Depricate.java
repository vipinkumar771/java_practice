class Employee{
    @Deprecated
    public void generateSalary(){
     System.out.println("Salary is generated on the basis of the factors like basic, HK,TA,PF");
    };
    public void generateSalaryNew(){
        System.out.println("Salary is calculated on the basis of the factors like basic, HK, TA, Bonus, PF");
    }
}

class Depricate {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.generateSalaryNew();
    }
}
