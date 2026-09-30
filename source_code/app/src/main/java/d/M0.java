package d;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class M0 extends Pd.h implements Xd.l {
    public int purple;
    public /* synthetic */ Object red;
    public final /* synthetic */ m0.l silver;
    public final /* synthetic */ Ref.ObjectRef teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(m0.l lVar, Ref.ObjectRef objectRef, Nd.c cVar) {
        super(2, cVar);
        this.silver = lVar;
        this.teal = objectRef;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        M0 m02 = new M0(this.silver, this.teal, cVar);
        m02.red = obj;
        return m02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b5, code lost:
    
        r4.alpha = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r8 != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r8.charlie != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r4.alpha = d.av.alpha;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        r8 = r12.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r9 >= r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        r10 = (m0.r) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r10.bravo() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (m0.q.echo(r10, r2.white.f12964c, r2.foxtrot()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r9 = r9 + 1;
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        r4.alpha = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r7 = m0.l.red;
        r16.red = r2;
        r16.purple = 2;
        r7 = r2.charlie(r7, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r7 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009b -> B:6:0x009e). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        Object obj2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        at atVar = at.alpha;
        Ref.ObjectRef objectRef = this.teal;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    afVar = (m0.af) this.red;
                    ResultKt.alpha(obj);
                    Object charlie = obj;
                    List list = ((m0.k) charlie).alpha;
                    int size = list.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (((m0.r) list.get(i5)).bravo()) {
                            break;
                        }
                    }
                    this.red = afVar;
                    this.purple = 1;
                    obj2 = afVar.charlie(this.silver, this);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                afVar = (m0.af) this.red;
                ResultKt.alpha(obj);
                obj2 = obj;
                m0.k kVar = (m0.k) obj2;
                List list2 = kVar.alpha;
                int size2 = list2.size();
                int i10 = 0;
                while (true) {
                    List list3 = kVar.alpha;
                    if (i10 < size2) {
                        if (!m0.q.bravo((m0.r) list2.get(i10))) {
                            break;
                        }
                        i10++;
                    } else {
                        objectRef.alpha = new au((m0.r) list3.get(0));
                        break;
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.alpha(obj);
            afVar = (m0.af) this.red;
            this.red = afVar;
            this.purple = 1;
            obj2 = afVar.charlie(this.silver, this);
        }
    }
}
