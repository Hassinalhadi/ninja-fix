package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class x {
    public static t alpha(long j5, Object obj) {
        int i4;
        t tVar = (t) D.charlie.hotel(j5, obj);
        if (!((AbstractC0595b) tVar).alpha) {
            aq aqVar = (aq) tVar;
            int i5 = aqVar.red;
            if (i5 == 0) {
                i4 = 10;
            } else {
                i4 = i5 * 2;
            }
            aq delta = aqVar.delta(i4);
            D.oscar(obj, j5, delta);
            return delta;
        }
        return tVar;
    }
}
