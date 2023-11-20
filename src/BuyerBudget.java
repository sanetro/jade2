package jadelab2;

public class BuyerBudget {
    private int budget;

    BuyerBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public boolean isAvaibleToBuy(int cost) {
        if (this.budget - cost > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
