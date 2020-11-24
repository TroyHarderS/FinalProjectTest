package models;

public class CustomerModel {

    private String email = "kekis100500@gmail.com";
    private String password = "EasyPassword12";
    private String phoneNumber = "54687931";
    private String address = "Witcher street 16";
    private String city = "Novigrad";
    private String zip = "County side";
    private String name = "Ninja";
    private String lastName = "Reeves";

    public String getEmail() { return email; }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getZip() { return zip; }
    public String getLastName() { return lastName; }
}
