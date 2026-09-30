package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public abstract class am {
    public static final al alpha;
    public static final al bravo;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.al] */
    static {
        al alVar = null;
        try {
            alVar = (al) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        alpha = alVar;
        bravo = new Object();
    }
}
