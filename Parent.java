public class Parent{
    String f;
    String l;
    int age;
    public Parent(String fn, String ln, int a){
        f = fn;
        l = ln;
        age = a;
    }
    public String toString(){
        return "Name: " + this.f +" "+ this.l + "\nAge: "+ this.age;
    }


}