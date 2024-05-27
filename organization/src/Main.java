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
    }
}