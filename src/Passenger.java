public class Passenger {
    Sign sign1 = new Sign();
    private String psrName;
    private String psrPassword;
    private int charge;


    public Passenger(String psrName, String psrPassword, int charge) {
        this.psrName = psrName;
        this.psrPassword = psrPassword;
        this.charge = charge;
    }

    public Sign getSign1() {
        return sign1;
    }

    public void setSign1(Sign sign1) {
        this.sign1 = sign1;
    }

    public String getPsrName() {
        return psrName;
    }

    public void setPsrName(String psrName) {
        this.psrName = sign1.user;
    }

    public String getPsrPassword() {
        return psrPassword;
    }

    public void setPsrPassword(String psrPassword) {
        this.psrPassword = sign1.password;
    }

    public void setCharge(int charge) {
        this.charge = sign1.chargeSign;
    }
    public int getCharge() {
        return charge;
    }

}

