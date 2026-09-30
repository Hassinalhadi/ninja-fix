package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* loaded from: classes2.dex */
public final class aq extends com.google.crypto.tink.shaded.protobuf.x {
    private static final aq DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC1490h value_ = AbstractC1490h.purple;

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(aq.class, aqVar);
    }

    public static void mike(aq aqVar, String str) {
        aqVar.getClass();
        aqVar.typeUrl_ = str;
    }

    public static void november(aq aqVar, C1489g c1489g) {
        aqVar.getClass();
        aqVar.value_ = c1489g;
    }

    public static void oscar(aq aqVar, G g2) {
        aqVar.getClass();
        aqVar.outputPrefixType_ = g2.bravo();
    }

    public static aq papa() {
        return DEFAULT_INSTANCE;
    }

    public static ap tango() {
        return (ap) DEFAULT_INSTANCE.charlie();
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new aq();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (aq.class) {
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

    public final G quebec() {
        G alpha = G.alpha(this.outputPrefixType_);
        if (alpha == null) {
            return G.UNRECOGNIZED;
        }
        return alpha;
    }

    public final String romeo() {
        return this.typeUrl_;
    }

    public final AbstractC1490h sierra() {
        return this.value_;
    }
}
