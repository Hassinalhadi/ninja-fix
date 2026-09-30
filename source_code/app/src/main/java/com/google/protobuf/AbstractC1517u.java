package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1517u {
    public static final Charset alpha;
    public static final byte[] bravo;

    static {
        Charset.forName("US-ASCII");
        alpha = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        bravo = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length >= 0) {
                int i4 = (0 - 0) + length;
                if (i4 >= 0) {
                    if (i4 <= Integer.MAX_VALUE) {
                        return;
                    } else {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                }
                throw InvalidProtocolBufferException.parseFailure();
            }
            throw InvalidProtocolBufferException.negativeSize();
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int alpha(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }
}
