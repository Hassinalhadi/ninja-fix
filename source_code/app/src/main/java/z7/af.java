package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* loaded from: classes2.dex */
public final class af extends com.google.crypto.tink.shaded.protobuf.x {
    private static final af DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER;
    private AbstractC1490h encryptedKeyset_ = AbstractC1490h.purple;
    private az keysetInfo_;

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(af.class, afVar);
    }

    public static void mike(af afVar, C1489g c1489g) {
        afVar.getClass();
        afVar.encryptedKeyset_ = c1489g;
    }

    public static void november(af afVar, az azVar) {
        afVar.getClass();
        afVar.keysetInfo_ = azVar;
    }

    public static ae papa() {
        return (ae) DEFAULT_INSTANCE.charlie();
    }

    public static af quebec(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (af) com.google.crypto.tink.shaded.protobuf.x.juliet(DEFAULT_INSTANCE, bArr, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new af();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (af.class) {
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
        return this.encryptedKeyset_;
    }
}
