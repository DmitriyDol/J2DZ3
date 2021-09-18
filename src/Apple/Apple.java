class Apple implements Fruit{
    public float weight = 175;

    public Apple() {
        this.weight = 175f;
    }

    @Override
    public float getWeight() {
        return weight;
    }
}