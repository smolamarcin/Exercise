package generics;

public class App {
    public static void main(String[] args) {
        System.out.println("Generics!");
        BoxWithoutGenerics boxWithoutGenerics=new BoxWithoutGenerics();
        boxWithoutGenerics.set("siema");
        boxWithoutGenerics.set(1);
        BoxWithGenerics <String>boxWithGenerics=new BoxWithGenerics<>();
        boxWithGenerics.set("Siema");
        MyGenericClass as=new MyGenericClass<Integer>("sa");
    }
}
