package HumanClothes;

public class Human {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IBoots boots;

    public Human(String name, IJacket jacket, ITrousers trousers, IBoots boots) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.boots = boots;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public IBoots getBoots() {
        return boots;
    }

    public void setBoots(IBoots boots) {
        this.boots = boots;
    }


    public void toPutOn() {
        jacket.toDress();
        trousers.toDress();
        boots.toDress();
    }

    public void toUnPutOn() {
        jacket.toUnDress();
        trousers.toUnDress();
        boots.toUnDress();
    }
}
