import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
     
        ClothesFactory factory = new AdidasFactory();

        Clothes jeans = factory.createJeans();
        Clothes tShirt = factory.createTShirt();
        Clothes hat = factory.createHat();
        Clothes shoes = factory.createShoes();

        System.out.println("Jesper is wearing: " + jeans + ", " + tShirt + ", " + hat + ", " + shoes);

        factory = new BossFactory();

        jeans = factory.createJeans();
        tShirt = factory.createTShirt();
        hat = factory.createHat();
        shoes = factory.createShoes();

        System.out.println("Jesper after graduating, is wearing: " + jeans + ", " + tShirt + ", " + hat + ", " + shoes);


        //Bonus:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the factory (You got 2 options (BossFactory) or (AdidasFactory)");
        String factoryName = sc.nextLine();

        ClothesFactory factory2 =  FactoryProducer.setFactory(factoryName);
        
        if (factoryName == null ) {
            System.out.println("Invalid factory name");
            sc.close();
            return;
           
        }
        jeans = factory2.createJeans();
        tShirt = factory2.createTShirt();
        hat = factory2.createHat();
        shoes = factory2.createShoes();
        sc.close();
 
        
        System.out.println("3. Jesper is wearing: " + jeans + ", " + tShirt + ", " + hat + ", " + shoes);

    }
}
