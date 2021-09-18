import Apple.Fruit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple [] apple;
        apple = new Apple[10];
        for(int i = 0; i < apple.length; i++){
            apple[i] = new Apple();
        }

        ArrayList<Apple> arAppleList = new ArrayList<>();
        arAppleList.add(apple[0]);
        arAppleList.add(apple[1]);
        arAppleList.add(apple[2]);
        arAppleList.add(apple[3]);
        arAppleList.add(apple[4]);
        arAppleList.add(apple[5]);
        arAppleList.add(apple[6]);
        arAppleList.add(apple[7]);
        arAppleList.add(apple[8]);
        arAppleList.add(apple[9]);

        Box<Apple> box = new Box<>("Apple", arAppleList);
       System.out.println(box.getWeight());

    }
}
