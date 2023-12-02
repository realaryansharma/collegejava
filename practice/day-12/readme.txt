Static Keyword

    1. Mainly used for memory management.
    2. Can apply static keyword with variables, methods, blocks and nested classes.
    3. static keyword belongs to class than an instance of the class.
    3. static values can be change with only static methods.

Restrictions for static method

    1. The static method can not use non static data member or call non-static method directly.
    2. this and super cannot be used in stati context.

Why java main func is static.

    So that compiler can call it without the creation of an object or before the creation of object.

Java Static block that it will be executed at the time of class loading before the main function

static {
    sout("check");
}

Garbage Collection

    gc method is used to perfrom garbase Collection
    System.gc();

Aggregation ***

    1. If a class have an entitiy ref...such as address (has more than one feild).

Static method can not be overriden

