package com.incognia.internal;

import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

/* loaded from: classes2.dex */
public abstract class vB {
    public static byte[] b(byte[] bArr) {
        Inflater inflater = new Inflater(true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(byteArrayOutputStream, inflater);
        try {
            try {
                inflaterOutputStream.write(bArr);
                inflaterOutputStream.close();
                inflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }
}
