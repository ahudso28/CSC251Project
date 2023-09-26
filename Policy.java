public class Policy
{
   private int policyNumber;
   private String providersName;
   private PolicyHolder policyHolder;
   
   /**
      No-Arg Constructor
   */
   public Policy()
   {
      policyNumber = 0;
      providersName = "";
      policyHolder = new PolicyHolder();
   }
   
   /**
      Argument-Accepting Constructor
      @param pNu The integer value to set the policyNumber field to.
      @param pNa The string value to set the providersName field to.
      @param pH The object to set the policyHolder field to.
   */
   public Policy(int pNu, String pNa, PolicyHolder pH)
   {
      policyNumber = pNu;
      providersName = pNa;
      policyHolder = new PolicyHolder(pH);
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
      Method to set the policyHolder field.
      @param pH The object to set the policyHolder field to.
   */
   public void setPolicyHolder(PolicyHolder pH)
   {
      policyHolder = new PolicyHolder(pH);
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
      Method to get the object stored in the policyHolder field.
      @return The object stored in the policyHolder field.
   */
   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }
   
   public String toString()
   {
      return String.format(
         "Policy Number: %d" + 
         "\nProvider's Name: %s" + 
         "\n%s",
         policyNumber,
         providersName,
         policyHolder.toString()
      );
   }
}