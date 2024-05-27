public class Main {
    public static void main(String[] args) {
        NonProfitOrg org = new NonProfitOrg();
        Donor donor1 = new Donor("Nikoloz A", 93.0);
        Donor donor2 = new Donor("Nikoloz B", 1113.7);

        org.addDonor(donor1);
        org.addDonor(donor2);

        org.saveState(); // Saves the state to state.csv

        org.removeDonor(donor1); // Removes first donor from the list

        org.restoreState(); // Restores the state from state.csv

        System.out.println(donor1.getDonation());
        System.out.println(donor2.getName());

        System.out.println(donor1.getName());
        donor1.setName("Nikoloz C");
        System.out.println(donor1.getName());

        donor2.setDonation(87.0);
        System.out.println(donor2.getDonation());
    }
}