
public class BossFactory implements ClothesFactory {

    public Clothes createTShirt(){
        return new BossTShirt();
    }

    public Clothes createJeans(){
        return new BossJeans();
    }

    public Clothes createHat(){
        return new BossHat();
    }

    public Clothes createShoes(){
        return new BossShoes();
    }
    
}
