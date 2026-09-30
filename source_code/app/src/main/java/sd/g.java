package sd;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import t6.j4;

/* loaded from: classes2.dex */
public final class g implements m {
    public static final g charlie = new Object();

    public final List alpha(String name) {
        Intrinsics.echo(name, "name");
        return null;
    }

    @Override // zd.p
    public final Set foxtrot() {
        return kotlin.collections.u.alpha;
    }

    @Override // zd.p
    public final String get(String str) {
        alpha(str);
        return null;
    }

    @Override // zd.p
    public final boolean golf() {
        return true;
    }

    @Override // zd.p
    public final void hotel(Xd.l lVar) {
        j4.bravo(this, (bz.af) lVar);
    }

    @Override // zd.p
    public final boolean india() {
        alpha("Content-Encoding");
        return false;
    }

    public final String toString() {
        return "Headers " + kotlin.collections.u.alpha;
    }
}
