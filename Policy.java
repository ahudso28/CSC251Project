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
   
   public void setPolicyNumber(int pNu)
   {
      policyNumber = pNu;
   }
   
   public void setProvidersName(String pNa)
   {
      providersName = pNa;
   }
   
   public void setPolicyholdersFirstName(String pFN)
   {
      policyholdersFirstName = pFN;
   }
   
   public void setPolicyholdersLastName(String pLN)
   {
      policyholdersLastName = pLN;
   }
   
   public void setPolicyholdersAge(int pA)
   {
      policyholdersAge = pA;
   }
   
   public void setPolicyholdersSmokingStatus(String pSS)
   {
      policyholdersSmokingStatus = pSS;
   }
   
   public void setPolicyholdersHeight(double pH)
   {
      policyholdersHeight = pH;
   }
   
   public void setPolicyholdersWeight(double pW)
   {
      policyholdersWeight = pW;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProvidersName()
   {
      return providersName;
   }
   
   public String getPolicyholdersFirstName()
   {
      return policyholdersFirstName;
   }
   
   public String getPolicyholdersLastName()
   {
      return policyholdersLastName;
   }
   
   public int getPolicyholdersAge()
   {
      return policyholdersAge;
   }
   
   public String getPolicyholdersSmokingStatus()
   {
      return policyholdersSmokingStatus;
   }
   
   public double getPolicyholdersHeight()
   {
      return policyholdersHeight;
   }
   
   public double getPolicyholdersWeight()
   {
      return policyholdersWeight;
   }
   
   public double calculateBMI()
   {
      return (policyholdersWeight * 703) / Math.pow(policyholdersHeight, 2);
   }
   
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