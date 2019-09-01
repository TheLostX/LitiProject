import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;

public class MainClass {

    public static void main(String[] args) {

        Game.info().setName("GURK NUKEM");
        Game.info().setSubTitle("");
        Game.info().setVersion("v0.0.1");
        Game.info().setWebsite("here/goes/the/web");
        Game.info().setDescription("An example 2D platformer with shooter " +
                "elements made in the LITIengine");

        Game.init(args);

        GurkNukemLogic.init();

        Game.window().setIconImage(Resources.images().get("icon.png"));
        Game.graphics().setBaseRenderScale(4.001f);


        Resources.load("game.litidata");

        Game.world().loadEnvironment("level1");

        Game.screens().add(new IngameScreen());



        Game.start();
    }
}
