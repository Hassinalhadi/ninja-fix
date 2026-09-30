package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* loaded from: classes2.dex */
public final class y extends com.google.crypto.tink.shaded.protobuf.x {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1490h keyValue_ = AbstractC1490h.purple;
    private int version_;

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(y.class, yVar);
    }

    public static void mike(y yVar) {
        yVar.version_ = 0;
    }

    public static void november(y yVar, C1489g c1489g) {
        yVar.getClass();
        yVar.keyValue_ = c1489g;
    }

    public static x quebec() {
        return (x) DEFAULT_INSTANCE.charlie();
    }

    public static y romeo(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (y) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new y();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (y.class) {
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

    public final AbstractC1490h oscar() {
        return this.keyValue_;
    }

    public final int papa() {
        return this.version_;
    }
}
