package b7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ q bravo;

    public /* synthetic */ p(q qVar, int i4) {
        this.alpha = i4;
        this.bravo = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 1:
                super.onAnimationEnd(animator);
                q qVar = this.bravo;
                q.alpha(qVar);
                ArrayList arrayList = qVar.yellow;
                if (arrayList != null && !qVar.f3357a) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((androidx.vectordrawable.graphics.drawable.c) it.next()).onAnimationEnd(qVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 0:
                super.onAnimationStart(animator);
                q qVar = this.bravo;
                ArrayList arrayList = qVar.yellow;
                if (arrayList != null && !qVar.f3357a) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((androidx.vectordrawable.graphics.drawable.c) it.next()).onAnimationStart(qVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
