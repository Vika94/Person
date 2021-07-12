package HumanClothes;

public class Boots implements IBoots {
    @Override
    public void toDress() {
        System.out.println("Я надел обувь");
    }

    @Override
    public void toUnDress() {
        System.out.println("Я снял обувь");
    }
}
