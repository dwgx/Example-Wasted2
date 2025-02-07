public class LoopTest {
    static int idk = 10;
    static int next = 0;

    public static void loop() {
        if (next < idk) {
            next++;
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        while (next < idk) {
            loop();
        }
    }
}
