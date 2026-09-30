package ae;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class af implements OnBackAnimationCallback {
    public final /* synthetic */ ad alpha;
    public final /* synthetic */ ad bravo;
    public final /* synthetic */ ae charlie;
    public final /* synthetic */ ae delta;

    public af(ad adVar, ad adVar2, ae aeVar, ae aeVar2) {
        this.alpha = adVar;
        this.bravo = adVar2;
        this.charlie = aeVar;
        this.delta = aeVar2;
    }

    public final void onBackCancelled() {
        this.delta.invoke();
    }

    public final void onBackInvoked() {
        this.charlie.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        this.bravo.invoke(new C0423b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        this.alpha.invoke(new C0423b(backEvent));
    }
}
