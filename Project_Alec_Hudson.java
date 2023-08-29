import java.util.Scanner;
public class Project_Alec_Hudson
{
   public static void main(String[] args)
   {
      Policy policy = new Policy();
      
      policy.setPolicyNumber( askPolicyNumber() );
      policy.setProvidersName( askProvidersName() );
      policy.setPolicyholdersFirstName( askPolicyholdersFirstName() );
      policy.setPolicyholdersLastName( askPolicyholdersLastName() );
      policy.setPolicyholdersAge( askPolicyholdersAge() );
      policy.setPolicyholdersSmokingStatus( askPolicyholdersSmokingStatus() );
      policy.setPolicyholdersHeight( askPolicyholdersHeight() );
      policy.setPolicyholdersWeight( askPolicyholdersWeight() );
      
      displayInformation(
         policy.getPolicyNumber(),
         policy.getProvidersName(),
         policy.getPolicyholdersFirstName(),
         policy.getPolicyholdersLastName(),
         policy.getPolicyholdersAge(),
         policy.getPolicyholdersSmokingStatus(),
         policy.getPolicyholdersHeight(),
         policy.getPolicyholdersWeight(),
         policy.calculateBMI(),
         policy.calculatePrice()
      );
   }
   
   public static int askPolicyNumber()
   {
      Scanner keyboard = new Scanner(System.in);
      int policyNumber;
      
      do {
         System.out.print("Please enter the Policy Number: ");
         policyNumber = keyboard.nextInt();
      } while (policyNumber < 1);
      
      return policyNumber;
   }
   
   public static String askProvidersName()
   {
      Scanner keyboard = new Scanner(System.in);
      String providersName;
      
      do {
         System.out.print("Please enter the Providers Name: ");
         providersName = keyboard.nextLine();
      } while (providersName.equalsIgnoreCase(""));
      
      return providersName;
   }
   
   public static String askPolicyholdersFirstName()
   {
      Scanner keyboard = new Scanner(System.in);
      String policyholdersFirstName;
      
      do {
         System.out.print("Please enter the Policyholder's First Name: ");
         policyholdersFirstName = keyboard.nextLine();
      } while (policyholdersFirstName.equalsIgnoreCase(""));
      
      return policyholdersFirstName;
   }
   
   public static String askPolicyholdersLastName()
   {
      Scanner keyboard = new Scanner(System.in);
      String policyholdersLastName;
      
      do {
         System.out.print("Please enter the Policyholder's Last Name: ");
         policyholdersLastName = keyboard.nextLine();
      } while (policyholdersLastName.equalsIgnoreCase(""));
      
      return policyholdersLastName;
   }
   
   public static int askPolicyholdersAge()
   {
      Scanner keyboard = new Scanner(System.in);
      int policyholdersAge;
      
      do {
         System.out.print("Please enter the Policyholder's Age: ");
         policyholdersAge = keyboard.nextInt();
      } while (policyholdersAge < 1);
      
      return policyholdersAge;
   }
   
   public static String askPolicyholdersSmokingStatus()
   {
      Scanner keyboard = new Scanner(System.in);
      String policyholdersSmokingStatus;
      
      do {
         System.out.print("Please enter the Policyholder's Smoking Status: ");
         policyholdersSmokingStatus = keyboard.nextLine();
      } while ( !(policyholdersSmokingStatus.equalsIgnoreCase("smoker")) && !(policyholdersSmokingStatus.equalsIgnoreCase("non-smoker")) );
      
      return policyholdersSmokingStatus;
   }
   
   public static double askPolicyholdersHeight()
   {
      Scanner keyboard = new Scanner(System.in);
      double policyholdersHeight;
      
      do {
         System.out.print("Please enter the Policyholder's Height: ");
         policyholdersHeight = keyboard.nextDouble();
      } while (policyholdersHeight <= 0.00);
      
      return policyholdersHeight;
   }
   
   public static double askPolicyholdersWeight()
   {
      Scanner keyboard = new Scanner(System.in);
      double policyholdersWeight;
      
      do {
         System.out.print("Please enter the Policyholder's Weight: ");
         policyholdersWeight = keyboard.nextDouble();
      } while (policyholdersWeight <= 0.00);
      
      return policyholdersWeight;
   }
   
   public static void displayInformation(int pNu, String pNa, String pFN, String pLN, int pA, String pSS, double pH, double pW, double BMI, double Price)
   {
      System.out.print(
         "\nPolicy Number: " + pNu
         + "\nProvider's Name: " + pNa
         + "\nPolicyholder's First Name: " + pFN
         + "\nPolicyholder's Last Name: " + pLN
         + "\nPolicyholder's Age: " + pA
         + "\npolicyholder's Smoking Status: " + pSS
      );
      System.out.printf("\nPolicyholder's Height: %.1f inches", pH);
      System.out.printf("\nPolicyholder's Weight: %.1f pounds", pW);
      System.out.printf("\nPolicyholder's BMI: %.2f", BMI);
      System.out.printf("\nPolicy Price: $%.2f", Price);
   }
}