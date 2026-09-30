package d;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* renamed from: d.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1561y extends Pd.h implements Xd.l {
    public m0.k purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f12005s;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ kotlin.jvm.internal.q white;
    public final /* synthetic */ Ref.ObjectRef yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561y(kotlin.jvm.internal.q qVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Nd.c cVar) {
        super(2, cVar);
        this.white = qVar;
        this.yellow = objectRef;
        this.f12005s = objectRef2;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C1561y c1561y = new C1561y(this.white, this.yellow, this.f12005s, cVar);
        c1561y.teal = obj;
        return c1561y;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C1561y) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        r2 = r3 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7 A[EDGE_INSN: B:71:0x00d7->B:13:0x00d7 BREAK  A[LOOP:0: B:7:0x00c4->B:10:0x00d4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b8 -> B:6:0x00bb). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        int i4;
        Object obj2;
        m0.af afVar2;
        Object charlie;
        m0.af afVar3;
        m0.k kVar;
        int size;
        int i5;
        boolean delta;
        Object obj3;
        Object obj4;
        Od.a aVar = Od.a.alpha;
        int i10 = this.silver;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        m0.k kVar2 = null;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    i4 = this.red;
                    kVar = this.purple;
                    afVar3 = (m0.af) this.teal;
                    ResultKt.alpha(obj);
                    charlie = obj;
                    List list = ((m0.k) charlie).alpha;
                    size = list.size();
                    i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        if (((m0.r) list.get(i5)).bravo()) {
                            i4 = z2 ? 1 : 0;
                            break;
                        }
                        i5++;
                    }
                    Ref.ObjectRef objectRef = this.yellow;
                    delta = ab.delta(kVar, ((m0.r) objectRef.alpha).alpha);
                    Ref.ObjectRef objectRef2 = this.f12005s;
                    List list2 = kVar.alpha;
                    if (!delta) {
                        int size2 = list2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size2) {
                                obj4 = list2.get(i12);
                                if (((m0.r) obj4).delta) {
                                    break;
                                }
                                i12++;
                            } else {
                                obj4 = kVar2;
                                break;
                            }
                        }
                        m0.r rVar = (m0.r) obj4;
                        if (rVar != null) {
                            objectRef.alpha = rVar;
                            objectRef2.alpha = rVar;
                        } else {
                            i4 = z2 ? 1 : 0;
                            afVar = afVar3;
                            if (i4 != 0) {
                                m0.l lVar = m0.l.purple;
                                this.teal = afVar;
                                this.purple = kVar2;
                                this.red = i4;
                                this.silver = z2 ? 1 : 0;
                                obj2 = afVar.charlie(lVar, this);
                            } else {
                                return Unit.INSTANCE;
                            }
                        }
                    } else {
                        int size3 = list2.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size3) {
                                obj3 = list2.get(i13);
                                if (m0.q.delta(((m0.r) obj3).alpha, ((m0.r) objectRef.alpha).alpha)) {
                                    break;
                                }
                                i13++;
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        objectRef2.alpha = obj3;
                    }
                    afVar = afVar3;
                    z2 = true;
                    kVar2 = null;
                    i11 = 2;
                    if (i4 != 0) {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i4 = this.red;
                afVar = (m0.af) this.teal;
                ResultKt.alpha(obj);
                obj2 = obj;
                m0.k kVar3 = (m0.k) obj2;
                List list3 = kVar3.alpha;
                int size4 = list3.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size4) {
                        if (!m0.q.charlie((m0.r) list3.get(i14))) {
                            break;
                        }
                        i14++;
                    } else {
                        i4 = z2 ? 1 : 0;
                        break;
                    }
                }
                List list4 = kVar3.alpha;
                int size5 = list4.size();
                int i15 = 0;
                while (i15 < size5) {
                    m0.r rVar2 = (m0.r) list4.get(i15);
                    if (rVar2.bravo()) {
                        break;
                    }
                    afVar2 = afVar;
                    if (m0.q.echo(rVar2, afVar.white.f12964c, afVar2.foxtrot())) {
                        break;
                    }
                    i15++;
                    afVar = afVar2;
                }
                afVar2 = afVar;
                if (kVar3.charlie == i11) {
                    this.white.alpha = z2;
                    i4 = z2 ? 1 : 0;
                }
                m0.l lVar2 = m0.l.red;
                m0.af afVar4 = afVar2;
                this.teal = afVar4;
                this.purple = kVar3;
                this.red = i4;
                this.silver = i11;
                charlie = afVar4.charlie(lVar2, this);
                if (charlie != aVar) {
                    afVar3 = afVar4;
                    kVar = kVar3;
                    List list5 = ((m0.k) charlie).alpha;
                    size = list5.size();
                    i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                        }
                        i5++;
                    }
                    Ref.ObjectRef objectRef3 = this.yellow;
                    delta = ab.delta(kVar, ((m0.r) objectRef3.alpha).alpha);
                    Ref.ObjectRef objectRef22 = this.f12005s;
                    List list22 = kVar.alpha;
                    if (!delta) {
                    }
                    afVar = afVar3;
                    z2 = true;
                    kVar2 = null;
                    i11 = 2;
                    if (i4 != 0) {
                    }
                }
                return aVar;
            }
        } else {
            ResultKt.alpha(obj);
            afVar = (m0.af) this.teal;
            i4 = 0;
            if (i4 != 0) {
            }
        }
    }
}
