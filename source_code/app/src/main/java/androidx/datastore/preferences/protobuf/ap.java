package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class ap {
    public static final ap charlie = new ap();
    public final ConcurrentHashMap bravo = new ConcurrentHashMap();
    public final aa alpha = new aa();

    public final as alpha(Class cls) {
        as xray;
        Class cls2;
        u.alpha(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.bravo;
        as asVar = (as) concurrentHashMap.get(cls);
        if (asVar == null) {
            aa aaVar = this.alpha;
            aaVar.getClass();
            Class cls3 = at.alpha;
            if (!s.class.isAssignableFrom(cls) && (cls2 = at.alpha) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            ar alpha = ((z) aaVar.alpha).alpha(cls);
            if ((alpha.delta & 2) == 2) {
                boolean isAssignableFrom = s.class.isAssignableFrom(cls);
                s sVar = alpha.alpha;
                if (isAssignableFrom) {
                    xray = new ak(at.charlie, m.alpha, sVar);
                } else {
                    aw awVar = at.bravo;
                    C0605l c0605l = m.bravo;
                    if (c0605l != null) {
                        xray = new ak(awVar, c0605l, sVar);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else if (s.class.isAssignableFrom(cls)) {
                C0605l c0605l2 = null;
                al alVar = am.bravo;
                x xVar = y.bravo;
                ay ayVar = at.charlie;
                if (av.q.mike(alpha.alpha()) != 1) {
                    c0605l2 = m.alpha;
                }
                C0605l c0605l3 = c0605l2;
                ae aeVar = af.bravo;
                int[] iArr = aj.november;
                if (alpha instanceof ar) {
                    xray = aj.xray(alpha, alVar, xVar, ayVar, c0605l3, aeVar);
                } else {
                    alpha.getClass();
                    throw new ClassCastException();
                }
            } else {
                C0605l c0605l4 = null;
                al alVar2 = am.alpha;
                x xVar2 = y.alpha;
                aw awVar2 = at.bravo;
                if (av.q.mike(alpha.alpha()) == 1 || (c0605l4 = m.bravo) != null) {
                    C0605l c0605l5 = c0605l4;
                    ae aeVar2 = af.alpha;
                    int[] iArr2 = aj.november;
                    if (alpha instanceof ar) {
                        xray = aj.xray(alpha, alVar2, xVar2, awVar2, c0605l5, aeVar2);
                    } else {
                        alpha.getClass();
                        throw new ClassCastException();
                    }
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            }
            as asVar2 = (as) concurrentHashMap.putIfAbsent(cls, xray);
            if (asVar2 != null) {
                return asVar2;
            }
            return xray;
        }
        return asVar;
    }
}
