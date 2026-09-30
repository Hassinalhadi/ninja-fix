package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1834l;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class UZb extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Function1 f9714W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zZG f9715b;

    /* renamed from: f9, reason: collision with root package name */
    public final /* synthetic */ Function1 f9716f9;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZb(zZG zzg, Function1 function1, Function1 function12) {
        super(1);
        this.f9715b = zzg;
        this.f9714W = function1;
        this.f9716f9 = function12;
    }

    public final void b(Object obj) {
        zZG zzg = this.f9715b;
        zzg.f11925W.b(new C1834l(obj, zzg, this.f9714W, this.f9716f9));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, zZG zzg, Function1 function1, Function1 function12) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            BGx bGx = (BGx) obj;
            ZJ zj = zzg.PqK;
            if (zj == null || zj.f10037W.get() == 2) {
                return;
            }
            ZJ zj2 = zzg.f11924V;
            if (zj2 != null) {
                zj2.f10037W.compareAndSet(0, 3);
            }
            if (bGx == null) {
                ZJ zj3 = zzg.PqK;
                if (zj3 != null) {
                    zj3.f10037W.compareAndSet(0, 3);
                }
                j.quebec(Result.m206constructorimpl(zZG.b((BGx) null, 3)), function12);
                return;
            }
            if (bGx.gmP) {
                ZJ zj4 = zzg.PqK;
                if (zj4 != null) {
                    zj4.f10037W.compareAndSet(0, 3);
                }
                j.quebec(Result.m206constructorimpl(zZG.b(bGx, 2)), function12);
                return;
            }
            if (!zzg.olU) {
                ZJ zj5 = zzg.PqK;
                if (zj5 != null) {
                    zj5.f10037W.compareAndSet(0, 3);
                }
                j.quebec(Result.m206constructorimpl(zZG.b(bGx, 2)), function12);
                return;
            }
            zzg.f11923R = bGx;
            function1.invoke(zZG.b(bGx, 2));
            zzg.f11927f9.b(bGx, new ayg(zzg, function12));
            return;
        }
        ZJ zj6 = zzg.PqK;
        if (zj6 == null || !zj6.f10037W.compareAndSet(0, 3)) {
            return;
        }
        ZJ zj7 = zzg.f11924V;
        if (zj7 != null) {
            zj7.f10037W.compareAndSet(0, 3);
        }
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function12);
    }
}
