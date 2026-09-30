package z7;

/* loaded from: classes2.dex */
public final class au extends com.google.crypto.tink.shaded.protobuf.x {
    private static final au DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private an keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [z7.au, com.google.crypto.tink.shaded.protobuf.x] */
    static {
        ?? xVar = new com.google.crypto.tink.shaded.protobuf.x();
        DEFAULT_INSTANCE = xVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(au.class, xVar);
    }

    public static void mike(au auVar, an anVar) {
        auVar.getClass();
        auVar.keyData_ = anVar;
    }

    public static void november(au auVar, G g2) {
        auVar.getClass();
        auVar.outputPrefixType_ = g2.bravo();
    }

    public static void oscar(au auVar) {
        ao aoVar = ao.ENABLED;
        auVar.getClass();
        auVar.status_ = aoVar.alpha();
    }

    public static void papa(au auVar, int i4) {
        auVar.keyId_ = i4;
    }

    public static at victor() {
        return (at) DEFAULT_INSTANCE.charlie();
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new com.google.crypto.tink.shaded.protobuf.x();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (au.class) {
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

    public final an quebec() {
        an anVar = this.keyData_;
        if (anVar == null) {
            return an.papa();
        }
        return anVar;
    }

    public final int romeo() {
        return this.keyId_;
    }

    public final G sierra() {
        G alpha = G.alpha(this.outputPrefixType_);
        if (alpha == null) {
            return G.UNRECOGNIZED;
        }
        return alpha;
    }

    public final ao tango() {
        ao aoVar;
        int i4 = this.status_;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        aoVar = null;
                    } else {
                        aoVar = ao.DESTROYED;
                    }
                } else {
                    aoVar = ao.DISABLED;
                }
            } else {
                aoVar = ao.ENABLED;
            }
        } else {
            aoVar = ao.UNKNOWN_STATUS;
        }
        if (aoVar == null) {
            return ao.UNRECOGNIZED;
        }
        return aoVar;
    }

    public final boolean uniform() {
        if (this.keyData_ != null) {
            return true;
        }
        return false;
    }
}
