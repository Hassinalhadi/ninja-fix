package E;

import F.L2;
import J8.ag;
import J8.ak;
import J8.v;
import a0.C0366t;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import bv.ah;
import bz.C0778c;
import f.C1667d;
import f.C1668e;
import f.C1670g;
import f.C1671h;
import f.C1675l;
import f.C1676m;
import f.C1677n;
import f.InterfaceC1672i;
import f.InterfaceC1678o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n.ay;
import n3.EnumC2159b;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import vf.ab;
import vf.ad;
import y.aj;
import yf.EnumC3430C;
import yf.G;
import yf.InterfaceC3440j;

/* loaded from: classes3.dex */
public final class e implements InterfaceC3440j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ e(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.red = obj;
        this.purple = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bravo(int i4, Nd.c cVar) {
        G g2;
        int i5;
        if (cVar instanceof G) {
            g2 = (G) cVar;
            int i10 = g2.red;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                g2.red = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = g2.alpha;
                Od.a aVar = Od.a.alpha;
                i5 = g2.red;
                if (i5 == 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (i4 > 0) {
                        kotlin.jvm.internal.q qVar = (kotlin.jvm.internal.q) this.red;
                        if (!qVar.alpha) {
                            qVar.alpha = true;
                            EnumC3430C enumC3430C = EnumC3430C.alpha;
                            g2.red = 1;
                            if (((InterfaceC3440j) this.purple).emit(enumC3430C, g2) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        g2 = new G(this, cVar);
        Object obj2 = g2.alpha;
        Od.a aVar2 = Od.a.alpha;
        i5 = g2.red;
        if (i5 == 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018a  */
    @Override // yf.InterfaceC3440j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Nd.c cVar) {
        ag agVar;
        int i4;
        List<Object> emptyList;
        switch (this.alpha) {
            case 0:
                InterfaceC1672i interfaceC1672i = (InterfaceC1672i) obj;
                boolean z2 = interfaceC1672i instanceof C1676m;
                a aVar = (a) this.red;
                if (z2) {
                    C1676m c1676m = (C1676m) interfaceC1672i;
                    i iVar = aVar.f964a;
                    if (iVar != null) {
                        Intrinsics.checkNotNull(iVar);
                    } else {
                        iVar = p.alpha(aVar.yellow);
                        aVar.f964a = iVar;
                        Intrinsics.checkNotNull(iVar);
                    }
                    k alpha = iVar.alpha(aVar);
                    alpha.bravo(c1676m, aVar.red, aVar.f967d, aVar.e, ((C0366t) aVar.teal.getValue()).alpha, ((g) aVar.white.getValue()).delta, aVar.f968f);
                    ((t0) aVar.f965b).setValue(alpha);
                } else if (interfaceC1672i instanceof C1677n) {
                    C1676m c1676m2 = ((C1677n) interfaceC1672i).alpha;
                    k kVar = (k) ((t0) aVar.f965b).getValue();
                    if (kVar != null) {
                        kVar.delta();
                    }
                } else if (interfaceC1672i instanceof C1675l) {
                    C1676m c1676m3 = ((C1675l) interfaceC1672i).alpha;
                    k kVar2 = (k) ((t0) aVar.f965b).getValue();
                    if (kVar2 != null) {
                        kVar2.delta();
                    }
                } else {
                    aVar.purple.bravo(interfaceC1672i, (ab) this.purple);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC1672i interfaceC1672i2 = (InterfaceC1672i) obj;
                boolean z10 = interfaceC1672i2 instanceof InterfaceC1678o;
                b bVar = (b) this.red;
                if (z10) {
                    if (bVar.f970b) {
                        bVar.b((InterfaceC1678o) interfaceC1672i2);
                    } else {
                        bVar.f971c.golf(interfaceC1672i2);
                    }
                } else {
                    s sVar = bVar.white;
                    if (sVar == null) {
                        sVar = new s(bVar.teal, bVar.purple);
                        AbstractC2557q.india(bVar);
                        bVar.white = sVar;
                    }
                    sVar.bravo(interfaceC1672i2, (ab) this.purple);
                }
                return Unit.INSTANCE;
            case 2:
                InterfaceC1672i interfaceC1672i3 = (InterfaceC1672i) obj;
                boolean z11 = interfaceC1672i3 instanceof C1676m;
                kotlin.jvm.internal.s sVar2 = (kotlin.jvm.internal.s) this.red;
                boolean z12 = true;
                if (z11) {
                    sVar2.alpha++;
                } else if (interfaceC1672i3 instanceof C1677n) {
                    sVar2.alpha--;
                } else if (interfaceC1672i3 instanceof C1675l) {
                    sVar2.alpha--;
                }
                if (sVar2.alpha <= 0) {
                    z12 = false;
                }
                L2 l22 = (L2) this.purple;
                if (l22.red != z12) {
                    l22.red = z12;
                    AbstractC2555o.golf(l22).blue();
                }
                return Unit.INSTANCE;
            case 3:
                ((F2.j) this.red).echo((J2.p) this.purple, (F2.c) obj);
                return Unit.INSTANCE;
            case 4:
                if (cVar instanceof ag) {
                    agVar = (ag) cVar;
                    int i5 = agVar.purple;
                    if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        agVar.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                        Object obj2 = agVar.alpha;
                        Od.a aVar2 = Od.a.alpha;
                        i4 = agVar.purple;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                ResultKt.alpha(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.alpha(obj2);
                            ((ak) this.purple).getClass();
                            v vVar = new v((String) ((G1.b) obj).charlie(J8.t.charlie));
                            agVar.purple = 1;
                            if (((InterfaceC3440j) this.red).emit(vVar, agVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                agVar = new ag(this, cVar);
                Object obj22 = agVar.alpha;
                Od.a aVar22 = Od.a.alpha;
                i4 = agVar.purple;
                if (i4 == 0) {
                }
                return Unit.INSTANCE;
            case 5:
                o3.b bVar2 = (o3.b) obj;
                EnumC2159b bravo = bVar2.bravo();
                Kb.h hVar = (Kb.h) this.red;
                if (bravo != null) {
                    Kb.c bronze = Kb.h.bronze(bravo);
                    Pair coral = hVar.coral(bronze);
                    emptyList = kotlin.collections.ab.juliet(new Kb.a(bronze, (String) coral.first, (String) coral.second));
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                hVar.crimson(emptyList, bVar2.alpha());
                ((Kb.m) this.purple).submitList(emptyList);
                return Unit.INSTANCE;
            case 6:
                InterfaceC1672i interfaceC1672i4 = (InterfaceC1672i) obj;
                boolean z13 = interfaceC1672i4 instanceof C1667d;
                ArrayList arrayList = (ArrayList) this.red;
                if (z13) {
                    arrayList.add(interfaceC1672i4);
                } else if (interfaceC1672i4 instanceof C1668e) {
                    arrayList.remove(((C1668e) interfaceC1672i4).alpha);
                }
                ((ax) this.purple).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return Unit.INSTANCE;
            case 7:
                InterfaceC1672i interfaceC1672i5 = (InterfaceC1672i) obj;
                boolean z14 = interfaceC1672i5 instanceof C1670g;
                ah ahVar = (ah) this.red;
                if (!z14 && !(interfaceC1672i5 instanceof C1667d) && !(interfaceC1672i5 instanceof C1676m)) {
                    if (interfaceC1672i5 instanceof C1671h) {
                        ahVar.juliet(((C1671h) interfaceC1672i5).alpha);
                    } else if (interfaceC1672i5 instanceof C1668e) {
                        ahVar.juliet(((C1668e) interfaceC1672i5).alpha);
                    } else if (interfaceC1672i5 instanceof C1677n) {
                        ahVar.juliet(((C1677n) interfaceC1672i5).alpha);
                    } else if (interfaceC1672i5 instanceof C1675l) {
                        ahVar.juliet(((C1675l) interfaceC1672i5).alpha);
                    }
                } else {
                    ahVar.golf(interfaceC1672i5);
                }
                Object[] objArr = ahVar.alpha;
                int i10 = ahVar.bravo;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    ay ayVar = (ay) this.purple;
                    if (i11 < i10) {
                        InterfaceC1672i interfaceC1672i6 = (InterfaceC1672i) objArr[i11];
                        if (interfaceC1672i6 instanceof C1670g) {
                            ayVar.getClass();
                            i12 |= 2;
                        } else if (interfaceC1672i6 instanceof C1667d) {
                            ayVar.getClass();
                            i12 |= 1;
                        } else if (interfaceC1672i6 instanceof C1676m) {
                            ayVar.getClass();
                            i12 |= 4;
                        }
                        i11++;
                    } else {
                        ayVar.bravo.kilo(i12);
                        return Unit.INSTANCE;
                    }
                }
                break;
            case 8:
                long j5 = ((Z.b) obj).alpha;
                C0778c c0778c = (C0778c) this.red;
                if ((((Z.b) c0778c.delta()).alpha & 9223372034707292159L) != 9205357640488583168L && (j5 & 9223372034707292159L) != 9205357640488583168L && Float.intBitsToFloat((int) (((Z.b) c0778c.delta()).alpha & 4294967295L)) != Float.intBitsToFloat((int) (4294967295L & j5))) {
                    ad.zulu((ab) this.purple, null, null, new aj(c0778c, j5, null), 3);
                    return Unit.INSTANCE;
                }
                Object foxtrot = c0778c.foxtrot(cVar, new Z.b(j5));
                if (foxtrot != Od.a.alpha) {
                    return Unit.INSTANCE;
                }
                return foxtrot;
            default:
                return bravo(((Number) obj).intValue(), cVar);
        }
    }
}
