package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Z implements Transition.TransitionListener {
    public final /* synthetic */ Object alpha;
    public final /* synthetic */ ArrayList bravo;
    public final /* synthetic */ Object charlie;
    public final /* synthetic */ ArrayList delta;
    public final /* synthetic */ b0 echo;

    public Z(b0 b0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.echo = b0Var;
        this.alpha = obj;
        this.bravo = arrayList;
        this.charlie = obj2;
        this.delta = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        b0 b0Var = this.echo;
        Object obj = this.alpha;
        if (obj != null) {
            b0Var.amber(obj, this.bravo, null);
        }
        Object obj2 = this.charlie;
        if (obj2 != null) {
            b0Var.amber(obj2, this.delta, null);
        }
    }
}
