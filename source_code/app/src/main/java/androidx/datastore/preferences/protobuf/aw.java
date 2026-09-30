package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class aw {
    public abstract ax alpha(Object obj);

    public final boolean bravo(int i4, C0601h c0601h, Object obj) {
        int i5 = c0601h.bravo;
        int i10 = i5 >>> 3;
        int i11 = i5 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return false;
                        }
                        if (i11 == 5) {
                            c0601h.whiskey(5);
                            ((ax) obj).charlie(5 | (i10 << 3), Integer.valueOf(c0601h.alpha.november()));
                            return true;
                        }
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    ax axVar = new ax(0, new int[8], new Object[8], true);
                    int i12 = i10 << 3;
                    int i13 = i12 | 4;
                    int i14 = i4 + 1;
                    if (i14 >= 100) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    while (c0601h.alpha() != Integer.MAX_VALUE && bravo(i14, c0601h, axVar)) {
                    }
                    if (i13 == c0601h.bravo) {
                        if (axVar.echo) {
                            axVar.echo = false;
                        }
                        ((ax) obj).charlie(i12 | 3, axVar);
                        return true;
                    }
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                ((ax) obj).charlie((i10 << 3) | 2, c0601h.echo());
                return true;
            }
            c0601h.whiskey(1);
            ((ax) obj).charlie((i10 << 3) | 1, Long.valueOf(c0601h.alpha.oscar()));
            return true;
        }
        c0601h.whiskey(0);
        ((ax) obj).charlie(i10 << 3, Long.valueOf(c0601h.alpha.romeo()));
        return true;
    }
}
