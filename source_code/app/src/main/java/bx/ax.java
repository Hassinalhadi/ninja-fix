package bx;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ax {
    public static final ay alpha = new ay(new M((B) null, (ac) null, (E) null, (LinkedHashMap) null, 63));

    public final ay alpha(ax axVar) {
        M m4 = ((ay) axVar).bravo;
        B b2 = m4.alpha;
        if (b2 == null) {
            b2 = ((ay) this).bravo.alpha;
        }
        M m5 = ((ay) this).bravo;
        ac acVar = m4.bravo;
        if (acVar == null) {
            acVar = m5.bravo;
        }
        E e = m4.charlie;
        if (e == null) {
            e = m5.charlie;
        }
        return new ay(new M(b2, acVar, e, kotlin.collections.y.uniform(m5.echo, m4.echo), 16));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ax) && Intrinsics.areEqual(((ay) ((ax) obj)).bravo, ((ay) this).bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((ay) this).bravo.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        if (Intrinsics.areEqual(this, alpha)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        M m4 = ((ay) this).bravo;
        B b2 = m4.alpha;
        String str3 = null;
        if (b2 != null) {
            str = b2.toString();
        } else {
            str = null;
        }
        sb2.append(str);
        sb2.append(",\nSlide - null,\nShrink - ");
        ac acVar = m4.bravo;
        if (acVar != null) {
            str2 = acVar.toString();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        sb2.append(",\nScale - ");
        E e = m4.charlie;
        if (e != null) {
            str3 = e.toString();
        }
        sb2.append(str3);
        return sb2.toString();
    }
}
