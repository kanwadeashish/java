package com.xworkz.exception.internal;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import javax.management.JMRuntimeException;
import javax.print.attribute.UnmodifiableSetException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.NoSuchMechanismException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.io.UncheckedIOException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.security.ProviderException;
import java.time.DateTimeException;
import java.util.*;
import java.util.concurrent.RejectedExecutionException;

public class RunTimeExceptionsExample {

    public void annotationTypeMismatchException(){
        System.out.println("AnnotationTypeMismatchException");
        throw new AnnotationTypeMismatchException(null,null);
    }
    public void arithmeticException(){
        System.out.println("ArithmeticException");
        throw new ArithmeticException();
    }
    public void arrayStoreException(){
        System.out.println("ArrayStoreException");
        throw new ArrayStoreException();
    }
    public void bufferOverflowException(){
        System.out.println("BufferOverflowException");
        throw new BufferOverflowException();
    }
    public void bufferUnderflowException(){
        System.out.println("BufferUnderflowException");
        throw new BufferUnderflowException();
    }
    public void cannotRedoException(){
        System.out.println("CannotRedoException");
        throw new CannotRedoException();
    }
    public void cannotUndoException(){
        System.out.println("CannotUndoException");
        throw new CannotUndoException();
    }
    public void classCastException(){
        System.out.println("ClassCastException");
        throw new ClassCastException();
    }
    public void CMMException(){
        System.out.println("CMMException");
        throw new CMMException("");
    }
    public void concurrentModificationException(){
        System.out.println("ConcurrentModificationException");
        throw new ConcurrentModificationException();
    }
    public void dateTimeException(){
        System.out.println("DateTimeException");
        throw new DateTimeException("");
    }
    public void DOMException(){
        System.out.println("DOMException");
        throw new DOMException((short) 0,null);
    }
    public void emptyStackException(){
        System.out.println("EmptyStackException");
        throw new EmptyStackException();
    }
    public void enumConstantNotPresentException(){
        System.out.println("EnumConstantNotPresentException");
        throw new EnumConstantNotPresentException(null,null);
    }
    public void eventException(){
        System.out.println("EventException");
        throw new EventException((short) 0,null);
    }
    public void fileSystemAlreadyExistsException(){
        System.out.println("FileSystemAlreadyExistsException");
        throw new FileSystemAlreadyExistsException();
    }
    public void fileSystemNotFoundException(){
        System.out.println("FileSystemNotFoundException");
        throw new FileSystemNotFoundException();
    }
    public void illegalArgumentException(){
        System.out.println("IllegalArgumentException");
        throw new IllegalArgumentException();
    }
    public void illegalMonitorStateException(){
        System.out.println("IllegalMonitorStateException");
        throw new IllegalMonitorStateException();
    }
    public void illegalPathStateException(){
        System.out.println("IllegalPathStateException");
        throw new IllegalPathStateException();
    }
    public void illegalStateException(){
        System.out.println("IllegalStateException");
        throw new IllegalStateException();
    }
    public void illformedLocaleException(){
        System.out.println("IllformedLocaleException");
        throw new IllformedLocaleException();
    }
    public void imagingOpException(){
        System.out.println("ImagingOpException");
        throw new ImagingOpException("");
    }
    public void incompleteAnnotationException(){
        System.out.println("IncompleteAnnotationException");
        throw new IncompleteAnnotationException(null,null);
    }
    public void indexOutOfBoundsException(){
        System.out.println("IndexOutOfBoundsException");
        throw new IndexOutOfBoundsException();
    }
    public void JMRuntimeException(){
        System.out.println("JMRuntimeException");
        throw new JMRuntimeException();
    }
    public void LSException(){
        System.out.println("LSException");
        throw new LSException((short) 0,"");
    }
    public void malformedParameterizedTypeException(){
        System.out.println("MalformedParameterizedTypeException");
        throw new MalformedParameterizedTypeException();
    }
    public void malformedParametersException(){
        System.out.println("MalformedParametersException");
        throw new MalformedParametersException();
    }
    public void missingResourceException(){
        System.out.println("MissingResourceException");
        throw new MissingResourceException("","","");
    }
    public void negativeArraySizeException(){
        System.out.println("NegativeArraySizeException");
        throw new NegativeArraySizeException();
    }
    public void noSuchElementException(){
        System.out.println("noSuchElementException");
        throw new NoSuchElementException();
    }
    public void noSuchMechanismException(){
        System.out.println("NoSuchMechanismException");
        throw new NoSuchMechanismException();
    }
    public void nullPointerException(){
        System.out.println("NullPointerException");
        throw new NullPointerException();
    }
    public void profileDataException(){
        System.out.println("ProfileDataException");
        throw new ProfileDataException("");
    }
    public void providerException(){
        System.out.println("ProviderException");
        throw new ProviderException();
    }
    public void providerNotFoundException(){
        System.out.println("ProviderNotFoundException");
        throw new ProviderNotFoundException();
    }
    public void rasterFormatException(){
        System.out.println("RasterFormatException");
        throw new RasterFormatException("");
    }
    public void rejectedExecutionException(){
        System.out.println("RejectedExecutionException");
        throw new RejectedExecutionException();
    }
    public void securityException(){
        System.out.println("SecurityException");
        throw new SecurityException();
    }
    public void typeNotPresentException(){
        System.out.println("TypeNotPresentException");
        throw new TypeNotPresentException("",null);
    }
    public void uncheckedIOException(){
        System.out.println("UncheckedIOException");
        throw new UncheckedIOException(null);
    }
    public void undeclaredThrowableException(){
        System.out.println("UndeclaredThrowableException");
        throw new UndeclaredThrowableException(null);
    }
    public void unmodifiableSetException(){
        System.out.println("UnmodifiableSetException");
        throw new UnmodifiableSetException();
    }
    public void unsupportedOperationException(){
        System.out.println("UnsupportedOperationException");
        throw new UnsupportedOperationException();
    }
    public void wrongMethodTypeException(){
        System.out.println("WrongMethodTypeException");
        throw new WrongMethodTypeException();
    }

}
