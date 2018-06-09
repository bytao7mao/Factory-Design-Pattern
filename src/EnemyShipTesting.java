import java.util.Scanner;

/**
 * Created by taoLen on 6/9/2018.
 */
public class EnemyShipTesting {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
//        EnemyShip theEnemy = null;
//        String option = "";
//        System.out.println("What type of ship? (UFO/ROCKET)");
//        if (sc.hasNextLine()){
//            option=sc.nextLine();
//        }
//        if (option.equalsIgnoreCase("u")){
//            theEnemy = new UFOEnemyShip();
//        } else if (option.equalsIgnoreCase("r")){
//            theEnemy = new RocketEnemyShip();
//        }

        Factory factory = new Factory();
        EnemyShip typeOfenemyShip = null;
        runningTheCode(factory,typeOfenemyShip);

    }

    public static void doStuffEnemy(EnemyShip ufoShip) {
        ufoShip.displayEnemyShip();
        ufoShip.followHeroShip();
        ufoShip.enemyShipShoots();
    }
    public static void runningTheCode(Factory factory, EnemyShip typeOfenemyShip){
        System.out.println("What type of ship? (UFO/ROCKET)");
        if (sc.hasNextLine()){
            String typeOfShip = sc.nextLine();
            typeOfenemyShip = factory.makeShip(typeOfShip);
        }
        if (typeOfenemyShip!=null){
            doStuffEnemy(typeOfenemyShip);
        }else{
            System.out.println("Enter a U, R, or B next");
            runningTheCode(factory, typeOfenemyShip);
        }
    }
}
