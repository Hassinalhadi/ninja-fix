package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public abstract class C {
    public final boolean alpha(Object obj, az azVar) {
        int tango = azVar.tango();
        int i4 = tango >>> 3;
        int i5 = tango & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 == 4) {
                            return false;
                        }
                        if (i5 == 5) {
                            ((D) obj).charlie((i4 << 3) | 5, Integer.valueOf(azVar.hotel()));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    D bravo = D.bravo();
                    int i10 = i4 << 3;
                    int i11 = i10 | 4;
                    while (azVar.zulu() != Integer.MAX_VALUE && alpha(bravo, azVar)) {
                    }
                    if (i11 == azVar.tango()) {
                        bravo.echo = false;
                        ((D) obj).charlie(i10 | 3, bravo);
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                ((D) obj).charlie((i4 << 3) | 2, azVar.beige());
                return true;
            }
            ((D) obj).charlie((i4 << 3) | 1, Long.valueOf(azVar.charlie()));
            return true;
        }
        ((D) obj).charlie(i4 << 3, Long.valueOf(azVar.emerald()));
        return true;
    }

    public abstract D bravo();
}
