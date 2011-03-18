package com.thoughtworks.university;

public interface GameOfLife {

	GameOfLife NULL = new GameOfLife() {
        public boolean hasLife(int column, int row) { return false; }
        public int numberOfGenerations(int column, int row) { return 0; };
        public void setListener(GameListener listener) { }
		public void toggleCellAt(int column, int row) { }
		public void nextGeneration() { }
		public int getHeight() { return 0; }
		public int getWidth() { return 0; }
    };

	void toggleCellAt(int column, int row);
	boolean hasLife(int column, int row);
	void nextGeneration();
	int numberOfGenerations(int column, int row);

	void setListener(GameListener listener);
	int getHeight();
	int getWidth();
}
