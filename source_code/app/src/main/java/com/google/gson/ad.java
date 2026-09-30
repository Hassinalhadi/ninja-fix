package com.google.gson;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes2.dex */
public abstract class ad {
    public final Object fromJson(Reader reader) throws IOException {
        return read(new S8.a(reader));
    }

    public final Object fromJsonTree(q qVar) {
        try {
            return read(new com.google.gson.internal.bind.e(qVar));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final ad nullSafe() {
        if (!(this instanceof TypeAdapter$NullSafeTypeAdapter)) {
            return new TypeAdapter$NullSafeTypeAdapter(this);
        }
        return this;
    }

    public abstract Object read(S8.a aVar) throws IOException;

    public final void toJson(Writer writer, Object obj) throws IOException {
        write(new S8.c(writer), obj);
    }

    public final q toJsonTree(Object obj) {
        try {
            com.google.gson.internal.bind.g gVar = new com.google.gson.internal.bind.g();
            write(gVar, obj);
            return gVar.pink();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public abstract void write(S8.c cVar, Object obj) throws IOException;

    public final Object fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, obj);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }
}
