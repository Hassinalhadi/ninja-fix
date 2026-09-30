package D0;

import a0.ar;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public abstract class ae {
    public static final J2.l alpha = new J2.l(new y(14), new z(15));
    public static final J2.l bravo = new J2.l(new y(15), new z(16));
    public static final J2.l charlie = new J2.l(new y(16), new z(17));

    public static a alpha(String str, an anVar, long j5, Q0.d dVar, H0.j jVar, List list, int i4, int i5) {
        if ((i5 & 32) != 0) {
            list = CollectionsKt.emptyList();
        }
        return new a(new L0.d(str, anVar, list, CollectionsKt.emptyList(), jVar, dVar), i4, 1, j5);
    }

    public static final long bravo(int i4, int i5) {
        if (i4 < 0 || i5 < 0) {
            J0.a.alpha("start and end cannot be negative. [start: " + i4 + ", end: " + i5 + ']');
        }
        long j5 = (i5 & 4294967295L) | (i4 << 32);
        int i10 = am.charlie;
        return j5;
    }

    public static final long charlie(int i4, long j5) {
        int i5;
        int i10 = am.charlie;
        int i11 = (int) (j5 >> 32);
        int i12 = 0;
        if (i11 < 0) {
            i5 = 0;
        } else {
            i5 = i11;
        }
        if (i5 > i4) {
            i5 = i4;
        }
        int i13 = (int) (4294967295L & j5);
        if (i13 >= 0) {
            i12 = i13;
        }
        if (i12 <= i4) {
            i4 = i12;
        }
        if (i5 == i11 && i4 == i13) {
            return j5;
        }
        return bravo(i5, i4);
    }

    public static final int delta(int i4, List list) {
        int i5;
        char c3;
        int i10 = ((q) CollectionsKt.ochre(list)).charlie;
        if (i4 > ((q) CollectionsKt.ochre(list)).charlie) {
            J0.a.alpha("Index " + i4 + " should be less or equal than last line's end " + i10);
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (true) {
            if (i11 <= size) {
                i5 = (i11 + size) >>> 1;
                q qVar = (q) list.get(i5);
                if (qVar.bravo > i4) {
                    c3 = 1;
                } else if (qVar.charlie <= i4) {
                    c3 = 65535;
                } else {
                    c3 = 0;
                }
                if (c3 < 0) {
                    i11 = i5 + 1;
                } else {
                    if (c3 <= 0) {
                        break;
                    }
                    size = i5 - 1;
                }
            } else {
                i5 = -(i11 + 1);
                break;
            }
        }
        if (i5 >= 0 && i5 < list.size()) {
            return i5;
        }
        StringBuilder sierra = Q0.c.sierra(i5, "Found paragraph index ", " should be in range [0, ");
        sierra.append(list.size());
        sierra.append(").\nDebug info: index=");
        sierra.append(i4);
        sierra.append(", paragraphs=[");
        sierra.append(S0.a.alpha(list, null, new A4.a(22), 31));
        sierra.append(']');
        J0.a.alpha(sierra.toString());
        return i5;
    }

    public static final int echo(int i4, List list) {
        char c3;
        int size = list.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i10 = (i5 + size) >>> 1;
            q qVar = (q) list.get(i10);
            if (qVar.delta > i4) {
                c3 = 1;
            } else if (qVar.echo <= i4) {
                c3 = 65535;
            } else {
                c3 = 0;
            }
            if (c3 < 0) {
                i5 = i10 + 1;
            } else if (c3 > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i5 + 1);
    }

    public static final int foxtrot(ArrayList arrayList, float f5) {
        char c3;
        if (f5 <= 0.0f) {
            return 0;
        }
        if (f5 >= ((q) CollectionsKt.ochre(arrayList)).golf) {
            return CollectionsKt.ivory(arrayList);
        }
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            q qVar = (q) arrayList.get(i5);
            if (qVar.foxtrot > f5) {
                c3 = 1;
            } else if (qVar.golf <= f5) {
                c3 = 65535;
            } else {
                c3 = 0;
            }
            if (c3 < 0) {
                i4 = i5 + 1;
            } else if (c3 > 0) {
                size = i5 - 1;
            } else {
                return i5;
            }
        }
        return -(i4 + 1);
    }

    public static final void golf(ArrayList arrayList, long j5, Function1 function1) {
        int size = arrayList.size();
        for (int delta = delta(am.foxtrot(j5), arrayList); delta < size; delta++) {
            q qVar = (q) arrayList.get(delta);
            if (qVar.bravo < am.echo(j5)) {
                if (qVar.bravo != qVar.charlie) {
                    function1.invoke(qVar);
                }
            } else {
                return;
            }
        }
    }

    public static final an hotel(an anVar, Q0.n nVar) {
        int i4;
        int i5;
        float f5;
        int i10;
        int i11;
        af afVar = anVar.alpha;
        O0.o oVar = ag.delta;
        O0.o charlie2 = afVar.alpha.charlie(new Cb.s(25));
        Q0.q[] qVarArr = Q0.p.bravo;
        long j5 = afVar.bravo;
        if ((j5 & 1095216660480L) == 0) {
            j5 = ag.alpha;
        }
        long j6 = j5;
        H0.v vVar = afVar.charlie;
        if (vVar == null) {
            vVar = H0.v.yellow;
        }
        H0.v vVar2 = vVar;
        H0.r rVar = afVar.delta;
        if (rVar != null) {
            i4 = rVar.alpha;
        } else {
            i4 = 0;
        }
        H0.r rVar2 = new H0.r(i4);
        H0.s sVar = afVar.echo;
        if (sVar != null) {
            i5 = sVar.alpha;
        } else {
            i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        H0.s sVar2 = new H0.s(i5);
        H0.k kVar = afVar.foxtrot;
        if (kVar == null) {
            kVar = H0.k.alpha;
        }
        H0.k kVar2 = kVar;
        String str = afVar.golf;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j7 = afVar.hotel;
        if ((j7 & 1095216660480L) == 0) {
            j7 = ag.bravo;
        }
        long j10 = j7;
        O0.a aVar = afVar.india;
        if (aVar != null) {
            f5 = aVar.alpha;
        } else {
            f5 = 0.0f;
        }
        O0.a aVar2 = new O0.a(f5);
        O0.p pVar = afVar.juliet;
        if (pVar == null) {
            pVar = O0.p.charlie;
        }
        O0.p pVar2 = pVar;
        K0.b bVar = afVar.kilo;
        if (bVar == null) {
            K0.b bVar2 = K0.b.red;
            bVar = K0.d.alpha.delta();
        }
        K0.b bVar3 = bVar;
        long j11 = afVar.lima;
        if (j11 == 16) {
            j11 = ag.charlie;
        }
        long j12 = j11;
        O0.l lVar = afVar.mike;
        if (lVar == null) {
            lVar = O0.l.bravo;
        }
        O0.l lVar2 = lVar;
        ar arVar = afVar.november;
        if (arVar == null) {
            arVar = ar.delta;
        }
        ar arVar2 = arVar;
        c0.e eVar = afVar.papa;
        if (eVar == null) {
            eVar = c0.g.alpha;
        }
        af afVar2 = new af(charlie2, j6, vVar2, rVar2, sVar2, kVar2, str2, j10, aVar2, pVar2, bVar3, j12, lVar2, arVar2, afVar.oscar, eVar);
        int i12 = u.bravo;
        t tVar = anVar.bravo;
        int i13 = tVar.alpha;
        int i14 = 5;
        if (i13 == Integer.MIN_VALUE) {
            i10 = 5;
        } else {
            i10 = i13;
        }
        int i15 = tVar.bravo;
        if (i15 == 3) {
            int i16 = ao.$EnumSwitchMapping$0[nVar.ordinal()];
            if (i16 != 1) {
                if (i16 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i14 = 4;
            }
        } else if (i15 == Integer.MIN_VALUE) {
            int i17 = ao.$EnumSwitchMapping$0[nVar.ordinal()];
            if (i17 != 1) {
                if (i17 == 2) {
                    i14 = 2;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i14 = 1;
            }
        } else {
            i14 = i15;
        }
        long j13 = tVar.charlie;
        if ((j13 & 1095216660480L) == 0) {
            j13 = u.alpha;
        }
        O0.q qVar = tVar.delta;
        if (qVar == null) {
            qVar = O0.q.charlie;
        }
        O0.q qVar2 = qVar;
        int i18 = tVar.golf;
        if (i18 == 0) {
            i18 = O0.e.bravo;
        }
        int i19 = i18;
        int i20 = tVar.hotel;
        if (i20 == Integer.MIN_VALUE) {
            i11 = 1;
        } else {
            i11 = i20;
        }
        O0.s sVar3 = tVar.india;
        if (sVar3 == null) {
            sVar3 = O0.s.charlie;
        }
        return new an(afVar2, new t(i10, i14, j13, qVar2, tVar.echo, tVar.foxtrot, i19, i11, sVar3), anVar.charlie);
    }
}
