package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;

/* loaded from: classes3.dex */
public final class C implements androidx.lifecycle.aj {
    public final /* synthetic */ Wb.a alpha;
    public final /* synthetic */ androidx.lifecycle.ac purple;
    public final /* synthetic */ L red;

    public C(L l10, Wb.a aVar, androidx.lifecycle.ac acVar) {
        this.red = l10;
        this.alpha = aVar;
        this.purple = acVar;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        androidx.lifecycle.aa aaVar2 = androidx.lifecycle.aa.ON_START;
        L l10 = this.red;
        if (aaVar == aaVar2) {
            Map map = l10.mike;
            Bundle bundle = (Bundle) map.get("annotateResult");
            if (bundle != null) {
                this.alpha.alpha(bundle);
                map.remove("annotateResult");
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Clearing fragment result with key annotateResult");
                }
            }
        }
        if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
            this.purple.charlie(this);
            l10.november.remove("annotateResult");
        }
    }
}
