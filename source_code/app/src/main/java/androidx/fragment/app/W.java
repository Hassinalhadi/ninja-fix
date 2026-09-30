package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import x2.C3291l;

/* loaded from: classes3.dex */
public abstract class W {
    public static final b0 alpha = new Object();
    public static final d0 bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.b0, java.lang.Object] */
    static {
        d0 d0Var = null;
        try {
            d0Var = (d0) C3291l.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        bravo = d0Var;
    }

    public static final void alpha(int i4, ArrayList views) {
        Intrinsics.echo(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i4);
        }
    }
}
