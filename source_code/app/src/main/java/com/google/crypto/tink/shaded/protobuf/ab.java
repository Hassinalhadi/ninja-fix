package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class ab {
    public static final Charset alpha = Charset.forName("UTF-8");
    public static final byte[] bravo;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        bravo = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.truncatedMessage();
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void alpha(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static int bravo(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static x charlie(Object obj, Object obj2) {
        x xVar = (x) ((ao) obj);
        v vVar = (v) xVar.delta(5);
        vVar.charlie();
        v.delta(vVar.purple, xVar);
        ao aoVar = (ao) obj2;
        if (vVar.alpha.getClass().isInstance(aoVar)) {
            vVar.charlie();
            v.delta(vVar.purple, (x) ((AbstractC1483a) aoVar));
            return vVar.bravo();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
