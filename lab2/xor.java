import java.lang.Math;
import java.util.Arrays;
class xor{
    static int [] Xor(int [] arr1, int [] arr2){
        int n=arr1.length,m=arr2.length;
        int [] ans=new int[m+n];
        int s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2[j]==arr1[i]){
                    ans[s]=arr2[j];
                    s++;
                    break;
                }
            }
        }
        
        /*for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
        System.out.print(s+"\n");*/
        Arrays.sort(ans);
        int [] result=new int[m+n-2*s];
        s=0;
        for(int i=0;i<n;i++){
            if(Arrays.binarySearch(ans,arr1[i])<0){
               result[s]=arr1[i];
               s++;
            }
        }
        for(int i=0;i<m;i++){
            if(Arrays.binarySearch(ans,arr2[i])<0){
               result[s]=arr2[i];
               s++;
            }
        }
        Arrays.sort(result);
        return result;

        

    }
    public static void main(String args[]){
        int [] a={1,3,5,7,8,9,10};
        int [] b={1,2,4,6,8,10,11};
        int [] ans=Xor(a,b);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}