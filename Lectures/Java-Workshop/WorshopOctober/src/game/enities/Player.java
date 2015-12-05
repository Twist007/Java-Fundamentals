package game.enities;


import gfx.Assets;
import gfx.SpriteSheet;

import java.awt.*;

public class Player {
    private String name;
    private int width, height;
    private int x, y, velocityX, velocityY, helth;

    private SpriteSheet playerImage;
    private Rectangle boundingBox;

    public Player(String name, int width, int height, int x, int y) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.velocityX = this.velocityY = 2;
        this.height=Integer.MAX_VALUE;

        this.boundingBox = new Rectangle(x, y, width, height);
        this.playerImage=new SpriteSheet(Assets.player,width,height);
    }

    public void tick(){
this.boundingBox.setBounds(this.x,this.y,this.width,this.height);
    }

    public void render(Graphics graphics){
graphics.drawImage(this.playerImage.crop(0,0),this.x,this.y,null);
    }

    public  boolean intersects(Rectangle enemy){
        if (this.boundingBox.contains(enemy.x,enemy.y)||
                enemy.contains(this.boundingBox.x,this.boundingBox.y)){
            return true;
        }
        return false;
    }
}















