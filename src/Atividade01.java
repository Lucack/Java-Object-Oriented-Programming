public class Atividade01 {
    
     
    public static double diffAbs(double a, double b){
        double diff = a-b;
        if (diff <0){
            diff *= (-1);
        }
        return diff;
    }
    
    public static double sqrt(double n, double epsilon) {
        
        double x = n/2;
        double result = 0;
        double diff = diffAbs(result,x);
        
        //System.out.println("diff: "+ diff+ "epsilon:"+ epsilon);
        
        while (diff > epsilon){
            
            result = ( x + ( n/x ) ) / 2;
            diff = diffAbs(result,x);
            x = result;
            //System.out.println("x: "+ x+ "result:"+ result);
        }
    
        return x;
        
    }
    
    

    public static boolean isPerfectNumber(long number) {
        
        if (number < 0) return false;
        
        int sum = 0;
        
        for (int i = 1 ; i < number; i++){
            
            if (number % i == 0){
                sum+=i;
            }
        }
        
        if (sum == number){
            return true;
        }
        
        return false;
    }

    public static String encrypt(String message, int key) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char[] alfList = alfabeto.toCharArray();
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++  ){
            //System.out.println("Antes: "+ chars[i]);
            //System.out.println("alfListLenght: "+ alfList.length);
            //System.out.println("alfabeto: "+ alfabeto.indexOf(chars[i]));
            int newIndex = alfabeto.indexOf(chars[i])+key;
            if (newIndex >= alfList.length){
                newIndex = newIndex-alfList.length;
            }
            chars[i] = alfList[newIndex];
            //System.out.println("Depois: "+ chars[i]);
        }
        String result = new String(chars);

        return result;
    }

    public static String decrypt(String encryptedMessage, int key) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char[] alfList = alfabeto.toCharArray();
        char[] chars = encryptedMessage.toCharArray();

        for (int i = 0; i < chars.length; i++  ){
            //System.out.println("Antes: "+ chars[i]);
            //System.out.println("alfListLenght: "+ alfList.length);
            //System.out.println("alfabeto: "+ alfabeto.indexOf(chars[i]));
            
            int newIndex = alfabeto.indexOf(chars[i])-key;

            if (newIndex < 0){
                newIndex = newIndex+alfList.length;
            }
            chars[i] = alfList[newIndex];
            //System.out.println("Depois: "+ chars[i]);
        }
        String result = new String(chars);

        return result;
    }
    
    
    public static void main(String[] args) throws Exception {
        
        double a = 16.0;
        double e = 0.001;
        
        
        double result = sqrt(a,e);
        System.out.println("Resultado sqrt de "+a+" e e:"+ e +" e igual: "+ result);
        
        int perfect = 7;
        System.out.println("Resultado perfect de "+perfect+" e igual: "+ isPerfectNumber(perfect));
        
        
        String text = "hello";
        String text1 = "aaaa";
        System.out.println("Resultado encrypt de "+text+" e igual: "+ encrypt(text,3));
        System.out.println("Resultado encrypt de "+text+" e igual: "+ decrypt(text1,3));
        
    }
    
}
