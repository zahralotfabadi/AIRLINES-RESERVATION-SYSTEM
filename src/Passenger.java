public class Passenger {
    Sign sign1=new Sign();
    private String psrName=sign1.user;
    private String psrPassword= sign1.password;
    public int charge=0;
    public String[] flight;

    public Passenger(String psrName, String psrPassword) {
        this.psrName = psrName;
        this.psrPassword = psrPassword;
    }

    public String getPsrName() {
        return psrName;
    }

    public void setPsrName(String psrName) {
        this.psrName = psrName;
    }

    public String getPsrPassword() {
        return psrPassword;
    }

    public void setPsrPassword(String psrPassword) {
        this.psrPassword = psrPassword;
    }
}

