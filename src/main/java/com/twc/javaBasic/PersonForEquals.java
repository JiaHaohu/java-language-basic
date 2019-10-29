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
        //  Please implement equals.
        //
        // Hint:
        //  The equals method should has the following properties:
        //  (1) It is reflexive: For any non-null reference x, x.equals(x) should return true.
        //  (2) It is symmetric: For any references x and y, x.equals(y) should return true if and
        //      only if y.equals(x) returns true.
        //  (3) It is transitive: For any references x, y, and z, if x.equals(y) returns true and
        //      y.equals(z) returns true, then x.equals(z) should return true.
        //  (4) It is consistent: If the objects to which x and y refer haven’t changed, then
        //      repeated calls to x.equals(y) return the same value.
        //  (5) For any non-null reference x, x.equals(null) should return false.
        //
        //  You can refer to page 229 of "Core Java Vol 1", section 5.2.1 and 5.2.2
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }

    @Override
    public int hashCode() {
        // TODO:
        //  please implement hashCode.
        //
        // Hint:
        //  If you redefine the equals method, you will also need to redefine the hashCode method
        //  for objects that users might insert into a hash table.
        //
        //  Your definitions of equals and hashCode must be compatible: If x.equals(y) is true,
        //  then x.hashCode() must return the same value as y.hashCode()
        //
        //  You can refer to page 235 of "Core Java Vol 1", section 5.2.3.
        // <--start
        throw new RuntimeException("Not implemented");
        // --end-->
    }
}
