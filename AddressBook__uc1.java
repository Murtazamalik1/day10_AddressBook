package day9;

public class AddressBook_uc1 {
  private   String firstname;
  private String lastname;
  private  String address;
  public   String state;
  private  double phone_no;
  public   String city;
  public   int zip;
  private  String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(double phone_no) {
        this.phone_no = phone_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddressBook_uc1{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", phone_no=" + phone_no +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        AddressBook_uc1 addressBook_uc1 = new AddressBook_uc1();
        System.out.println(addressBook_uc1);
    }
}
