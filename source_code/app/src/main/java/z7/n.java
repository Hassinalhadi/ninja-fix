package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* loaded from: classes2.dex */
public final class n extends com.google.crypto.tink.shaded.protobuf.x {
    private static final n DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1490h keyValue_ = AbstractC1490h.purple;
    private p params_;
    private int version_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(n.class, nVar);
    }

    public static void mike(n nVar) {
        nVar.version_ = 0;
    }

    public static void november(n nVar, p pVar) {
        nVar.getClass();
        pVar.getClass();
        nVar.params_ = pVar;
    }

    public static void oscar(n nVar, C1489g c1489g) {
        nVar.getClass();
        nVar.keyValue_ = c1489g;
    }

    public static m sierra() {
        return (m) DEFAULT_INSTANCE.charlie();
    }

    public static n tango(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (n) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new n();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (n.class) {
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

    public final AbstractC1490h papa() {
        return this.keyValue_;
    }

    public final p quebec() {
        p pVar = this.params_;
        if (pVar == null) {
            return p.mike();
        }
        return pVar;
    }

    public final int romeo() {
        return this.version_;
    }
}
