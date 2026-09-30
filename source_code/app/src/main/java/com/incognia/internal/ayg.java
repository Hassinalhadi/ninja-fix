package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1827e;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class ayg extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Function1 f10130W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zZG f10131b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayg(zZG zzg, Function1 function1) {
        super(1);
        this.f10131b = zzg;
        this.f10130W = function1;
    }

    public final void b(Object obj) {
        zZG zzg = this.f10131b;
        zzg.f11925W.b(new C1827e(obj, (Object) zzg, this.f10130W, 6));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, zZG zzg, Function1 function1) {
        WT wt;
        if (Result.m207exceptionOrNullimpl(obj) == null) {
            NnB nnB = (NnB) obj;
            ZJ zj = zzg.PqK;
            if (zj == null || !zj.f10037W.compareAndSet(0, 3)) {
                return;
            }
            BGx bGx = zzg.f11923R;
            if (bGx != null) {
                wt = new WT(zZG.DOu, new jW(bGx, nnB));
            } else {
                wt = new WT(zZG.DOu, null);
            }
            j.quebec(Result.m206constructorimpl(wt), function1);
            return;
        }
        ZJ zj2 = zzg.PqK;
        if (zj2 == null || !zj2.f10037W.compareAndSet(0, 3)) {
            return;
        }
        j.quebec(Result.m206constructorimpl(zZG.b(zzg.f11923R, 2)), function1);
    }
}
