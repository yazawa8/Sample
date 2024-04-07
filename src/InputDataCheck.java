import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputDataCheck {

    // パスワード書式のチェック
    // 8文字以上で1文字以上の数字、小文字英字、大文字英字がそれぞれ含まれていること
    public boolean passwordCheck(String password) {
        // パスワードの書式を設定
        String regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}";
        Pattern pattern = Pattern.compile(regex);

        // 引数で渡された文字列をチェック
        Matcher matcher = pattern.matcher(password);

        // チェックした結果を返す
        return matcher.matches();
    }

    public static void main(String[] args) {
        String password1 = "password";
        String password2 = "Pass";
        String password3 = "Passw0rd";

        InputDataCheck pfc = new InputDataCheck();

        System.out.print("passwordは、");
        if (pfc.passwordCheck(password1)) {
            System.out.println("合致しています。");
        } else {
            System.out.println("合致していません。");
        }

        System.out.print("Passは、");
        if (pfc.passwordCheck(password2)) {
            System.out.println("合致しています。");
        } else {
            System.out.println("合致していません。");
        }

        System.out.print("Passw0rdは、");
        if (pfc.passwordCheck(password3)) {
            System.out.println("合致しています。");
        } else {
            System.out.println("合致していません。");
        }

    }

    //  ・・・省略
}