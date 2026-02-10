package com.ciberedu.Week07_CollectionsMapsSets.Day05_Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserRoleManager {

    private Map<String, User> manager;

    public UserRoleManager() {
        manager = new HashMap<>();
    }

    public void addUser(User user) {
        manager.put(user.getUsername(), user);
    }

    public Set<User> getUsersByRole(Role role) {
        Set<User> busqueda = new HashSet<>();
        for (User u : manager.values()) {
            if (u.getRoles().contains(role)) {

                busqueda.add(u);
            }
        }
        return busqueda;
    }

    public boolean assignRole(String username, Role role) {
        // Tu lógica aquí
        User u = manager.get(username);

        if (u != null) {
            return u.addRole(role);
        }
        return false;
    }

    public boolean revokeRole(String username, Role role) {
        User u = manager.get(username);

        if (u != null && u.getRoles().contains(role)) {
            return u.removeRole(role);
        }

        return false;
    }


    public boolean userHasRole(String username, Role role) {
        User u = manager.get(username);

        if (u != null){
            return u.getRoles().contains(role);
        }
        // return u != null && u.getRoles().contains(role);
        return false;
    }

    public Set<User> getUserWithBothRoles(Role role1, Role role2){
        Set<User> result = new HashSet<>(getUsersByRole(role1));
        Set<User> secondSet = new HashSet<>(getUsersByRole(role2));

        result.retainAll(secondSet);

        return result;

    }


}
