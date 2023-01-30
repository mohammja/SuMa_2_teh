public class AdidasFactory implements ClothesFactory{
    
    public Clothes createJeans(){
        return new AdidasJeans();
    }

    public Clothes createHat(){
        return new AdidasHat();
    }

    public Clothes createShoes(){
        return new AdidasShoes();
    }

    public Clothes createTShirt(){
        return new AdidasTShirt();
    }
}
