package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;

/* renamed from: z7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3472d extends com.google.crypto.tink.shaded.protobuf.x {
    private static final C3472d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER;
    private int keySize_;
    private C3473e params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [z7.d, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ?? xVar = new com.google.crypto.tink.shaded.protobuf.x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(C3472d.class, xVar);
    }

    public static C3472d oscar(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (C3472d) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.x();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (C3472d.class) {
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

    public final int mike() {
        return this.keySize_;
    }

    public final C3473e november() {
        C3473e c3473e = this.params_;
        if (c3473e == null) {
            return C3473e.mike();
        }
        return c3473e;
    }
}
