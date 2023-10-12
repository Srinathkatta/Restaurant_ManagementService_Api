package com.srinath.Restaurant.mangaement.system.Controller;

import com.srinath.Restaurant.mangaement.system.Model.Dto.SignInInput;
import com.srinath.Restaurant.mangaement.system.Model.Dto.SignUpOutput;
import com.srinath.Restaurant.mangaement.system.Model.OrderEntity;
import com.srinath.Restaurant.mangaement.system.Model.User;
import com.srinath.Restaurant.mangaement.system.Service.AuthenticationService;
import com.srinath.Restaurant.mangaement.system.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("user/signup")
    public SignUpOutput signUpInstaUser(@RequestBody User user)
    {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInInstaUser(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String sigOutInstaUser(String email, String token) {
        if (authenticationService.authenticate(email, token)) {
            return userService.sigOutUser(email);
        } else {
            return "Sign out not allowed for non authenticated user.";
        }
    }

    @PostMapping("user/order")
    public String neworder(String email , OrderEntity orderEntity){
        return  userService.neworder(email,orderEntity);

    }
}
