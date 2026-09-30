package z7;

/* loaded from: classes2.dex */
public final class ak extends com.google.crypto.tink.shaded.protobuf.x {
    private static final ak DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [z7.ak, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ?? xVar = new com.google.crypto.tink.shaded.protobuf.x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(ak.class, xVar);
    }

    public static ak mike() {
        return DEFAULT_INSTANCE;
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.x();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (ak.class) {
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

    public final ag november() {
        ag agVar;
        int i4 = this.hash_;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            agVar = null;
                        } else {
                            agVar = ag.SHA512;
                        }
                    } else {
                        agVar = ag.SHA256;
                    }
                } else {
                    agVar = ag.SHA384;
                }
            } else {
                agVar = ag.SHA1;
            }
        } else {
            agVar = ag.UNKNOWN_HASH;
        }
        if (agVar == null) {
            return ag.UNRECOGNIZED;
        }
        return agVar;
    }

    public final int oscar() {
        return this.tagSize_;
    }
}
