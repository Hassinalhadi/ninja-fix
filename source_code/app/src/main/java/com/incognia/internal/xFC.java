package com.incognia.internal;

import kotlin.UByte;
import kotlin.text.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class xFC {
    public static final Number W(byte[] bArr) {
        long j5 = 0;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            j5 += (UByte.m209constructorimpl(bArr[i4]) & 255) << (i4 * 7);
        }
        if (-128 <= j5 && j5 <= 127) {
            return Byte.valueOf((byte) j5);
        }
        if (-32768 <= j5 && j5 <= 32767) {
            return Short.valueOf((short) j5);
        }
        if (-2147483648L <= j5 && j5 <= 2147483647L) {
            return Integer.valueOf((int) j5);
        }
        return Long.valueOf(j5);
    }

    public static final byte[] b(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        byte[] bArr3 = new byte[min];
        for (int i4 = 0; i4 < min; i4++) {
            bArr3[i4] = (byte) (bArr[i4] ^ bArr2[i4]);
        }
        return bArr3;
    }

    public static final JSONObject b(byte[] bArr) {
        return new JSONObject(new String(bArr, a.alpha));
    }
}
