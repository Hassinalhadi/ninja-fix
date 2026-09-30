package x2;

import android.view.View;
import java.util.ArrayList;

/* renamed from: x2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3288i implements x {
    public final /* synthetic */ View alpha;
    public final /* synthetic */ ArrayList bravo;

    public C3288i(View view, ArrayList arrayList) {
        this.alpha = view;
        this.bravo = arrayList;
    }

    @Override // x2.x
    public final void onTransitionCancel(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar) {
        zVar.azure(this);
        this.alpha.setVisibility(8);
        ArrayList arrayList = this.bravo;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) arrayList.get(i4)).setVisibility(0);
        }
    }

    @Override // x2.x
    public final void onTransitionPause(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionResume(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar) {
        zVar.azure(this);
        zVar.alpha(this);
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar, boolean z2) {
        onTransitionStart(zVar);
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar, boolean z2) {
        onTransitionEnd(zVar);
    }
}
