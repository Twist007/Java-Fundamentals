package states;

import game.enities.Player;
import gfx.Assets;

import java.awt.*;


public class GameState extends State {

    private static final int Gravity=2;
    private Player player;

    public GameState() {
        player=new Player("pesho",512,255);
    }

    private void init(){
        Assets.init();

    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics graphics) {

    }
}
