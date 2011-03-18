package com.thoughtworks.university;


public interface GameListener {

    GameListener NULL = new GameListener() { public void cellsChanged(GameOfLife cells) {} };

    void cellsChanged(GameOfLife cells);

}