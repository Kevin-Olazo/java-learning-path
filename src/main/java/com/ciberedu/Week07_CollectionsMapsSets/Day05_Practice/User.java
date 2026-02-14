package com.ciberedu.Week07_CollectionsMapsSets.Day05_Practice;

import java.util.HashSet;
import java.util.Set;

public class User {

    private String username;

    private Set<Role> roles;

    public User() {
    }

    public User(String username) {
        this.username = username;
        this.roles = new HashSet<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean addRole(Role role){
        return this.roles.add(role);
    }

    public boolean removeRole(Role role){
        return this.roles.remove(role);
    }
}
