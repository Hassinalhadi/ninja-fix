package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* renamed from: z7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3470b extends com.google.crypto.tink.shaded.protobuf.x {
    private static final C3470b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1490h keyValue_ = AbstractC1490h.purple;
    private C3473e params_;
    private int version_;

    static {
        C3470b c3470b = new C3470b();
        DEFAULT_INSTANCE = c3470b;
        com.google.crypto.tink.shaded.protobuf.x.kilo(C3470b.class, c3470b);
    }

    public static void mike(C3470b c3470b) {
        c3470b.version_ = 0;
    }

    public static void november(C3470b c3470b, C1489g c1489g) {
        c3470b.getClass();
        c3470b.keyValue_ = c1489g;
    }

    public static void oscar(C3470b c3470b, C3473e c3473e) {
        c3470b.getClass();
        c3473e.getClass();
        c3470b.params_ = c3473e;
    }

    public static C3469a sierra() {
        return (C3469a) DEFAULT_INSTANCE.charlie();
    }

    public static C3470b tango(AbstractC1490h abstractC1490h, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (C3470b) com.google.crypto.tink.shaded.protobuf.x.india(DEFAULT_INSTANCE, abstractC1490h, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C3470b();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (C3470b.class) {
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

    public final C3473e quebec() {
        C3473e c3473e = this.params_;
        if (c3473e == null) {
            return C3473e.mike();
        }
        return c3473e;
    }

    public final int romeo() {
        return this.version_;
    }
}
