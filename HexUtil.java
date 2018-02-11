public class HexUtil {
    private static String hexToString(String hex){
        String hexSplit = hex.replaceAll("(.{2})","$1 ").trim();
        String[] hexValueArray = hexSplit.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String item : hexValueArray){
            char value = (char) Integer.parseInt(item,16);
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }
    
    public static void main(String args[]) {
        String hex = "48656c6c6f20576f726c64"; //Assume sources char can be found in ASCII 
        String result = hexToString(hex);
        System.out.println(result);
    }   
    
    
    
}
