package group1.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.depth * mybox.height;

        System.out.println("volume = " + vol);
    }
}
