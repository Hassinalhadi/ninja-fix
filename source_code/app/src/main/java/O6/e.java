package O6;

import android.view.View;
import androidx.camera.core.impl.ai;
import androidx.lifecycle.aa;
import androidx.lifecycle.an;
import av.r;
import bd.h;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g.C1718a;
import kotlin.jvm.internal.Intrinsics;
import y1.C3391d;

/* loaded from: classes2.dex */
public final class e implements Runnable {
    public final /* synthetic */ int alpha;
    public boolean purple;
    public final Object red;
    public final Object silver;

    public e(an registry, aa event) {
        this.alpha = 1;
        Intrinsics.echo(registry, "registry");
        Intrinsics.echo(event, "event");
        this.red = registry;
        this.silver = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1718a c1718a;
        switch (this.alpha) {
            case 0:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.silver;
                C3391d c3391d = swipeDismissBehavior.alpha;
                View view = (View) this.red;
                if (c3391d != null && c3391d.golf()) {
                    view.postOnAnimation(this);
                    return;
                } else {
                    if (this.purple && (c1718a = swipeDismissBehavior.purple) != null) {
                        c1718a.beige(view);
                        return;
                    }
                    return;
                }
            case 1:
                if (!this.purple) {
                    ((an) this.red).foxtrot((aa) this.silver);
                    this.purple = true;
                    return;
                }
                return;
            default:
                ((h) this.red).execute(new ai(4, this));
                return;
        }
    }

    public e(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.alpha = 0;
        this.silver = swipeDismissBehavior;
        this.red = view;
        this.purple = z2;
    }

    public e(r rVar, h hVar) {
        this.alpha = 2;
        this.silver = rVar;
        this.purple = false;
        this.red = hVar;
    }
}
