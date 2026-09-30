package b;

import f.C1676m;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0694i extends Pd.i implements Xd.l {
    public int alpha;
    public final /* synthetic */ InterfaceC1673j purple;
    public final /* synthetic */ C1676m red;
    public final /* synthetic */ ac silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0694i(InterfaceC1673j interfaceC1673j, C1676m c1676m, ac acVar, Nd.c cVar) {
        super(2, cVar);
        this.purple = interfaceC1673j;
        this.red = c1676m;
        this.silver = acVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0694i(this.purple, this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0694i) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (((f.C1674k) r7.purple).alpha(r2, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (vf.ad.november(r5, r7) == r0) goto L15;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        C1676m c1676m = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.alpha(obj);
                    this.silver.f3312g = c1676m;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            long j5 = ad.alpha;
            this.alpha = 1;
        }
        this.alpha = 2;
    }
}
