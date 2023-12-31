import java.lang.Math;
public class Policy
{
   private int policyNumber;
   private String providersName;
   private String policyholdersFirstName;
   private String policyholdersLastName;
   private int policyholdersAge;
   private String policyholdersSmokingStatus;
   private double policyholdersHeight;
   private double policyholdersWeight;
   
   /**
      No-Arg Constructor
   */
   public Policy()
   {
      policyNumber = 0;
      providersName = "";
      policyholdersFirstName = "";
      policyholdersLastName = "";
      policyholdersAge = 0;
      policyholdersSmokingStatus = "";
      policyholdersHeight = 0;
      policyholdersWeight = 0;
   }
   
   /**
      Argument-Accepting Constructor
      @param pNu The integer value to set the policyNumber field to.
      @param pNa The string value to set the providersName field to.
      @param pFN The string value to set the policyholdersFirstName field to.
      @param pLN The string value to set the policyholdersLastName field to.
      @param pA The integer value to set the policyholdersAge field to.
      @param pSS The string value to set the policyholdersSmokingStatus field to.
      @param pH The double value to set the policyholdersHeight field to.
      @param pW The double value to set the policyholdersWeight field to.
   */
   public Policy(int pNu, String pNa, String pFN, String pLN, int pA, String pSS, double pH, double pW)
   {
      policyNumber = pNu;
      providersName = pNa;
      policyholdersFirstName = pFN;
      policyholdersLastName = pLN;
      policyholdersAge = pA;
      policyholdersSmokingStatus = pSS;
      policyholdersHeight = pH;
      policyholdersWeight = pW;
   }
   
   /**
      Method to set the policyNumber field.
      @param pNu The integer value to set the policyNumber field to.
   */
   public void setPolicyNumber(int pNu)
   {
      policyNumber = pNu;
   }
   
   /** 
      Method to set the providersName field.
      @param pNa The string value to set the providersName field to.
   */
   public void setProvidersName(String pNa)
   {
      providersName = pNa;
   }
   
   /**
      Method to set the policyholdersFirstName field.
      @param pFN The string value to set the policyholdersFirstName field to.
   */
   public void setPolicyholdersFirstName(String pFN)
   {
      policyholdersFirstName = pFN;
   }
   
   /**
      Method to set the policyholdersLastName field.
      @param pLN The string value to set the policyholdersLastName field to.
   */
   public void setPolicyholdersLastName(String pLN)
   {
      policyholdersLastName = pLN;
   }
   
   /**
      Method to set the policyholdersAge field.
      @param pA The integer value to set the policyholdersAge field to.
   */
   public void setPolicyholdersAge(int pA)
   {
      policyholdersAge = pA;
   }
   
   /**
      Method to set the policyholdersSmokingStatus field.
      @param pSS The string value to set the policyholdersSmokingStatus field to.
   */
   public void setPolicyholdersSmokingStatus(String pSS)
   {
      policyholdersSmokingStatus = pSS;
   }
   
   /**
      Method to set the policyholdersHeight field.
      @param pH The double value to set the policyholdersHeight field to.
   */
   public void setPolicyholdersHeight(double pH)
   {
      policyholdersHeight = pH;
   }
   
   /**
      Method to set the policyholdersWeight field.
      @param pW The double value to set the policyholdersWeight field to.
   */
   public void setPolicyholdersWeight(double pW)
   {
      policyholdersWeight = pW;
   }
   
   /**
      Method to get the integer value stored in the policyNumber field.
      @return The integer value stored in the policyNumber field.
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      Method to get the string value stored in the providersName field.
      @return The string value stored in the providersName field.
   */
   public String getProvidersName()
   {
      return providersName;
   }
   
   /**
      Method to get the string value stored in the policyholdersFirstName field.
      @return The string value stored in the policyholdersFirstName field.
   */
   public String getPolicyholdersFirstName()
   {
      return policyholdersFirstName;
   }
   
   /**
      Method to get the string value stored in the policyholdersLastName field.
      @return The string value stored in the policyholdersLastName field.
   */
   public String getPolicyholdersLastName()
   {
      return policyholdersLastName;
   }
   
   /**
      Method to get the integer value stored in the policyholdersAge field.
      @return The integer value stored in the policyholdersAge field.
   */
   public int getPolicyholdersAge()
   {
      return policyholdersAge;
   }
   
   /**
      Method to get the string value stored in the policyholdersSmokingStatus field.
      @return The string value stored in the policyholdersSmokingStatus field.
   */
   public String getPolicyholdersSmokingStatus()
   {
      return policyholdersSmokingStatus;
   }
   
   /**
      Method to get the double value stored in the policyholdersHeight field.
      @return The double value stored in the policyholdersHeight field.
   */
   public double getPolicyholdersHeight()
   {
      return policyholdersHeight;
   }
   
   /**
      Method to get the double value stored in the policyholdersWeight field.
      @return The double value stored in the policyholdersWeight field.
   */
   public double getPolicyholdersWeight()
   {
      return policyholdersWeight;
   }
   
   /**
      Method to calculate the BMI(Body Mass Index) of the policy holder using the policyholdersWeight and policyholdersHeight fields.
      @return The BMI(Body Mass Index) of the policyholder.
   */
   public double calculateBMI()
   {
      return (policyholdersWeight * 703) / Math.pow(policyholdersHeight, 2);
   }
   
   /**
      Method to calculate the price/fee of the policy using the policyholdersAge field, the policyholdersSmokingStatus field, and the calculated BMI(Body Mass Index) of the policy holder.
      @return The calculated price/fee of the policy.
   */
   public double calculatePrice()
   {
      final double BASE_FEE = 600.00, AGE_FEE = 75.00, SMOKER_FEE = 100.00, BMI_LIMIT = 35.00;
      final int AGE_LIMIT = 50;
      
      double calculatedFee = 0.00, BMI = calculateBMI();
      calculatedFee += BASE_FEE;
      
      if (policyholdersAge > AGE_LIMIT)
      {
         calculatedFee += AGE_FEE;
      }
      if (policyholdersSmokingStatus.equalsIgnoreCase("smoker"))
      {
         calculatedFee += SMOKER_FEE;
      }
      if (BMI > BMI_LIMIT)
      {
         calculatedFee += (BMI - 35) * 20;
      }
      
      return calculatedFee;
   }
}