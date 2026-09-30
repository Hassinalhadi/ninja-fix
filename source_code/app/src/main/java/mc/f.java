package mc;

import B9.U0;
import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends f0 {
    public final U0 alpha;

    public f(U0 u02) {
        super(u02.red);
        this.alpha = u02;
    }

    public static void alpha(U0 u02, int i4, int i5) {
        TextView tvAmount = u02.f243g;
        Intrinsics.delta(tvAmount, "tvAmount");
        Context context = tvAmount.getContext();
        Intrinsics.delta(context, "getContext(...)");
        tvAmount.setTextColor(context.getColor(i4));
        u02.f249m.setBackgroundResource(i4);
        TextView tvBadge = u02.f244h;
        Intrinsics.delta(tvBadge, "tvBadge");
        Context context2 = tvBadge.getContext();
        Intrinsics.delta(context2, "getContext(...)");
        tvBadge.setTextColor(context2.getColor(i4));
        tvBadge.setBackgroundResource(i5);
    }
}
