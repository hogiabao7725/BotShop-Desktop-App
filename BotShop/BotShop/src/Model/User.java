package Model;

public class User {
    private int UID;
    private String UName;
    private String UEmail;
    private String UPassword;
    private String UPhone;
    private String USecuQues;
    private String UAnswer;
    private String UAddress;
    private String UCountry;

    public User(int UID) {
        this.UID = UID;
    }

    public User(int UID, String UName, String UEmail, String UPassword, String UPhone, String USecuQues, String UAnswer, String UAddress, String UCountry) {
        this.UID = UID;
        this.UName = UName;
        this.UEmail = UEmail;
        this.UPassword = UPassword;
        this.UPhone = UPhone;
        this.USecuQues = USecuQues;
        this.UAnswer = UAnswer;
        this.UAddress = UAddress;
        this.UCountry = UCountry;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getUEmail() {
        return UEmail;
    }

    public void setUEmail(String UEmail) {
        this.UEmail = UEmail;
    }

    public String getUPassword() {
        return UPassword;
    }

    public void setUPassword(String UPassword) {
        this.UPassword = UPassword;
    }

    public String getUPhone() {
        return UPhone;
    }

    public void setUPhone(String UPhone) {
        this.UPhone = UPhone;
    }

    public String getUSecuQues() {
        return USecuQues;
    }

    public void setUSecuQues(String USecuQues) {
        this.USecuQues = USecuQues;
    }

    public String getUAnswer() {
        return UAnswer;
    }

    public void setUAnswer(String UAnswer) {
        this.UAnswer = UAnswer;
    }

    public String getUAddress() {
        return UAddress;
    }

    public void setUAddress(String UAddress) {
        this.UAddress = UAddress;
    }

    public String getUCountry() {
        return UCountry;
    }

    public void setUCountry(String UCountry) {
        this.UCountry = UCountry;
    }
    
    
}
