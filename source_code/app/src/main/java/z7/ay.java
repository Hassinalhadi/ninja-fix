package z7;

/* loaded from: classes2.dex */
public final class ay extends com.google.crypto.tink.shaded.protobuf.x {
    private static final ay DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(ay.class, ayVar);
    }

    public static void mike(ay ayVar, String str) {
        ayVar.getClass();
        str.getClass();
        ayVar.typeUrl_ = str;
    }

    public static void november(ay ayVar, G g2) {
        ayVar.getClass();
        ayVar.outputPrefixType_ = g2.bravo();
    }

    public static void oscar(ay ayVar, ao aoVar) {
        ayVar.getClass();
        ayVar.status_ = aoVar.alpha();
    }

    public static void papa(ay ayVar, int i4) {
        ayVar.keyId_ = i4;
    }

    public static ax romeo() {
        return (ax) DEFAULT_INSTANCE.charlie();
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new ay();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (ay.class) {
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

    public final int quebec() {
        return this.keyId_;
    }
}
