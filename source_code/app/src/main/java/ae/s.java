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
public class s extends AbstractC2997g3 {
    @Override // t6.AbstractC2997g3
    public void charlie(@NotNull al statusBarStyle, @NotNull al navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z2, boolean z10) {
        int i4;
        int i5;
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
        if (z10) {
            i5 = navigationBarStyle.bravo;
        } else {
            i5 = navigationBarStyle.alpha;
        }
        window.setNavigationBarColor(i5);
        C1718a c1718a = new C1718a(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            b0Var = new d0(window, c1718a);
        } else if (i10 >= 30) {
            b0Var = new d0(window, c1718a);
        } else if (i10 >= 26) {
            b0Var = new b0(window, c1718a);
        } else {
            b0Var = new b0(window, c1718a);
        }
        b0Var.echo(!z2);
        b0Var.delta(!z10);
    }
}
