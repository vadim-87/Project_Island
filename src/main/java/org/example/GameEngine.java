package org.example;

public class GameEngine {
    private static final int delay = 2000;

    void start(GameModel islandGame){
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
