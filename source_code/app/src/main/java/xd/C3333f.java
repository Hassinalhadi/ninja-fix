package xd;

import androidx.datastore.preferences.protobuf.E;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import t6.AbstractC2981d2;
import t6.AbstractC3012j3;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* renamed from: xd.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3333f implements InterfaceC3440j {
    public final /* synthetic */ InterfaceC3440j alpha;
    public final /* synthetic */ sd.e purple;
    public final /* synthetic */ Charset red;
    public final /* synthetic */ Ed.a silver;
    public final /* synthetic */ Object teal;

    public C3333f(InterfaceC3440j interfaceC3440j, sd.e eVar, Charset charset, Ed.a aVar, Object obj) {
        this.alpha = interfaceC3440j;
        this.purple = eVar;
        this.red = charset;
        this.silver = aVar;
        this.teal = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r12.emit(r13, r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        C3332e c3332e;
        int i4;
        InterfaceC3440j interfaceC3440j;
        if (cVar instanceof C3332e) {
            c3332e = (C3332e) cVar;
            int i5 = c3332e.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3332e.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c3332e.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = c3332e.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj2);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3440j = c3332e.red;
                    ResultKt.alpha(obj2);
                } else {
                    ResultKt.alpha(obj2);
                    yd.j jVar = (yd.j) obj;
                    interfaceC3440j = this.alpha;
                    c3332e.red = interfaceC3440j;
                    c3332e.purple = 1;
                    jVar.getClass();
                    Charset charset = kotlin.text.a.alpha;
                    Charset charset2 = this.red;
                    if (Intrinsics.areEqual(charset2, charset)) {
                        Ed.a aVar2 = this.silver;
                        if (Intrinsics.areEqual(aVar2.alpha, u.alpha.bravo(InterfaceC3439i.class))) {
                            obj2 = new vd.a(new yd.h(jVar, this.teal, AbstractC3012j3.delta(jVar.alpha.bravo, E.alpha(aVar2)), charset2, null), AbstractC2981d2.charlie(this.purple, charset2));
                        }
                    }
                    obj2 = null;
                }
                c3332e.red = null;
                c3332e.purple = 2;
            }
        }
        c3332e = new C3332e(this, cVar);
        Object obj22 = c3332e.alpha;
        Od.a aVar3 = Od.a.alpha;
        i4 = c3332e.purple;
        if (i4 == 0) {
        }
        c3332e.red = null;
        c3332e.purple = 2;
    }
}
