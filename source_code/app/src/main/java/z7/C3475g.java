package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;

/* renamed from: z7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3475g extends com.google.crypto.tink.shaded.protobuf.x {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C3475g DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C3478j aesCtrKey_;
    private ai hmacKey_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.x, z7.g] */
    static {
        ?? xVar = new com.google.crypto.tink.shaded.protobuf.x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(C3475g.class, xVar);
    }

    public static void mike(C3475g c3475g) {
        c3475g.version_ = 0;
    }

    public static void november(C3475g c3475g, C3478j c3478j) {
        c3475g.getClass();
        c3478j.getClass();
        c3475g.aesCtrKey_ = c3478j;
    }

    public static void oscar(C3475g c3475g, ai aiVar) {
        c3475g.getClass();
        aiVar.getClass();
        c3475g.hmacKey_ = aiVar;
    }

    public static C3474f sierra() {
        return (C3474f) DEFAULT_INSTANCE.charlie();
    }

    public static C3475g tango(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (C3475g) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.x();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (C3475g.class) {
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

    public final C3478j papa() {
        C3478j c3478j = this.aesCtrKey_;
        if (c3478j == null) {
            return C3478j.papa();
        }
        return c3478j;
    }

    public final ai quebec() {
        ai aiVar = this.hmacKey_;
        if (aiVar == null) {
            return ai.papa();
        }
        return aiVar;
    }

    public final int romeo() {
        return this.version_;
    }
}
