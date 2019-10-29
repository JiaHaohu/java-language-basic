package com.twc.javaBasic;

import com.twc.javaBasic.util.Employee;
import com.twc.javaBasic.util.MethodWithAnnotation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        //
        // Hint:
        //   If you find it difficult. Please check "Core Java Vol 1", section 5.7.1 on page 262.
        // <--start
        final Class<? extends Employee> expected = null;
        // --end-->

        assertSame(expected, employeeClass);
    }

    @Test
    void should_be_able_to_get_full_qualified_name() {
        Employee employee = new Employee();
        Class<? extends Employee> employeeClass = employee.getClass();

        // TODO: please modify the following code to pass the test
        // <--start
        final String expected = null;
        // --end-->

        assertEquals(expected, employeeClass.getName());
    }

    @Test
    void should_be_able_to_get_strange_name_for_array() {
        final Class<Double[]> clazz = Double[].class;

        // Context:
        //  For historical reasons, the getName method returns somewhat strange names for array types.
        //
        // TODO: please modify the following code to pass the test
        //
        // Hint
        //  If you find it difficult. Please check "Core Java Vol 1", section 5.7.1 on page 262.
        // <--start
        final String expected = null;
        // --end-->

        assertEquals(expected, clazz.getName());
    }

    @SuppressWarnings({"ConstantConditions", "unused"})
    @Test
    void should_be_able_to_instantiate_types_at_runtime() throws Exception {
        Class<?> theClass = Class.forName("com.cultivation.javaBasic.util.Employee");

        // Context:
        //  You can obtain a Class object corresponding to a class name by using the static forName
        //  method.
        //
        //  Another example of a useful method is one that lets you create an instance of a class on
        //  the fly. This method is called, naturally enough, newInstance()
        //
        // TODO: please created an instance described by `theClass`
        //
        // Hint
        //  If you find it difficult. Please check "Core Java Vol 1", section 5.7.1 on page 263.
        // <--start
        Employee instance = null;
        // --end-->

        assertEquals("Employee", instance.getTitle());
    }

    @SuppressWarnings({"ConstantConditions", "unused"})
    @Test
    void should_be_able_to_print_all_static_methods_of_double() {
        Class<Double> doubleClass = Double.class;

        // Context
        //  The getFields, getMethods, and getConstructors methods of the Class class return arrays
        //  of the public fields, methods, and constructors that the class supports. This includes
        //  public members of superclasses. The getDeclaredFields, getDeclaredMethods, and
        //  getDeclaredConstructors methods of the Class class return arrays consisting of all fields,
        //  methods, and constructors that are declared in the class. This includes private, package,
        //  and protected members, but not members of superclasses.
        //
        // TODO:
        //  please get all public static declared methods of Double. Sorted in an ascending order
        //
        // Hint
        //  If you find it difficult. Please check "Core Java Vol 1", section 5.7.3 on page 266-267.
        // <--start
        String[] publicStaticMethods = null;
        // --end-->

        final String[] expected = {
            "compare", "doubleToLongBits", "doubleToRawLongBits", "hashCode",
            "isFinite", "isInfinite", "isNaN", "longBitsToDouble", "max",
            "min", "parseDouble", "sum", "toHexString", "toString", "valueOf",
            "valueOf"
        };

        assertArrayEquals(expected, publicStaticMethods);
    }

    @SuppressWarnings({"unused", "ConstantConditions", "RedundantThrows"})
    @Test
    void should_be_able_to_evaluate_object_field_values_at_runtime() throws Exception {
        Object employee = new Employee();

        // TODO:
        //  please get the value of `getTitle` method using reflection. No casting to Employee is allowed.
        //
        // Hint
        //  If you find it difficult. Please check "Core Java Vol 1", section 5.7.4 on page 271.
        // <--start
        Object result = null;
        // --end-->

        assertEquals("Employee", result);
    }

    @SuppressWarnings({"unused", "ConstantConditions"})
    @Test
    void should_be_able_to_get_the_item_class_of_the_array() {
        Object employees = new Employee[0];

        // Context
        //  Use the getComponentType method of the Class class (which is defined only for class objects
        //  that represent arrays) to find the right type for the array
        //
        // TODO: please get the class of array item `employees`
        //
        // Hint
        //  If you find it difficult. Please check "Core Java Vol 1", section 5.7.5 on page 277.
        // <--start
        Class<?> itemClass = null;
        // --end-->

        assertEquals(Employee.class, itemClass);
    }

    @SuppressWarnings({"ConstantConditions", "unused"})
    @Test
    void should_be_able_to_get_the_methods_who_contains_MyAnnotation_annotation() {
        Class<MethodWithAnnotation> theClass = MethodWithAnnotation.class;

        // Context:
        //  There is a `getAnnotation` method defined in the AnnotatedElement interface. The
        //  classes Method, Constructor, Field, Class, and Package implement this interface.
        //
        // TODO: please get the methods who contains @MyAnnotation annotation.
        //
        // Hint
        //  If you find it difficult. Please check "Core Java Vol 2", section 8.3.2 on page 457.
        // <--start
        String[] methodsContainsAnnotations = null;
        // --end-->

        assertArrayEquals(new String[] {"theMethod"}, methodsContainsAnnotations);
    }
}
