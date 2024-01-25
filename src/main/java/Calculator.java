public class Calculator {
    public int sum(int a, int b) {
        // 요구사항 : 음수를 받지 않겠다
        if (a< 0 || b < 0) {
            throw new RuntimeException();
        }
        return a + b;
    }
}
