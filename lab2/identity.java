class identity{
    public static void main(String args[]){
        //Calendar c;
        System.out.println("Calendar.DECEMBER -> value of static variable in Calendar class\nCalendar.getInstance() -> Calling Static method");
        System.out.println("c.isTimeSet -> calling non static method in Calendar class for object c\nCalendar.getAvailableLocales() -> Calling Static method");
        System.out.println("c.clear() -> calling non static method in Calendar class for object c\n Calendar.MILLISECOND -> value of static variable in Calendar class");
        System.out.println("c.get(1) -> calling non static method in Calendar class for object c");
    }
}