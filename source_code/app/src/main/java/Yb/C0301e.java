package Yb;

import android.content.Context;
import delivery.samurai.android.R;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.W4;

/* renamed from: Yb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0301e extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ C0307h purple;
    public final /* synthetic */ File red;
    public final /* synthetic */ Context silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301e(C0307h c0307h, File file, Context context, Nd.c cVar) {
        super(2, cVar);
        this.purple = c0307h;
        this.red = file;
        this.silver = context;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0301e(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0301e) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
    
        if (vf.ad.blue(r1, r5, r7) == r0) goto L52;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        H9.m mVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        File file = this.red;
        C0307h c0307h = this.purple;
        File file2 = null;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
            } else {
                ResultKt.alpha(obj);
                Cf.e eVar = vf.ao.alpha;
                Cf.d dVar = Cf.d.purple;
                C0299d c0299d = new C0299d(c0307h, file, null);
                this.alpha = 1;
                obj = vf.ad.blue(dVar, c0299d, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            mVar = (H9.m) obj;
        } catch (Exception unused) {
            file.getAbsolutePath();
            if (c0307h.isAdded() && Intrinsics.areEqual(c0307h.f2414F, file)) {
                String string = c0307h.getString(R.string.image_process_failed);
                Intrinsics.delta(string, "getString(...)");
                c0307h.black(string);
            } else {
                return Unit.INSTANCE;
            }
        }
        if (c0307h.isAdded() && Intrinsics.areEqual(c0307h.f2414F, file)) {
            if (!c0307h.isAdded()) {
                return Unit.INSTANCE;
            }
            if (mVar instanceof H9.l) {
                if (!c0307h.isAdded()) {
                    return Unit.INSTANCE;
                }
                File file3 = c0307h.f2422z;
                if (file3 != null && !Intrinsics.areEqual(file3, ((H9.l) mVar).alpha) && !c0307h.C) {
                    file2 = file3;
                }
                c0307h.B = file2;
                c0307h.f2422z = (File) ((H9.l) mVar).alpha;
                ((androidx.compose.runtime.t0) c0307h.f2419w).setValue((File) ((H9.l) mVar).alpha);
                c0307h.A = c0307h.f2421y;
                c0307h.f2421y = (File) ((H9.l) mVar).alpha;
            } else if (mVar instanceof H9.k) {
                if (!c0307h.isAdded()) {
                    return Unit.INSTANCE;
                }
                c0307h.A = c0307h.f2421y;
                c0307h.black(W4.alpha(this.silver, ((H9.k) mVar).alpha));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(c0307h.f2414F, file)) {
            vf.U u4 = vf.U.alpha;
            Cf.e eVar2 = vf.ao.alpha;
            Nd.h plus = u4.plus(Cf.d.purple);
            C0297c c0297c = new C0297c(c0307h, mVar, null);
            this.alpha = 2;
        }
        return Unit.INSTANCE;
    }
}
