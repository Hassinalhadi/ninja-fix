package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0452e0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C0452e0(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void alpha(AdapterView adapterView) {
    }

    private final void bravo(AdapterView adapterView) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j5) {
        Z z2;
        switch (this.alpha) {
            case 0:
                if (i4 != -1 && (z2 = ((C0466l0) this.purple).red) != null) {
                    z2.setListSelectionHidden(false);
                    return;
                }
                return;
            default:
                ((SearchView) this.purple).onItemSelected(i4);
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.alpha;
    }
}
