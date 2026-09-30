package b;

import f.C1674k;
import f.C1675l;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1672i;
import f.InterfaceC1673j;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0690e extends Pd.i implements Xd.l {
    public boolean alpha;
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ d.N silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ InterfaceC1673j white;
    public final /* synthetic */ AbstractC0701p yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0690e(d.N n5, long j5, InterfaceC1673j interfaceC1673j, AbstractC0701p abstractC0701p, Nd.c cVar) {
        super(2, cVar);
        this.silver = n5;
        this.teal = j5;
        this.white = interfaceC1673j;
        this.yellow = abstractC0701p;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0690e c0690e = new C0690e(this.silver, this.teal, this.white, this.yellow, cVar);
        c0690e.red = obj;
        return c0690e;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C0690e) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        if (((f.C1674k) r10).alpha(r2, r17) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        if (((f.C1674k) r10).alpha(r3, r17) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.I zulu;
        Object golf;
        InterfaceC1672i c1675l;
        boolean z2;
        C1677n c1677n;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        AbstractC0701p abstractC0701p = this.yellow;
        InterfaceC1673j interfaceC1673j = this.white;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4 && i4 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.alpha(obj);
                        abstractC0701p.f3312g = null;
                        return Unit.INSTANCE;
                    }
                    c1677n = (C1677n) this.red;
                    ResultKt.alpha(obj);
                    this.red = null;
                    this.purple = 4;
                } else {
                    z2 = this.alpha;
                    ResultKt.alpha(obj);
                    if (z2) {
                        C1676m c1676m = new C1676m(this.teal);
                        C1677n c1677n2 = new C1677n(c1676m);
                        this.red = c1677n2;
                        this.purple = 3;
                        if (((C1674k) interfaceC1673j).alpha(c1676m, this) != aVar) {
                            c1677n = c1677n2;
                            this.red = null;
                            this.purple = 4;
                        }
                        return aVar;
                    }
                    abstractC0701p.f3312g = null;
                    return Unit.INSTANCE;
                }
            } else {
                zulu = (vf.I) this.red;
                ResultKt.alpha(obj);
                golf = obj;
            }
        } else {
            ResultKt.alpha(obj);
            zulu = vf.ad.zulu((vf.ab) this.red, null, null, new C0689d(this.yellow, this.teal, this.white, null), 3);
            this.red = zulu;
            this.purple = 1;
            golf = this.silver.golf(this);
        }
        boolean booleanValue = ((Boolean) golf).booleanValue();
        if (zulu.echo()) {
            this.red = null;
            this.alpha = booleanValue;
            this.purple = 2;
            if (vf.ad.lima(zulu, this) != aVar) {
                z2 = booleanValue;
                if (z2) {
                }
                abstractC0701p.f3312g = null;
                return Unit.INSTANCE;
            }
        } else {
            C1676m c1676m2 = abstractC0701p.f3312g;
            if (c1676m2 != null) {
                if (booleanValue) {
                    c1675l = new C1677n(c1676m2);
                } else {
                    c1675l = new C1675l(c1676m2);
                }
                this.red = null;
                this.purple = 5;
            }
            abstractC0701p.f3312g = null;
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
