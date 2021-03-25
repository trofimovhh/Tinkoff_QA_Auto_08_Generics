public class Main {

    public static void main(final String[] args) {

        // Check copyFromBoxToBox()
        Apple apple1 = new Apple();
        Box<Apple> appleBox1 = new Box<>();
        Box<Fruit> fruitBox1 = new Box<>();
        appleBox1.put(apple1);
        BoxUtil.copyFromBoxToBox(appleBox1, fruitBox1);
        System.out.println(fruitBox1.get());

        // Check copyFreshFruitFromBoxToBox()
        Fruit orange = new Fruit();
//        orange.setFresh(false);
        Box<Fruit> ob1 = new Box<>();
        Box<Fruit> ob2 = new Box<>();
        ob1.put(orange);
        BoxUtil.copyFreshFruitFromBoxToBox(ob1, ob2);
        System.out.println(ob2.get());

        // Check printElementFromBoxes() and printElementFromTwoBoxes()
        Box aBox = new Box();
        Box bBox = new Box();
        Box cBox = new Box();
        Box dBox = new Box();
        Fruit hiddenApple = new Fruit();
        dBox.put(hiddenApple);
        cBox.put(dBox);
        bBox.put(cBox);
        aBox.put(bBox);
        BoxUtil.printElementFromTwoBoxes(cBox);
        BoxUtil.printElementFromBoxes(dBox);
        BoxUtil.printElementFromBoxes(aBox);
    }
}
