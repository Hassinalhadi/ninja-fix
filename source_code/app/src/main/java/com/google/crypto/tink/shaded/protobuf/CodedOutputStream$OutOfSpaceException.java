package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class CodedOutputStream$OutOfSpaceException extends IOException {
    private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
    private static final long serialVersionUID = -6947486886997889499L;

    public CodedOutputStream$OutOfSpaceException() {
        super(MESSAGE);
    }

    public CodedOutputStream$OutOfSpaceException(String str) {
        super(av.q.echo("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
    }

    public CodedOutputStream$OutOfSpaceException(Throwable th) {
        super(MESSAGE, th);
    }

    public CodedOutputStream$OutOfSpaceException(String str, Throwable th) {
        super(av.q.echo("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
    }
}
