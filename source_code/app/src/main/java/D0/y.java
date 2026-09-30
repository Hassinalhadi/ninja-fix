package D0;

import F.AbstractC0141o0;
import F.G2;
import Jb.aw;
import Lb.AbstractC0225h;
import Lb.ax;
import a0.C0366t;
import a0.ar;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.core.ui.content.ComposableSingletons$FlowComponentItemViewKt;
import com.checkout.components.interfaces.model.ComponentResult;
import com.google.android.gms.measurement.internal.C1473v;
import delivery.samurai.android.R;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import l3.AbstractC2056a;
import q0.C2391j;
import s6.AbstractC2636d7;
import s6.AbstractC2644e6;
import s6.AbstractC2760r6;
import s6.T5;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.W3;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Xd.l {
    public final /* synthetic */ int alpha;

    public /* synthetic */ y(int i4) {
        this.alpha = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean alpha;
        boolean bravo;
        i iVar;
        Object alpha2;
        Unit a6;
        Unit a8;
        C1473v c1473v = kotlinx.serialization.modules.a.alpha;
        T.p pVar = T.p.alpha;
        int i4 = 8;
        boolean z2 = false;
        switch (this.alpha) {
            case 0:
                am amVar = (am) obj2;
                return CollectionsKt.azure(Integer.valueOf((int) (amVar.alpha >> 32)), Integer.valueOf((int) (amVar.alpha & 4294967295L)));
            case 1:
                R.b bVar = (R.b) obj;
                ar arVar = (ar) obj2;
                return CollectionsKt.azure(ad.alpha(new C0366t(arVar.alpha), ad.papa, bVar), ad.alpha(new Z.b(arVar.bravo), ad.romeo, bVar), Float.valueOf(arVar.charlie));
            case 2:
                Q0.p pVar2 = (Q0.p) obj2;
                long j5 = Q0.p.charlie;
                if (pVar2 == null) {
                    alpha = false;
                } else {
                    alpha = Q0.p.alpha(pVar2.alpha, j5);
                }
                if (alpha) {
                    return Boolean.FALSE;
                }
                return CollectionsKt.azure(Float.valueOf(Q0.p.charlie(pVar2.alpha)), new Q0.q(Q0.p.bravo(pVar2.alpha)));
            case 3:
                Z.b bVar2 = (Z.b) obj2;
                if (bVar2 == null) {
                    bravo = false;
                } else {
                    bravo = Z.b.bravo(bVar2.alpha, 9205357640488583168L);
                }
                if (bravo) {
                    return Boolean.FALSE;
                }
                return CollectionsKt.azure(Float.valueOf(Float.intBitsToFloat((int) (bVar2.alpha >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar2.alpha & 4294967295L))));
            case 4:
                R.b bVar3 = (R.b) obj;
                List list = ((K0.b) obj2).alpha;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(ad.alpha((K0.a) list.get(i5), ad.tango, bVar3));
                }
                return arrayList;
            case 5:
                return ((K0.a) obj2).alpha.toLanguageTag();
            case 6:
                O0.i iVar2 = (O0.i) obj2;
                return CollectionsKt.azure(new O0.f(iVar2.alpha), new O0.h(iVar2.bravo), new Object());
            case 7:
                R.b bVar4 = (R.b) obj;
                e eVar = (e) obj2;
                Object obj3 = eVar.alpha;
                if (obj3 instanceof t) {
                    iVar = i.alpha;
                } else if (obj3 instanceof af) {
                    iVar = i.purple;
                } else if (obj3 instanceof aq) {
                    iVar = i.red;
                } else if (obj3 instanceof ap) {
                    iVar = i.silver;
                } else if (obj3 instanceof l) {
                    iVar = i.teal;
                } else if (obj3 instanceof k) {
                    iVar = i.white;
                } else if (obj3 instanceof ah) {
                    iVar = i.yellow;
                } else {
                    throw new UnsupportedOperationException();
                }
                int ordinal = iVar.ordinal();
                Object obj4 = eVar.alpha;
                switch (ordinal) {
                    case 0:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        alpha2 = ad.alpha((t) obj4, ad.golf, bVar4);
                        break;
                    case 1:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        alpha2 = ad.alpha((af) obj4, ad.hotel, bVar4);
                        break;
                    case 2:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        alpha2 = ad.alpha((aq) obj4, ad.charlie, bVar4);
                        break;
                    case 3:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        alpha2 = ad.alpha((ap) obj4, ad.delta, bVar4);
                        break;
                    case 4:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        alpha2 = ad.alpha((l) obj4, ad.echo, bVar4);
                        break;
                    case 5:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        alpha2 = ad.alpha((k) obj4, ad.foxtrot, bVar4);
                        break;
                    case 6:
                        Intrinsics.charlie(obj4, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        alpha2 = ((ah) obj4).alpha;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return CollectionsKt.azure(iVar, alpha2, Integer.valueOf(eVar.bravo), Integer.valueOf(eVar.charlie), eVar.delta);
            case 8:
                k kVar = (k) obj2;
                return CollectionsKt.azure(kVar.alpha, ad.alpha(kVar.bravo, ad.india, (R.b) obj));
            case 9:
                return ((aq) obj2).alpha;
            case 10:
                return ((ap) obj2).alpha;
            case 11:
                R.b bVar5 = (R.b) obj;
                t tVar = (t) obj2;
                O0.k kVar2 = new O0.k(tVar.alpha);
                O0.m mVar = new O0.m(tVar.bravo);
                Object alpha3 = ad.alpha(new Q0.p(tVar.charlie), ad.quebec, bVar5);
                O0.q qVar = O0.q.charlie;
                Object alpha4 = ad.alpha(tVar.delta, ad.lima, bVar5);
                Object alpha5 = ad.alpha(tVar.echo, ae.alpha, bVar5);
                O0.i iVar3 = O0.i.charlie;
                return CollectionsKt.azure(kVar2, mVar, alpha3, alpha4, alpha5, ad.alpha(tVar.foxtrot, ad.uniform, bVar5), ad.alpha(new O0.e(tVar.golf), ae.bravo, bVar5), new O0.d(tVar.hotel), ad.alpha(tVar.india, ae.charlie, bVar5));
            case 12:
                R.b bVar6 = (R.b) obj;
                af afVar = (af) obj2;
                C0366t c0366t = new C0366t(afVar.alpha.bravo());
                ac acVar = ad.papa;
                Object alpha6 = ad.alpha(c0366t, acVar, bVar6);
                Q0.p pVar3 = new Q0.p(afVar.bravo);
                ac acVar2 = ad.quebec;
                Object alpha7 = ad.alpha(pVar3, acVar2, bVar6);
                H0.v vVar = H0.v.purple;
                Object alpha8 = ad.alpha(afVar.charlie, ad.mike, bVar6);
                Object alpha9 = ad.alpha(new Q0.p(afVar.hotel), acVar2, bVar6);
                Object alpha10 = ad.alpha(afVar.india, ad.november, bVar6);
                Object alpha11 = ad.alpha(afVar.juliet, ad.kilo, bVar6);
                K0.b bVar7 = K0.b.red;
                Object alpha12 = ad.alpha(afVar.kilo, ad.sierra, bVar6);
                Object alpha13 = ad.alpha(new C0366t(afVar.lima), acVar, bVar6);
                Object alpha14 = ad.alpha(afVar.mike, ad.juliet, bVar6);
                ar arVar2 = ar.delta;
                return CollectionsKt.azure(alpha6, alpha7, alpha8, afVar.delta, afVar.echo, -1, afVar.golf, alpha9, alpha10, alpha11, alpha12, alpha13, alpha14, ad.alpha(afVar.november, ad.oscar, bVar6));
            case 13:
                R.b bVar8 = (R.b) obj;
                al alVar = (al) obj2;
                af afVar2 = alVar.alpha;
                J2.l lVar = ad.hotel;
                return CollectionsKt.azure(ad.alpha(afVar2, lVar, bVar8), ad.alpha(alVar.bravo, lVar, bVar8), ad.alpha(alVar.charlie, lVar, bVar8), ad.alpha(alVar.delta, lVar, bVar8));
            case 14:
                Boolean valueOf = Boolean.valueOf(((v) obj2).alpha);
                J2.l lVar2 = ad.alpha;
                return CollectionsKt.azure(valueOf, new Object());
            case 15:
                return Integer.valueOf(((O0.e) obj2).alpha);
            case 16:
                O0.s sVar = (O0.s) obj2;
                O0.r rVar = new O0.r(sVar.alpha);
                J2.l lVar3 = ad.alpha;
                return CollectionsKt.azure(rVar, Boolean.valueOf(sVar.bravo));
            case 17:
                a6 = FlowComponentViewKt.a((ComponentResult) obj, ((Boolean) obj2).booleanValue());
                return a6;
            case 18:
                a8 = FlowComponentViewKt.a(((Integer) obj).intValue(), (String) obj2);
                return a8;
            case 19:
                return ComposableSingletons$FlowComponentItemViewKt.bravo(((Integer) obj).intValue(), (String) obj2);
            case 20:
                return ComposableSingletons$FlowComponentItemViewKt.alpha((InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 21:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(1 & intValue, z2)) {
                    z.s.bravo(AbstractC2056a.alpha(), "", V.kilo(pVar, 24), C0366t.echo, c0585q, 3504, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 22:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z2)) {
                    W3.alpha(AbstractC3076w3.charlie(R.drawable.ic_baseline_close_24, c0585q2, 6), AbstractC3086y3.bravo(c0585q2, R.string.close), AbstractC0538d.sierra(pVar, 1), null, C2391j.echo, 0.0f, null, c0585q2, 24960, 104);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj).getClass();
                Jb.ai row = (Jb.ai) obj2;
                Intrinsics.echo(row, "row");
                if (row instanceof Jb.ag) {
                    return "header_".concat(((Jb.ag) row).alpha);
                }
                if (row instanceof Jb.ah) {
                    return "item_" + ((Jb.ah) row).alpha;
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                InterfaceC1772d clazz = (InterfaceC1772d) obj;
                List types = (List) obj2;
                Intrinsics.echo(clazz, "clazz");
                Intrinsics.echo(types, "types");
                ArrayList echo = T5.echo(c1473v, types, true);
                Intrinsics.checkNotNull(echo);
                return T5.alpha(clazz, echo, new Jf.f(0, types));
            case 25:
                InterfaceC1772d clazz2 = (InterfaceC1772d) obj;
                List types2 = (List) obj2;
                Intrinsics.echo(clazz2, "clazz");
                Intrinsics.echo(types2, "types");
                ArrayList echo2 = T5.echo(c1473v, types2, true);
                Intrinsics.checkNotNull(echo2);
                KSerializer alpha15 = T5.alpha(clazz2, echo2, new Jf.f(1, types2));
                if (alpha15 != null) {
                    return AbstractC2644e6.bravo(alpha15);
                }
                return null;
            case 26:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (!c0585q3.magenta(1 & intValue3, z2)) {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
            case 27:
                InterfaceC0581m interfaceC0581m4 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                }
                C0585q c0585q4 = (C0585q) interfaceC0581m4;
                if (c0585q4.magenta(1 & intValue4, z2)) {
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.information_line, c0585q4, 6), null, V.kilo(pVar, 20), AbstractC0225h.lima, c0585q4, 3504, 0);
                } else {
                    c0585q4.ochre();
                }
                return Unit.INSTANCE;
            case 28:
                InterfaceC0581m interfaceC0581m5 = (InterfaceC0581m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z2 = true;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m5;
                if (c0585q5.magenta(1 & intValue5, z2)) {
                    Object jade = c0585q5.jade();
                    if (jade == C0580l.alpha) {
                        jade = new aw(i4);
                        c0585q5.f(jade);
                    }
                    AbstractC2760r6.alpha(false, (Function1) jade, null, false, c0585q5, 3126);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m6 = (InterfaceC0581m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z2 = true;
                }
                C0585q c0585q6 = (C0585q) interfaceC0581m6;
                if (c0585q6.magenta(1 & intValue6, z2)) {
                    G2.bravo(AbstractC3086y3.bravo(c0585q6, R.string.stc_mobile_label), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ax.kilo, AbstractC2636d7.charlie(13), null, null, Db.g.alpha, 0L, 0, 0L, 0, 16777180), c0585q6, 0, 0, 65534);
                } else {
                    c0585q6.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
