package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1484b;
import java.util.List;

/* loaded from: classes2.dex */
public final class av extends com.google.crypto.tink.shaded.protobuf.x {
    private static final av DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.aa key_ = com.google.crypto.tink.shaded.protobuf.ax.silver;
    private int primaryKeyId_;

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(av.class, avVar);
    }

    public static void mike(av avVar, int i4) {
        avVar.primaryKeyId_ = i4;
    }

    public static void november(av avVar, au auVar) {
        int i4;
        avVar.getClass();
        com.google.crypto.tink.shaded.protobuf.aa aaVar = avVar.key_;
        if (!((AbstractC1484b) aaVar).alpha) {
            int size = aaVar.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size * 2;
            }
            avVar.key_ = aaVar.golf(i4);
        }
        avVar.key_.add(auVar);
    }

    public static as sierra() {
        return (as) DEFAULT_INSTANCE.charlie();
    }

    public static av tango(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (av) com.google.crypto.tink.shaded.protobuf.x.juliet(DEFAULT_INSTANCE, bArr, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", au.class});
            case 3:
                return new av();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (av.class) {
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

    public final au oscar(int i4) {
        return (au) this.key_.get(i4);
    }

    public final int papa() {
        return this.key_.size();
    }

    public final List quebec() {
        return this.key_;
    }

    public final int romeo() {
        return this.primaryKeyId_;
    }
}
