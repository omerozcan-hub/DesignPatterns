public class Main {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.play();

        System.out.println();

        Game soccer = new Soccer();
        soccer.play();
    }
}