package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes3.dex */
public final class ar implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ar(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        switch (this.alpha) {
            case 0:
                at atVar = (at) this.purple;
                atVar.A.setSelection(i4);
                av avVar = atVar.A;
                if (avVar.getOnItemClickListener() != null) {
                    avVar.performItemClick(view, i4, atVar.f2867x.getItemId(i4));
                }
                atVar.dismiss();
                return;
            default:
                ((SearchView) this.purple).onItemClicked(i4, 0, null);
                return;
        }
    }
}
