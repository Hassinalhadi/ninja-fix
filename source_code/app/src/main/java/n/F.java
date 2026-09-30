package n;

import d.O0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class F extends Pd.h implements Xd.l {
    public m0.r purple;
    public int red;
    public /* synthetic */ Object silver;
    public final /* synthetic */ K teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(K k6, Nd.c cVar) {
        super(2, cVar);
        this.teal = k6;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        F f5 = new F(this.teal, cVar);
        f5.silver = obj;
        return f5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((F) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:6:0x0051). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        m0.af afVar2;
        m0.r rVar;
        Od.a aVar = Od.a.alpha;
        int i4 = this.red;
        K k6 = this.teal;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    rVar = this.purple;
                    afVar2 = (m0.af) this.silver;
                    ResultKt.alpha(obj);
                    List list = ((m0.k) obj).alpha;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        m0.r rVar2 = (m0.r) list.get(i5);
                        if (m0.q.delta(rVar2.alpha, rVar.alpha) && rVar2.delta) {
                            this.silver = afVar2;
                            this.purple = rVar;
                            this.red = 2;
                            obj = afVar2.charlie(m0.l.purple, this);
                        }
                    }
                    k6.charlie();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afVar = (m0.af) this.silver;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            afVar = (m0.af) this.silver;
            this.silver = afVar;
            this.red = 1;
            obj = O0.charlie(afVar, this, 2);
        }
        m0.r rVar3 = (m0.r) obj;
        long j5 = rVar3.charlie;
        k6.delta();
        afVar2 = afVar;
        rVar = rVar3;
        this.silver = afVar2;
        this.purple = rVar;
        this.red = 2;
        obj = afVar2.charlie(m0.l.purple, this);
    }
}
