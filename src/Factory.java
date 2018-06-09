/**
 * Created by taoLen on 6/9/2018.
 */
public class Factory {
    public EnemyShip makeShip(String newShip){
        EnemyShip ns = null;
        if (newShip.equalsIgnoreCase("u")){
            return new UFOEnemyShip();
        }else if (newShip.equalsIgnoreCase("r")){
            return new RocketEnemyShip();
        }else if (newShip.equalsIgnoreCase("b")){
            return new BiGUfoEnemy();
        }else return null;
    }
}
