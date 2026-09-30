package R3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class d implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ View alpha;
    public final /* synthetic */ e purple;

    public d(e eVar, View view) {
        this.purple = eVar;
        this.alpha = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Y3.l.foxtrot().post(new com.google.common.util.concurrent.d(5, this, this, false));
    }
}
