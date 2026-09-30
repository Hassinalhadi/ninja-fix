package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes2.dex */
public abstract class r {
    public static final q alpha = new Object();
    public static final q bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.q, java.lang.Object] */
    static {
        q qVar = null;
        try {
            qVar = (q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        bravo = qVar;
    }
}
