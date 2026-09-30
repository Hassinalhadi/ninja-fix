package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class q {
    public int alpha() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final s bravo() {
        if (this instanceof s) {
            return (s) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public String delta() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            S8.c cVar = new S8.c(stringWriter);
            cVar.f2054a = 1;
            com.google.gson.internal.bind.l.zulu.write(cVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
