package HumanClothes;

public class Jacket implements IJacket {
    @Override
    public void toDress() {
        System.out.println("Я надел куртку");
    }

    @Override
    public void toUnDress() {
        System.out.println("Я снял куртку");
    }
}
