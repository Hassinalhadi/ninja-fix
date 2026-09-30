package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* renamed from: z7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3478j extends com.google.crypto.tink.shaded.protobuf.x {
    private static final C3478j DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1490h keyValue_ = AbstractC1490h.purple;
    private l params_;
    private int version_;

    static {
        C3478j c3478j = new C3478j();
        DEFAULT_INSTANCE = c3478j;
        com.google.crypto.tink.shaded.protobuf.x.kilo(C3478j.class, c3478j);
    }

    public static void mike(C3478j c3478j) {
        c3478j.version_ = 0;
    }

    public static void november(C3478j c3478j, l lVar) {
        c3478j.getClass();
        lVar.getClass();
        c3478j.params_ = lVar;
    }

    public static void oscar(C3478j c3478j, C1489g c1489g) {
        c3478j.getClass();
        c3478j.keyValue_ = c1489g;
    }

    public static C3478j papa() {
        return DEFAULT_INSTANCE;
    }

    public static C3477i tango() {
        return (C3477i) DEFAULT_INSTANCE.charlie();
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.crypto.tink.shaded.protobuf.au, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.x
    public final Object delta(int i4) {
        com.google.crypto.tink.shaded.protobuf.au auVar;
        switch (av.q.mike(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new C3478j();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (C3478j.class) {
                        try {
                            com.google.crypto.tink.shaded.protobuf.au auVar3 = PARSER;
                            auVar = auVar3;
                            if (auVar3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                auVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return auVar;
                }
                return auVar2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final AbstractC1490h quebec() {
        return this.keyValue_;
    }

    public final l romeo() {
        l lVar = this.params_;
        if (lVar == null) {
            return l.mike();
        }
        return lVar;
    }

    public final int sierra() {
        return this.version_;
    }
}
