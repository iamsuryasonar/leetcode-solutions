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
        
        
        int ConvertedInteger = 0;
            
        for(int i = 0;i<s.length()-1;i++){
            int currentValue = SymbolToNum.get(s.charAt(i));
            int nextValue = SymbolToNum.get(s.charAt(i+1));
            
            if(currentValue < nextValue){
                
                ConvertedInteger = ConvertedInteger - currentValue;
                
            }else{
                
                ConvertedInteger = ConvertedInteger + currentValue;
                
            }
        }
        
        ConvertedInteger = ConvertedInteger + SymbolToNum.get(s.charAt(s.length()-1));
            
        return ConvertedInteger;    
    }
}