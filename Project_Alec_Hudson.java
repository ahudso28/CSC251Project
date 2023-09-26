import java.io.*;
import java.util.*;
public class Project_Alec_Hudson
{
   private static int numberPolicies = 0, numberSmokers = 0, numberNonSmokers = 0;
   
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
         policy.setPolicyHolder( new PolicyHolder() );
         policy.getPolicyHolder().setPolicyholdersFirstName( input.nextLine() );
         policy.getPolicyHolder().setPolicyholdersLastName( input.nextLine() );
         policy.getPolicyHolder().setPolicyholdersAge( input.nextInt() );
         if (input.hasNext())
            input.nextLine();
         policy.getPolicyHolder().setPolicyholdersSmokingStatus( input.nextLine() );
         policy.getPolicyHolder().setPolicyholdersHeight( input.nextDouble() );
         policy.getPolicyHolder().setPolicyholdersWeight( input.nextDouble() );
         
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
      for (int index = 0; index < policies.size(); index++)
      {
         Policy policy = policies.get(index);
         
         System.out.print( policy.toString() );
         
         numberPolicies++;
         if (policy.getPolicyHolder().getPolicyholdersSmokingStatus().equalsIgnoreCase("smoker"))
            numberSmokers++;
         else if (policy.getPolicyHolder().getPolicyholdersSmokingStatus().equalsIgnoreCase("non-smoker"))
            numberNonSmokers++;
         
         if (index < policies.size())
            System.out.println("\n");
      }
      
      System.out.print("There were " + numberPolicies + " Policy objects created."
      + "\nThe number of policies with a smoker is: " + numberSmokers
      + "\nThe number of policies with a non-smoker is: " + numberNonSmokers);
   }
}