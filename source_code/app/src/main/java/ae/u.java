package ae;

import android.os.Build;
import android.view.View;
import android.view.Window;
import g.C1718a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s1.b0;
import s1.d0;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public class u extends t {
    @Override // ae.s, t6.AbstractC2997g3
    public void charlie(@NotNull al statusBarStyle, @NotNull al navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z2, boolean z10) {
        t6.ab b0Var;
        Intrinsics.echo(statusBarStyle, "statusBarStyle");
        Intrinsics.echo(navigationBarStyle, "navigationBarStyle");
        Intrinsics.echo(window, "window");
        Intrinsics.echo(view, "view");
        AbstractC3087z.charlie(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        C1718a c1718a = new C1718a(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            b0Var = new d0(window, c1718a);
        } else if (i4 >= 30) {
            b0Var = new d0(window, c1718a);
        } else if (i4 >= 26) {
            b0Var = new b0(window, c1718a);
        } else {
            b0Var = new b0(window, c1718a);
        }
        b0Var.echo(!z2);
        b0Var.delta(!z10);
    }
}
