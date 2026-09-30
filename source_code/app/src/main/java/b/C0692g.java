package b;

import f.C1676m;
import f.C1677n;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0692g extends Pd.i implements Xd.l {
    public C1677n alpha;
    public int purple;
    public final /* synthetic */ ac red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ InterfaceC1673j teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0692g(ac acVar, long j5, InterfaceC1673j interfaceC1673j, Nd.c cVar) {
        super(2, cVar);
        this.red = acVar;
        this.silver = j5;
        this.teal = interfaceC1673j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0692g(this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0692g) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (((f.C1674k) r2).alpha(r1, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (((f.C1674k) r2).alpha(r8, r7) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        if (vf.ad.lima(r8, r7) == r0) goto L22;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1677n c1677n;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        InterfaceC1673j interfaceC1673j = this.teal;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        ResultKt.alpha(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1677n = this.alpha;
                ResultKt.alpha(obj);
                this.alpha = null;
                this.purple = 3;
            } else {
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            vf.Y y10 = this.red.f3318m;
            if (y10 != null) {
                this.purple = 1;
            }
        }
        C1676m c1676m = new C1676m(this.silver);
        c1677n = new C1677n(c1676m);
        this.alpha = c1677n;
        this.purple = 2;
    }
}
