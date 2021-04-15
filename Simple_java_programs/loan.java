class loan{
    public static void main(String args[]){
        int p = Integer.parseInt(args[0]);
        float r = Float.parseFloat(args[1]);
        int t = Integer.parseInt(args[2]);
        double y;
        y=p*Math.exp(r*t);
        System.out.print("monthly payments: ");
        System.out.print(y);
    }
}