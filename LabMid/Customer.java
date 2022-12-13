package LabMid;

public class Customer extends Person{

    private String custID;
    private String pswd;
    
    public Customer(String name, int age, String custID, String pswd) {
        super(name, age);
        this.custID = custID;
        this.pswd = pswd;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public String toString() {
        return "Customer [custID=" + custID + ", pswd=" + pswd + "]";
    }

    
    
}
