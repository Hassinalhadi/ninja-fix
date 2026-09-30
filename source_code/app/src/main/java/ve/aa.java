package ve;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa extends u implements Ee.b {
    public final Ne.c alpha;

    public aa(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        this.alpha = fqName;
    }

    @Override // Ee.b
    public final C3193e alpha(Ne.c fqName) {
        Intrinsics.echo(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aa) {
            if (Intrinsics.areEqual(this.alpha, ((aa) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // Ee.b
    public final Collection getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return aa.class.getName() + ": " + this.alpha;
    }
}
