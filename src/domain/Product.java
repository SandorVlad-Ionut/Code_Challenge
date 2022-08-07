package domain;


public class Product {

    public int Id;
    private int storage_unit;
    private String name;
    private int price;
    private int nutri_value;
    private String vendor;
    private String category;




    public Product() {

        this.name="";
        this.storage_unit = 0;
        this.price=0;
        this.nutri_value=0;
        this.vendor="";
        this.category="";


    }

    public Product( int Id,String name, int storage_unit, int price, int nutri_value, String vendor,String category) {


        this.Id=Id;
        this.storage_unit = storage_unit;
        this.name=name;
        this.price=price;
        this.nutri_value=nutri_value;
        this.vendor=vendor;
        this.category=category;


    }

    public String getVendor() {
        return vendor;
    }
    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }



    public Integer getPrice() {
        return price;
    }
    public Integer getId() { return Id;
    }

    public Integer getNutri() {
        return nutri_value;
    }
    public Integer getStorage() { return storage_unit;}



    public void setVendor(String vendor) {
        this.vendor =vendor ;
    }

    public void setCategory(String category ) {
        this.category =category ;
    }


    public void setNutri(int nutri) {
        this.nutri_value =nutri ;
    }

    public void setPrice(int price) {
        this.price = price ;
    }

    public void setId(int Id) {
        this.Id = Id ;
    }

    public void setStorage_unit(int storage_unit) {
        this.storage_unit =storage_unit ;
    }

   // @Override
    // public void setId(Integer Id) {
    //    this.Id=Id;
    //}


    @Override
    public String toString() {
        return " product " + name + " with the price " + price;
    }

}


