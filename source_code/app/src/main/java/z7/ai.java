package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* loaded from: classes2.dex */
public final class ai extends com.google.crypto.tink.shaded.protobuf.x {
    private static final ai DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1490h keyValue_ = AbstractC1490h.purple;
    private ak params_;
    private int version_;

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(ai.class, aiVar);
    }

    public static void mike(ai aiVar) {
        aiVar.version_ = 0;
    }

    public static void november(ai aiVar, ak akVar) {
        aiVar.getClass();
        akVar.getClass();
        aiVar.params_ = akVar;
    }

    public static void oscar(ai aiVar, C1489g c1489g) {
        aiVar.getClass();
        aiVar.keyValue_ = c1489g;
    }

    public static ai papa() {
        return DEFAULT_INSTANCE;
    }

    public static ah tango() {
        return (ah) DEFAULT_INSTANCE.charlie();
    }

    public static ai uniform(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (ai) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new ai();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (ai.class) {
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

    public final ak romeo() {
        ak akVar = this.params_;
        if (akVar == null) {
            return ak.mike();
        }
        return akVar;
    }

    public final int sierra() {
        return this.version_;
    }
}
