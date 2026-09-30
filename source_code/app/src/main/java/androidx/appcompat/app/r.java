package androidx.appcompat.app;

import android.view.Window;
import androidx.appcompat.widget.O;

/* loaded from: classes3.dex */
public final class r implements O, ao.w {
    public final /* synthetic */ ab alpha;

    public /* synthetic */ r(ab abVar) {
        this.alpha = abVar;
    }

    @Override // ao.w
    public void bravo(ao.l lVar, boolean z2) {
        this.alpha.quebec(lVar);
    }

    @Override // ao.w
    public boolean echo(ao.l lVar) {
        Window.Callback callback = this.alpha.e.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }
}
