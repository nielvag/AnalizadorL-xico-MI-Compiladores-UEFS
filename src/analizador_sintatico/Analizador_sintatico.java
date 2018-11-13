package analizador_sintatico;

import java.util.HashMap;
import java.util.Map;
import util.Production;

public class Analizador_sintatico {
    private static Map<String,Production> productions = new HashMap<String,Production>();
    
    
    public static void main(String[] args) {
        productions.put("class", new Production("class"));
        productions.put("identifier", new Production("class"));
        productions.put("extends", new Production("class"));
        productions.put("class-code", new Production("class"));
        
    }
    
}
