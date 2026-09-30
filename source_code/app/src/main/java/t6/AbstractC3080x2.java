package t6;

import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t6.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3080x2 {
    public static final void alpha(androidx.fragment.app.L l10, d3.k kVar, DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w, String str) {
        if (l10.blue(str) != null) {
            return;
        }
        if (!l10.jade() && kVar.getLifecycle().bravo().compareTo(androidx.lifecycle.ab.silver) >= 0) {
            dialogInterfaceOnCancelListenerC0627w.romeo(l10, str);
        } else {
            vf.ad.zulu(androidx.lifecycle.T.foxtrot(kVar), null, null, new Yc.b(kVar, l10, str, dialogInterfaceOnCancelListenerC0627w, null), 3);
        }
    }

    public static final Class bravo(ClassLoader classLoader, String fqName) {
        Intrinsics.echo(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
