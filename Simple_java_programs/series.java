class series{
    public static void main(String args[]){
        for(int i=16;i<=2048;i=i*2){
            System.out.println(Math.log(i)+"\t"+i+"\t"+i*Math.log(i)+"\t"+i*i+"\t"+i*i*i+"\t"+Math.pow(2,i));
        }
    }
}