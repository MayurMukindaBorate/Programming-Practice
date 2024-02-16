class Employee
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int amount, int A, String addr)
    {
        this.Name = str;
        this.Salary = amount;
        this.Age = A;
        this.Address = addr;
    }

    protected void finalize()
    {
        System.out.println("Inside Finalize method....");
    }

    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age :"+this.Age);
        System.out.println("Employee Salary :"+this.Salary);
        System.out.println("Employee Address :"+this.Address);
    }
}

class FinalizeDemo2
{
    public static void main(String arg[])
    {
        Employee eobj = new Employee("Amit", 78000, 28," Karve Road Pune");
        eobj.Display();
        Employee eobj2 = eobj;

        Employee eobj3 = new Employee("Sagar",88000,29,"prabhat Road Mumai");
        
        System.out.println("Hash code of eobj is : "+eobj.hashCode());
        System.out.println("Hash code of eobj is : "+eobj2.hashCode());
        System.out.println("Hash code of eobj is : "+eobj3.hashCode());

        eobj = null;
        System.gc();
    }
}