package Yb;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yb.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0305g extends Pd.i implements Xd.l {
    public final /* synthetic */ C0307h alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0305g(C0307h c0307h, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c0307h;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0305g(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0305g) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C0307h c0307h = this.alpha;
        File file = null;
        if (!c0307h.C) {
            File file2 = c0307h.A;
            if (file2 != null) {
                if (!Intrinsics.areEqual(file2, c0307h.f2422z)) {
                    file = file2;
                }
                if (file != null) {
                    file.delete();
                }
            }
            File file3 = c0307h.f2422z;
            if (file3 != null) {
                file3.delete();
            }
        } else {
            File file4 = c0307h.A;
            if (file4 != null) {
                if (!Intrinsics.areEqual(file4, c0307h.f2422z)) {
                    file = file4;
                }
                if (file != null) {
                    file.delete();
                }
            }
        }
        File file5 = c0307h.B;
        if (file5 != null) {
            file5.delete();
        }
        return Unit.INSTANCE;
    }
}
