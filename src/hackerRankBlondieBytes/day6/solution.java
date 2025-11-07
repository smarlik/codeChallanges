package day6;

public class solution {
    static String x="#";
    int height;
    public static void staircase(int height) {
        for (int c = 0; c < height; c = c + 1) {
            System.out.println(x);
            x=x+"#";
        
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }

}
