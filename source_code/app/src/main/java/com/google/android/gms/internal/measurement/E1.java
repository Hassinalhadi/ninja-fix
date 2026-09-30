package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class E1 {
    public static final Charset alpha;
    public static final byte[] bravo;

    static {
        Charset.forName("US-ASCII");
        alpha = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        bravo = bArr;
        ByteBuffer.wrap(bArr);
    }
}
