package ve;

import java.lang.annotation.Annotation;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import t6.H2;

/* loaded from: classes2.dex */
public final class af extends u implements Ee.b {
    public final ad alpha;
    public final Annotation[] bravo;
    public final String charlie;
    public final boolean delta;

    public af(ad adVar, Annotation[] reflectAnnotations, String str, boolean z2) {
        Intrinsics.echo(reflectAnnotations, "reflectAnnotations");
        this.alpha = adVar;
        this.bravo = reflectAnnotations;
        this.charlie = str;
        this.delta = z2;
    }

    @Override // Ee.b
    public final C3193e alpha(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        return H2.bravo(this.bravo, fqName);
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        return H2.charlie(this.bravo);
    }

    public final String toString() {
        String str;
        Ne.f fVar;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(af.class.getName());
        sb2.append(": ");
        if (this.delta) {
            str = "vararg ";
        } else {
            str = "";
        }
        sb2.append(str);
        String str2 = this.charlie;
        if (str2 != null) {
            fVar = Ne.f.delta(str2);
        } else {
            fVar = null;
        }
        sb2.append(fVar);
        sb2.append(": ");
        sb2.append(this.alpha);
        return sb2.toString();
    }
}
