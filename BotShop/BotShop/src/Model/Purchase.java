package Model;

public class Purchase {
    private int ID;
    private int UserID;
    private int PID;
    private int Quantity;
    private double Price;
    private String p_date;
    private String ReceivedDate;
    private int ShipperID;
    private String Status;

    public Purchase(int ID, int UserID, int PID, int Quantity, double Price, String p_date, String ReceivedDate, int ShipperID, String Status) {
        this.ID = ID;
        this.UserID = UserID;
        this.PID = PID;
        this.Quantity = Quantity;
        this.Price = Price;
        this.p_date = p_date;
        this.ReceivedDate = ReceivedDate;
        this.ShipperID = ShipperID;
        this.Status = Status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getPID() {
        return PID;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getP_date() {
        return p_date;
    }

    public void setP_date(String p_date) {
        this.p_date = p_date;
    }

    public String getReceivedDate() {
        return ReceivedDate;
    }

    public void setReceivedDate(String ReceivedDate) {
        this.ReceivedDate = ReceivedDate;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int ShipperID) {
        this.ShipperID = ShipperID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    } 
}
