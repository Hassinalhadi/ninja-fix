package com.google.protobuf;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1507j {
    public static final C1506i alpha = new Object();
    public static final C1506i bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.i, java.lang.Object] */
    static {
        C1506i c1506i = null;
        try {
            c1506i = (C1506i) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        bravo = c1506i;
    }
}
