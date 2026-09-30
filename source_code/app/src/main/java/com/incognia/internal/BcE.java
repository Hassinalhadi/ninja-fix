package com.incognia.internal;

import java.io.ByteArrayInputStream;

/* loaded from: classes2.dex */
public abstract class BcE {
    public static TL1 b(byte[] bArr) {
        bP bPVar = new bP(new ByteArrayInputStream(bArr));
        Long l10 = 0L;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (bPVar.b()) {
            gN W5 = bPVar.W();
            switch (W5.f10473b) {
                case 1:
                    l10 = Long.valueOf(W5.b());
                    break;
                case 2:
                    l11 = Long.valueOf(W5.b());
                    break;
                case 3:
                    l12 = Long.valueOf(W5.b());
                    break;
                case 4:
                    str = W5.W();
                    break;
                case 5:
                    l13 = Long.valueOf(W5.b());
                    break;
                case 6:
                    str2 = W5.W();
                    break;
                case 7:
                    l14 = Long.valueOf(W5.b());
                    break;
                case 8:
                    str3 = W5.W();
                    break;
            }
        }
        return new TL1(l10, l11, l12, str, l13, str2, l14, str3);
    }
}
