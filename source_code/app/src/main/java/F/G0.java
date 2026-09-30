package F;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import bz.C0778c;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class G0 implements OnBackAnimationCallback {
    public final /* synthetic */ vf.ab alpha;
    public final /* synthetic */ C0778c bravo;
    public final /* synthetic */ Function0 charlie;

    public G0(Function0 function0, C0778c c0778c, vf.ab abVar) {
        this.alpha = abVar;
        this.bravo = c0778c;
        this.charlie = function0;
    }

    public final void onBackCancelled() {
        vf.ad.zulu(this.alpha, null, null, new D0(this.bravo, null), 3);
    }

    public final void onBackInvoked() {
        this.charlie.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        vf.ad.zulu(this.alpha, null, null, new E0(this.bravo, backEvent, null), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        vf.ad.zulu(this.alpha, null, null, new F0(this.bravo, backEvent, null), 3);
    }
}
