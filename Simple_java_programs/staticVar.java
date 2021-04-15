class serial{
    static int count=1;
    int id;
    serial(){
       id=serial.count;
       serial.count++;
    }
    void returnId(){
        System.out.println("Object id: "+this.id);
    }
}
class staticVar{
    public static void main(String args[]){
    serial obj1= new serial();
    serial obj2= new serial();
    serial obj3= new serial();
    //System.out.println("Object 1 id: ");
    //System.out.println("Object 1 id: "+obj1.returnId()+"\n Object 2: "+obj2.returnId()+"\n Object 3: "+obj3.returnId());
    obj1.returnId();
    obj2.returnId();
    obj3.returnId();
    }
} 