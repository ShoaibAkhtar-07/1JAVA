class Employee {
    int salary;
    private String name;
    public Employee(int yoursalary,String yourname){
        salary = yoursalary;
        name = yourname;
    }
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Employee shoaib = new Employee(6,"shoaib akhtar");
        // shoaib.salary = 1;
        // System.out.println(shoaib.getSalary());
        // shoaib.setName("shoaib akhtar");
        // System.out.print(shoaib.getName());
        System.out.println(shoaib.getName());
        System.out.println(shoaib.getSalary());

    }
}
