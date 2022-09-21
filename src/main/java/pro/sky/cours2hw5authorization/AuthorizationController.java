package pro.sky.cours2hw5authorization;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authorization")
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;}


    @GetMapping
    public String verification(@RequestParam("login") String login, @RequestParam("password") String password, @RequestParam("confirmPassword") String confirmPassword ) {

        return authorizationService.verification(login, password, confirmPassword);

    }

}




//@RestController
//public class AuthorizationController {
//    String login = "java_skyprogo";
//    String password = "D_1hWiKjjP_9";
//    String confirmPassword = "D_1hWiKjjP_9";
//        System.out.println(authorization());

