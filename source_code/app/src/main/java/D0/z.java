package D0;

import a0.C0366t;
import a0.ar;
import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.app.network.network.models.Order;
import com.app.network.network.models.Shift;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.core.utils.extension.ExtensionsKt;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.model.CardMetadata;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeActivityV2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2636d7;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ z(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r1v125, types: [Y1.av, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        Integer num2;
        C0366t c0366t;
        Z.b bVar;
        Float f5;
        Float f10;
        Q0.q qVar;
        String str;
        al alVar;
        Float f11;
        Float f12;
        K0.a aVar;
        e eVar;
        O0.f fVar;
        O0.h hVar;
        O0.g gVar;
        i iVar;
        Integer num3;
        Integer num4;
        String str2;
        t tVar;
        af afVar;
        aq aqVar;
        ap apVar;
        l lVar;
        k kVar;
        String str3;
        String str4;
        String str5;
        String str6;
        al alVar2;
        O0.k kVar2;
        O0.m mVar;
        Q0.p pVar;
        O0.q qVar2;
        v vVar;
        O0.i iVar2;
        O0.e eVar2;
        O0.d dVar;
        O0.s sVar;
        int i4;
        int i5;
        int i10;
        int i11;
        long j5;
        C0366t c0366t2;
        Q0.p pVar2;
        H0.v vVar2;
        H0.r rVar;
        H0.s sVar2;
        String str7;
        Q0.p pVar3;
        O0.a aVar2;
        O0.p pVar4;
        K0.b bVar2;
        C0366t c0366t3;
        O0.l lVar2;
        ar arVar;
        Boolean bool;
        j jVar;
        O0.r rVar2;
        Boolean bool2;
        int i12 = 0;
        switch (this.alpha) {
            case 0:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                if (obj2 != null) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                Intrinsics.checkNotNull(num);
                int intValue = num.intValue();
                Object obj3 = list.get(1);
                if (obj3 != null) {
                    num2 = (Integer) obj3;
                } else {
                    num2 = null;
                }
                Intrinsics.checkNotNull(num2);
                return new am(ae.bravo(intValue, num2.intValue()));
            case 1:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                int i13 = C0366t.lima;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.areEqual(obj4, bool3);
                if (obj4 != null) {
                    if (Intrinsics.areEqual(obj4, Boolean.FALSE)) {
                        c0366t = new C0366t(C0366t.kilo);
                    } else {
                        c0366t = new C0366t(a0.ao.charlie(((Integer) obj4).intValue()));
                    }
                } else {
                    c0366t = null;
                }
                Intrinsics.checkNotNull(c0366t);
                long j6 = c0366t.alpha;
                Object obj5 = list2.get(1);
                ac acVar = ad.romeo;
                Intrinsics.areEqual(obj5, bool3);
                if (obj5 != null) {
                    bVar = (Z.b) acVar.purple.invoke(obj5);
                } else {
                    bVar = null;
                }
                Intrinsics.checkNotNull(bVar);
                long j7 = bVar.alpha;
                Object obj6 = list2.get(2);
                if (obj6 != null) {
                    f5 = (Float) obj6;
                } else {
                    f5 = null;
                }
                Intrinsics.checkNotNull(f5);
                return new ar(j6, j7, f5.floatValue());
            case 2:
                if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                    return new Q0.p(Q0.p.charlie);
                }
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list3 = (List) obj;
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    f10 = (Float) obj7;
                } else {
                    f10 = null;
                }
                Intrinsics.checkNotNull(f10);
                float floatValue = f10.floatValue();
                Object obj8 = list3.get(1);
                if (obj8 != null) {
                    qVar = (Q0.q) obj8;
                } else {
                    qVar = null;
                }
                Intrinsics.checkNotNull(qVar);
                return new Q0.p(AbstractC2636d7.delta(floatValue, qVar.alpha));
            case 3:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list4 = (List) obj;
                Object obj9 = list4.get(0);
                if (obj9 != null) {
                    str = (String) obj9;
                } else {
                    str = null;
                }
                Intrinsics.checkNotNull(str);
                Object obj10 = list4.get(1);
                J2.l lVar3 = ad.india;
                if (Intrinsics.areEqual(obj10, Boolean.FALSE) || obj10 == null) {
                    alVar = null;
                } else {
                    alVar = (al) ((Function1) lVar3.purple).invoke(obj10);
                }
                return new l(str, alVar);
            case 4:
                if (Intrinsics.areEqual(obj, Boolean.FALSE)) {
                    return new Z.b(9205357640488583168L);
                }
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list5 = (List) obj;
                Object obj11 = list5.get(0);
                if (obj11 != null) {
                    f11 = (Float) obj11;
                } else {
                    f11 = null;
                }
                Intrinsics.checkNotNull(f11);
                float floatValue2 = f11.floatValue();
                Object obj12 = list5.get(1);
                if (obj12 != null) {
                    f12 = (Float) obj12;
                } else {
                    f12 = null;
                }
                Intrinsics.checkNotNull(f12);
                float floatValue3 = f12.floatValue();
                return new Z.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(floatValue3) & 4294967295L));
            case 5:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                ArrayList arrayList = new ArrayList(list6.size());
                int size = list6.size();
                while (i12 < size) {
                    Object obj13 = list6.get(i12);
                    J2.l lVar4 = ad.tango;
                    if (Intrinsics.areEqual(obj13, Boolean.FALSE) || obj13 == null) {
                        aVar = null;
                    } else {
                        aVar = (K0.a) ((Function1) lVar4.purple).invoke(obj13);
                    }
                    Intrinsics.checkNotNull(aVar);
                    arrayList.add(aVar);
                    i12++;
                }
                return new K0.b(arrayList);
            case 6:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list7.size());
                int size2 = list7.size();
                while (i12 < size2) {
                    Object obj14 = list7.get(i12);
                    J2.l lVar5 = ad.bravo;
                    if (Intrinsics.areEqual(obj14, Boolean.FALSE) || obj14 == null) {
                        eVar = null;
                    } else {
                        eVar = (e) ((Function1) lVar5.purple).invoke(obj14);
                    }
                    Intrinsics.checkNotNull(eVar);
                    arrayList2.add(eVar);
                    i12++;
                }
                return arrayList2;
            case 7:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.String");
                return new K0.a(K0.d.alpha.echo((String) obj));
            case 8:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                if (obj15 != null) {
                    fVar = (O0.f) obj15;
                } else {
                    fVar = null;
                }
                Intrinsics.checkNotNull(fVar);
                float f13 = fVar.alpha;
                Object obj16 = list8.get(1);
                if (obj16 != null) {
                    hVar = (O0.h) obj16;
                } else {
                    hVar = null;
                }
                Intrinsics.checkNotNull(hVar);
                int i14 = hVar.alpha;
                Object obj17 = list8.get(2);
                if (obj17 != null) {
                    gVar = (O0.g) obj17;
                } else {
                    gVar = null;
                }
                Intrinsics.checkNotNull(gVar);
                gVar.getClass();
                return new O0.i(f13, i14);
            case 9:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                Object obj18 = list9.get(0);
                if (obj18 != null) {
                    iVar = (i) obj18;
                } else {
                    iVar = null;
                }
                Intrinsics.checkNotNull(iVar);
                Object obj19 = list9.get(2);
                if (obj19 != null) {
                    num3 = (Integer) obj19;
                } else {
                    num3 = null;
                }
                Intrinsics.checkNotNull(num3);
                int intValue2 = num3.intValue();
                Object obj20 = list9.get(3);
                if (obj20 != null) {
                    num4 = (Integer) obj20;
                } else {
                    num4 = null;
                }
                Intrinsics.checkNotNull(num4);
                int intValue3 = num4.intValue();
                Object obj21 = list9.get(4);
                if (obj21 != null) {
                    str2 = (String) obj21;
                } else {
                    str2 = null;
                }
                Intrinsics.checkNotNull(str2);
                switch (iVar.ordinal()) {
                    case 0:
                        Object obj22 = list9.get(1);
                        J2.l lVar6 = ad.golf;
                        if (Intrinsics.areEqual(obj22, Boolean.FALSE) || obj22 == null) {
                            tVar = null;
                        } else {
                            tVar = (t) ((Function1) lVar6.purple).invoke(obj22);
                        }
                        Intrinsics.checkNotNull(tVar);
                        return new e(str2, intValue2, intValue3, tVar);
                    case 1:
                        Object obj23 = list9.get(1);
                        J2.l lVar7 = ad.hotel;
                        if (Intrinsics.areEqual(obj23, Boolean.FALSE) || obj23 == null) {
                            afVar = null;
                        } else {
                            afVar = (af) ((Function1) lVar7.purple).invoke(obj23);
                        }
                        Intrinsics.checkNotNull(afVar);
                        return new e(str2, intValue2, intValue3, afVar);
                    case 2:
                        Object obj24 = list9.get(1);
                        J2.l lVar8 = ad.charlie;
                        if (Intrinsics.areEqual(obj24, Boolean.FALSE) || obj24 == null) {
                            aqVar = null;
                        } else {
                            aqVar = (aq) ((Function1) lVar8.purple).invoke(obj24);
                        }
                        Intrinsics.checkNotNull(aqVar);
                        return new e(str2, intValue2, intValue3, aqVar);
                    case 3:
                        Object obj25 = list9.get(1);
                        J2.l lVar9 = ad.delta;
                        if (Intrinsics.areEqual(obj25, Boolean.FALSE) || obj25 == null) {
                            apVar = null;
                        } else {
                            apVar = (ap) ((Function1) lVar9.purple).invoke(obj25);
                        }
                        Intrinsics.checkNotNull(apVar);
                        return new e(str2, intValue2, intValue3, apVar);
                    case 4:
                        Object obj26 = list9.get(1);
                        J2.l lVar10 = ad.echo;
                        if (Intrinsics.areEqual(obj26, Boolean.FALSE) || obj26 == null) {
                            lVar = null;
                        } else {
                            lVar = (l) ((Function1) lVar10.purple).invoke(obj26);
                        }
                        Intrinsics.checkNotNull(lVar);
                        return new e(str2, intValue2, intValue3, lVar);
                    case 5:
                        Object obj27 = list9.get(1);
                        J2.l lVar11 = ad.foxtrot;
                        if (Intrinsics.areEqual(obj27, Boolean.FALSE) || obj27 == null) {
                            kVar = null;
                        } else {
                            kVar = (k) ((Function1) lVar11.purple).invoke(obj27);
                        }
                        Intrinsics.checkNotNull(kVar);
                        return new e(str2, intValue2, intValue3, kVar);
                    case 6:
                        Object obj28 = list9.get(1);
                        if (obj28 != null) {
                            str3 = (String) obj28;
                        } else {
                            str3 = null;
                        }
                        Intrinsics.checkNotNull(str3);
                        return new e(str2, intValue2, intValue3, new ah(str3));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 10:
                if (obj != null) {
                    str4 = (String) obj;
                } else {
                    str4 = null;
                }
                Intrinsics.checkNotNull(str4);
                return new aq(str4);
            case 11:
                if (obj != null) {
                    str5 = (String) obj;
                } else {
                    str5 = null;
                }
                Intrinsics.checkNotNull(str5);
                return new ap(str5);
            case 12:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list10 = (List) obj;
                Object obj29 = list10.get(0);
                if (obj29 != null) {
                    str6 = (String) obj29;
                } else {
                    str6 = null;
                }
                Intrinsics.checkNotNull(str6);
                Object obj30 = list10.get(1);
                J2.l lVar12 = ad.india;
                if (Intrinsics.areEqual(obj30, Boolean.FALSE) || obj30 == null) {
                    alVar2 = null;
                } else {
                    alVar2 = (al) ((Function1) lVar12.purple).invoke(obj30);
                }
                return new k(str6, alVar2);
            case 13:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj31 = list11.get(0);
                if (obj31 != null) {
                    kVar2 = (O0.k) obj31;
                } else {
                    kVar2 = null;
                }
                Intrinsics.checkNotNull(kVar2);
                int i15 = kVar2.alpha;
                Object obj32 = list11.get(1);
                if (obj32 != null) {
                    mVar = (O0.m) obj32;
                } else {
                    mVar = null;
                }
                Intrinsics.checkNotNull(mVar);
                int i16 = mVar.alpha;
                Object obj33 = list11.get(2);
                Q0.q[] qVarArr = Q0.p.bravo;
                ac acVar2 = ad.quebec;
                Boolean bool4 = Boolean.FALSE;
                Intrinsics.areEqual(obj33, bool4);
                if (obj33 != null) {
                    pVar = (Q0.p) acVar2.purple.invoke(obj33);
                } else {
                    pVar = null;
                }
                Intrinsics.checkNotNull(pVar);
                long j10 = pVar.alpha;
                Object obj34 = list11.get(3);
                O0.q qVar3 = O0.q.charlie;
                J2.l lVar13 = ad.lima;
                if (Intrinsics.areEqual(obj34, bool4) || obj34 == null) {
                    qVar2 = null;
                } else {
                    qVar2 = (O0.q) ((Function1) lVar13.purple).invoke(obj34);
                }
                Object obj35 = list11.get(4);
                J2.l lVar14 = ae.alpha;
                if (Intrinsics.areEqual(obj35, bool4) || obj35 == null) {
                    vVar = null;
                } else {
                    vVar = (v) ((Function1) lVar14.purple).invoke(obj35);
                }
                Object obj36 = list11.get(5);
                O0.i iVar3 = O0.i.charlie;
                J2.l lVar15 = ad.uniform;
                if (Intrinsics.areEqual(obj36, bool4) || obj36 == null) {
                    iVar2 = null;
                } else {
                    iVar2 = (O0.i) ((Function1) lVar15.purple).invoke(obj36);
                }
                Object obj37 = list11.get(6);
                J2.l lVar16 = ae.bravo;
                if (Intrinsics.areEqual(obj37, bool4) || obj37 == null) {
                    eVar2 = null;
                } else {
                    eVar2 = (O0.e) ((Function1) lVar16.purple).invoke(obj37);
                }
                Intrinsics.checkNotNull(eVar2);
                int i17 = eVar2.alpha;
                Object obj38 = list11.get(7);
                if (obj38 != null) {
                    dVar = (O0.d) obj38;
                } else {
                    dVar = null;
                }
                Intrinsics.checkNotNull(dVar);
                int i18 = dVar.alpha;
                Object obj39 = list11.get(8);
                J2.l lVar17 = ae.charlie;
                if (Intrinsics.areEqual(obj39, bool4) || obj39 == null) {
                    i4 = i18;
                    i5 = i17;
                    i10 = i15;
                    i11 = i16;
                    j5 = j10;
                    sVar = null;
                } else {
                    sVar = (O0.s) ((Function1) lVar17.purple).invoke(obj39);
                    i4 = i18;
                    i5 = i17;
                    i10 = i15;
                    i11 = i16;
                    j5 = j10;
                }
                return new t(i10, i11, j5, qVar2, vVar, iVar2, i5, i4, sVar);
            case 14:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj40 = list12.get(0);
                int i19 = C0366t.lima;
                Boolean bool5 = Boolean.FALSE;
                Intrinsics.areEqual(obj40, bool5);
                if (obj40 != null) {
                    if (Intrinsics.areEqual(obj40, bool5)) {
                        c0366t2 = new C0366t(C0366t.kilo);
                    } else {
                        c0366t2 = new C0366t(a0.ao.charlie(((Integer) obj40).intValue()));
                    }
                } else {
                    c0366t2 = null;
                }
                Intrinsics.checkNotNull(c0366t2);
                long j11 = c0366t2.alpha;
                Object obj41 = list12.get(1);
                Q0.q[] qVarArr2 = Q0.p.bravo;
                ac acVar3 = ad.quebec;
                Intrinsics.areEqual(obj41, bool5);
                Function1 function1 = acVar3.purple;
                if (obj41 != null) {
                    pVar2 = (Q0.p) function1.invoke(obj41);
                } else {
                    pVar2 = null;
                }
                Intrinsics.checkNotNull(pVar2);
                long j12 = pVar2.alpha;
                Object obj42 = list12.get(2);
                H0.v vVar3 = H0.v.purple;
                J2.l lVar18 = ad.mike;
                if (Intrinsics.areEqual(obj42, bool5) || obj42 == null) {
                    vVar2 = null;
                } else {
                    vVar2 = (H0.v) ((Function1) lVar18.purple).invoke(obj42);
                }
                Object obj43 = list12.get(3);
                if (obj43 != null) {
                    rVar = (H0.r) obj43;
                } else {
                    rVar = null;
                }
                Object obj44 = list12.get(4);
                if (obj44 != null) {
                    sVar2 = (H0.s) obj44;
                } else {
                    sVar2 = null;
                }
                Object obj45 = list12.get(6);
                if (obj45 != null) {
                    str7 = (String) obj45;
                } else {
                    str7 = null;
                }
                Object obj46 = list12.get(7);
                Intrinsics.areEqual(obj46, bool5);
                if (obj46 != null) {
                    pVar3 = (Q0.p) function1.invoke(obj46);
                } else {
                    pVar3 = null;
                }
                Intrinsics.checkNotNull(pVar3);
                long j13 = pVar3.alpha;
                Object obj47 = list12.get(8);
                J2.l lVar19 = ad.november;
                if (Intrinsics.areEqual(obj47, bool5) || obj47 == null) {
                    aVar2 = null;
                } else {
                    aVar2 = (O0.a) ((Function1) lVar19.purple).invoke(obj47);
                }
                Object obj48 = list12.get(9);
                J2.l lVar20 = ad.kilo;
                if (Intrinsics.areEqual(obj48, bool5) || obj48 == null) {
                    pVar4 = null;
                } else {
                    pVar4 = (O0.p) ((Function1) lVar20.purple).invoke(obj48);
                }
                Object obj49 = list12.get(10);
                K0.b bVar3 = K0.b.red;
                J2.l lVar21 = ad.sierra;
                if (Intrinsics.areEqual(obj49, bool5) || obj49 == null) {
                    bVar2 = null;
                } else {
                    bVar2 = (K0.b) ((Function1) lVar21.purple).invoke(obj49);
                }
                Object obj50 = list12.get(11);
                Intrinsics.areEqual(obj50, bool5);
                if (obj50 != null) {
                    if (Intrinsics.areEqual(obj50, bool5)) {
                        c0366t3 = new C0366t(C0366t.kilo);
                    } else {
                        c0366t3 = new C0366t(a0.ao.charlie(((Integer) obj50).intValue()));
                    }
                } else {
                    c0366t3 = null;
                }
                Intrinsics.checkNotNull(c0366t3);
                long j14 = c0366t3.alpha;
                Object obj51 = list12.get(12);
                J2.l lVar22 = ad.juliet;
                if (Intrinsics.areEqual(obj51, bool5) || obj51 == null) {
                    lVar2 = null;
                } else {
                    lVar2 = (O0.l) ((Function1) lVar22.purple).invoke(obj51);
                }
                Object obj52 = list12.get(13);
                ar arVar2 = ar.delta;
                J2.l lVar23 = ad.oscar;
                if (Intrinsics.areEqual(obj52, bool5) || obj52 == null) {
                    arVar = null;
                } else {
                    arVar = (ar) ((Function1) lVar23.purple).invoke(obj52);
                }
                return new af(j11, j12, vVar2, rVar, sVar2, (H0.k) null, str7, j13, aVar2, pVar4, bVar2, j14, lVar2, arVar, 49184);
            case 15:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj53 = list13.get(0);
                if (obj53 != null) {
                    bool = (Boolean) obj53;
                } else {
                    bool = null;
                }
                Intrinsics.checkNotNull(bool);
                boolean booleanValue = bool.booleanValue();
                Object obj54 = list13.get(1);
                if (obj54 != null) {
                    jVar = (j) obj54;
                } else {
                    jVar = null;
                }
                Intrinsics.checkNotNull(jVar);
                jVar.getClass();
                return new v(booleanValue);
            case 16:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Int");
                return new O0.e(((Integer) obj).intValue());
            case 17:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list14 = (List) obj;
                Object obj55 = list14.get(0);
                if (obj55 != null) {
                    rVar2 = (O0.r) obj55;
                } else {
                    rVar2 = null;
                }
                Intrinsics.checkNotNull(rVar2);
                int i20 = rVar2.alpha;
                Object obj56 = list14.get(1);
                if (obj56 != null) {
                    bool2 = (Boolean) obj56;
                } else {
                    bool2 = null;
                }
                Intrinsics.checkNotNull(bool2);
                return new O0.s(i20, bool2.booleanValue());
            case 18:
                Shift it = (Shift) obj;
                Intrinsics.echo(it, "it");
                Long id2 = it.getId();
                if (id2 == null) {
                    return 0L;
                }
                return id2;
            case 19:
                Context ctx = (Context) obj;
                Intrinsics.echo(ctx, "ctx");
                LottieAnimationView lottieAnimationView = new LottieAnimationView(ctx);
                lottieAnimationView.setAnimation(R.raw.no_data);
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                lottieAnimationView.playAnimation();
                return lottieAnimationView;
            case 20:
                return FlowComponentViewKt.mike((PaymentMethodComponent) obj);
            case 21:
                return FlowComponentViewKt.charlie((CardMetadata) obj);
            case 22:
                return FlowComponentViewKt.hotel((CheckoutError) obj);
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                throw A0.z.hotel(obj);
            case 26:
                return ExtensionsKt.alpha((StackTraceElement) obj);
            case 27:
                Order order = (Order) obj;
                Intrinsics.echo(order, "order");
                Integer id3 = order.getId();
                if (id3 == null) {
                    return Integer.valueOf(order.hashCode());
                }
                return id3;
            case 28:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + ": " + entry.getValue();
            default:
                Y1.ak navOptions = (Y1.ak) obj;
                int i21 = HomeActivityV2.f12269k0;
                Intrinsics.echo(navOptions, "$this$navOptions");
                navOptions.delta = R.id.nav_orders;
                navOptions.echo = false;
                ?? obj57 = new Object();
                int i22 = HomeActivityV2.f12269k0;
                obj57.alpha = false;
                navOptions.echo = obj57.alpha;
                navOptions.foxtrot = obj57.bravo;
                navOptions.bravo = true;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z(Q0.f fVar) {
        this.alpha = 25;
    }
}
