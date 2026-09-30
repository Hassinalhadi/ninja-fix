package v;

import J.e;
import Pd.h;
import Xd.l;
import Y.aa;
import Y.ae;
import Y.p;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.O0;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import m0.af;
import m0.k;
import m0.q;
import m0.r;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3162a extends h implements l {
    public r purple;
    public m0.l red;
    public int silver;
    public /* synthetic */ Object teal;
    public final /* synthetic */ C3163b white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3162a(C3163b c3163b, Nd.c cVar) {
        super(2, cVar);
        this.white = c3163b;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C3162a c3162a = new C3162a(this.white, cVar);
        c3162a.teal = obj;
        return c3162a;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3162a) create((af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x00c3, code lost:
    
        if (r11 == r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0053, code lost:
    
        if (r9 == r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x026d, code lost:
    
        if (r4 != r1) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x026f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x00c3 -> B:29:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x026d -> B:7:0x0270). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        af afVar;
        Object bravo;
        r rVar;
        boolean z2;
        m0.l lVar;
        af afVar2;
        m0.l lVar2;
        Object charlie;
        C3163b c3163b;
        Object obj2;
        r rVar2;
        af afVar3;
        Object charlie2;
        Object obj3;
        Od.a aVar = Od.a.alpha;
        int i4 = this.silver;
        C3163b c3163b2 = this.white;
        int i5 = 2;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        rVar2 = this.purple;
                        afVar3 = (af) this.teal;
                        ResultKt.alpha(obj);
                        charlie2 = obj;
                        List list = ((k) charlie2).alpha;
                        int size = list.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                obj3 = list.get(i10);
                                r rVar3 = (r) obj3;
                                if (!rVar3.bravo()) {
                                    if (q.delta(rVar3.alpha, rVar2.alpha) && rVar3.delta) {
                                        break;
                                    }
                                }
                                i10++;
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        r rVar4 = (r) obj3;
                        if (rVar4 == null) {
                            return Unit.INSTANCE;
                        }
                        rVar4.alpha();
                        m0.l lVar3 = m0.l.alpha;
                        this.teal = afVar3;
                        this.purple = rVar2;
                        this.red = null;
                        this.silver = 3;
                        charlie2 = afVar3.charlie(lVar3, this);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    lVar2 = this.red;
                    rVar = this.purple;
                    afVar2 = (af) this.teal;
                    ResultKt.alpha(obj);
                    charlie = obj;
                    k kVar = (k) charlie;
                    List list2 = kVar.alpha;
                    int size2 = list2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            obj2 = list2.get(i11);
                            r rVar5 = (r) obj2;
                            c3163b = c3163b2;
                            if (!rVar5.bravo()) {
                                if (q.delta(rVar5.alpha, rVar.alpha) && rVar5.delta) {
                                    break;
                                }
                            }
                            i11++;
                            c3163b2 = c3163b;
                        } else {
                            c3163b = c3163b2;
                            obj2 = null;
                            break;
                        }
                    }
                    r rVar6 = (r) obj2;
                    if (rVar6 != null) {
                        if (rVar6.bravo - rVar.bravo < afVar2.golf().bravo() && kVar.charlie != 2) {
                            if (Z.b.charlie(Z.b.foxtrot(rVar6.charlie, rVar.charlie)) <= afVar2.golf().charlie()) {
                                i5 = 2;
                                c3163b2 = c3163b;
                                this.teal = afVar2;
                                this.purple = rVar;
                                this.red = lVar2;
                                this.silver = i5;
                                charlie = afVar2.charlie(lVar2, this);
                            }
                            if (rVar6 != null) {
                                return Unit.INSTANCE;
                            }
                            C3163b c3163b3 = c3163b;
                            if (!c3163b3.silver) {
                                T.r node = c3163b3.getNode();
                                e eVar = null;
                                while (true) {
                                    p pVar = p.silver;
                                    if (node != null) {
                                        if (node instanceof aa) {
                                            aa aaVar = (aa) node;
                                            if (aaVar.c().alpha) {
                                                aaVar.f(7);
                                            } else {
                                                ae.echo(aaVar, 7, pVar);
                                            }
                                        } else {
                                            if ((node.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (node instanceof AbstractC2556p)) {
                                                int i12 = 0;
                                                for (T.r rVar7 = ((AbstractC2556p) node).purple; rVar7 != null; rVar7 = rVar7.getChild$ui_release()) {
                                                    if ((rVar7.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                        i12++;
                                                        if (i12 == 1) {
                                                            node = rVar7;
                                                        } else {
                                                            if (eVar == null) {
                                                                eVar = new e(new T.r[16]);
                                                            }
                                                            if (node != null) {
                                                                eVar.bravo(node);
                                                                node = null;
                                                            }
                                                            eVar.bravo(rVar7);
                                                        }
                                                    }
                                                }
                                                if (i12 == 1) {
                                                }
                                            }
                                            node = AbstractC2555o.bravo(eVar);
                                        }
                                    } else {
                                        if (!c3163b3.getNode().isAttached()) {
                                            AbstractC2264a.bravo("visitChildren called on an unattached node");
                                        }
                                        e eVar2 = new e(new T.r[16]);
                                        T.r child$ui_release = c3163b3.getNode().getChild$ui_release();
                                        if (child$ui_release == null) {
                                            AbstractC2555o.alpha(eVar2, c3163b3.getNode());
                                        } else {
                                            eVar2.bravo(child$ui_release);
                                        }
                                        while (true) {
                                            int i13 = eVar2.red;
                                            if (i13 == 0) {
                                                break;
                                            }
                                            T.r rVar8 = (T.r) eVar2.mike(i13 - 1);
                                            if ((rVar8.getAggregateChildKindSet$ui_release() & Barcode.FORMAT_UPC_E) == 0) {
                                                AbstractC2555o.alpha(eVar2, rVar8);
                                            } else {
                                                while (true) {
                                                    if (rVar8 == null) {
                                                        break;
                                                    }
                                                    if ((rVar8.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                        e eVar3 = null;
                                                        while (rVar8 != null) {
                                                            if (rVar8 instanceof aa) {
                                                                aa aaVar2 = (aa) rVar8;
                                                                if (aaVar2.c().alpha) {
                                                                    aaVar2.f(7);
                                                                } else {
                                                                    ae.echo(aaVar2, 7, pVar);
                                                                }
                                                            } else {
                                                                if ((rVar8.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0 && (rVar8 instanceof AbstractC2556p)) {
                                                                    int i14 = 0;
                                                                    for (T.r rVar9 = ((AbstractC2556p) rVar8).purple; rVar9 != null; rVar9 = rVar9.getChild$ui_release()) {
                                                                        if ((rVar9.getKindSet$ui_release() & Barcode.FORMAT_UPC_E) != 0) {
                                                                            i14++;
                                                                            if (i14 == 1) {
                                                                                rVar8 = rVar9;
                                                                            } else {
                                                                                if (eVar3 == null) {
                                                                                    eVar3 = new e(new T.r[16]);
                                                                                }
                                                                                if (rVar8 != null) {
                                                                                    eVar3.bravo(rVar8);
                                                                                    rVar8 = null;
                                                                                }
                                                                                eVar3.bravo(rVar9);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i14 == 1) {
                                                                    }
                                                                }
                                                                rVar8 = AbstractC2555o.bravo(eVar3);
                                                            }
                                                        }
                                                    } else {
                                                        rVar8 = rVar8.getChild$ui_release();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            c3163b3.red.invoke();
                            rVar6.alpha();
                            rVar2 = rVar;
                            afVar3 = afVar2;
                            m0.l lVar32 = m0.l.alpha;
                            this.teal = afVar3;
                            this.purple = rVar2;
                            this.red = null;
                            this.silver = 3;
                            charlie2 = afVar3.charlie(lVar32, this);
                        }
                    }
                    rVar6 = null;
                    if (rVar6 != null) {
                    }
                }
            } else {
                afVar = (af) this.teal;
                ResultKt.alpha(obj);
                bravo = obj;
            }
        } else {
            ResultKt.alpha(obj);
            afVar = (af) this.teal;
            m0.l lVar4 = m0.l.alpha;
            this.teal = afVar;
            this.silver = 1;
            bravo = O0.bravo(afVar, true, lVar4, this);
        }
        rVar = (r) bravo;
        int i15 = rVar.india;
        if (i15 == 3 || i15 == 4) {
            long j5 = rVar.charlie;
            int i16 = (int) (j5 >> 32);
            if (Float.intBitsToFloat(i16) >= 0.0f && Float.intBitsToFloat(i16) < ((int) (afVar.white.f12964c >> 32))) {
                int i17 = (int) (j5 & 4294967295L);
                if (Float.intBitsToFloat(i17) >= 0.0f && Float.intBitsToFloat(i17) < ((int) (4294967295L & afVar.white.f12964c))) {
                    z2 = true;
                    if (c3163b2.silver && !z2) {
                        lVar = m0.l.purple;
                    } else {
                        lVar = m0.l.alpha;
                    }
                    m0.l lVar5 = lVar;
                    afVar2 = afVar;
                    lVar2 = lVar5;
                    this.teal = afVar2;
                    this.purple = rVar;
                    this.red = lVar2;
                    this.silver = i5;
                    charlie = afVar2.charlie(lVar2, this);
                }
            }
            z2 = false;
            if (c3163b2.silver) {
            }
            lVar = m0.l.alpha;
            m0.l lVar52 = lVar;
            afVar2 = afVar;
            lVar2 = lVar52;
            this.teal = afVar2;
            this.purple = rVar;
            this.red = lVar2;
            this.silver = i5;
            charlie = afVar2.charlie(lVar2, this);
        } else {
            return Unit.INSTANCE;
        }
    }
}
