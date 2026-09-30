package d;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2683j0;

/* loaded from: classes3.dex */
public final class as extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ Nd.h silver;
    public final /* synthetic */ Pd.h teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public as(Nd.h hVar, Xd.l lVar, Nd.c cVar) {
        super(2, cVar);
        this.silver = hVar;
        this.teal = (Pd.h) lVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.l, Pd.h] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        as asVar = new as(this.silver, this.teal, cVar);
        asVar.red = obj;
        return asVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((as) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [m0.af, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Xd.l, Pd.h] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0070 -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        m0.af afVar2;
        Od.a aVar = Od.a.alpha;
        m0.af afVar3 = this.purple;
        Nd.h hVar = this.silver;
        try {
        } catch (CancellationException e) {
            e = e;
            if (!vf.ad.whiskey(hVar)) {
            }
        }
        if (afVar3 != 0) {
            if (afVar3 != 1) {
                if (afVar3 != 2) {
                    if (afVar3 == 3) {
                        m0.af afVar4 = (m0.af) this.red;
                        ResultKt.alpha(obj);
                        afVar2 = afVar4;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.af afVar5 = (m0.af) this.red;
                    ResultKt.alpha(obj);
                    afVar2 = afVar5;
                }
                afVar = afVar2;
                if (!vf.ad.whiskey(hVar)) {
                    try {
                    } catch (CancellationException e4) {
                        afVar3 = afVar;
                        e = e4;
                        if (!vf.ad.whiskey(hVar)) {
                            this.red = afVar3;
                            this.purple = 3;
                            Object alpha = AbstractC2683j0.alpha(afVar3, m0.l.red, this);
                            afVar2 = afVar3;
                        } else {
                            throw e;
                        }
                    }
                    ?? r12 = this.teal;
                    this.red = afVar;
                    this.purple = 1;
                    if (r12.invoke(afVar, this) != aVar) {
                        afVar3 = afVar;
                        this.red = afVar3;
                        this.purple = 2;
                        Object alpha2 = AbstractC2683j0.alpha(afVar3, m0.l.red, this);
                        afVar2 = afVar3;
                    }
                    return aVar;
                }
                return Unit.INSTANCE;
            }
            m0.af afVar6 = (m0.af) this.red;
            ResultKt.alpha(obj);
            afVar3 = afVar6;
            this.red = afVar3;
            this.purple = 2;
            Object alpha22 = AbstractC2683j0.alpha(afVar3, m0.l.red, this);
            afVar2 = afVar3;
        } else {
            ResultKt.alpha(obj);
            afVar = (m0.af) this.red;
            if (!vf.ad.whiskey(hVar)) {
            }
        }
    }
}
