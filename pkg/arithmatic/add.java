package pkg.arithmatic;
public class add extends mul{
    public int sum(int a,int b){
        return a+b;
    }
}
class mul extends div{
    public int product(int a,int b){
        return a*b;
    }
}
class div extends sub{
    public float frag(int a,int b){
        return a/b;
    }
}
class sub{
    public int reduce(int a,int b){
        return a-b;
    }
}