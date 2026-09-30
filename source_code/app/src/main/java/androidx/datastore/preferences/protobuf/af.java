package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class af {
    public static final ae alpha;
    public static final ae bravo;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.ae, java.lang.Object] */
    static {
        ap apVar = ap.charlie;
        ae aeVar = null;
        try {
            aeVar = (ae) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        alpha = aeVar;
        bravo = new Object();
    }
}
