package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import de.AbstractC1618a;
import de.AbstractC1621d;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import s6.AbstractC2817y0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/X0;", "Lcom/fingerprintjs/android/fpjs_pro_internal/cj;", "delta", "a"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X0 implements cj {
    public final W0 alpha;
    public final W0 bravo;
    public final boolean charlie;

    public X0(W0 w02, W0 w03, boolean z2) {
        this.alpha = w02;
        this.bravo = w03;
        this.charlie = z2;
    }

    public static byte alpha(byte b2, byte b4) {
        byte m209constructorimpl = UByte.m209constructorimpl(b2);
        byte m209constructorimpl2 = UByte.m209constructorimpl(b4);
        return UByte.m209constructorimpl((byte) UInt.m210constructorimpl(UInt.m210constructorimpl(m209constructorimpl2 & 255) + UInt.m210constructorimpl(m209constructorimpl & 255)));
    }

    public static int bravo(byte b2, byte b4) {
        return UByte.m209constructorimpl((byte) UInt.m210constructorimpl(UInt.m210constructorimpl(UByte.m209constructorimpl(b2) & 255) - UInt.m210constructorimpl(UByte.m209constructorimpl(b4) & 255))) & 255;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cj
    public final byte[] component5(byte[] bArr) {
        byte[] bArr2;
        byte b2;
        boolean z2 = this.charlie;
        if (!z2) {
            bArr2 = bArr;
        } else {
            this.alpha.getClass();
            try {
                Object[] objArr = {0L, new V0(bArr), 1, null};
                Object echo = am.echo(853678683);
                if (echo == null) {
                    echo = am.charlie((char) (40618 - Process.getGidForName("")), 53 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 222, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class});
                }
                bArr2 = (byte[]) component13.alpha((N14263A23323) ((Method) echo).invoke(null, objArr));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (bArr2 == null) {
            return new byte[0];
        }
        AbstractC1618a abstractC1618a = AbstractC1621d.alpha;
        byte bravo = (byte) AbstractC2817y0.bravo();
        int bravo2 = ((byte) AbstractC2817y0.bravo()) % 128;
        int i4 = bravo2 + 4;
        byte[] bArr3 = new byte[bravo2 + 11 + bArr2.length];
        bArr3[0] = bravo;
        bArr3[1] = alpha(bravo, (byte) 3);
        if (z2) {
            b2 = 10;
        } else {
            b2 = 7;
        }
        bArr3[2] = alpha(bravo, b2);
        bArr3[3] = alpha(bravo, (byte) bravo2);
        AbstractC1618a abstractC1618a2 = AbstractC1621d.alpha;
        abstractC1618a2.getClass();
        byte[] bArr4 = new byte[bravo2];
        abstractC1618a2.foxtrot().nextBytes(bArr4);
        for (int i5 = 0; i5 < bravo2; i5++) {
            bArr3[i5 + 4] = bArr4[i5];
        }
        AbstractC1618a abstractC1618a3 = AbstractC1621d.alpha;
        AbstractC1618a abstractC1618a4 = AbstractC1621d.alpha;
        abstractC1618a4.getClass();
        byte[] bArr5 = new byte[7];
        abstractC1618a4.foxtrot().nextBytes(bArr5);
        for (int i10 = 0; i10 < 7; i10++) {
            bArr3[i4 + i10] = bArr5[i10];
        }
        int i11 = bravo2 + 11;
        int length = bArr2.length;
        for (int i12 = 0; i12 < length; i12++) {
            bArr3[i12 + i11] = (byte) (bArr5[i12 % 7] ^ bArr2[i12]);
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0059, code lost:
    
        if (r6 == 10) goto L14;
     */
    @Override // com.fingerprintjs.android.fpjs_pro_internal.cj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] component9(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        boolean z2 = true;
        int bravo = bravo(bArr[1], b2);
        int bravo2 = bravo(bArr[2], b2);
        if (bravo == 3 && CollectionsKt.listOf(7, 10).contains(Integer.valueOf(bravo2))) {
            int bravo3 = bravo(bArr[3], b2);
            int i4 = bravo3 + 4;
            int i5 = bravo3 + 11;
            byte[] copyOfRange = ArraysKt.copyOfRange(bArr, i4, i5);
            int length = bArr.length - i5;
            bArr2 = new byte[length];
            int length2 = bArr.length - length;
            for (int i10 = 0; i10 < length; i10++) {
                bArr2[i10] = (byte) (bArr[length2 + i10] ^ copyOfRange[i10 % 7]);
            }
        } else {
            bArr2 = new byte[0];
        }
        z2 = false;
        if (bArr2.length == 0 || !z2) {
            return bArr2;
        }
        return (byte[]) component13.vD14832N6715(this.bravo.component5(bArr2), new byte[0]);
    }
}
