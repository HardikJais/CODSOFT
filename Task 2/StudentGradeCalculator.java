import java.util.*;
class StudentGradeCalculator
{
    public double percentagecalculation(int marks[],int noOfsubjects)
    {
        int totalmarks=0;
        for(int i=0;i<marks.length;i++)
        {
            totalmarks+=marks[i];
        }
        System.out.println("\nTotal marks obtained: "+totalmarks);
        return totalmarks/noOfsubjects;
    }
    public char gradecalculation(double avgpercentage)
    {
        if (avgpercentage >= 90) 
            return 'A';
        else if (avgpercentage >= 80 && avgpercentage<90) 
            return 'B';
        else if (avgpercentage >= 70 && avgpercentage <80) 
            return 'C';
        else if (avgpercentage >= 60 && avgpercentage <70) 
            return 'D';
        else 
            return 'F';
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StudentGradeCalculator ob=new StudentGradeCalculator();
        System.out.println("Enter the number of subjects :");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0;i<n;i++)
        {
            
            System.out.println("Enter marks of subject "+(i+1)+"\nMake sure that the marks you enter is out of 100 :");
            marks[i]=sc.nextInt();
        }
        double avgpercentage=ob.percentagecalculation(marks,n);
        char grade=ob.gradecalculation(avgpercentage);
        
        System.out.println("Average percentage scored: "+(int)avgpercentage);
        System.out.println("Grade obtained: "+grade);
        
    }
}