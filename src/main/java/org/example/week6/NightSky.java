package src.main.java.org.example.week6;

import java.util.Random;

public class NightSky {
        private double density;
        private int width;
        private int height;

        public NightSky(double density, int width, int height) {
            this.density = density;
            this.width = width;
            this.height = height;
        }

        public NightSky(int width, int height) {
            this.density = 0.1;
            this.width = width;
            this.height = height;
        }

        public NightSky(double density) {
            this.density = density;
            this.width = 20;
            this.height = 10;
        }

        private int numberOfStars=0;
        public int setNumberOfStars(int numberOfStars) {
            this.numberOfStars = numberOfStars;
            return numberOfStars;
        }

        public void printLine(){
            for(int i = 0; i<this.width; i++){
                long result = Math.round(Math.random());
                if(result == 1){
                    System.out.print("*");
                    setNumberOfStars(numberOfStars=numberOfStars+1);
                }else{
                    System.out.print(" ");
                }
            }
        }

    public void printLineIncludeDensity() {
        int starsInLine = (int) Math.round(density * this.width);
        Random rand = new Random();

        for (int i = 0; i < this.width; i++) {
            if (starsInLine > 0 && rand.nextDouble() <= (double) starsInLine / (this.width - i)) {
                System.out.print("*");
                starsInLine--;
                setNumberOfStars(numberOfStars + 1);
            } else {
                System.out.print(" ");
            }
        }
    }


    public void print(){
            for (int i = 0; i < height; i++) {
                //printLine();
                printLineIncludeDensity();
                System.out.println();
            }
        }

        public int starsInLastPrint(){
            return numberOfStars;
        }
}

