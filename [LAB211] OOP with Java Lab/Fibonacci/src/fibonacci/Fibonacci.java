 // 50 loc
 // 20 loc Bubble sort 
package fibonacci;

 
public class Fibonacci {

    
    public static void main(String[] args) {
        System.out.println(" 45 sequence Fibonaci ");
        
          for (int i = 0; i < 45; i++) {
            int result = Fibonacci(i);
            System.out.println(result + ", ");
        }

     }
        
    public static int Fibonacci(int input){
        if(input < 2){
           return input; 
        }else{
            return Fibonacci(input -1 ) + Fibonacci(input - 2);
        }
    }
    
 
    
}
