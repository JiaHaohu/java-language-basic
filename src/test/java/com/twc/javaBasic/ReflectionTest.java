package com.twc.javaBasic;

import com.twc.javaBasic.util.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class ReflectionTest {
    @Test
    void should_be_able_to_get_class_object() {
        Employee employee = new Employee();
        Class<? extends Employee> employeeClass = employee.getClass();

        // Context:
        //   While your program is running, the Java runtime system always maintains what
        //   is called runtime type identification on all objects. This information keeps track of
        //   the class to which each object belongs.
        //
        //   You can also access this information by working with a special Java class. The class
        //   that holds this information is called `Class`. The getClass() method in the Object
        //   class returns an instance of `Class` type.
        //
        // TODO:
        //   please get class of `Employee`. While the employeeClass is obtained using getClass()
        //   method, I would like you to get the class object in another way.
        //   If you find it difficult. Please check "Core Java Vol 1", section 5.7.1 on page 262.
        // <--start
        final Class<? extends Employee> expected = null;
        // --end-->

        assertSame(expected, employeeClass);
    }
}
