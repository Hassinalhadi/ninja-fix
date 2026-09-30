package t0;

import android.view.View;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import td.C3117a;

/* loaded from: classes3.dex */
public final class N0 implements androidx.lifecycle.aj {
    public final /* synthetic */ C3117a alpha;
    public final /* synthetic */ androidx.compose.runtime.D purple;
    public final /* synthetic */ androidx.compose.runtime.Y red;
    public final /* synthetic */ Ref.ObjectRef silver;
    public final /* synthetic */ View teal;

    public N0(C3117a c3117a, androidx.compose.runtime.D d4, androidx.compose.runtime.Y y10, Ref.ObjectRef objectRef, View view) {
        this.alpha = c3117a;
        this.purple = d4;
        this.red = y10;
        this.silver = objectRef;
        this.teal = view;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        switch (K0.$EnumSwitchMapping$0[aaVar.ordinal()]) {
            case 1:
                vf.ad.zulu(this.alpha, null, vf.ac.silver, new M0(this.silver, this.red, alVar, this, this.teal, null), 1);
                return;
            case 2:
                androidx.compose.runtime.D d4 = this.purple;
                if (d4 != null) {
                    C3.d dVar = (C3.d) d4.red;
                    synchronized (dVar.red) {
                        try {
                            if (!dVar.india()) {
                                ArrayList arrayList = (ArrayList) dVar.purple;
                                dVar.purple = (ArrayList) dVar.silver;
                                dVar.silver = arrayList;
                                dVar.alpha = true;
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    Nd.c cVar = (Nd.c) arrayList.get(i4);
                                    Result.Companion companion = Result.INSTANCE;
                                    cVar.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.red.green();
                return;
            case 3:
                this.red.bronze();
                return;
            case 4:
                this.red.amber();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
