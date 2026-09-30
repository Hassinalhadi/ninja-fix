package s6;

import a0.C0366t;
import android.content.Context;
import android.util.TypedValue;
import g0.C1725e;
import g0.C1726f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2710m0 {
    public static C1726f alpha;

    public static final C1726f alpha() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.ShoppingBag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(18.0f, 6.0f);
        bVar.golf(-2.0f);
        bVar.echo(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        bVar.kilo(8.0f, 3.79f, 8.0f, 6.0f);
        bVar.foxtrot(6.0f);
        bVar.delta(4.9f, 6.0f, 4.0f, 6.9f, 4.0f, 8.0f);
        bVar.november(12.0f);
        bVar.echo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bVar.golf(12.0f);
        bVar.echo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bVar.mike(8.0f);
        bVar.delta(20.0f, 6.9f, 19.1f, 6.0f, 18.0f, 6.0f);
        bVar.charlie();
        bVar.juliet(10.0f, 10.0f);
        bVar.echo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        bVar.lima(-1.0f, -0.45f, -1.0f, -1.0f);
        bVar.mike(8.0f);
        bVar.golf(2.0f);
        bVar.mike(10.0f);
        bVar.charlie();
        bVar.juliet(12.0f, 4.0f);
        bVar.echo(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        bVar.golf(-4.0f);
        bVar.delta(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f);
        bVar.charlie();
        bVar.juliet(16.0f, 10.0f);
        bVar.echo(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        bVar.lima(-1.0f, -0.45f, -1.0f, -1.0f);
        bVar.mike(8.0f);
        bVar.golf(2.0f);
        bVar.mike(10.0f);
        bVar.charlie();
        C1725e.delta(c1725e, bVar.alpha, 0, auVar);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static TypedValue bravo(int i4, Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean charlie(Context context, int i4, boolean z2) {
        TypedValue bravo = bravo(i4, context);
        if (bravo != null && bravo.type == 18) {
            if (bravo.data != 0) {
                return true;
            }
            return false;
        }
        return z2;
    }

    public static TypedValue delta(Context context, int i4, String str) {
        TypedValue bravo = bravo(i4, context);
        if (bravo != null) {
            return bravo;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }
}
