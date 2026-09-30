package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import s1.InterfaceC2587u;
import s1.a0;

/* loaded from: classes2.dex */
public final class f implements InterfaceC2587u {
    public final /* synthetic */ l alpha;

    public f(l lVar) {
        this.alpha = lVar;
    }

    @Override // s1.InterfaceC2587u
    public final a0 gold(View view, a0 a0Var) {
        k kVar;
        FrameLayout frameLayout;
        k kVar2;
        BottomSheetBehavior bottomSheetBehavior;
        k kVar3;
        BottomSheetBehavior bottomSheetBehavior2;
        k kVar4;
        l lVar = this.alpha;
        kVar = lVar.edgeToEdgeCallback;
        if (kVar != null) {
            bottomSheetBehavior2 = lVar.behavior;
            kVar4 = lVar.edgeToEdgeCallback;
            bottomSheetBehavior2.f7867R.remove(kVar4);
        }
        frameLayout = lVar.bottomSheet;
        lVar.edgeToEdgeCallback = new k(frameLayout, a0Var);
        kVar2 = lVar.edgeToEdgeCallback;
        kVar2.echo(lVar.getWindow());
        bottomSheetBehavior = lVar.behavior;
        kVar3 = lVar.edgeToEdgeCallback;
        ArrayList arrayList = bottomSheetBehavior.f7867R;
        if (!arrayList.contains(kVar3)) {
            arrayList.add(kVar3);
        }
        return a0Var;
    }
}
