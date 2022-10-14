public class LocalConsultant extends LocalResource implements Citizen, Consultant
{
   // instance variables
   private double skillPrice;
   private double taxRate;
   private double permittax;
   private String trn;
  
   //citizen - trn consultant - earn from tax
   //constructor
   public LocalConsultant(String dob, String sector, double skillPrice, double taxRate)
   { 
      super(dob,sector);
      this.skillPrice = skillPrice;
      this.taxRate = taxRate;
      this.permittax = taxRate*skillPrice;  
   }
   
   public void setTRN( String trn)
   {
       this.trn = trn;
   }
   public String getTRN()
   {
       return this.trn;
   }
   
   public double earnFromSkill()
   {
       return this.skillPrice;
   }
   
   public String getContact()
   {
       return "LocalConsultant#"+ getId();
   }
   
   public double getPay()
   {
        return (this.skillPrice - this.permittax);
   }
   
   public double getPermittax()
   {
       return this.permittax;
   } 
} 
