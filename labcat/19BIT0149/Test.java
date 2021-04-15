interface F {
    // An abstract method in interface cannot have 
    
    void test();
}

public class Test implements F {
    // This method needs definition
    public void test(){
        System.out.println("I am an overridden method");
    }
    public static void main(String[] args){
        // We are instantiating a Test object 
        // Test is F so we can use this 
        F q = new Test();


    
        q.test();
    }

}