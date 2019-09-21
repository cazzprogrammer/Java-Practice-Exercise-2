package main.java.com.stackroute.PE_exercise2;

public class MemberVariable {
    Member ob = new Member();
    public String setvalues(String name,int age,double salary)
    {

        ob.setName(name);
        ob.setAge(age);
        ob.setSalary(salary);
        String s = display();
        return s;
    }
    public String display(){

        return "Member Name: "+ ob.getName()+" Potter Member age: "+ob.getAge()+ " Member salary: "+ob.getSalary();
    }
}
