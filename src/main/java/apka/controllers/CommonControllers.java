package apka.controllers;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Iterator;


@Controller
public class CommonControllers {

    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public String main(){
        return "log";
    }


    @RequestMapping(value = "/zaloguj", method = RequestMethod.GET)
    public String nazwa(Model model){
        model.addAttribute("User", new User() {
            @Override
            public boolean equals(Object another) {
                return false;
            }

            @Override
            public String toString() {
                return null;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getFullName() {
                return null;
            }

            @Override
            public void setFullName(String fullName) {

            }

            @Override
            public Iterator<Group> getGroups() {
                return null;
            }

            @Override
            public String getPassword() {
                return null;
            }

            @Override
            public void setPassword(String password) {

            }

            @Override
            public Iterator<Role> getRoles() {
                return null;
            }

            @Override
            public UserDatabase getUserDatabase() {
                return null;
            }

            @Override
            public String getUsername() {
                return null;
            }

            @Override
            public void setUsername(String username) {

            }

            @Override
            public void addGroup(Group group) {

            }

            @Override
            public void addRole(Role role) {

            }

            @Override
            public boolean isInGroup(Group group) {
                return false;
            }

            @Override
            public boolean isInRole(Role role) {
                return false;
            }

            @Override
            public void removeGroup(Group group) {

            }

            @Override
            public void removeGroups() {

            }

            @Override
            public void removeRole(Role role) {

            }

            @Override
            public void removeRoles() {

            }
        });
        return "main";
    }

    @RequestMapping(value = "/zaloguj", method = RequestMethod.POST)
    public String nazwagracza(@RequestParam String Nazwagracza){
        return "main";
    }

    @RequestMapping(value ="/register", method = RequestMethod.GET)
    public  String register(){
        return "register";
    }

    @RequestMapping(value = "/rejestracja", method = RequestMethod.POST)
    public String rejestrgracza(){
        return "log";
    }



//    @RequestMapping(value = "/rejes", method = RequestMethod.GET)
//    public String regis(){
//        return "/register";
//    }




}
