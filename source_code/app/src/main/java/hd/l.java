package hd;

import com.checkout.address.model.State;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.address.M;
import com.checkout.components.address.S;
import com.checkout.components.address.V;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.InputFieldViewKt;
import com.checkout.components.ui.view.InternalButtonViewKt;
import com.checkout.components.ui.view.RotateIconViewKt;
import com.clevertap.android.sdk.Constants;
import d.C1534h0;
import i.C1867p;
import i.C1874w;
import id.C1914b;
import id.C1915c;
import id.C1916d;
import io.getunleash.android.DefaultUnleash;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import jd.C1959a;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ld.AbstractC2073i;
import pd.C2303a;
import s6.Q4;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ l(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit _init_$lambda$0;
        Unit InputComponentContainerPreview$lambda$8$lambda$7$lambda$6;
        Unit InputFieldView$lambda$8$lambda$4$lambda$3;
        Unit InternalButtonView$lambda$3$lambda$2$lambda$1$lambda$0;
        boolean z2;
        int i4 = 3;
        int i5 = 1;
        int i10 = 0;
        Nd.c cVar = null;
        switch (this.alpha) {
            case 0:
                C1914b createClientPlugin = (C1914b) obj;
                Intrinsics.echo(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.alpha.yellow.golf(C2303a.golf, new cd.a(i4, cVar));
                return Unit.INSTANCE;
            case 1:
                C1914b createClientPlugin2 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin2, "$this$createClientPlugin");
                ((at) createClientPlugin2.bravo).getClass();
                n.alpha().charlie();
                return Unit.INSTANCE;
            case 2:
                C1914b createClientPlugin3 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin3, "$this$createClientPlugin");
                o oVar = (o) createClientPlugin3.bravo;
                List i11 = CollectionsKt.i(oVar.alpha);
                List i12 = CollectionsKt.i(oVar.bravo);
                createClientPlugin3.alpha(id.g.red, new q(oVar.charlie, null));
                createClientPlugin3.alpha(id.g.purple, new cd.a(i11, cVar, i4));
                createClientPlugin3.alpha(C1845a.white, new r(i12, cVar, i10));
                createClientPlugin3.alpha(C1845a.silver, new r(i12, cVar, i5));
                return Unit.INSTANCE;
            case 3:
                C1914b createClientPlugin4 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin4, "$this$createClientPlugin");
                y yVar = (y) createClientPlugin4.bravo;
                List<Pair> p4 = CollectionsKt.p(kotlin.collections.y.xray(yVar.bravo), new ac(1));
                LinkedHashSet linkedHashSet = yVar.alpha;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedHashSet) {
                    if (!yVar.bravo.containsKey((Charset) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<Charset> p5 = CollectionsKt.p(arrayList, new ac(0));
                StringBuilder sb2 = new StringBuilder();
                for (Charset charset : p5) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.SEPARATOR_COMMA);
                    }
                    sb2.append(Q4.charlie(charset));
                }
                for (Pair pair : p4) {
                    Charset charset2 = (Charset) pair.first;
                    float floatValue = ((Number) pair.second).floatValue();
                    if (sb2.length() > 0) {
                        sb2.append(Constants.SEPARATOR_COMMA);
                    }
                    double d4 = floatValue;
                    if (0.0d <= d4 && d4 <= 1.0d) {
                        sb2.append(Q4.charlie(charset2) + ";q=" + (Zd.a.delta(100 * floatValue) / 100.0d));
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                int length = sb2.length();
                Charset charset3 = yVar.charlie;
                if (length == 0) {
                    sb2.append(Q4.charlie(charset3));
                }
                String sb3 = sb2.toString();
                Charset charset4 = (Charset) CollectionsKt.green(p5);
                if (charset4 == null) {
                    Pair pair2 = (Pair) CollectionsKt.green(p4);
                    if (pair2 != null) {
                        charset4 = (Charset) pair2.getFirst();
                    } else {
                        charset4 = null;
                    }
                    if (charset4 == null) {
                        charset4 = kotlin.text.a.alpha;
                    }
                }
                createClientPlugin4.alpha(C1845a.teal, new aa(sb3, charset4, null));
                createClientPlugin4.alpha(id.g.teal, new ab(charset3, null));
                return Unit.INSTANCE;
            case 4:
                C1914b createClientPlugin5 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin5, "$this$createClientPlugin");
                ((ae) createClientPlugin5.bravo).getClass();
                createClientPlugin5.alpha(id.g.purple, new cd.a(createClientPlugin5, cVar, 4));
                return Unit.INSTANCE;
            case 5:
                C1914b createClientPlugin6 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin6, "$this$createClientPlugin");
                createClientPlugin6.alpha(C1845a.yellow, new cd.a(createClientPlugin6, cVar, 5));
                return Unit.INSTANCE;
            case 6:
                C1914b createClientPlugin7 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin7, "$this$createClientPlugin");
                ao aoVar = (ao) createClientPlugin7.bravo;
                createClientPlugin7.alpha(id.g.purple, new j(aoVar.alpha, aoVar.bravo, aoVar.charlie, null));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj).getClass();
                return null;
            case 8:
                return Unit.INSTANCE;
            case 9:
                List list = (List) obj;
                return new C1874w(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 10:
                return Unit.INSTANCE;
            case 11:
                return DefaultUnleash.charlie((File) obj);
            case 12:
                return Unit.INSTANCE;
            case 13:
                List list2 = (List) obj;
                return new j.t(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 14:
                ((Integer) obj).intValue();
                return CollectionsKt.emptyList();
            case 15:
                ((Integer) obj).getClass();
                j.l lVar = j.u.alpha;
                return -1;
            case 16:
                return M.a((A0.ad) obj);
            case 17:
                return S.a((A0.ad) obj);
            case 18:
                return V.a((State) obj);
            case 19:
                return AbstractC0870k.a((A0.ad) obj);
            case 20:
                _init_$lambda$0 = TextLabelViewStyle._init_$lambda$0((D0.ak) obj);
                return _init_$lambda$0;
            case 21:
                A0.ad semantics = (A0.ad) obj;
                Intrinsics.echo(semantics, "$this$semantics");
                A0.aa.echo(semantics, 0);
                return Unit.INSTANCE;
            case 22:
                A0.ad semantics2 = (A0.ad) obj;
                Intrinsics.echo(semantics2, "$this$semantics");
                A0.aa.echo(semantics2, 0);
                return Unit.INSTANCE;
            case 23:
                C1914b createClientPlugin8 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin8, "$this$createClientPlugin");
                jd.b bVar = (jd.b) createClientPlugin8.bravo;
                ArrayList arrayList2 = bVar.bravo;
                LinkedHashSet linkedHashSet2 = bVar.alpha;
                createClientPlugin8.alpha(id.g.silver, new jd.d(null, createClientPlugin8, arrayList2, linkedHashSet2));
                createClientPlugin8.alpha(id.g.teal, new jd.e(null, createClientPlugin8, arrayList2, linkedHashSet2));
                return Unit.INSTANCE;
            case 24:
                C1959a it = (C1959a) obj;
                Intrinsics.echo(it, "it");
                return it.alpha.toString();
            case 25:
                InputComponentContainerPreview$lambda$8$lambda$7$lambda$6 = InputContainerViewKt.InputComponentContainerPreview$lambda$8$lambda$7$lambda$6(((Boolean) obj).booleanValue());
                return InputComponentContainerPreview$lambda$8$lambda$7$lambda$6;
            case 26:
                InputFieldView$lambda$8$lambda$4$lambda$3 = InputFieldViewKt.InputFieldView$lambda$8$lambda$4$lambda$3((A0.ad) obj);
                return InputFieldView$lambda$8$lambda$4$lambda$3;
            case 27:
                InternalButtonView$lambda$3$lambda$2$lambda$1$lambda$0 = InternalButtonViewKt.InternalButtonView$lambda$3$lambda$2$lambda$1$lambda$0((A0.ad) obj);
                return InternalButtonView$lambda$3$lambda$2$lambda$1$lambda$0;
            case 28:
                return RotateIconViewKt.alpha((bz.al) obj);
            default:
                C1914b createClientPlugin9 = (C1914b) obj;
                Intrinsics.echo(createClientPlugin9, "$this$createClientPlugin");
                kd.i iVar = (kd.i) createClientPlugin9.bravo;
                kd.g gVar = iVar.charlie;
                if (gVar == null) {
                    Lazy lazy = kd.h.alpha;
                    gVar = new com.google.android.material.internal.s(16);
                }
                kd.g gVar2 = gVar;
                kd.e eVar = iVar.echo;
                ArrayList arrayList3 = iVar.alpha;
                ArrayList arrayList4 = iVar.bravo;
                if (iVar.delta == kd.j.purple) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                createClientPlugin9.alpha(kd.ai.teal, new kd.n(z2, gVar2, arrayList3, arrayList4, eVar, createClientPlugin9, null));
                createClientPlugin9.alpha(kd.ai.red, new kd.n(z2, gVar2, arrayList4, eVar, createClientPlugin9, null));
                createClientPlugin9.alpha(kd.ai.silver, new kd.o(z2, eVar, arrayList4, null));
                createClientPlugin9.alpha(kd.ai.purple, new kd.p(z2, eVar, null));
                if (z2) {
                    return Unit.INSTANCE;
                }
                if (!eVar.red) {
                    return Unit.INSTANCE;
                }
                C1915c c1915c = AbstractC2073i.alpha;
                c1915c.bravo((C1916d) c1915c.foxtrot(new C1534h0(21, eVar)), createClientPlugin9.alpha);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(int i4, C1867p c1867p) {
        this.alpha = 10;
    }
}
