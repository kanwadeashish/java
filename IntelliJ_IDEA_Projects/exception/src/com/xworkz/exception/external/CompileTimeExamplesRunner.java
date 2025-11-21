package com.xworkz.exception.external;

import com.xworkz.exception.internal.CompileTimeExamples;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;

public class CompileTimeExamplesRunner {

    public static void main(String[] args) throws IOException, URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SQLException {

        CompileTimeExamples examples = new CompileTimeExamples();

        examples.IOException();
        examples.EOFException();
        examples.fileNotFoundException();
        examples.interruptedIOException();
        examples.invalidClassException();
        examples.invalidObjectException();
        examples.notActiveException();
        examples.notSerializableException();
        examples.streamCorruptedException();
        examples.writeAbortedException();
        examples.syncFailedException();
        examples.unsupportedEncodingException();
        examples.UTFDataFormatException();
        examples.socketException();
        examples.protocolException();
        examples.malformedURLException();
        examples.unknownHostException();
        examples.unknownServiceException();
        examples.URISyntaxException();
        examples.classNotFoundException();
        examples.instantiationException();
        examples.illegalAccessException();
        examples.noSuchFieldException();
        examples.noSuchMethodException();
        examples.SQLException();
        examples.batchUpdateException();
        examples.SQLClientInfoException();
        examples.SQLDataException();
        examples.SQLFeatureNotSupportedException();
        examples.SQLIntegrityConstraintViolationException();
        examples.SQLInvalidAuthorizationSpecException();
        examples.SQLNonTransientConnectionException();
        examples.SQLNonTransientException();
        examples.SQLRecoverableException();
        examples.SQLSyntaxErrorException();
        examples.SQLTimeoutException();
        examples.SQLTransactionRollbackException();
        examples.SQLTransientConnectionException();
        examples.SQLTransientException();
        examples.dataTruncation();

    }

}
