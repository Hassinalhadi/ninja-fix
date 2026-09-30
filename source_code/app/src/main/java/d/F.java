package d;

import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class F extends Pd.i implements Xd.l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ J red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j5, Nd.c cVar) {
        super(2, cVar);
        this.red = j5;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        F f5 = new F(this.red, cVar);
        f5.purple = obj;
        return f5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (d.J.alpha(r2, r3, r4, r5, r6, r12) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:9:0x0032, B:11:0x003c, B:17:0x004c, B:25:0x0027), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006a -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.ab abVar;
        vf.ab abVar2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        J j5 = this.red;
        try {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        abVar2 = (vf.ab) this.purple;
                        ResultKt.alpha(obj);
                        abVar = abVar2;
                        if (!vf.ad.whiskey(abVar.charlie())) {
                            xf.e eVar = j5.echo;
                            this.purple = abVar;
                            this.alpha = 1;
                            Object india = eVar.india(this);
                            if (india != aVar) {
                                abVar2 = abVar;
                                obj = india;
                                ay ayVar = (ay) obj;
                                float lavender = j5.delta.lavender(ax.alpha);
                                float lavender2 = j5.delta.lavender(ax.bravo);
                                C1548o0 c1548o0 = j5.alpha;
                                this.purple = abVar2;
                                this.alpha = 2;
                            } else {
                                return aVar;
                            }
                        } else {
                            j5.golf = null;
                            return Unit.INSTANCE;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    abVar2 = (vf.ab) this.purple;
                    ResultKt.alpha(obj);
                    ay ayVar2 = (ay) obj;
                    float lavender3 = j5.delta.lavender(ax.alpha);
                    float lavender22 = j5.delta.lavender(ax.bravo);
                    C1548o0 c1548o02 = j5.alpha;
                    this.purple = abVar2;
                    this.alpha = 2;
                }
            } else {
                ResultKt.alpha(obj);
                abVar = (vf.ab) this.purple;
                if (!vf.ad.whiskey(abVar.charlie())) {
                }
            }
        } catch (Throwable th) {
            j5.golf = null;
            throw th;
        }
    }
}
