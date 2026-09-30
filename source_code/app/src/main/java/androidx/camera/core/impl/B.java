package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class B implements af {
    public static final E0.k purple;
    public static final B red;
    public final TreeMap alpha;

    static {
        E0.k kVar = new E0.k(5);
        purple = kVar;
        red = new B(new TreeMap(kVar));
    }

    public B(TreeMap treeMap) {
        this.alpha = treeMap;
    }

    public static B alpha(af afVar) {
        if (B.class.equals(afVar.getClass())) {
            return (B) afVar;
        }
        TreeMap treeMap = new TreeMap(purple);
        for (C0505c c0505c : afVar.romeo()) {
            Set<ae> beige = afVar.beige(c0505c);
            ArrayMap arrayMap = new ArrayMap();
            for (ae aeVar : beige) {
                arrayMap.put(aeVar, afVar.juliet(c0505c, aeVar));
            }
            treeMap.put(c0505c, arrayMap);
        }
        return new B(treeMap);
    }

    @Override // androidx.camera.core.impl.af
    public final Set beige(C0505c c0505c) {
        Map map = (Map) this.alpha.get(c0505c);
        if (map == null) {
            return Collections.EMPTY_SET;
        }
        return Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.af
    public final void charlie(A2.ao aoVar) {
        for (Map.Entry entry : this.alpha.tailMap(new C0505c("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (((C0505c) entry.getKey()).alpha.startsWith("camera2.captureRequest.option.")) {
                C0505c c0505c = (C0505c) entry.getKey();
                androidx.camera.core.r rVar = (androidx.camera.core.r) aoVar.purple;
                af afVar = (af) aoVar.red;
                rVar.bravo.foxtrot(c0505c, afVar.pink(c0505c), afVar.quebec(c0505c));
            } else {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.af
    public final boolean echo(C0505c c0505c) {
        return this.alpha.containsKey(c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public final Object juliet(C0505c c0505c, ae aeVar) {
        Map map = (Map) this.alpha.get(c0505c);
        if (map != null) {
            if (map.containsKey(aeVar)) {
                return map.get(aeVar);
            }
            throw new IllegalArgumentException("Option does not exist: " + c0505c + " with priority=" + aeVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public final ae pink(C0505c c0505c) {
        Map map = (Map) this.alpha.get(c0505c);
        if (map != null) {
            return (ae) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public final Object plum(C0505c c0505c, Object obj) {
        try {
            return quebec(c0505c);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.af
    public final Object quebec(C0505c c0505c) {
        Map map = (Map) this.alpha.get(c0505c);
        if (map != null) {
            return map.get((ae) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + c0505c);
    }

    @Override // androidx.camera.core.impl.af
    public final Set romeo() {
        return Collections.unmodifiableSet(this.alpha.keySet());
    }
}
