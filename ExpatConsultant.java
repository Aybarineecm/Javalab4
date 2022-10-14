class ExpatConsultant extends Person implements Consultant, RegisteredExpat
{
    
    private double airfare , permitTax, skillPrice;
    private int id;
    static private int nextId;
    private String sector;
    
      
public ExpatConsultant(){}

public ExpatConsultant(String dob, String sector,double skillPrice,double taxRate, double airfare)
{
    //dob is a string in the format mm/dd/yyyy
    // By doing this you are initializing all the variables from the parent constructor
    super();
    String[] parts = dob.split("/");
    super.setDob(Integer.parseInt(parts[1]),Integer.parseInt(parts[0]),Integer.parseInt(parts[2])); 
    this.skillPrice = skillPrice;
    this.permitTax=skillPrice*taxRate;
    this.airfare=airfare;
    this.sector = sector;
    this.id = getNextId();
        
}

public String getSector()
{
    return sector;
}
public String getContact()
{
    return "Reg. Expatriate#"+this.id;
}

public int getNextId()
{
    id=nextId;
    nextId++;
    return id;
}

public int getId()
{
    return id;
}

    public double getPay()
    {
        double earnings = earnFromSkill();
        return (earnings - permitTax -airfare);
        
    }
    
    public String getWorkPermit()
    {
        return "WP00" + this.id;
    }
    
    
    public double earnFromSkill()
    {
        return this.skillPrice;
    }
}