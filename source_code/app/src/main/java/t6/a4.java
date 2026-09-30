package t6;

import ae.AbstractC0422a;
import android.content.Context;
import android.os.Build;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vf.C3195B;

/* loaded from: classes2.dex */
public abstract class a4 {
    public static final void alpha(io.ktor.utils.io.t tVar, io.ktor.utils.io.m first, io.ktor.utils.io.m mVar) {
        Intrinsics.echo(tVar, "<this>");
        Intrinsics.echo(first, "first");
        vf.ad.zulu(C3195B.alpha, vf.ao.alpha, null, new zd.c(tVar, first, mVar, null), 2).crimson(new zd.b(first, mVar, 0));
    }

    public static Context bravo(Context context) {
        int golf;
        Context applicationContext = context.getApplicationContext();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34 && (golf = AbstractC0422a.golf(context)) != AbstractC0422a.golf(applicationContext)) {
            applicationContext = AbstractC0422a.alpha(golf, applicationContext);
        }
        if (i4 >= 30) {
            String charlie = bc.d.charlie(context);
            if (!Objects.equals(charlie, bc.d.charlie(applicationContext))) {
                return bc.d.alpha(applicationContext, charlie);
            }
        }
        return applicationContext;
    }

    public static final Pair charlie(io.ktor.utils.io.t tVar, vf.ab coroutineScope) {
        Intrinsics.echo(tVar, "<this>");
        Intrinsics.echo(coroutineScope, "coroutineScope");
        io.ktor.utils.io.m mVar = new io.ktor.utils.io.m(true);
        io.ktor.utils.io.m mVar2 = new io.ktor.utils.io.m(true);
        vf.ad.zulu(coroutineScope, null, null, new zd.f(tVar, mVar, mVar2, null), 3).crimson(new zd.b(mVar, mVar2, 1));
        return new Pair(mVar, mVar2);
    }
}
