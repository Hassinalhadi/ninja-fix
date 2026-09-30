package z7;

import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;

/* loaded from: classes2.dex */
public final class an extends com.google.crypto.tink.shaded.protobuf.x {
    private static final an DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.au PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC1490h value_ = AbstractC1490h.purple;

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        com.google.crypto.tink.shaded.protobuf.x.kilo(an.class, anVar);
    }

    public static void mike(an anVar, String str) {
        anVar.getClass();
        str.getClass();
        anVar.typeUrl_ = str;
    }

    public static void november(an anVar, C1489g c1489g) {
        anVar.getClass();
        anVar.value_ = c1489g;
    }

    public static void oscar(an anVar, am amVar) {
        anVar.getClass();
        if (amVar != am.UNRECOGNIZED) {
            anVar.keyMaterialType_ = amVar.alpha;
        } else {
            amVar.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static an papa() {
        return DEFAULT_INSTANCE;
    }

    public static al tango() {
        return (al) DEFAULT_INSTANCE.charlie();
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
                return new com.google.crypto.tink.shaded.protobuf.ay(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new an();
            case 4:
                return new com.google.crypto.tink.shaded.protobuf.v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.au auVar2 = PARSER;
                if (auVar2 == null) {
                    synchronized (an.class) {
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

    public final am quebec() {
        am amVar;
        int i4 = this.keyMaterialType_;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            amVar = null;
                        } else {
                            amVar = am.REMOTE;
                        }
                    } else {
                        amVar = am.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    amVar = am.ASYMMETRIC_PRIVATE;
                }
            } else {
                amVar = am.SYMMETRIC;
            }
        } else {
            amVar = am.UNKNOWN_KEYMATERIAL;
        }
        if (amVar == null) {
            return am.UNRECOGNIZED;
        }
        return amVar;
    }

    public final String romeo() {
        return this.typeUrl_;
    }

    public final AbstractC1490h sierra() {
        return this.value_;
    }
}
