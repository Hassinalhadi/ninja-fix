package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;

/* renamed from: z7.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3468B extends com.google.crypto.tink.shaded.protobuf.x {
    private static final C3468B DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [z7.B, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ?? xVar = new com.google.crypto.tink.shaded.protobuf.x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(C3468B.class, xVar);
    }

    public static void mike(C3468B c3468b) {
        c3468b.version_ = 0;
    }

    public static void november(C3468B c3468b, C c3) {
        c3468b.getClass();
        c3.getClass();
        c3468b.params_ = c3;
    }

    public static C3467A quebec() {
        return (C3467A) DEFAULT_INSTANCE.charlie();
    }

    public static C3468B romeo(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (C3468B) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.x();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (C3468B.class) {
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

    public final C oscar() {
        C c3 = this.params_;
        if (c3 == null) {
            return C.mike();
        }
        return c3;
    }

    public final int papa() {
        return this.version_;
    }
}
