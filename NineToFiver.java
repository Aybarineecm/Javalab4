class NineToFiver extends LocalResource
{
    
    private int starthour, endhour;
    private int numWorkDays;
    private double hourlyRate;
    private double taxRate;
    
    public NineToFiver(String dob, String sector,
            int starthour, int endhour, int numWorkDays, 
            double hourlyRate, double taxRate)
    {
        super(dob,sector);
        this.starthour= starthour;
        this.endhour = endhour;
        this.numWorkDays=numWorkDays;
        this.hourlyRate=hourlyRate;
    }
    
    public double getPay()
    {
        return (1 - taxRate)*hourlyRate*(endhour-starthour)*numWorkDays;
    }
   

    public String getContact()
    {
        return "Local Employee #"+getId();
    }
    
}