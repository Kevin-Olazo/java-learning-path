package com.ciberedu.Week07_CollectionsMapsSets.Day05_Practice;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("Kevin");
        User u2 = new User("Daniel");
        User u3 = new User("Jose");
        User u4 = new User("Andres");
        User u5 = new User("Maria");
        User u6 = new User("Nicole");

        UserRoleManager urm = new UserRoleManager();

        urm.addUser(u1);
        urm.addUser(u2);
        urm.addUser(u3);
        urm.addUser(u4);
        urm.addUser(u5);
        urm.addUser(u6);

        urm.assignRole("Kevin", Role.ADMIN);
        urm.assignRole("Kevin", Role.MODERATOR);
        urm.assignRole("Kevin", Role.USER);

        urm.assignRole("Daniel", Role.MODERATOR);
        urm.assignRole("Daniel", Role.USER);

        urm.assignRole("Jose", Role.MODERATOR);
        urm.assignRole("Andres", Role.MODERATOR);
        urm.assignRole("Maria", Role.USER);
        urm.assignRole("Nicole", Role.USER);


        System.out.println("USER ROLE");
        for(User u : urm.getUsersByRole(Role.USER)){
            System.out.println(u.getUsername());
        }

        System.out.println("MODERATOR AND USER");
        for (User u : urm.getUserWithBothRoles(Role.MODERATOR, Role.USER)){
            System.out.println(u.getUsername());
        }

        System.out.println(urm.userHasRole("Nicole", Role.ADMIN));

    }

    public void buscarJoker(Map<String, User> mapa) {
        User joker = mapa.get("Joker");

        if (joker != null){
            System.out.println("Encontre a: " + joker.getUsername());
        } else {
            System.out.println("El usuario no existe.");
        }
    }
}
