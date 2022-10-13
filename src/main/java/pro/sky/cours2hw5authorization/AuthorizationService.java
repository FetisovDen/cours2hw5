package pro.sky.cours2hw5authorization;

import org.springframework.stereotype.Service;
import pro.sky.cours2hw5authorization.exception.WrongLoginException;
import pro.sky.cours2hw5authorization.exception.WrongPasswordException;

import java.lang.invoke.WrongMethodTypeException;


@Service
public class AuthorizationService {
    public String verification(String login, String password, String confirmPassword) {
        try {
            if (login == null) {
                return String.valueOf(false);
            } else if (login.length() >= 20) {
                throw new WrongLoginException();
            }
            for (int i = 0; i < login.length(); i++) {
                char c = login.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '1' && c <= '9') && !(c == '_')) {
                    return String.valueOf(false);
                }
            }
            if (password == null) {
                return String.valueOf(false);
            } else if (password.length() >= 20) {
                throw new WrongPasswordException();
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z') && !(c >= '1' && c <= '9') && !(c == '_')) {
                    return String.valueOf(false);
                }
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            return String.valueOf(false);
        }


        return String.valueOf(true);
    }
}
