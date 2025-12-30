package com.xworkz.excep.external;

import com.xworkz.excep.internal.InbuiltExceptions;

public class InbuiltExceptionsRunner {

    public static void main(String[] args) {

        InbuiltExceptions exceptions = new InbuiltExceptions();

        exceptions.arithmeticException();
        exceptions.arrayIndex();
        exceptions.nullPointer();
        exceptions.numberFormat();
        exceptions.stringIndex();
        exceptions.classCast();
        exceptions.negativeArraySize();
        exceptions.arrayStore();
        exceptions.illegalArgument();
        exceptions.unsupportedOperation();

    }

}
