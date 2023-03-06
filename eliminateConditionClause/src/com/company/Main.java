package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        validateRequest();
    }

    public static void validateRequest() {
        List<Valid> validOptions = new ArrayList<>();
        validOptions.add(new ValidDate());
        validOptions.add(new ValidString());

        for(Valid v : validOptions) {
            System.out.println(v.validate("String to be test"));
        }
    }
}
