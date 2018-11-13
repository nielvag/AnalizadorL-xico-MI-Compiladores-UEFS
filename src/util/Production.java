package util;


import java.util.ArrayList;

public class Production {
    private String first;
    private boolean hasNull = false;
    private ArrayList<Production> derivations;

    public Production(String first) {
        this.first = first;
        derivations = new ArrayList<Production>();
    }
    
    public int derivateProductions() {
        return 0;
    }

    public String getFirst() {
        return first;
    }

    public boolean isHasNull() {
        return hasNull;
    }

    public void setTerminal(String terminal) {
        this.first = terminal;
    }

    public void setHasNull(boolean hasNull) {
        this.hasNull = hasNull;
    }
    
    
}
