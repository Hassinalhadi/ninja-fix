package ve;

import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3062u;

/* loaded from: classes2.dex */
public abstract class ad implements Ee.d {
    @Override // Ee.b
    public C3193e alpha(Ne.c fqName) {
        Object obj;
        Intrinsics.echo(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(AbstractC3192d.alpha(AbstractC3062u.bravo(AbstractC3062u.alpha(((C3193e) obj).alpha))).bravo(), fqName)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C3193e) obj;
    }

    public abstract Type bravo();

    public final boolean equals(Object obj) {
        if ((obj instanceof ad) && Intrinsics.areEqual(bravo(), ((ad) obj).bravo())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return bravo().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + bravo();
    }
}
