package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;

/* loaded from: classes2.dex */
public final class F extends com.google.crypto.tink.shaded.protobuf.x {
    private static final F DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER;
    private aq dekTemplate_;
    private String kekUri_ = "";

    static {
        F f5 = new F();
        DEFAULT_INSTANCE = f5;
        com.google.crypto.tink.shaded.protobuf.x.kilo(F.class, f5);
    }

    public static F mike() {
        return DEFAULT_INSTANCE;
    }

    public static F papa(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (F) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new F();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (F.class) {
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

    public final aq november() {
        aq aqVar = this.dekTemplate_;
        if (aqVar == null) {
            return aq.papa();
        }
        return aqVar;
    }

    public final String oscar() {
        return this.kekUri_;
    }
}
