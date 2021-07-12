package HumanClothes;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Vasia", new Jacket(), new Trousers(), new Boots());
        human1.toPutOn();
        human1.toUnPutOn();
        human1.setJacket(new Windbreaker());
        human1.toPutOn();
        human1.toUnPutOn();

    }
}
