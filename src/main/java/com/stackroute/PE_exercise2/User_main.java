package main.java.com.stackroute.PE_exercise2;

public class User_main {

    public static void main(String args[])
    {
        User user = new User();

        user.setFirstName("Dipankar");
        user.setLastName("Minj");
        user.setAge(199);
        user.setSalary(60000);


        if(user.getAge() !=-1)
        {
            System.out.println("Name: "+ user.getFullName());
            System.out.println("Age: "+ user.getAge());
            if(user.isValidAge()) {
                System.out.println("Valid age to be an employee");
                System.out.println("Salary: " + user.getSalary());
            }
            else
            {
                System.out.println("Age not eligible for being an employee");
            }
        }


    }
}
