package Y1;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;
import pf.InterfaceC2358h;

/* loaded from: classes3.dex */
public abstract class y {
    public static String alpha(H0.a context, int i4) {
        Intrinsics.echo(context, "context");
        if (i4 <= 16777215) {
            return String.valueOf(i4);
        }
        try {
            Context context2 = context.purple;
            Intrinsics.checkNotNull(context2);
            String resourceName = context2.getResources().getResourceName(i4);
            Intrinsics.checkNotNull(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i4);
        }
    }

    public static InterfaceC2358h bravo(aa aaVar) {
        Intrinsics.echo(aaVar, "<this>");
        return AbstractC2360j.lima(aaVar, new X9.i(6));
    }
}
