package yf;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* renamed from: yf.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3436f implements InterfaceC3440j {
    public final /* synthetic */ C3437g alpha;
    public final /* synthetic */ Ref.ObjectRef purple;
    public final /* synthetic */ InterfaceC3440j red;

    public C3436f(C3437g c3437g, Ref.ObjectRef objectRef, InterfaceC3440j interfaceC3440j) {
        this.alpha = c3437g;
        this.purple = objectRef;
        this.red = interfaceC3440j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        C3435e c3435e;
        int i4;
        if (cVar instanceof C3435e) {
            c3435e = (C3435e) cVar;
            int i5 = c3435e.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3435e.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c3435e.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c3435e.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    this.alpha.getClass();
                    Ref.ObjectRef objectRef = this.purple;
                    Object obj3 = objectRef.alpha;
                    if (obj3 != zf.b.bravo && Intrinsics.areEqual(obj3, obj)) {
                        return Unit.INSTANCE;
                    }
                    objectRef.alpha = obj;
                    c3435e.red = 1;
                    if (this.red.emit(obj, c3435e) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c3435e = new C3435e(this, cVar);
        Object obj22 = c3435e.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = c3435e.red;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }
}
