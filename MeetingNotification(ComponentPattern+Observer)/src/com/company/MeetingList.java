package com.company;

import java.util.ArrayList;
import java.util.List;

public class MeetingList {
    private List<User> userList = new ArrayList<User>();

    public void attach(User u) {
        this.userList.add(u);
    }

    public void detach(User u) {
        this.userList.remove(u);
    }

    public void notifyUsers() {
        for(User u : userList) {
            u.operation();
        }
    }
}
