import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branch branch) {
        System.out.println("Branch added -> " + branch);
        branches.add(branch);
    }

    public void printListOfBranches() {
        for(Branch branch : branches) {
            System.out.println(branch);
        }
    }

    public String toString() {
        String nameOfBank = "Capital Bank";
        return "Name of the branch is " + nameOfBank + " it has currently " + branches.size() + " branches";
    }

}
