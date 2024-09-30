 class User{
    private String lastname="";
    private String firstname="";
    private String phone="";
    private String address="";

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    } 
    public void setfirstname(String firstname)
    {
        this.firstname = firstname;
    } 
    public void setphone(String phone)
    {
        this.phone = phone;
    } 
    public void setaddress(String address)
    {
        this.address = address;
    } 

    public String getLastname(){
        return lastname;
    }

    public String getAddress(){
        return address;
    }

}

public class builder {
    public static void main(String[] args){
        User user = new User();
        user.setLastname("Joseph");
        System.out.print(user.getLastname());
    }
}

/*

echo "# pattern builder" >> README.md
git init
git add builder.java
git commit -m "builder.java"
git branch -M main
git remote add origin https://github.com/MePrince47/pattern.git
git push -u origin main


*/