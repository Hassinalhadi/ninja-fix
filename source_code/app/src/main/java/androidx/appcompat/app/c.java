package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes3.dex */
public final class c implements AdapterView.OnItemClickListener {
    public final /* synthetic */ f alpha;
    public final /* synthetic */ d purple;

    public c(d dVar, f fVar) {
        this.purple = dVar;
        this.alpha = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        d dVar = this.purple;
        DialogInterface.OnClickListener onClickListener = dVar.romeo;
        f fVar = this.alpha;
        onClickListener.onClick(fVar.bravo, i4);
        if (!dVar.tango) {
            fVar.bravo.dismiss();
        }
    }
}
