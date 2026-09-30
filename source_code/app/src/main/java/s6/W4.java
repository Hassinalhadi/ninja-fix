package s6;

import android.content.Context;
import delivery.samurai.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class W4 {
    public static String alpha(Context context, H9.j jVar) {
        Intrinsics.echo(context, "context");
        boolean z2 = jVar instanceof H9.c;
        int i4 = R.string.image_file_corrupted;
        if (!z2 && !(jVar instanceof H9.d) && !(jVar instanceof H9.b)) {
            if (jVar instanceof H9.e) {
                i4 = R.string.image_optimization_failed;
            } else if (!(jVar instanceof H9.f) && !(jVar instanceof H9.g)) {
                if (jVar instanceof H9.h) {
                    i4 = R.string.storage_unavailable;
                } else if (jVar instanceof H9.a) {
                    i4 = R.string.image_compression_failed;
                } else if (jVar instanceof H9.i) {
                    i4 = R.string.image_total_size_too_large;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        String string = context.getString(i4);
        Intrinsics.delta(string, "getString(...)");
        return string;
    }

    public static ge.z bravo(ge.w type) {
        Intrinsics.echo(type, "type");
        return new ge.z(ge.aa.alpha, type);
    }
}
