package b;

import d.O0;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class r extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ C0704t silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0704t c0704t, Nd.c cVar) {
        super(2, cVar);
        this.silver = c0704t;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        r rVar = new r(this.silver, cVar);
        rVar.red = obj;
        return rVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004b -> B:6:0x004e). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        C0704t c0704t = this.silver;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    afVar = (m0.af) this.red;
                    ResultKt.alpha(obj);
                    List list = ((m0.k) obj).alpha;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i5 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj3 = list.get(i10);
                        if (((m0.r) obj3).delta) {
                            arrayList.add(obj3);
                        }
                    }
                    int size2 = arrayList.size();
                    while (true) {
                        if (i5 < size2) {
                            obj2 = arrayList.get(i5);
                            if (m0.q.delta(((m0.r) obj2).alpha, c0704t.hotel)) {
                                break;
                            }
                            i5++;
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    m0.r rVar = (m0.r) obj2;
                    if (rVar == null) {
                        rVar = (m0.r) CollectionsKt.green(arrayList);
                    }
                    if (rVar != null) {
                        c0704t.hotel = rVar.alpha;
                        c0704t.bravo = rVar.charlie;
                    }
                    if (arrayList.isEmpty()) {
                        c0704t.hotel = -1L;
                        return Unit.INSTANCE;
                    }
                    this.red = afVar;
                    this.purple = 2;
                    obj = afVar.charlie(m0.l.purple, this);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                afVar = (m0.af) this.red;
                ResultKt.alpha(obj);
            }
        } else {
            ResultKt.alpha(obj);
            afVar = (m0.af) this.red;
            this.red = afVar;
            this.purple = 1;
            obj = O0.charlie(afVar, this, 2);
        }
        m0.r rVar2 = (m0.r) obj;
        c0704t.hotel = rVar2.alpha;
        c0704t.bravo = rVar2.charlie;
        this.red = afVar;
        this.purple = 2;
        obj = afVar.charlie(m0.l.purple, this);
    }
}
