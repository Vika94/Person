package HumanClothes;

public class Trousers implements ITrousers {
    @Override
    public void toDress() {
        System.out.println("Я надел штаны");
    }

    @Override
    public void toUnDress() {
        System.out.println("Я снял штаны");
    }
}
