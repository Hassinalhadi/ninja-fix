package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1484b;

/* loaded from: classes2.dex */
public final class az extends com.google.crypto.tink.shaded.protobuf.x {
    private static final az DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.aa keyInfo_ = com.google.crypto.tink.shaded.protobuf.ax.silver;
    private int primaryKeyId_;

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(az.class, azVar);
    }

    public static void mike(az azVar, int i4) {
        azVar.primaryKeyId_ = i4;
    }

    public static void november(az azVar, ay ayVar) {
        int i4;
        azVar.getClass();
        com.google.crypto.tink.shaded.protobuf.aa aaVar = azVar.keyInfo_;
        if (!((AbstractC1484b) aaVar).alpha) {
            int size = aaVar.size();
            if (size == 0) {
                i4 = 10;
            } else {
                i4 = size * 2;
            }
            azVar.keyInfo_ = aaVar.golf(i4);
        }
        azVar.keyInfo_.add(ayVar);
    }

    public static aw papa() {
        return (aw) DEFAULT_INSTANCE.charlie();
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", ay.class});
            case 3:
                return new az();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (az.class) {
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

    public final ay oscar() {
        return (ay) this.keyInfo_.get(0);
    }
}
