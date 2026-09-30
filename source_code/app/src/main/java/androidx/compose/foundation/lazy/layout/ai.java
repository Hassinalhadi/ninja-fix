package androidx.compose.foundation.lazy.layout;

import id.C1915c;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2788u7;

/* loaded from: classes3.dex */
public final class ai {
    public final Function1 alpha;
    public C3.d charlie;
    public int foxtrot;
    public final C1915c bravo = new C1915c(23);
    public int delta = -1;
    public int echo = -1;

    public ai(Function1 function1) {
        this.alpha = function1;
    }

    public final ag alpha(int i4, long j5, boolean z2, Function1 function1) {
        C3.d dVar = this.charlie;
        if (dVar != null) {
            aw awVar = (aw) dVar.silver;
            boolean z10 = awVar instanceof ViewOnAttachStateChangeListenerC0560a;
            au auVar = new au(dVar, i4, this.bravo, function1);
            auVar.delta = new Q0.a(j5);
            if (z10) {
                if (z2) {
                    ViewOnAttachStateChangeListenerC0560a viewOnAttachStateChangeListenerC0560a = (ViewOnAttachStateChangeListenerC0560a) awVar;
                    viewOnAttachStateChangeListenerC0560a.purple.add(new az(1, auVar));
                    if (!viewOnAttachStateChangeListenerC0560a.red) {
                        viewOnAttachStateChangeListenerC0560a.red = true;
                        viewOnAttachStateChangeListenerC0560a.alpha.post(viewOnAttachStateChangeListenerC0560a);
                    }
                } else {
                    ViewOnAttachStateChangeListenerC0560a viewOnAttachStateChangeListenerC0560a2 = (ViewOnAttachStateChangeListenerC0560a) awVar;
                    viewOnAttachStateChangeListenerC0560a2.purple.add(new az(0, auVar));
                    if (!viewOnAttachStateChangeListenerC0560a2.red) {
                        viewOnAttachStateChangeListenerC0560a2.red = true;
                        viewOnAttachStateChangeListenerC0560a2.alpha.post(viewOnAttachStateChangeListenerC0560a2);
                    }
                }
            } else {
                awVar.alpha(auVar);
            }
            AbstractC2788u7.alpha(i4, "compose:lazy:schedule_prefetch:index");
            return auVar;
        }
        return f.alpha;
    }
}
