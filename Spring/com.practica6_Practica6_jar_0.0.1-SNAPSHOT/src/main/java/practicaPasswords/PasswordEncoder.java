
package practicaPasswords;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class PasswordEncoder {
    public static void main (String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        for(int i = 0; i < 3; i++){
            System.out.println(encoder.encode("Valladolid"));
        }
    }
}
