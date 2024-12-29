package fi;

@FunctionalInterface
interface Parent{
     void parent();
     default void doIt(){
         System.out.println("do it parent interface ");
     }
}
@FunctionalInterface
interface Child {
    void child();
    default void doIt(){
        System.out.println("child overridden method");
    }
}
public class FI_Inheritance implements Parent,Child{
    public static void main(String[] args) {
        FI_Inheritance fiInheritance = new FI_Inheritance();
        fiInheritance.parent();
    }

    @Override
    public void parent() {

    }

    @Override
    public void doIt() {
        Child.super.doIt();
    }
 /*   @Override
    public void doIt() {
        Parent.super.doIt();
    }*/

    @Override
    public void child() {

    }
}
