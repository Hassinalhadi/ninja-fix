package bx;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class az {
    public static final A alpha = new A(new M((B) null, (ac) null, (E) null, (LinkedHashMap) null, 63));
    public static final A bravo = new A(new M((B) null, (ac) null, (E) null, (LinkedHashMap) null, 47));

    public final A alpha(az azVar) {
        boolean z2;
        M m4 = ((A) azVar).charlie;
        B b2 = m4.alpha;
        if (b2 == null) {
            b2 = ((A) this).charlie.alpha;
        }
        M m5 = ((A) this).charlie;
        ac acVar = m4.bravo;
        if (acVar == null) {
            acVar = m5.bravo;
        }
        E e = m4.charlie;
        if (e == null) {
            e = m5.charlie;
        }
        if (!m4.delta && !m5.delta) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new A(new M(b2, acVar, e, z2, kotlin.collections.y.uniform(m5.echo, m4.echo)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof az) && Intrinsics.areEqual(((A) ((az) obj)).charlie, ((A) this).charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((A) this).charlie.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        if (Intrinsics.areEqual(this, alpha)) {
            return "ExitTransition.None";
        }
        if (Intrinsics.areEqual(this, bravo)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        M m4 = ((A) this).charlie;
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(m4.delta);
        return sb2.toString();
    }
}
