package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class ah {
    public static final ag alpha;
    public static final ag bravo;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.protobuf.ag, java.lang.Object] */
    static {
        ag agVar = null;
        try {
            agVar = (ag) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        alpha = agVar;
        bravo = new Object();
    }
}
