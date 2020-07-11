package com.epam3.CleanCode_Serialization;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
        Interest interest=new Interest();
        System.out.println("Enter Principal Amount, Time in Years, Rate of Interest");
        int prinicipalAmount=sc.nextInt();
        int timeInYears=sc.nextInt();
        double rateOfInterest=sc.nextDouble();
        System.out.println("Select Option\n1)Simple Interest\n2)Compound Interest\n");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1: System.out.println(interest.calculateSimpleInterest(prinicipalAmount, timeInYears, rateOfInterest));
                break;
        case 2:         
        	   System.out.println(interest.calculateCompoundInterest(prinicipalAmount, timeInYears, rateOfInterest));
        	   break;
        }
        
        System.out.println("Select type of materials and if required select fully automated from below options\n1)Standard Materials\n2)Above Standard Materials\n3)High Standard Materials\n4)High Standard and Fully Automated");
        ch=sc.nextInt();
        ConstructionCost cost=new ConstructionCost();
        System.out.println("Enter area of house");
        int area =sc.nextInt();
        switch(ch)
        {
        case 1: System.out.println(cost.costUsingStandardMaterials(area));
                break;
        case 2: System.out.println(cost.costUsingAboveStandardMaterials(area));
                break;
        case 3: System.out.println(cost.costUsingHightStandardMaterials(area));
                break;
        case 4: System.out.println(cost.costUsingHighStandardMaterialsandFullyAutomated(area));
                break;
        }
        
    }
}
