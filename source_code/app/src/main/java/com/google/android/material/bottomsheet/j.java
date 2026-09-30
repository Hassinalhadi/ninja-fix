package com.google.android.material.bottomsheet;

import android.view.View;

/* loaded from: classes2.dex */
public final class j extends c {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ j(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    private final void delta(View view) {
    }

    private final void echo(View view) {
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void bravo(View view) {
        int i4 = this.alpha;
    }

    @Override // com.google.android.material.bottomsheet.c
    public final void charlie(int i4, View view) {
        switch (this.alpha) {
            case 0:
                if (i4 == 5) {
                    ((l) this.bravo).cancel();
                    return;
                }
                return;
            default:
                if (i4 == 5) {
                    ((m) this.bravo).sierra();
                    return;
                }
                return;
        }
    }
}
