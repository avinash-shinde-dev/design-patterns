package structural.flyweight.solution;

import java.util.HashMap;

public class BulletTypeFactory {

    private static final HashMap<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String colour){
        if(!bulletTypes.containsKey(colour)){
            bulletTypes.put(colour, new BulletType(colour));
        }

        return bulletTypes.get(colour);
    }
}
