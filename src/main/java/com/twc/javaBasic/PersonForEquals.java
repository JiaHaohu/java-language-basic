package com.twc.javaBasic;

import java.util.Objects;

@SuppressWarnings("unused")
public class PersonForEquals {
    private final String name;
    private final short yearOfBirth;

    public PersonForEquals(String name, short yearOfBirth) {
        if (name == null) {
            throw new IllegalArgumentException("name is mandatory.");
        }

        if (yearOfBirth <= 1900 || yearOfBirth >= 2019) {
            throw new IllegalArgumentException("year of birth is out of range.");
        }

        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO:
        //  please implement equals. You can refer to page 229 of "Core Java Vol 1",
        //  section 5.2.1.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    @Override
    public int hashCode() {
        // TODO:
        //  please implement hashCode. You can refer to page 235 of "Core Java Vol 1",
        //  section 5.2.3.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }
}
