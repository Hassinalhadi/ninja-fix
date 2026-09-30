package ae;

import android.os.Build;
import android.view.View;
import android.view.Window;
import g.C1718a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s1.b0;
import s1.d0;
import t6.AbstractC2997g3;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public final class r extends AbstractC2997g3 {
    @Override // t6.AbstractC2997g3
    public void charlie(@NotNull al statusBarStyle, @NotNull al navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z2, boolean z10) {
        int i4;
        t6.ab b0Var;
        Intrinsics.echo(statusBarStyle, "statusBarStyle");
        Intrinsics.echo(navigationBarStyle, "navigationBarStyle");
        Intrinsics.echo(window, "window");
        Intrinsics.echo(view, "view");
        AbstractC3087z.charlie(window, false);
        if (z2) {
            i4 = statusBarStyle.bravo;
        } else {
            i4 = statusBarStyle.alpha;
        }
        window.setStatusBarColor(i4);
        window.setNavigationBarColor(navigationBarStyle.bravo);
        C1718a c1718a = new C1718a(view);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            b0Var = new d0(window, c1718a);
        } else if (i5 >= 30) {
            b0Var = new d0(window, c1718a);
        } else if (i5 >= 26) {
            b0Var = new b0(window, c1718a);
        } else {
            b0Var = new b0(window, c1718a);
        }
        b0Var.echo(!z2);
    }
}
