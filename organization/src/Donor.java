public class Donor {
    private String name;
    private double donation;

    public Donor(String name, double donation) {
        this.name = name;
        this.donation = donation;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation){
        this.donation = donation;
    }
}
