public class CoolNumbers {
    public static void main(String[] args){
        System.out.println(isCool(0, 49));
        System.out.println(countCools(3 , 1111 ,9999));
    
        
    }
    public static boolean isCool (int x , int n){
        int temp = x;
        boolean cool= false ;
        while (temp > 0){
            int digit = temp % 10 ;
            if (digit ==0 || n % digit !=0){
                cool = false;
                break;
            }
            else {
                cool = true;
            }
            temp /=10;
        }
        return cool;
    
        
    }
    public static int countCools (int n , int a , int b){
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isCool(i,n)){
               ++count;
            }
            
        }
        return count;
        
    
    
        }
    }
    
