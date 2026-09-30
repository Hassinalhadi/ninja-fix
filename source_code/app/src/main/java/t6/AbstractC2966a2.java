package t6;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import delivery.samurai.android.R;
import f1.AbstractC1681a;
import kotlin.jvm.internal.Intrinsics;
import pf.AbstractC2360j;

/* renamed from: t6.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2966a2 {
    public static final /* synthetic */ int alpha = 0;

    public static final Y1.r alpha(Activity activity) {
        View findViewById;
        Intrinsics.echo(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 28) {
            findViewById = AbstractC1681a.alpha(activity);
        } else {
            findViewById = activity.findViewById(R.id.nav_host_fragment);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        Intrinsics.delta(findViewById, "requireViewById(...)");
        Y1.r rVar = (Y1.r) AbstractC2360j.india(AbstractC2360j.papa(AbstractC2360j.lima(findViewById, new X9.i(8)), new X9.i(9)));
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on 2131362821");
    }
}
