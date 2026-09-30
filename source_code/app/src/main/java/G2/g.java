package G2;

import A2.z;
import F2.i;
import J2.p;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends c {
    public static final String charlie;
    public final int bravo;

    static {
        String golf = z.golf("NetworkNotRoamingCtrlr");
        Intrinsics.delta(golf, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        charlie = golf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(H2.f tracker) {
        super(tracker);
        Intrinsics.echo(tracker, "tracker");
        this.bravo = 7;
    }

    @Override // G2.e
    public final boolean charlie(p workSpec) {
        Intrinsics.echo(workSpec, "workSpec");
        if (workSpec.juliet.alpha == 4) {
            return true;
        }
        return false;
    }

    @Override // G2.c
    public final int delta() {
        return this.bravo;
    }

    @Override // G2.c
    public final boolean echo(Object obj) {
        i value = (i) obj;
        Intrinsics.echo(value, "value");
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = value.alpha;
        if (i4 < 24) {
            z.echo().alpha(charlie, "Not-roaming network constraint is not supported before API 24, only checking for connected state.");
            if (z2) {
                return false;
            }
            return true;
        }
        if (z2 && value.delta) {
            return false;
        }
        return true;
    }
}
