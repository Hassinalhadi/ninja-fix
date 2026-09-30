package s1;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class az {
    public final WeakReference alpha;

    public az(View view) {
        this.alpha = new WeakReference(view);
    }

    public final void alpha(float f5) {
        View view = (View) this.alpha.get();
        if (view != null) {
            view.animate().alpha(f5);
        }
    }

    public final void bravo() {
        View view = (View) this.alpha.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void charlie(long j5) {
        View view = (View) this.alpha.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
    }

    public final void delta(InterfaceC2566A interfaceC2566A) {
        View view = (View) this.alpha.get();
        if (view != null) {
            if (interfaceC2566A != null) {
                view.animate().setListener(new com.google.android.material.navigation.a(view, 1, interfaceC2566A));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void echo(float f5) {
        View view = (View) this.alpha.get();
        if (view != null) {
            view.animate().translationY(f5);
        }
    }
}
