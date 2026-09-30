package Kb;

import B9.AbstractC0064s0;
import android.view.View;
import androidx.recyclerview.widget.f0;

/* loaded from: classes2.dex */
public final class l extends f0 {
    public final AbstractC0064s0 alpha;
    public final m bravo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(m mVar, AbstractC0064s0 abstractC0064s0, m mVar2) {
        super(r0);
        View view = abstractC0064s0.red;
        this.alpha = abstractC0064s0;
        this.bravo = mVar2;
        view.setOnClickListener(new k(0, this, mVar));
    }
}
