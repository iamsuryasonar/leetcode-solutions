class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> SymbolToNum = new HashMap<Character,Integer>();
        
        SymbolToNum.put('I', 1);
        SymbolToNum.put('V', 5);
        SymbolToNum.put('X', 10);
        SymbolToNum.put('L', 50);
        SymbolToNum.put('C', 100);
        SymbolToNum.put('D', 500);
        SymbolToNum.put('M', 1000);
        
        
        int IntegerValue = 0;
            
        for(int i = 0;i<s.length()-1;i++){
            
            if(SymbolToNum.get(s.charAt(i))<SymbolToNum.get(s.charAt(i+1))){
                
                IntegerValue = IntegerValue - SymbolToNum.get(s.charAt(i));
                
            }else{
                
                IntegerValue = IntegerValue + SymbolToNum.get(s.charAt(i));
                
            }
        }
        
        IntegerValue = IntegerValue + SymbolToNum.get(s.charAt(s.length()-1));
            
        return IntegerValue;    
    }
}