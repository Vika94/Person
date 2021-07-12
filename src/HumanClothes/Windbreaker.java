package HumanClothes;

public class Windbreaker implements IJacket {
    @Override
    public void toDress() {
        System.out.println("Я надел ветровку");
    }

    @Override
    public void toUnDress() {
        System.out.println("Я снял ветровку");
    }
}
