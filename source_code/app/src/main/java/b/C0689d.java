package b;

import f.C1674k;
import f.C1676m;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0689d extends Pd.i implements Xd.l {
    public C1676m alpha;
    public int purple;
    public final /* synthetic */ AbstractC0701p red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ InterfaceC1673j teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0689d(AbstractC0701p abstractC0701p, long j5, InterfaceC1673j interfaceC1673j, Nd.c cVar) {
        super(2, cVar);
        this.red = abstractC0701p;
        this.silver = j5;
        this.teal = interfaceC1673j;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C0689d(this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0689d) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (vf.ad.november(r5, r7) == r0) goto L17;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1676m c1676m;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        AbstractC0701p abstractC0701p = this.red;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    c1676m = this.alpha;
                    ResultKt.alpha(obj);
                    abstractC0701p.f3312g = c1676m;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            if (abstractC0701p.g()) {
                long j5 = ad.alpha;
                this.purple = 1;
            }
        }
        C1676m c1676m2 = new C1676m(this.silver);
        this.alpha = c1676m2;
        this.purple = 2;
        if (((C1674k) this.teal).alpha(c1676m2, this) != aVar) {
            c1676m = c1676m2;
            abstractC0701p.f3312g = c1676m;
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
