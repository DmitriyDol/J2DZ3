public class Box {private String type;
    private ArrayList<T> fruit = new ArrayList<>();
    float sum;

    public Box(String type, ArrayList<T> fruit) {
        this.type = type;
        this.fruit = fruit;
        sum = 0;
    }

    public float getWeight(){
        for(int i = 0; i < fruit.size(); i++){
            sum += fruit.get(i).getWeight(); // Вот тут появляется ошибка. Т. к. java не может найти метод getWeight();
        }
        return sum;
    }
}
