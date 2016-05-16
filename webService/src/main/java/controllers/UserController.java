package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lisko on 13/05/16.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAllUsersPerAccount() {
        return "User 1";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String setAllUsersPerAccount() {
        return "User 1";
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public String delAllUsersPerAccount() {
        return "User 1";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getSpecificUserPerAccount(@PathVariable Long id) {
        return id.toString();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public String setSpecificUserPerAccount(@PathVariable Long id) {
        return id.toString();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteSpecificUserPerAccount(@PathVariable Long id) {
        return id.toString();
    }
}
