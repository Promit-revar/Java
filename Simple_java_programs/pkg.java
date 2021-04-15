import pack1.Extract;
import pack1.Pack2.*;
import java.util.*;
class pkg{
    public static void main(String args[]){
        
        
                int n;
                Extract e = Extract();
                Sum s = Sum();
                SumOfSquares ss = SumOfSquares();
                Scanner sc = Scanner(System.in);
                n = sc.nextInt();
        
                e.extractDigits(n);
                s.printSum(n);
                ss.printSumofSquares(n);
        
            }
        }
    


