package com.xworkz.exception.internal;

import java.io.*;
import java.net.*;
import java.sql.*;

public class CompileTimeExamples {

    public void IOException() throws IOException {
        throw new IOException();
    }
    public void EOFException() throws EOFException {
        throw new EOFException();
    }
    public void fileNotFoundException() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    public void interruptedIOException() throws InterruptedIOException {
        throw new InterruptedIOException();
    }
    public void invalidClassException() throws InvalidClassException {
        throw new InvalidClassException("");
    }
    public void invalidObjectException() throws InvalidObjectException {
        throw new InvalidObjectException("");
    }
    public void notActiveException() throws NotActiveException {
        throw new NotActiveException();
    }
    public void notSerializableException() throws NotSerializableException {
        throw new NotSerializableException();
    }
    public void streamCorruptedException() throws StreamCorruptedException {
        throw new StreamCorruptedException("");
    }
    public void writeAbortedException() throws WriteAbortedException {
        throw new WriteAbortedException("",null);
    }
    public void syncFailedException() throws SyncFailedException {
        throw new SyncFailedException("");
    }
    public void unsupportedEncodingException() throws UnsupportedEncodingException {
        throw new UnsupportedEncodingException();
    }
    public void UTFDataFormatException() throws UTFDataFormatException {
        throw new UTFDataFormatException();
    }
    public void socketException() throws SocketException {
        throw new SocketException();
    }
    public void protocolException() throws ProtocolException {
        throw new ProtocolException();
    }
    public void malformedURLException() throws MalformedURLException {
        throw new MalformedURLException();
    }
    public void unknownHostException() throws UnknownHostException {
        throw new UnknownHostException();
    }
    public void unknownServiceException() throws UnknownServiceException {
        throw new UnknownServiceException();
    }
    public void URISyntaxException() throws URISyntaxException {
        throw new URISyntaxException("","");
    }
    public void classNotFoundException() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }
    public void instantiationException() throws InstantiationException {
        throw new InstantiationException();
    }
    public void illegalAccessException() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
    public void noSuchFieldException() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void noSuchMethodException() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
    public void SQLException() throws SQLException {
        throw new SQLException();
    }
    public void batchUpdateException() throws BatchUpdateException {
        throw new BatchUpdateException();
    }
    public void SQLClientInfoException() throws SQLClientInfoException {
        throw new SQLClientInfoException();
    }
    public void SQLDataException() throws SQLDataException {
        throw new SQLDataException();
    }
    public void SQLFeatureNotSupportedException() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException();
    }
    public void SQLIntegrityConstraintViolationException() throws SQLIntegrityConstraintViolationException {
        throw new SQLIntegrityConstraintViolationException();
    }
    public void SQLInvalidAuthorizationSpecException() throws SQLInvalidAuthorizationSpecException {
        throw new SQLInvalidAuthorizationSpecException();
    }
    public void SQLNonTransientConnectionException() throws SQLNonTransientConnectionException {
        throw new SQLNonTransientConnectionException();
    }
    public void SQLNonTransientException() throws SQLNonTransientException {
        throw new SQLNonTransientException();
    }
    public void SQLRecoverableException() throws SQLRecoverableException {
        throw new SQLRecoverableException();
    }
    public void SQLSyntaxErrorException() throws SQLSyntaxErrorException {
        throw new SQLSyntaxErrorException();
    }
    public void SQLTimeoutException() throws SQLTimeoutException {
        throw new SQLTimeoutException();
    }
    public void SQLTransactionRollbackException() throws SQLTransactionRollbackException {
        throw new SQLTransactionRollbackException();
    }
    public void SQLTransientConnectionException() throws SQLTransientConnectionException {
        throw new SQLTransientConnectionException();
    }
    public void SQLTransientException() throws SQLTransientException {
        throw new SQLTransientException();
    }
    public void dataTruncation() throws DataTruncation {
        throw new DataTruncation(0,true,false,0,0);
    }

}
