package aw;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import s6.T7;

/* loaded from: classes3.dex */
public final class d implements c {
    public final DynamicRangeProfiles alpha;

    public d(Object obj) {
        this.alpha = (DynamicRangeProfiles) obj;
    }

    public static Set delta(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            androidx.camera.core.t tVar = (androidx.camera.core.t) b.alpha.get(l10);
            T7.foxtrot(tVar, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(tVar);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // aw.c
    public final DynamicRangeProfiles alpha() {
        return this.alpha;
    }

    @Override // aw.c
    public final Set bravo() {
        return delta(this.alpha.getSupportedProfiles());
    }

    @Override // aw.c
    public final Set charlie(androidx.camera.core.t tVar) {
        boolean z2;
        Long alpha = b.alpha(tVar, this.alpha);
        if (alpha != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.bravo("DynamicRange is not supported: " + tVar, z2);
        return delta(this.alpha.getProfileCaptureRequestConstraints(alpha.longValue()));
    }
}
