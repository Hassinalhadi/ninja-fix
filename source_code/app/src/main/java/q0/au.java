package q0;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.InterfaceC0541g;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import q0.AbstractC2367C;
import s0.AbstractC2557q;

/* loaded from: classes3.dex */
public final class au implements ap {
    public final androidx.compose.foundation.layout.aq alpha;

    public au(androidx.compose.foundation.layout.aq aqVar) {
        this.alpha = aqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0266 A[SYNTHETIC] */
    @Override // q0.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int alpha(InterfaceC2402u interfaceC2402u, List list, int i4) {
        InterfaceC2401t interfaceC2401t;
        InterfaceC2401t interfaceC2401t2;
        int i5;
        int i10;
        int i11;
        boolean z2;
        int[] iArr;
        int i12;
        bv.k kVar;
        int i13;
        List list2;
        int i14;
        long alpha;
        int i15;
        boolean z10;
        int i16;
        bv.k kVar2;
        boolean z11;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int i20 = 1;
        ArrayList golf = AbstractC2557q.golf(interfaceC2402u);
        androidx.compose.foundation.layout.aq aqVar = this.alpha;
        aqVar.getClass();
        List list3 = (List) CollectionsKt.jade(1, golf);
        if (list3 != null) {
            interfaceC2401t = (InterfaceC2401t) CollectionsKt.green(list3);
        } else {
            interfaceC2401t = null;
        }
        List list4 = (List) CollectionsKt.jade(2, golf);
        if (list4 != null) {
            interfaceC2401t2 = (InterfaceC2401t) CollectionsKt.green(list4);
        } else {
            interfaceC2401t2 = null;
        }
        int i21 = 0;
        aqVar.foxtrot.bravo(interfaceC2401t, interfaceC2401t2, Q0.b.bravo(0, i4, 7));
        List list5 = (List) CollectionsKt.green(golf);
        if (list5 == null) {
            list5 = CollectionsKt.emptyList();
        }
        int ochre = interfaceC2402u.ochre(aqVar.charlie);
        int ochre2 = interfaceC2402u.ochre(aqVar.echo);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i22 = 0; i22 < size3; i22++) {
            InterfaceC2401t interfaceC2401t3 = (InterfaceC2401t) list5.get(i22);
            int lima = interfaceC2401t3.lima(i4);
            iArr2[i22] = lima;
            iArr3[i22] = interfaceC2401t3.jade(lima);
        }
        int size4 = list5.size();
        androidx.compose.foundation.layout.ao aoVar = aqVar.foxtrot;
        int i23 = LottieConstants.IterateForever;
        if (Integer.MAX_VALUE < size4) {
            aoVar.getClass();
            androidx.compose.foundation.layout.ak akVar = androidx.compose.foundation.layout.ak.alpha;
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            aoVar.getClass();
            androidx.compose.foundation.layout.ak akVar2 = androidx.compose.foundation.layout.ak.alpha;
        }
        int min = Math.min(LottieConstants.IterateForever, list5.size());
        int i24 = 0;
        for (int i25 = 0; i25 < size; i25++) {
            i24 += iArr2[i25];
        }
        int size5 = ((list5.size() - 1) * ochre) + i24;
        if (size2 != 0) {
            int i26 = iArr3[0];
            int i27 = size2 - 1;
            if (1 <= i27) {
                int i28 = 1;
                while (true) {
                    int i29 = iArr3[i28];
                    if (i26 < i29) {
                        i26 = i29;
                    }
                    if (i28 == i27) {
                        break;
                    }
                    i28++;
                }
            }
            if (size != 0) {
                int i30 = iArr2[0];
                int i31 = size - 1;
                if (1 <= i31) {
                    int i32 = 1;
                    while (true) {
                        int i33 = iArr2[i32];
                        if (i30 < i33) {
                            i30 = i33;
                        }
                        if (i32 == i31) {
                            break;
                        }
                        i32++;
                    }
                }
                int i34 = size5;
                while (i30 <= i34 && i26 != i4) {
                    int i35 = (i30 + i34) / 2;
                    if (list5.isEmpty()) {
                        alpha = bv.k.alpha(i21, i21);
                        i13 = i30;
                        i12 = i20;
                        iArr = iArr2;
                        i5 = min;
                    } else {
                        i5 = min;
                        androidx.compose.foundation.layout.ag agVar = new androidx.compose.foundation.layout.ag(aoVar, Q0.b.alpha(i21, i35, i21, i23), ochre, ochre2);
                        InterfaceC2401t interfaceC2401t4 = (InterfaceC2401t) CollectionsKt.jade(i21, list5);
                        if (interfaceC2401t4 != null) {
                            i10 = iArr3[i21];
                        } else {
                            i10 = i21;
                        }
                        if (interfaceC2401t4 != null) {
                            i11 = iArr2[i21];
                        } else {
                            i11 = i21;
                        }
                        if (list5.size() > i20) {
                            z2 = i20;
                        } else {
                            z2 = 0;
                        }
                        long alpha2 = bv.k.alpha(i35, i23);
                        if (interfaceC2401t4 == null) {
                            i12 = i20;
                            iArr = iArr2;
                            kVar = null;
                        } else {
                            iArr = iArr2;
                            i12 = i20;
                            kVar = new bv.k(bv.k.alpha(i11, i10));
                        }
                        int i36 = 0;
                        if (agVar.bravo(z2, 0, alpha2, kVar, 0, 0, 0, false, false).bravo) {
                            if (interfaceC2401t4 != null) {
                                z12 = i12;
                            } else {
                                z12 = 0;
                            }
                            bv.k alpha3 = aoVar.alpha(0, 0, z12);
                            if (alpha3 != null) {
                                i17 = (int) (alpha3.alpha & 4294967295L);
                            } else {
                                i17 = 0;
                            }
                            alpha = bv.k.alpha(i17, 0);
                            i13 = i30;
                        } else {
                            int size6 = list5.size();
                            int i37 = 0;
                            int i38 = 0;
                            int i39 = 0;
                            int i40 = i35;
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                if (i37 < size6) {
                                    int i43 = i40 - i11;
                                    int i44 = i37 + 1;
                                    int max = Math.max(i42, i10);
                                    InterfaceC2401t interfaceC2401t5 = (InterfaceC2401t) CollectionsKt.jade(i44, list5);
                                    if (interfaceC2401t5 != null) {
                                        i10 = iArr3[i44];
                                    } else {
                                        i10 = 0;
                                    }
                                    if (interfaceC2401t5 != null) {
                                        i13 = i30;
                                        i15 = iArr[i44] + ochre;
                                    } else {
                                        i13 = i30;
                                        i15 = 0;
                                    }
                                    if (i37 + 2 < list5.size()) {
                                        z10 = i12;
                                    } else {
                                        z10 = 0;
                                    }
                                    int i45 = i44 - i39;
                                    int i46 = i41;
                                    long alpha4 = bv.k.alpha(i43, LottieConstants.IterateForever);
                                    if (interfaceC2401t5 == null) {
                                        i16 = i15;
                                        list2 = list5;
                                        kVar2 = null;
                                    } else {
                                        list2 = list5;
                                        i16 = i15;
                                        kVar2 = new bv.k(bv.k.alpha(i15, i10));
                                    }
                                    androidx.compose.foundation.layout.af bravo = agVar.bravo(z10, i45, alpha4, kVar2, i46, i36, max, false, false);
                                    if (bravo.alpha) {
                                        int i47 = max + ochre2 + i36;
                                        if (interfaceC2401t5 != null) {
                                            z11 = i12;
                                        } else {
                                            z11 = 0;
                                        }
                                        androidx.compose.foundation.layout.ae alpha5 = agVar.alpha(bravo, z11, i46, i47, i43, i45);
                                        int i48 = i16 - ochre;
                                        i41 = i46 + 1;
                                        if (bravo.bravo) {
                                            if (alpha5 != null && !alpha5.delta) {
                                                i47 = ((int) (alpha5.charlie & 4294967295L)) + ochre2 + i47;
                                            }
                                            i36 = i47;
                                            i14 = i44;
                                        } else {
                                            i11 = i48;
                                            i40 = i35;
                                            i36 = i47;
                                            i39 = i44;
                                            i42 = 0;
                                        }
                                    } else {
                                        i40 = i43;
                                        i41 = i46;
                                        i42 = max;
                                        i11 = i16;
                                    }
                                    list5 = list2;
                                    i30 = i13;
                                    i37 = i44;
                                    i38 = i37;
                                } else {
                                    i13 = i30;
                                    list2 = list5;
                                    i14 = i38;
                                    break;
                                }
                            }
                            alpha = bv.k.alpha(i36 - ochre2, i14);
                            i18 = (int) (alpha >> 32);
                            int i49 = (int) (alpha & 4294967295L);
                            if (i18 > i4 && i49 >= i5) {
                                if (i18 < i4) {
                                    i34 = i35 - 1;
                                    i26 = i18;
                                    size5 = i35;
                                    iArr2 = iArr;
                                    list5 = list2;
                                    i20 = i12;
                                    i30 = i13;
                                } else {
                                    return i35;
                                }
                            } else {
                                i19 = i35 + 1;
                                if (i19 <= i34) {
                                    return i19;
                                }
                                i26 = i18;
                                i30 = i19;
                                size5 = i35;
                                iArr2 = iArr;
                                list5 = list2;
                                i20 = i12;
                            }
                            i23 = LottieConstants.IterateForever;
                            i21 = 0;
                            min = i5;
                        }
                    }
                    list2 = list5;
                    i18 = (int) (alpha >> 32);
                    int i492 = (int) (alpha & 4294967295L);
                    if (i18 > i4) {
                    }
                    i19 = i35 + 1;
                    if (i19 <= i34) {
                    }
                }
                return size5;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    @Override // q0.ap
    public final int bravo(InterfaceC2402u interfaceC2402u, List list, int i4) {
        InterfaceC2401t interfaceC2401t;
        ArrayList golf = AbstractC2557q.golf(interfaceC2402u);
        androidx.compose.foundation.layout.aq aqVar = this.alpha;
        aqVar.getClass();
        List list2 = (List) CollectionsKt.jade(1, golf);
        InterfaceC2401t interfaceC2401t2 = null;
        if (list2 != null) {
            interfaceC2401t = (InterfaceC2401t) CollectionsKt.green(list2);
        } else {
            interfaceC2401t = null;
        }
        List list3 = (List) CollectionsKt.jade(2, golf);
        if (list3 != null) {
            interfaceC2401t2 = (InterfaceC2401t) CollectionsKt.green(list3);
        }
        long bravo = Q0.b.bravo(i4, 0, 13);
        androidx.compose.foundation.layout.ao aoVar = aqVar.foxtrot;
        aoVar.bravo(interfaceC2401t, interfaceC2401t2, bravo);
        List list4 = (List) CollectionsKt.green(golf);
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        return androidx.compose.foundation.layout.aq.alpha(list4, i4, interfaceC2402u.ochre(aqVar.charlie), interfaceC2402u.ochre(aqVar.echo), aoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    @Override // q0.ap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aq delta(ar arVar, List list, long j5) {
        ao aoVar;
        ao aoVar2;
        ao aoVar3;
        ao aoVar4;
        ao aoVar5;
        bv.k kVar;
        Integer num;
        Integer num2;
        androidx.compose.foundation.layout.af afVar;
        androidx.compose.foundation.layout.ae aeVar;
        int i4;
        int i5;
        char c3;
        long j6;
        bv.k kVar2;
        Integer num3;
        Integer num4;
        int i10;
        Integer num5;
        bv.k kVar3;
        androidx.compose.foundation.layout.af bravo;
        androidx.compose.foundation.layout.af afVar2;
        Integer num6;
        boolean z2;
        Integer num7;
        long alpha;
        boolean z10;
        long alpha2;
        final int i11 = 1;
        ArrayList golf = AbstractC2557q.golf(arVar);
        final androidx.compose.foundation.layout.aq aqVar = this.alpha;
        aqVar.getClass();
        boolean isEmpty = golf.isEmpty();
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        if (!isEmpty) {
            int golf2 = Q0.a.golf(j5);
            final androidx.compose.foundation.layout.ao aoVar6 = aqVar.foxtrot;
            if (golf2 == 0) {
                aoVar6.getClass();
                androidx.compose.foundation.layout.ak akVar = androidx.compose.foundation.layout.ak.alpha;
                androidx.compose.foundation.layout.ak akVar2 = androidx.compose.foundation.layout.ak.alpha;
            } else {
                List list2 = (List) CollectionsKt.gold(golf);
                if (list2.isEmpty()) {
                    return arVar.papa(0, 0, tVar, new a5.c(7));
                }
                List list3 = (List) CollectionsKt.jade(1, golf);
                if (list3 != null) {
                    aoVar = (ao) CollectionsKt.green(list3);
                } else {
                    aoVar = null;
                }
                List list4 = (List) CollectionsKt.jade(2, golf);
                if (list4 != null) {
                    aoVar2 = (ao) CollectionsKt.green(list4);
                } else {
                    aoVar2 = null;
                }
                list2.size();
                aoVar6.getClass();
                androidx.compose.foundation.layout.E e = androidx.compose.foundation.layout.E.alpha;
                long xray = AbstractC0538d.xray(AbstractC0538d.kilo(10, AbstractC0538d.juliet(j5, e)));
                if (aoVar != null) {
                    final int i12 = 0;
                    androidx.compose.foundation.layout.aj.charlie(aoVar, aqVar, xray, new Function1() { // from class: androidx.compose.foundation.layout.am
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            AbstractC2367C abstractC2367C = (AbstractC2367C) obj;
                            switch (i12) {
                                case 0:
                                    if (abstractC2367C != null) {
                                        aqVar.getClass();
                                        i13 = abstractC2367C.navy();
                                        i14 = abstractC2367C.maroon();
                                    } else {
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                    bv.k kVar4 = new bv.k(bv.k.alpha(i13, i14));
                                    ao aoVar7 = aoVar6;
                                    aoVar7.echo = kVar4;
                                    aoVar7.bravo = abstractC2367C;
                                    return Unit.INSTANCE;
                                default:
                                    if (abstractC2367C != null) {
                                        aqVar.getClass();
                                        i15 = abstractC2367C.navy();
                                        i16 = abstractC2367C.maroon();
                                    } else {
                                        i15 = 0;
                                        i16 = 0;
                                    }
                                    bv.k kVar5 = new bv.k(bv.k.alpha(i15, i16));
                                    ao aoVar8 = aoVar6;
                                    aoVar8.foxtrot = kVar5;
                                    aoVar8.delta = abstractC2367C;
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    aoVar6.alpha = aoVar;
                }
                if (aoVar2 != null) {
                    androidx.compose.foundation.layout.aj.charlie(aoVar2, aqVar, xray, new Function1() { // from class: androidx.compose.foundation.layout.am
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i13;
                            int i14;
                            int i15;
                            int i16;
                            AbstractC2367C abstractC2367C = (AbstractC2367C) obj;
                            switch (i11) {
                                case 0:
                                    if (abstractC2367C != null) {
                                        aqVar.getClass();
                                        i13 = abstractC2367C.navy();
                                        i14 = abstractC2367C.maroon();
                                    } else {
                                        i13 = 0;
                                        i14 = 0;
                                    }
                                    bv.k kVar4 = new bv.k(bv.k.alpha(i13, i14));
                                    ao aoVar7 = aoVar6;
                                    aoVar7.echo = kVar4;
                                    aoVar7.bravo = abstractC2367C;
                                    return Unit.INSTANCE;
                                default:
                                    if (abstractC2367C != null) {
                                        aqVar.getClass();
                                        i15 = abstractC2367C.navy();
                                        i16 = abstractC2367C.maroon();
                                    } else {
                                        i15 = 0;
                                        i16 = 0;
                                    }
                                    bv.k kVar5 = new bv.k(bv.k.alpha(i15, i16));
                                    ao aoVar8 = aoVar6;
                                    aoVar8.foxtrot = kVar5;
                                    aoVar8.delta = abstractC2367C;
                                    return Unit.INSTANCE;
                            }
                        }
                    });
                    aoVar6.charlie = aoVar2;
                }
                Iterator it = list2.iterator();
                long juliet = AbstractC0538d.juliet(j5, e);
                J.e eVar = new J.e(new aq[16]);
                int hotel = Q0.a.hotel(juliet);
                int juliet2 = Q0.a.juliet(juliet);
                int golf3 = Q0.a.golf(juliet);
                bv.aa aaVar = bv.o.alpha;
                bv.aa aaVar2 = new bv.aa();
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(arVar.lavender(aqVar.charlie));
                int ceil2 = (int) Math.ceil(arVar.lavender(aqVar.echo));
                long alpha3 = Q0.b.alpha(0, hotel, 0, golf3);
                long xray2 = AbstractC0538d.xray(AbstractC0538d.kilo(14, alpha3));
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                if (!it.hasNext()) {
                    aoVar4 = null;
                } else {
                    try {
                        aoVar3 = (ao) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        aoVar3 = null;
                    }
                    aoVar4 = aoVar3;
                }
                if (aoVar4 != null) {
                    if (AbstractC0538d.mike(AbstractC0538d.lima(aoVar4)) == 0.0f) {
                        AbstractC0538d.lima(aoVar4);
                        AbstractC2367C victor = aoVar4.victor(xray2);
                        objectRef.alpha = victor;
                        alpha2 = bv.k.alpha(victor.navy(), victor.maroon());
                    } else {
                        int lima = aoVar4.lima(LottieConstants.IterateForever);
                        alpha2 = bv.k.alpha(lima, aoVar4.jade(lima));
                    }
                    aoVar5 = aoVar4;
                    kVar = new bv.k(alpha2);
                } else {
                    aoVar5 = aoVar4;
                    kVar = null;
                }
                if (kVar != null) {
                    num = Integer.valueOf((int) (kVar.alpha >> 32));
                } else {
                    num = null;
                }
                if (kVar != null) {
                    num2 = Integer.valueOf((int) (kVar.alpha & 4294967295L));
                } else {
                    num2 = null;
                }
                bv.z zVar = new bv.z();
                Integer num8 = num;
                bv.z zVar2 = new bv.z();
                kotlin.collections.t tVar2 = tVar;
                bv.ab abVar = new bv.ab();
                bv.k kVar4 = kVar;
                androidx.compose.foundation.layout.ao aoVar7 = aqVar.foxtrot;
                androidx.compose.foundation.layout.ag agVar = new androidx.compose.foundation.layout.ag(aoVar7, juliet, ceil, ceil2);
                androidx.compose.foundation.layout.af bravo2 = agVar.bravo(it.hasNext(), 0, bv.k.alpha(hotel, golf3), kVar4, 0, 0, 0, false, false);
                androidx.compose.foundation.layout.aq aqVar2 = aqVar;
                if (bravo2.bravo) {
                    if (kVar4 != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    afVar = bravo2;
                    aeVar = agVar.alpha(afVar, z10, -1, 0, hotel, 0);
                } else {
                    afVar = bravo2;
                    aeVar = null;
                }
                int i13 = hotel;
                Integer num9 = num2;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                androidx.compose.foundation.layout.ae aeVar2 = aeVar;
                androidx.compose.foundation.layout.af afVar3 = afVar;
                int i20 = ceil;
                ao aoVar8 = aoVar5;
                int i21 = golf3;
                int i22 = juliet2;
                while (!afVar3.bravo && aoVar8 != null) {
                    Intrinsics.checkNotNull(num8);
                    int intValue = num8.intValue();
                    Intrinsics.checkNotNull(num9);
                    int intValue2 = num9.intValue();
                    bv.ab abVar2 = abVar;
                    int i23 = i16 + intValue;
                    int max = Math.max(i14, intValue2);
                    int i24 = i13 - intValue;
                    int i25 = i15 + 1;
                    aoVar7.getClass();
                    arrayList.add(aoVar8);
                    aaVar2.hotel(i15, objectRef.alpha);
                    boolean z11 = aoVar8.yankee() instanceof androidx.compose.foundation.layout.P;
                    int i26 = i25 - i17;
                    if (it.hasNext()) {
                        try {
                            aoVar8 = (ao) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                        }
                        objectRef.alpha = null;
                        if (aoVar8 == null) {
                            if (AbstractC0538d.mike(AbstractC0538d.lima(aoVar8)) == 0.0f) {
                                AbstractC0538d.lima(aoVar8);
                                AbstractC2367C victor2 = aoVar8.victor(xray2);
                                objectRef.alpha = victor2;
                                j6 = xray2;
                                alpha = bv.k.alpha(victor2.navy(), victor2.maroon());
                            } else {
                                j6 = xray2;
                                int lima2 = aoVar8.lima(LottieConstants.IterateForever);
                                alpha = bv.k.alpha(lima2, aoVar8.jade(lima2));
                            }
                            kVar2 = new bv.k(alpha);
                        } else {
                            j6 = xray2;
                            kVar2 = null;
                        }
                        if (kVar2 == null) {
                            num3 = Integer.valueOf(((int) (kVar2.alpha >> 32)) + i20);
                        } else {
                            num3 = null;
                        }
                        Integer num10 = num3;
                        if (kVar2 == null) {
                            num4 = Integer.valueOf((int) (kVar2.alpha & 4294967295L));
                        } else {
                            num4 = null;
                        }
                        boolean hasNext = it.hasNext();
                        int i27 = i18;
                        long alpha4 = bv.k.alpha(i24, i21);
                        if (kVar2 != null) {
                            i10 = i24;
                            num5 = num4;
                            kVar3 = null;
                        } else {
                            Intrinsics.checkNotNull(num10);
                            int intValue3 = num10.intValue();
                            Intrinsics.checkNotNull(num4);
                            i10 = i24;
                            num5 = num4;
                            kVar3 = new bv.k(bv.k.alpha(intValue3, num4.intValue()));
                        }
                        bravo = agVar.bravo(hasNext, i26, alpha4, kVar3, i27, i19, max, false, false);
                        int i28 = max;
                        if (!bravo.alpha) {
                            int min = Math.min(Math.max(i22, i23), hotel);
                            int i29 = i19 + i28;
                            if (kVar2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            afVar2 = bravo;
                            androidx.compose.foundation.layout.ae alpha5 = agVar.alpha(afVar2, z2, i27, i29, i10, i26);
                            zVar2.charlie(i28);
                            i21 = (i21 - i29) - ceil2;
                            zVar.charlie(i25);
                            if (num10 != null) {
                                num7 = Integer.valueOf(num10.intValue() - i20);
                            } else {
                                num7 = null;
                            }
                            i18 = i27 + 1;
                            aeVar2 = alpha5;
                            num6 = num7;
                            i22 = min;
                            i13 = hotel;
                            i17 = i25;
                            i19 = i29 + ceil2;
                            i28 = 0;
                            i16 = 0;
                        } else {
                            afVar2 = bravo;
                            int i30 = i10;
                            i16 = i23;
                            num6 = num10;
                            i13 = i30;
                            i18 = i27;
                        }
                        i15 = i25;
                        abVar = abVar2;
                        num9 = num5;
                        num8 = num6;
                        i14 = i28;
                        afVar3 = afVar2;
                        xray2 = j6;
                    }
                    aoVar8 = null;
                    objectRef.alpha = null;
                    if (aoVar8 == null) {
                    }
                    if (kVar2 == null) {
                    }
                    Integer num102 = num3;
                    if (kVar2 == null) {
                    }
                    boolean hasNext2 = it.hasNext();
                    int i272 = i18;
                    long alpha42 = bv.k.alpha(i24, i21);
                    if (kVar2 != null) {
                    }
                    bravo = agVar.bravo(hasNext2, i26, alpha42, kVar3, i272, i19, max, false, false);
                    int i282 = max;
                    if (!bravo.alpha) {
                    }
                    i15 = i25;
                    abVar = abVar2;
                    num9 = num5;
                    num8 = num6;
                    i14 = i282;
                    afVar3 = afVar2;
                    xray2 = j6;
                }
                bv.ab abVar3 = abVar;
                if (aeVar2 != null) {
                    arrayList.add(aeVar2.alpha);
                    aaVar2.hotel(arrayList.size() - 1, aeVar2.bravo);
                    int i31 = zVar.bravo - 1;
                    boolean z12 = aeVar2.delta;
                    long j7 = aeVar2.charlie;
                    if (z12) {
                        zVar2.foxtrot(i31, Math.max(zVar2.alpha(i31), (int) (j7 & 4294967295L)));
                        zVar.foxtrot(i31, zVar.bravo() + 1);
                    } else {
                        zVar2.charlie((int) (j7 & 4294967295L));
                        zVar.charlie(zVar.bravo() + 1);
                    }
                }
                int size = arrayList.size();
                AbstractC2367C[] abstractC2367CArr = new AbstractC2367C[size];
                for (int i32 = 0; i32 < size; i32++) {
                    abstractC2367CArr[i32] = aaVar2.bravo(i32);
                }
                int i33 = zVar.bravo;
                int[] iArr = new int[i33];
                int[] iArr2 = new int[i33];
                int[] iArr3 = zVar.alpha;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                AbstractC2367C[] abstractC2367CArr2 = abstractC2367CArr;
                while (i35 < i33) {
                    int i37 = iArr3[i35];
                    int alpha6 = zVar2.alpha(i35);
                    bv.ab abVar4 = abVar3;
                    if (abVar4.bravo(i35)) {
                        c3 = 65535;
                    } else {
                        c3 = 65535;
                        if (Q0.a.golf(alpha3) == Integer.MAX_VALUE) {
                            alpha6 = Integer.MAX_VALUE;
                        } else {
                            alpha6 = Q0.a.golf(alpha3) - i36;
                        }
                    }
                    abVar3 = abVar4;
                    int[] iArr4 = iArr3;
                    AbstractC2367C[] abstractC2367CArr3 = abstractC2367CArr2;
                    int i38 = i22;
                    androidx.compose.foundation.layout.aq aqVar3 = aqVar2;
                    int i39 = i20;
                    aq papa = AbstractC0538d.papa(aqVar3, i38, Q0.a.india(alpha3), Q0.a.hotel(alpha3), alpha6, i39, arVar, arrayList, abstractC2367CArr3, i34, i37, iArr, i35);
                    int bravo3 = papa.bravo();
                    int alpha7 = papa.alpha();
                    iArr2[i35] = alpha7;
                    i36 += alpha7;
                    int max2 = Math.max(i38, bravo3);
                    eVar.bravo(papa);
                    i35++;
                    i20 = i39;
                    i34 = i37;
                    tVar2 = tVar2;
                    i33 = i33;
                    aqVar2 = aqVar3;
                    i22 = max2;
                    abstractC2367CArr2 = abstractC2367CArr3;
                    iArr3 = iArr4;
                }
                int i40 = i22;
                androidx.compose.foundation.layout.aq aqVar4 = aqVar2;
                kotlin.collections.t tVar3 = tVar2;
                if (eVar.red == 0) {
                    i4 = 0;
                    i5 = 0;
                } else {
                    i4 = i40;
                    i5 = i36;
                }
                InterfaceC0541g interfaceC0541g = aqVar4.bravo;
                int ochre = ((eVar.red - 1) * arVar.ochre(interfaceC0541g.alpha())) + i5;
                int india = Q0.a.india(juliet);
                int golf4 = Q0.a.golf(juliet);
                if (ochre < india) {
                    ochre = india;
                }
                if (ochre <= golf4) {
                    golf4 = ochre;
                }
                interfaceC0541g.bravo(arVar, golf4, iArr2, iArr);
                int juliet3 = Q0.a.juliet(juliet);
                int hotel2 = Q0.a.hotel(juliet);
                if (i4 < juliet3) {
                    i4 = juliet3;
                }
                if (i4 <= hotel2) {
                    hotel2 = i4;
                }
                return arVar.papa(hotel2, golf4, tVar3, new Ya.c(6, eVar));
            }
        }
        return arVar.papa(0, 0, tVar, new a5.c(6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof au) && Intrinsics.areEqual(this.alpha, ((au) obj).alpha)) {
            return true;
        }
        return false;
    }

    @Override // q0.ap
    public final int golf(InterfaceC2402u interfaceC2402u, List list, int i4) {
        InterfaceC2401t interfaceC2401t;
        ArrayList golf = AbstractC2557q.golf(interfaceC2402u);
        androidx.compose.foundation.layout.aq aqVar = this.alpha;
        aqVar.getClass();
        List list2 = (List) CollectionsKt.jade(1, golf);
        InterfaceC2401t interfaceC2401t2 = null;
        if (list2 != null) {
            interfaceC2401t = (InterfaceC2401t) CollectionsKt.green(list2);
        } else {
            interfaceC2401t = null;
        }
        List list3 = (List) CollectionsKt.jade(2, golf);
        if (list3 != null) {
            interfaceC2401t2 = (InterfaceC2401t) CollectionsKt.green(list3);
        }
        aqVar.foxtrot.bravo(interfaceC2401t, interfaceC2401t2, Q0.b.bravo(0, i4, 7));
        List list4 = (List) CollectionsKt.green(golf);
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        int ochre = interfaceC2402u.ochre(aqVar.charlie);
        int size = list4.size();
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i5 < size) {
            int romeo = ((InterfaceC2401t) list4.get(i5)).romeo(i4) + ochre;
            int i13 = i5 + 1;
            if (i13 - i11 != Integer.MAX_VALUE && i13 != list4.size()) {
                i12 += romeo;
            } else {
                i10 = Math.max(i10, (i12 + romeo) - ochre);
                i11 = i5;
                i12 = 0;
            }
            i5 = i13;
        }
        return i10;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // q0.ap
    public final int hotel(InterfaceC2402u interfaceC2402u, List list, int i4) {
        InterfaceC2401t interfaceC2401t;
        ArrayList golf = AbstractC2557q.golf(interfaceC2402u);
        androidx.compose.foundation.layout.aq aqVar = this.alpha;
        aqVar.getClass();
        List list2 = (List) CollectionsKt.jade(1, golf);
        InterfaceC2401t interfaceC2401t2 = null;
        if (list2 != null) {
            interfaceC2401t = (InterfaceC2401t) CollectionsKt.green(list2);
        } else {
            interfaceC2401t = null;
        }
        List list3 = (List) CollectionsKt.jade(2, golf);
        if (list3 != null) {
            interfaceC2401t2 = (InterfaceC2401t) CollectionsKt.green(list3);
        }
        long bravo = Q0.b.bravo(i4, 0, 13);
        androidx.compose.foundation.layout.ao aoVar = aqVar.foxtrot;
        aoVar.bravo(interfaceC2401t, interfaceC2401t2, bravo);
        List list4 = (List) CollectionsKt.green(golf);
        if (list4 == null) {
            list4 = CollectionsKt.emptyList();
        }
        return androidx.compose.foundation.layout.aq.alpha(list4, i4, interfaceC2402u.ochre(aqVar.charlie), interfaceC2402u.ochre(aqVar.echo), aoVar);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.alpha + ')';
    }
}
