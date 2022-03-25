package exercises.scopeChallenge;

public class X {

    private int x;

    public void X(int x) {
        this.x = x;
    }

    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(this.x + " x " + x + " = " + x * this.x);
        }
    }
}
