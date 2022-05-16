
package java_project_1_2;


public class Product {
    
    private  int id;
    private  String location;
    private  float rent;
    private  String addDate; 
    private  byte[] picture;
    
    public Product(int cnum,String loc, float ren, String pAddDate, byte[] pimg)
    {
        this.id = cnum;
        this.location=loc;
        this.rent = ren;
        this.addDate = pAddDate;
        this.picture = pimg;
        
    }

    

    
    
    public int getId()
    {
        return id;
    }
    
 
    
    public String getlocation()
    {
        return location;
    }
    
    public float getrent()
    {
        return rent;
    }
    
    public String getAddDate()
    {
        return  addDate;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    
    
    
}

    

