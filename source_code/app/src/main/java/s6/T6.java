package s6;

import android.content.res.Configuration;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class T6 {
    public static o1.e alpha(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new o1.e(new o1.h(E2.d.delta(configuration)));
        }
        return o1.e.alpha(configuration.locale);
    }

    public static Pe.t bravo(Function1 changeOptions) {
        Intrinsics.echo(changeOptions, "changeOptions");
        Pe.z zVar = new Pe.z();
        changeOptions.invoke(zVar);
        zVar.alpha = true;
        return new Pe.t(zVar);
    }
}
