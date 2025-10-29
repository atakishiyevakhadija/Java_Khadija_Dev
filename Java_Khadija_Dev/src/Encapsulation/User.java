package Encapsulation;

public class User {
    private String name;
    private String surname;
    private int phoneNumber;
    private String email;
    private String cardNumber;
    private String birthdate;
    private int password;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public String getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }
    public int getPassword(){
        return password;
    }
    public void setPassword(int password){
        this.password = password;
    }
}
