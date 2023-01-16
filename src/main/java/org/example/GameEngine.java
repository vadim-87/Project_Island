package org.example;

public class GameEngine {
    private static final int delay = 2000;




   public void start(Game islandGame){
            while (true){
                islandGame.nextDay();
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
