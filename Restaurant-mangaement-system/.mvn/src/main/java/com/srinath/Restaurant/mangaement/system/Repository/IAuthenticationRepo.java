package com.srinath.Restaurant.mangaement.system.Repository;

import com.srinath.Restaurant.mangaement.system.Model.Admin;
import com.srinath.Restaurant.mangaement.system.Model.AuthenticationToken;
import com.srinath.Restaurant.mangaement.system.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

    AuthenticationToken findFirstByAdmin(Admin admin);
}