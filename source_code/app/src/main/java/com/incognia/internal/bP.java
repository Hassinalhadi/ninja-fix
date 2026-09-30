package com.incognia.internal;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class bP {

    /* renamed from: f9, reason: collision with root package name */
    public static final byte[] f10170f9 = new byte[0];

    /* renamed from: W, reason: collision with root package name */
    public final InputStream f10171W;

    /* renamed from: b, reason: collision with root package name */
    public final ByteArrayOutputStream f10172b = new ByteArrayOutputStream(4);

    public bP(InputStream inputStream) {
        this.f10171W = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream);
    }

    public final gN W() {
        Object obj;
        byte[] bArr;
        long j5 = 0;
        for (int i4 = 0; i4 < b(this.f10172b).length; i4++) {
            j5 += (UByte.m209constructorimpl(r0[i4]) & 255) << (i4 * 7);
        }
        int i5 = (int) (j5 >> 3);
        byte b2 = (byte) (7 & j5);
        Iterator it = ((List) QLZ.f9495W.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((QLZ) obj).f9496b == b2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Object obj2 = (QLZ) obj;
        if (obj2 == null) {
            obj2 = wDK.f11602f9;
        }
        if (Intrinsics.areEqual(obj2, wDK.f11602f9)) {
            bArr = b(this.f10172b);
        } else if (Intrinsics.areEqual(obj2, qG3.f11137f9)) {
            byte[] bArr2 = new byte[8];
            int read = this.f10171W.read(bArr2);
            if (read == -1) {
                bArr = f10170f9;
            } else {
                bArr = Arrays.copyOf(bArr2, read);
            }
        } else if (Intrinsics.areEqual(obj2, voK.f11588f9)) {
            byte[] bArr3 = new byte[4];
            int read2 = this.f10171W.read(bArr3);
            if (read2 == -1) {
                bArr = f10170f9;
            } else {
                bArr = Arrays.copyOf(bArr3, read2);
            }
        } else if (Intrinsics.areEqual(obj2, l25.f10793f9)) {
            byte[] bArr4 = new byte[xFC.W(b(this.f10172b)).intValue()];
            int read3 = this.f10171W.read(bArr4);
            if (read3 == -1) {
                bArr = f10170f9;
            } else {
                bArr = Arrays.copyOf(bArr4, read3);
            }
        } else {
            bArr = f10170f9;
        }
        return new gN(i5, bArr);
    }

    public final boolean b() {
        return this.f10171W.available() > 0;
    }

    public final byte[] b(ByteArrayOutputStream byteArrayOutputStream) {
        int read = this.f10171W.read();
        while ((read & (-128)) != 0) {
            byteArrayOutputStream.write(read ^ (-128));
            read = this.f10171W.read();
        }
        byteArrayOutputStream.write(read);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.reset();
        return byteArray;
    }
}
