import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    public Box() {
    }

    public float getWeightBox(){
        float mass = 0.0f;

        for(T fruit : box){
            mass += fruit.getWeightFruit();
        }
        return mass;
    }

    public boolean compare(Box anotherBox) {
        if(this.getWeightBox() == anotherBox.getWeightBox()) return true;
        return false;
    }

    public void fillBoxToBox(Box <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int amount){
        while (amount > 0){
            box.add(fruit);
            amount--;
        }
    }
}

