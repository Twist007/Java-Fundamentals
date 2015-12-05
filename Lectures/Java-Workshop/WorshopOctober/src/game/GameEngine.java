package game;

import display.Display;
import gfx.Assets;
import gfx.ImageLoader;
import gfx.SpriteSheet;
import states.GameState;
import states.State;
import states.StateManager;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class GameEngine implements Runnable {
    private String title;

    private Display display;
    private BufferStrategy buffer;
    private Graphics graphics;

    private SpriteSheet sheet;

    private Thread thread;
    private boolean isRunning;

    private int width = 512;
    private int height = 255;
    private int temp = 0;
    private int secTemp = 0;

    public GameEngine(String name) {
        this.title = name;
    }

    private void init() {
        this.display = new Display(title);

        StateManager.setCurrentState(new GameState());

        this.sheet = new SpriteSheet(Assets.player, 512, 255);
        SpriteSheet background = new SpriteSheet(Assets.background, 800, 600);
    }

    private void tick() {
        temp++;
        if (temp >= 4) {
            temp = 0;
            if (secTemp == 1) {
                secTemp = 0;
            }
            secTemp = 1;

        }
    }

    private void render() {
        this.buffer = this.display.getCanvas().getBufferStrategy();

        if (this.buffer == null) {
            this.display.getCanvas().createBufferStrategy(2);   //3
            return;
        }

        this.graphics = this.buffer.getDrawGraphics();


        graphics.clearRect(0, 0, Display.WIDTH, Display.HEIGHT);

        //start drawing

        graphics.drawImage(this.sheet.crop(secTemp, temp), 0, 0, null);


        //end drawing


        // graphics.setColor(Color.blue);
        // graphics.fillRect(100, 200, 50, 50); // x, y , w, h

        this.graphics.dispose();
        this.buffer.show();

    }

    @Override
    public void run() {
        this.init();

        int fps = 10;
        double timePerTick = 1_000_000_000.0 / fps;
        double delta=0;

        long now;
        long lastTime=System.nanoTime();

        while (isRunning) {

            now=System.nanoTime();
            delta+=(now-lastTime)/timePerTick;
            lastTime=now;

            if (delta>=1){

                StateManager.getCurrentState().tick();
                StateManager.getCurrentState().render(graphics);
                delta--;
            }

        }

        this.stop();
    }

    public synchronized void start() {
        if  (!isRunning) {
            this.thread = new Thread(this);

            this.isRunning = true;
            this.thread.start();
        }
    }

    public synchronized void stop() {
        if (isRunning) {
            try {
                this.thread.join();
                this.isRunning = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}