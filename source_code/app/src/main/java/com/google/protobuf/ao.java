package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class ao {
    public static final an alpha;
    public static final an bravo;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.protobuf.an] */
    static {
        an anVar = null;
        try {
            anVar = (an) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        alpha = anVar;
        bravo = new Object();
    }
}
