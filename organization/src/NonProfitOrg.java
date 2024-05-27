import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NonProfitOrg {
    private List<Donor> donors;

    public NonProfitOrg(){
        this.donors = new ArrayList<>();
    }

    public void addDonor(Donor donor) {
        donors.add(donor);
    }

    public void removeDonor(Donor donor) {
        donors.remove(donor);
    }

    public void saveState() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("state.csv"))) {
            for (Donor donor : donors) {
                writer.println(donor.getName() + "," + donor.getDonation());
            }
        } catch (IOException e) {
            System.out.println("Error saving state: " + e.getMessage());
        }
    }

    public void restoreState() {
        try (BufferedReader reader = new BufferedReader(new FileReader("state.csv"))) {
            donors.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                double donation = Double.parseDouble(parts[1]);
                Donor donor = new Donor(name, donation);
                donors.add(donor);
            }
        } catch (IOException e) {
            System.out.println("Error restoring state: " + e.getMessage());
        }
    }
}
