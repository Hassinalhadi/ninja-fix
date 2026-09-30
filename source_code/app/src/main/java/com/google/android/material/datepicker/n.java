package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ao;
import androidx.recyclerview.widget.b0;

/* loaded from: classes2.dex */
public final class n extends LinearLayoutManager {
    public final /* synthetic */ int blue;
    public final /* synthetic */ r bronze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, int i4, int i5) {
        super(i4, false);
        this.bronze = rVar;
        this.blue = i5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A(b0 b0Var, int[] iArr) {
        int i4 = this.blue;
        r rVar = this.bronze;
        if (i4 == 0) {
            iArr[0] = rVar.f7989c.getWidth();
            iArr[1] = rVar.f7989c.getWidth();
        } else {
            iArr[0] = rVar.f7989c.getHeight();
            iArr[1] = rVar.f7989c.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.L
    public final void x(RecyclerView recyclerView, int i4) {
        ao aoVar = new ao(recyclerView.getContext());
        aoVar.setTargetPosition(i4);
        y(aoVar);
    }
}
