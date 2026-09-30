package A4;

import Cb.c;
import D0.ac;
import D0.ad;
import D0.af;
import D0.al;
import D0.g;
import D0.q;
import D0.t;
import H0.v;
import J2.l;
import Q0.p;
import com.checkout.components.core.common.components.factory.DefaultCardComponentFactory;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        af afVar;
        af afVar2;
        af afVar3;
        List list;
        p pVar;
        af afVar4 = null;
        p pVar2 = null;
        String str = null;
        afVar4 = null;
        switch (this.alpha) {
            case 0:
                return DefaultCardComponentFactory.charlie((PaymentMethod) obj);
            case 1:
                return DefaultCardComponentFactory.alpha((PaymentMethod) obj);
            case 2:
                c it = (c) obj;
                Intrinsics.echo(it, "it");
                return it.alpha;
            case 3:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 5:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 6:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 7:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 8:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 9:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 10:
                String it2 = (String) obj;
                Intrinsics.echo(it2, "it");
                return it2;
            case 11:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 12:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 13:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 14:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 15:
                String it3 = (String) obj;
                Intrinsics.echo(it3, "it");
                return it3;
            case 16:
                String option = (String) obj;
                Intrinsics.echo(option, "option");
                int hashCode = option.hashCode();
                if (hashCode != -437716159) {
                    if (hashCode != 2092848) {
                        if (hashCode == 2092883 && option.equals("Cash")) {
                            return "Pay with cash on delivery";
                        }
                    } else if (option.equals("Card")) {
                        return "Pay with credit or debit card";
                    }
                } else if (option.equals("Digital Wallet")) {
                    return "Pay using mobile payment app";
                }
                return "";
            case 17:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 18:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 19:
                Intrinsics.echo((String) obj, "it");
                return Unit.INSTANCE;
            case 20:
                String it4 = (String) obj;
                Intrinsics.echo(it4, "it");
                return it4;
            case 21:
                return Boolean.valueOf(!(((D0.b) obj) instanceof t));
            case 22:
                q qVar = (q) obj;
                StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
                sb2.append(qVar.bravo);
                sb2.append(", ");
                return Q0.c.quebec(sb2, qVar.charlie, ')');
            case 23:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                l lVar = ad.hotel;
                Boolean bool = Boolean.FALSE;
                boolean areEqual = Intrinsics.areEqual(obj2, bool);
                Function1 function1 = (Function1) lVar.purple;
                if (areEqual || obj2 == null) {
                    afVar = null;
                } else {
                    afVar = (af) function1.invoke(obj2);
                }
                Object obj3 = list2.get(1);
                if (Intrinsics.areEqual(obj3, bool) || obj3 == null) {
                    afVar2 = null;
                } else {
                    afVar2 = (af) function1.invoke(obj3);
                }
                Object obj4 = list2.get(2);
                if (Intrinsics.areEqual(obj4, bool) || obj4 == null) {
                    afVar3 = null;
                } else {
                    afVar3 = (af) function1.invoke(obj4);
                }
                Object obj5 = list2.get(3);
                if (!Intrinsics.areEqual(obj5, bool) && obj5 != null) {
                    afVar4 = (af) function1.invoke(obj5);
                }
                return new al(afVar, afVar2, afVar3, afVar4);
            case 24:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj6 = list3.get(1);
                l lVar2 = ad.alpha;
                if (Intrinsics.areEqual(obj6, Boolean.FALSE) || obj6 == null) {
                    list = null;
                } else {
                    list = (List) ((Function1) lVar2.purple).invoke(obj6);
                }
                Object obj7 = list3.get(0);
                if (obj7 != null) {
                    str = (String) obj7;
                }
                Intrinsics.checkNotNull(str);
                return new g(list, str);
            case 25:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Int");
                return new O0.l(((Integer) obj).intValue());
            case 26:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list4 = (List) obj;
                return new O0.p(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 27:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                Q0.q[] qVarArr = p.bravo;
                ac acVar = ad.quebec;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.areEqual(obj8, bool2);
                Function1 function12 = acVar.purple;
                if (obj8 != null) {
                    pVar = (p) function12.invoke(obj8);
                } else {
                    pVar = null;
                }
                Intrinsics.checkNotNull(pVar);
                long j5 = pVar.alpha;
                Object obj9 = list5.get(1);
                Intrinsics.areEqual(obj9, bool2);
                if (obj9 != null) {
                    pVar2 = (p) function12.invoke(obj9);
                }
                Intrinsics.checkNotNull(pVar2);
                return new O0.q(j5, pVar2.alpha);
            case 28:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Int");
                return new v(((Integer) obj).intValue());
            default:
                Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlin.Float");
                return new O0.a(((Float) obj).floatValue());
        }
    }
}
