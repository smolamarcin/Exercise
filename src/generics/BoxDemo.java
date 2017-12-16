package generics;

public class BoxDemo {
    public static <U> void addBox(U u, java.util.List<BoxWithGenerics<U>> boxes) {
        BoxWithGenerics<U> box = new BoxWithGenerics<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(java.util.List<BoxWithGenerics<U>> boxes) {
        int counter = 0;
        for (BoxWithGenerics<U> box :boxes) {
            U boxContents=box.get();
            System.out.println("Box #"+counter+" contains ["+boxContents.toString()+"]");
            counter++;
        }
    }
}
