package Fe;

import B9.ab;
import Ce.am;
import android.content.Context;
import gf.AbstractC1792g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.az;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import pe.InterfaceC2336l;
import pe.aq;
import ye.EnumC3424b;

/* loaded from: classes2.dex */
public final class u {
    public final boolean alpha;
    public final boolean bravo;
    public final Object charlie;
    public final Object delta;
    public final Object echo;

    public u(InterfaceC2336l interfaceC2336l, boolean z2, ab containerContext, EnumC3424b enumC3424b, boolean z10) {
        Intrinsics.echo(containerContext, "containerContext");
        this.charlie = interfaceC2336l;
        this.alpha = z2;
        this.delta = containerContext;
        this.echo = enumC3424b;
        this.bravo = z10;
    }

    public static void alpha(Object obj, ArrayList arrayList, A0.p pVar) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) pVar.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                alpha(it.next(), arrayList, pVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Collection, java.lang.Iterable] */
    public static j bravo(aq aqVar) {
        ?? arrayList;
        i iVar;
        boolean z2;
        Intrinsics.echo(aqVar, "<this>");
        if (aqVar instanceof am) {
            List<p000if.c> upperBounds = aqVar.getUpperBounds();
            Intrinsics.delta(upperBounds, "this.upperBounds");
            if (!upperBounds.isEmpty()) {
                Iterator it = upperBounds.iterator();
                while (it.hasNext()) {
                    if (!AbstractC1792g.azure((p000if.c) it.next())) {
                        if (!upperBounds.isEmpty()) {
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                if (delta((p000if.c) it2.next()) != null) {
                                    arrayList = upperBounds;
                                    break;
                                }
                            }
                        }
                        if (!upperBounds.isEmpty()) {
                            for (p000if.c cVar : upperBounds) {
                                Intrinsics.echo(cVar, "<this>");
                                if (kotlin.reflect.jvm.internal.impl.types.c.echo((y) cVar) != null) {
                                    arrayList = new ArrayList();
                                    for (p000if.c cVar2 : upperBounds) {
                                        Intrinsics.echo(cVar2, "<this>");
                                        y echo = kotlin.reflect.jvm.internal.impl.types.c.echo((y) cVar2);
                                        if (echo != null) {
                                            arrayList.add(echo);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        Iterator it3 = arrayList.iterator();
                                        while (it3.hasNext()) {
                                            if (!AbstractC1792g.crimson((p000if.c) it3.next())) {
                                                iVar = i.red;
                                                break;
                                            }
                                        }
                                    }
                                    iVar = i.purple;
                                    if (arrayList != upperBounds) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    return new j(iVar, z2);
                                }
                            }
                            return null;
                        }
                        return null;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static Ne.e charlie(ae aeVar) {
        InterfaceC2330f interfaceC2330f;
        Intrinsics.echo(aeVar, "<this>");
        hf.f fVar = az.alpha;
        InterfaceC2332h kilo = aeVar.green().kilo();
        if (kilo instanceof InterfaceC2330f) {
            interfaceC2330f = (InterfaceC2330f) kilo;
        } else {
            interfaceC2330f = null;
        }
        if (interfaceC2330f == null) {
            return null;
        }
        return Qe.e.golf(interfaceC2330f);
    }

    public static i delta(p000if.c cVar) {
        ae hotel;
        ae hotel2;
        Intrinsics.echo(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.types.s golf = AbstractC1792g.golf(cVar);
        if (golf == null || (hotel = AbstractC1792g.green(golf)) == null) {
            hotel = AbstractC1792g.hotel(cVar);
            Intrinsics.checkNotNull(hotel);
        }
        if (AbstractC1792g.bronze(hotel)) {
            return i.purple;
        }
        kotlin.reflect.jvm.internal.impl.types.s golf2 = AbstractC1792g.golf(cVar);
        if (golf2 == null || (hotel2 = AbstractC1792g.orange(golf2)) == null) {
            hotel2 = AbstractC1792g.hotel(cVar);
            Intrinsics.checkNotNull(hotel2);
        }
        if (!AbstractC1792g.bronze(hotel2)) {
            return i.red;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public ArrayList echo(p000if.c cVar) {
        ab abVar = (ab) this.delta;
        ye.y yVar = (ye.y) abVar.silver.getValue();
        Be.a aVar = (Be.a) abVar.purple;
        Intrinsics.echo(cVar, "<this>");
        a aVar2 = new a(cVar, aVar.quebec.bravo(yVar, ((y) cVar).getAnnotations()), null);
        A0.p pVar = new A0.p(12, this);
        ArrayList arrayList = new ArrayList(1);
        alpha(aVar2, arrayList, pVar);
        return arrayList;
    }

    public u(Context context, String str, B0.a callback, boolean z2, boolean z10) {
        Intrinsics.echo(callback, "callback");
        this.charlie = context;
        this.delta = str;
        this.echo = callback;
        this.alpha = z2;
        this.bravo = z10;
    }
}
