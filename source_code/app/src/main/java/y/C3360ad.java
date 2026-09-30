package y;

import com.google.android.gms.internal.measurement.C1290a1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import t6.AbstractC3047q3;

/* renamed from: y.ad, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3360ad extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ C1290a1 silver;
    public final /* synthetic */ B0.a teal;
    public final /* synthetic */ n.K white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3360ad(C1290a1 c1290a1, B0.a aVar, n.K k6, Nd.c cVar) {
        super(2, cVar);
        this.silver = c1290a1;
        this.teal = aVar;
        this.white = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3360ad c3360ad = new C3360ad(this.silver, this.teal, this.white, cVar);
        c3360ad.red = obj;
        return c3360ad;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3360ad) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (t6.AbstractC3047q3.bravo(r1, r9.silver, r9.teal, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (t6.AbstractC3047q3.charlie(r1, r9.white, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        if (r10 == r0) goto L32;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2 && i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                return Unit.INSTANCE;
            }
            afVar = (m0.af) this.red;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            afVar = (m0.af) this.red;
            this.red = afVar;
            this.purple = 1;
            obj = AbstractC3047q3.alpha(afVar, this);
        }
        m0.k kVar = (m0.k) obj;
        if (AbstractC3047q3.echo(kVar) && (kVar.delta & 33) != 0) {
            List list = kVar.alpha;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!((m0.r) list.get(i5)).bravo()) {
                }
            }
            this.red = null;
            this.purple = 2;
        }
        if (!AbstractC3047q3.echo(kVar)) {
            this.red = null;
            this.purple = 3;
        }
        return Unit.INSTANCE;
    }
}
