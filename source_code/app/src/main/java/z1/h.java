package z1;

import B9.C0044i;
import android.view.View;
import android.view.ViewStub;
import com.google.android.gms.internal.measurement.C1298c;

/* loaded from: classes3.dex */
public final class h implements ViewStub.OnInflateListener {
    public final /* synthetic */ C1298c alpha;

    public h(C1298c c1298c) {
        this.alpha = c1298c;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        C1298c c1298c = this.alpha;
        c1298c.red = view;
        ((C0044i) c1298c.silver).getClass();
        c1298c.purple = d.alpha.bravo(viewStub.getLayoutResource(), view);
        ((C0044i) c1298c.silver).lima();
        ((C0044i) c1298c.silver).foxtrot();
    }
}
