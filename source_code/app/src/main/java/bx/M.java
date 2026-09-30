package bx;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class M {
    public final B alpha;
    public final ac bravo;
    public final E charlie;
    public final boolean delta;
    public final Map echo;

    public M(B b2, ac acVar, E e, boolean z2, Map map) {
        this.alpha = b2;
        this.bravo = acVar;
        this.charlie = e;
        this.delta = z2;
        this.echo = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m4 = (M) obj;
        if (Intrinsics.areEqual(this.alpha, m4.alpha) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.bravo, m4.bravo) && Intrinsics.areEqual(this.charlie, m4.charlie) && this.delta == m4.delta && Intrinsics.areEqual(this.echo, m4.echo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4;
        int i5 = 0;
        B b2 = this.alpha;
        if (b2 == null) {
            hashCode = 0;
        } else {
            hashCode = b2.hashCode();
        }
        int i10 = hashCode * 961;
        ac acVar = this.bravo;
        if (acVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = acVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        E e = this.charlie;
        if (e != null) {
            i5 = e.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.echo.hashCode() + ((i12 + i4) * 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.alpha + ", slide=null, changeSize=" + this.bravo + ", scale=" + this.charlie + ", hold=" + this.delta + ", effectsMap=" + this.echo + ')';
    }

    public /* synthetic */ M(B b2, ac acVar, E e, LinkedHashMap linkedHashMap, int i4) {
        this((i4 & 1) != 0 ? null : b2, (i4 & 4) != 0 ? null : acVar, (i4 & 8) != 0 ? null : e, (i4 & 16) == 0, (i4 & 32) != 0 ? kotlin.collections.t.alpha : linkedHashMap);
    }
}
