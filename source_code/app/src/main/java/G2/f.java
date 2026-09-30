package G2;

import A2.z;
import F2.i;
import J2.p;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends c {
    public static final String charlie;
    public final int bravo;

    static {
        String golf = z.golf("NetworkMeteredCtrlr");
        Intrinsics.delta(golf, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        charlie = golf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(H2.f tracker) {
        super(tracker);
        Intrinsics.echo(tracker, "tracker");
        this.bravo = 7;
    }

    @Override // G2.e
    public final boolean charlie(p workSpec) {
        Intrinsics.echo(workSpec, "workSpec");
        if (workSpec.juliet.alpha == 5) {
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
        if (i4 < 26) {
            z.echo().alpha(charlie, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z2) {
                return false;
            }
            return true;
        }
        if (z2 && value.charlie) {
            return false;
        }
        return true;
    }
}
