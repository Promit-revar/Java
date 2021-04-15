
class arrays{
    static boolean isEqual(int [] arr1,int [] arr2){
       
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i])
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int [] arr1=new int[5];
        int [] arr2=new int[5];
        for(int i=0;i<5;i++){
            arr1[i]=i+1;
            arr2[i]=i+1;
        }
        
        int [] arr3={1,2,3,4,6};
        int [] arr4={1,2,3,4};
        if(isEqual(arr3,arr2)){
            System.out.println("arrays are equal");
        }
        else{
            System.out.println("arrays are not equal");
        }
    }
}