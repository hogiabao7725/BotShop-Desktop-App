package Model;

public class Category {
    private int CID;
    private String CName;
    private String CDecrip;

    public Category(int CID, String CName, String CDecrip) {
        this.CID = CID;
        this.CName = CName;
        this.CDecrip = CDecrip;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getCDecrip() {
        return CDecrip;
    }

    public void setCDecrip(String CDecrip) {
        this.CDecrip = CDecrip;
    }
    
    
}
