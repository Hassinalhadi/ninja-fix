package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class ae {
    public static ad alpha(Object obj, Object obj2) {
        ad adVar = (ad) obj;
        ad adVar2 = (ad) obj2;
        if (!adVar2.isEmpty()) {
            if (!adVar.alpha) {
                adVar = adVar.bravo();
            }
            adVar.alpha();
            if (!adVar2.isEmpty()) {
                adVar.putAll(adVar2);
            }
        }
        return adVar;
    }
}
