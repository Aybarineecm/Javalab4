class LocalResource extends Person
{
   //instance variables
   private String dob;
   private String sector;
   private static int count=-1;
   private int idnum;
   private String trn_num;
   private double pay ;
   private String contact;
   
    
    
   // constructor
   public LocalResource(String dob, String sector)
   {    
        super();
        count++;
        String[] parts = dob.split("/");
        super.setDob(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),Integer.parseInt(parts[2])); 
        this.dob = dob ;
        this.idnum = count;
        this.trn_num = trn_num;
        this.sector = sector;  
        this.contact = contact;
   }
   
   public String getDob()
   {
       return this.dob;
   }
   
   public int getId()
   {
       return this.idnum;
   }
   
   public String getSector()
   {
       return this.sector;
   }
   
   public String getTRN()
   { 
        // Integer.toString(i); converting int to String
        
        return Integer.toString(100000000 + this.idnum); 
       
   }
   
   public double getPay()
   {
       return this.pay;
   }
   
   public String getContact()
   {
       return this.contact;
   }
   
   
     
}