import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;

public class GurkNukemLogic {

    private GurkNukemLogic(){

    }

    public static void init(){

        Camera camera = new PositionLockCamera(Player.instance());
        camera.setClampToMap(true);
        Game.world().setCamera(camera);

        Game.world().setGravity(120);

        Game.world().addLoadedListener( e -> {

            Spawnpoint enter = e.getSpawnpoint("enter");
            if (enter != null){
                enter.spawn(Player.instance());
            }

        }

        );
    }
}
