package main.java.com.stackroute.PE_exercise2;

public class Student {

    int minimum,maximum;
    double average;


    public Student() {
        this.minimum = 0;
        this.maximum = 0;
        this.average = 0.0;
    }

    public String takeinput(int number,int arr[])
    {

        if(number != arr.length)
            return "Array length doesn't match the input";
        else
        {
            int flag=0;
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<0 || arr[i]>100)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                return "Maximum: "+ getMaximum(arr) + " Minimum: "+ getMinimum(arr) + " Average: "+ getAverage(arr);
            else
                return "Grades Should be between 0 and 100 inclusive";

        }

    }

    public  int getMinimum(int arr[]) {
        int min = 120;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public int getMaximum(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public double getAverage(int arr[]) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg/arr.length;
        return avg;
    }
}
