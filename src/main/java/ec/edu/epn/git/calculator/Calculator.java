package ec.edu.epn.git.calculator;

public class Calculator {
    private int ans;

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int sub(int a, int b) {
        return a-b;
    }

    public int div(int a, int b) {
        return a/b;
    }

    public int mul(int a, int b) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a*b;
    }
}
