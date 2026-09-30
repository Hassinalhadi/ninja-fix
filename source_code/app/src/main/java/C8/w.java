package C8;

import com.google.protobuf.AbstractC1499b;
import com.google.protobuf.AbstractC1511n;
import com.google.protobuf.AbstractC1513p;
import com.google.protobuf.C1514q;
import com.google.protobuf.InterfaceC1515s;
import com.google.protobuf.ap;
import com.google.protobuf.at;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class w extends AbstractC1513p {
    private static final w DEFAULT_INSTANCE;
    private static volatile ap PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC1515s sessionVerbosity_converter_ = new Object();
    private int bitField0_;
    private String sessionId_ = "";
    private com.google.protobuf.r sessionVerbosity_ = C1514q.silver;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.protobuf.s] */
    static {
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        AbstractC1513p.papa(w.class, wVar);
    }

    public static void sierra(w wVar, String str) {
        wVar.getClass();
        str.getClass();
        wVar.bitField0_ |= 1;
        wVar.sessionId_ = str;
    }

    public static void tango(w wVar) {
        int i4;
        wVar.getClass();
        RandomAccess randomAccess = wVar.sessionVerbosity_;
        if (!((AbstractC1499b) randomAccess).alpha) {
            C1514q c1514q = (C1514q) randomAccess;
            int i5 = c1514q.red;
            if (i5 == 0) {
                i4 = 10;
            } else {
                i4 = i5 * 2;
            }
            if (i4 >= i5) {
                wVar.sessionVerbosity_ = new C1514q(Arrays.copyOf(c1514q.purple, i4), c1514q.red, true);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((C1514q) wVar.sessionVerbosity_).bravo(av.q.mike(2));
    }

    public static v whiskey() {
        return (v) DEFAULT_INSTANCE.india();
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.protobuf.ap, java.lang.Object] */
    @Override // com.google.protobuf.AbstractC1513p
    public final Object juliet(int i4) {
        ap apVar;
        switch (av.q.mike(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new at(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", h.delta});
            case 3:
                return new w();
            case 4:
                return new AbstractC1511n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ap apVar2 = PARSER;
                if (apVar2 == null) {
                    synchronized (w.class) {
                        try {
                            ap apVar3 = PARSER;
                            apVar = apVar3;
                            if (apVar3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                apVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return apVar;
                }
                return apVar2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int uniform() {
        int i4 = 0;
        int hotel = ((C1514q) this.sessionVerbosity_).hotel(0);
        if (hotel != 0) {
            if (hotel == 1) {
                i4 = 2;
            }
        } else {
            i4 = 1;
        }
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public final int victor() {
        return ((C1514q) this.sessionVerbosity_).size();
    }
}
