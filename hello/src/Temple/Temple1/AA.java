package Temple.Temple1;

class A {
    
    public void job() {
        int n = 0;
        for (int i = 0; i < 99999999; i++) {
            n += i;
        }
    }

    public void job2() {
        int r = 0;
        for (int i = 0; i < 999999999; i++) {
            r *= i;
        }
    }
}