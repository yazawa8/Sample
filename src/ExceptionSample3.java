public class ExceptionSample3 {

    public static void main(String[] args) {
        try {
            int x = divide(3, 0);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("ゼロで除算しました。");
        } catch (Exception e) {
            System.err.println("例外が発生しました。");
            throw e;
        } finally {
            System.out.println("処理を終了します。");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int ret = a / b;
        return ret;
    }
}