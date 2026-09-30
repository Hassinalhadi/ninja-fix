package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class y {
    public static final x alpha;
    public static final x bravo;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.datastore.preferences.protobuf.x] */
    static {
        ap apVar = ap.charlie;
        x xVar = null;
        try {
            xVar = (x) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        alpha = xVar;
        bravo = new Object();
    }
}
