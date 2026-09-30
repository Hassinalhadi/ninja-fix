package n9;

import android.content.Context;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2165b {
    public final int alpha;
    public float bravo;
    public float charlie;
    public boolean delta;
    public final u9.a echo;

    public C2165b(Context context, u9.a aVar) {
        this.echo = aVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.bravo(viewConfiguration, "ViewConfiguration.get(context)");
        this.alpha = viewConfiguration.getScaledTouchSlop();
    }
}
