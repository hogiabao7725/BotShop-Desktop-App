package Model;

public class Product {
    private int PID;
    private String PName;
    private int CID;
    private int PQuantity;
    private double PPrice;

    public Product(int PID, String PName, int CID, int PQuantity, double PPrice) {
        this.PID = PID;
        this.PName = PName;
        this.CID = CID;
        this.PQuantity = PQuantity;
        this.PPrice = PPrice;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public int getPQuantity() {
        return PQuantity;
    }

    public void setPQuantity(int PQuantity) {
        this.PQuantity = PQuantity;
    }

    public double getPPrice() {
        return PPrice;
    }

    public void setPPrice(double PPrice) {
        this.PPrice = PPrice;
    }

    
}
