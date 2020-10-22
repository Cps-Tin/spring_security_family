import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author: Cai Peishen
 * @Date: 2020/10/20 18:48
 * @Description:
 */
public class Test01 {

    @Test
    public void createPassword(){
        String password = new BCryptPasswordEncoder().encode("123");
        System.out.println(password);
    }

}
