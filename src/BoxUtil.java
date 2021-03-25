public class BoxUtil {

    private static Box<? extends Box> myBox;

    // скопировать содержимое из одной коробки в другую
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T> void copyFromBoxToBox(final Box<? extends T> src, final Box<T> dest) {
        dest.put(src.get());
    }

    // скопировать содержимое из Box(src) которая может быть типизирована только классом Fruit и его наследниками,
    // при условии, что содержащийся фрукт свежий (fresh == true).
    //Box(dest) в которую будем копировать может быть типизирована любым родителем объекта содержащимся в Box(src)
    public static <T extends Fruit> void copyFreshFruitFromBoxToBox(final Box<T> src, final Box<? super Fruit> dest) {
        if (src.get().isFresh()) {
            dest.put(src.get());
        }
    }

    //вывести в консоль (toString()) объект второй коробки
    public static void printElementFromTwoBoxes(final Box<Box> box) {
        System.out.println(box.get().get());
    }

    /*
     *
     * вывести в консоль (toString()) объект последней коробки
     * box Box, которая содержит в себе любое кол-во вложенных Box, в последней из которых может быть любой объект.
     */

    public static void printElementFromBoxes(final Box<? extends Box> box) {
        myBox = box;
        while (myBox.get() instanceof Box) {
            myBox = myBox.get();
        }
        System.out.println(myBox.get());
    }

}

//... - необходимо заменить на корректный код или оставить пустым.
