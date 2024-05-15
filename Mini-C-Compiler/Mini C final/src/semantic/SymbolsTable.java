
package semantic;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class SymbolsTable {
    
    private HashMap<String, Object[]> symbols;
    
    @Override
    public String toString() { 
//        Collections<Object[]> c = new Collections[10];
//               c = symbols.values();
//        for (Object objectName : symbols.keySet()) {
//   System.out.println(objectName);
//   System.out.println(symbols.get(objectName));
// }
    return symbols.values().toString();

//    return Arrays.asList(symbols).toString();    
        
        
    }
    
    protected SymbolsTable(){
        symbols = new HashMap<>();
    }
    
    private static SymbolsTable INSTANCE;
    
    public static SymbolsTable getInstance(){
        if (INSTANCE == null)
            INSTANCE = new SymbolsTable();
        return INSTANCE;
    }
    
    public void addSymbol(String symbol, Object[] value){
        symbols.put(symbol, value);
    }
    
    public Object[] getSymbol(String symbol){
        if (symbols.containsKey(symbol)){
            return symbols.get(symbol);
        }
        return null;
    }
        public String getType(String symbol) {
        if (symbols.containsKey(symbol)) {

            Object data[] = symbols.get(symbol);
            return (String) data[0];

        }
        return "";
    }

    public Object getValue(String symbol) {
        if (symbols.containsKey(symbol)) {

            Object data[] = symbols.get(symbol);
            return data[1];

        }
        return "";
    }

    
}
