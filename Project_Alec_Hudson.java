import java.io.*;
import java.util.*;
public class Project_Alec_Hudson
{
   public static void main(String[] args) throws IOException
   {      
      File file = new File("PolicyInformation.txt");
      Scanner input = new Scanner(file);
      
      if (!file.exists())
      {
         System.out.println("PolicyInformation.txt file was not found.");
         System.exit(0);
      }
      
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      while (input.hasNext())
      {
         Policy policy = new Policy();
         
         policy.setPolicyNumber( input.nextInt() );
         if (input.hasNext())
            input.nextLine();
         policy.setProvidersName( input.nextLine() );
         policy.setPolicyholdersFirstName( input.nextLine() );
         policy.setPolicyholdersLastName( input.nextLine() );
         policy.setPolicyholdersAge( input.nextInt() );
         if (input.hasNext())
            input.nextLine();
         policy.setPolicyholdersSmokingStatus( input.nextLine() );
         policy.setPolicyholdersHeight( input.nextDouble() );
         policy.setPolicyholdersWeight( input.nextDouble() );
         
         policies.add(policy);
         
         if (input.hasNext())
            input.nextLine();
         if (input.hasNext())
            input.nextLine();
      }
      
      input.close();
      
      displayInformation(policies);
   }
      
   public static void displayInformation(ArrayList<Policy> policies)
   {  
      int numberSmokers = 0, numberNonSmokers = 0;
      
      for (int index = 0; index < policies.size(); index++)
      {
         Policy policy = policies.get(index);
         
         System.out.print(
            "Policy Number: " + policy.getPolicyNumber()
            + "\nProvider's Name: " + policy.getProvidersName()
            + "\nPolicyholder's First Name: " + policy.getPolicyholdersFirstName()
            + "\nPolicyholder's Last Name: " + policy.getPolicyholdersLastName()
            + "\nPolicyholder's Age: " + policy.getPolicyholdersAge()
            + "\npolicyholder's Smoking Status: " + policy.getPolicyholdersSmokingStatus()
         );
         System.out.printf("\nPolicyholder's Height: %.1f inches", policy.getPolicyholdersHeight() );
         System.out.printf("\nPolicyholder's Weight: %.1f pounds", policy.getPolicyholdersWeight() );
         System.out.printf("\nPolicyholder's BMI: %.2f", policy.calculateBMI() );
         System.out.printf("\nPolicy Price: $%.2f", policy.calculatePrice() );
         
         if (policy.getPolicyholdersSmokingStatus().equalsIgnoreCase("smoker"))
            numberSmokers += 1;
         else if (policy.getPolicyholdersSmokingStatus().equalsIgnoreCase("non-smoker"))
            numberNonSmokers += 1;
         
         if (index < policies.size())
            System.out.println("\n");
      }
      
      System.out.print("The number of policies with a smoker is: " + numberSmokers
      + "\nThe number of policies with a non-smoker is: " + numberNonSmokers);
   }
}