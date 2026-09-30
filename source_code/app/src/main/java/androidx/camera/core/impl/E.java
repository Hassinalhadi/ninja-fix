package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class E {
    public final boolean alpha;
    public final Set bravo;
    public final Set charlie;

    public E(boolean z2, HashSet hashSet, HashSet hashSet2) {
        Set hashSet3;
        Set hashSet4;
        this.alpha = z2;
        if (hashSet == null) {
            hashSet3 = Collections.EMPTY_SET;
        } else {
            hashSet3 = new HashSet(hashSet);
        }
        this.bravo = hashSet3;
        if (hashSet2 == null) {
            hashSet4 = Collections.EMPTY_SET;
        } else {
            hashSet4 = new HashSet(hashSet2);
        }
        this.charlie = hashSet4;
    }

    public final boolean alpha(Class cls, boolean z2) {
        if (!this.bravo.contains(cls)) {
            if (!this.charlie.contains(cls) && this.alpha && z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        E e = (E) obj;
        if (this.alpha != e.alpha || !Objects.equals(this.bravo, e.bravo) || !Objects.equals(this.charlie, e.charlie)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.alpha), this.bravo, this.charlie);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.alpha + ", forceEnabledQuirks=" + this.bravo + ", forceDisabledQuirks=" + this.charlie + '}';
    }
}
