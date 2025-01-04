package Model;

public class Shipper {
    private int SID;
    private String SName;
    private String SEmail;
    private String SPassword;
    private String SPhone;
    private String SAddress;
    private String SCountry;

    public Shipper(int SID, String SName, String SEmail, String SPassword, String SPhone, String SAddress, String SCountry) {
        this.SID = SID;
        this.SName = SName;
        this.SEmail = SEmail;
        this.SPassword = SPassword;
        this.SPhone = SPhone;
        this.SAddress = SAddress;
        this.SCountry = SCountry;
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getSEmail() {
        return SEmail;
    }

    public void setSEmail(String SEmail) {
        this.SEmail = SEmail;
    }

    public String getSPassword() {
        return SPassword;
    }

    public void setSPassword(String SPassword) {
        this.SPassword = SPassword;
    }

    public String getSPhone() {
        return SPhone;
    }

    public void setSPhone(String SPhone) {
        this.SPhone = SPhone;
    }

    public String getSAddress() {
        return SAddress;
    }

    public void setSAddress(String SAddress) {
        this.SAddress = SAddress;
    }

    public String getSCountry() {
        return SCountry;
    }

    public void setSCountry(String SCountry) {
        this.SCountry = SCountry;
    }
    
    
}
