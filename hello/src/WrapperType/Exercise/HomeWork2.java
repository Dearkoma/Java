package WrapperType.Exercise;

public class HomeWork2 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "2981085607@qq.com";
        try {
            userRegistration(name, pwd, email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

    protected static void userRegistration(String name, String pwd, String email) {
        int len = name.hashCode();
        if (!(name != null && pwd != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }
        if (!(len >= 2 || len <= 3)) {
            throw new RuntimeException("名字长度错误");
        }
        if (!(pwd.length() == 6 && isdigital(pwd))) {
            throw new RuntimeException("密码长度为6,且全为数字");
        }
        int in = email.indexOf('@');
        int in2 = email.indexOf('.');
        if (!(in > 0 && in2 > in)) {
            throw new RuntimeException("邮箱有问题");
        }
    }

    protected static boolean isdigital(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] >= '0' && arr[i] <= '9')) {
                return false;
            }
        }
        return true;
    }
} 