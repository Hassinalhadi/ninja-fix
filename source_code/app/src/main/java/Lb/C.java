package Lb;

import a0.InterfaceC0341aa;
import androidx.lifecycle.d0;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import delivery.samurai.android.ui.wallet.WalletFragment;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import delivery.samurai.android.ui.zones.ZonesFragment;
import ge.InterfaceC1772d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import of.AbstractC2262q;
import pe.InterfaceC2328d;
import pe.InterfaceC2345u;
import s0.AbstractC2555o;
import se.AbstractC2852b;
import se.AbstractC2863m;
import t0.C2946x;
import t6.Y1;

/* loaded from: classes2.dex */
public final class C extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i4, Object obj) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [Qe.k] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pe.x xVar;
        q0.z parentLayoutCoordinates;
        boolean z2;
        ?? emptyList;
        switch (this.alpha) {
            case 0:
                return (D) this.purple;
            case 1:
                return (d0) ((C) this.purple).invoke();
            case 2:
                return (TicketDetailsFragment) this.purple;
            case 3:
                return (d0) ((C) this.purple).invoke();
            case 4:
                Pe.q changeOptions = Pe.q.alpha;
                Pe.t tVar = (Pe.t) this.purple;
                tVar.getClass();
                Intrinsics.echo(changeOptions, "changeOptions");
                Pe.z zVar = tVar.delta;
                Pe.z zVar2 = new Pe.z();
                Field[] declaredFields = Pe.z.class.getDeclaredFields();
                Intrinsics.delta(declaredFields, "this::class.java.declaredFields");
                int length = declaredFields.length;
                ?? r72 = 0;
                int i4 = 0;
                while (i4 < length) {
                    Field field = declaredFields[i4];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj = field.get(zVar);
                        if (obj instanceof Pe.x) {
                            xVar = (Pe.x) obj;
                        } else {
                            xVar = null;
                        }
                        if (xVar != null) {
                            String name = field.getName();
                            Intrinsics.delta(name, "field.name");
                            kotlin.text.r.quebec(name, "is", r72);
                            InterfaceC1772d bravo = kotlin.jvm.internal.u.alpha.bravo(Pe.z.class);
                            String name2 = field.getName();
                            StringBuilder sb2 = new StringBuilder("get");
                            ?? name3 = field.getName();
                            Intrinsics.delta(name3, "field.name");
                            int length2 = name3.length();
                            String str = name3;
                            if (length2 > 0) {
                                char upperCase = Character.toUpperCase(name3.charAt(r72));
                                String substring = name3.substring(1);
                                Intrinsics.delta(substring, "this as java.lang.String).substring(startIndex)");
                                str = upperCase + substring;
                            }
                            sb2.append(str);
                            new kotlin.jvm.internal.o(bravo, name2, sb2.toString());
                            field.set(zVar2, new Pe.x(xVar.alpha, zVar2));
                        }
                    }
                    i4++;
                    r72 = 0;
                }
                changeOptions.invoke(zVar2);
                zVar2.alpha = true;
                return new Pe.t(zVar2);
            case 5:
                return (OrderHistoryFragment) this.purple;
            case 6:
                return (d0) ((C) this.purple).invoke();
            case 7:
                return (Qb.p) this.purple;
            case 8:
                return (d0) ((C) this.purple).invoke();
            case 9:
                return (TicketsFragment) this.purple;
            case 10:
                return (d0) ((C) this.purple).invoke();
            case 11:
                kotlin.reflect.jvm.internal.impl.types.y bravo2 = ((kotlin.reflect.jvm.internal.impl.types.as) this.purple).bravo();
                Intrinsics.delta(bravo2, "this@createCapturedIfNeeded.type");
                return bravo2;
            case 12:
                ((Se.m) this.purple).getClass();
                throw null;
            case 13:
                return (WalletFragment) this.purple;
            case 14:
                return (d0) ((C) this.purple).invoke();
            case 15:
                U0.z zVar3 = (U0.z) this.purple;
                parentLayoutCoordinates = zVar3.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.india()) {
                    parentLayoutCoordinates = null;
                }
                if (parentLayoutCoordinates != null && zVar3.m9getPopupContentSizebOM6tXw() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 16:
                return (Va.a) this.purple;
            case 17:
                return (d0) ((C) this.purple).invoke();
            case 18:
                return (Wa.b) this.purple;
            case 19:
                return (d0) ((C) this.purple).invoke();
            case 20:
                return (Wc.l) this.purple;
            case 21:
                return (d0) ((C) this.purple).invoke();
            case 22:
                return (WithDrawHistoryFragment) this.purple;
            case 23:
                return (d0) ((C) this.purple).invoke();
            case 24:
                X.b bVar = (X.b) this.purple;
                X.h hVar = bVar.red;
                X.h hVar2 = hVar;
                if (hVar == null) {
                    ?? obj2 = new Object();
                    bVar.red = obj2;
                    hVar2 = obj2;
                }
                if (hVar2.bravo == null) {
                    InterfaceC0341aa graphicsContext = ((C2946x) AbstractC2555o.hotel(bVar)).getGraphicsContext();
                    hVar2.charlie();
                    hVar2.bravo = graphicsContext;
                }
                return hVar2;
            case 25:
                return (Xa.g) this.purple;
            case 26:
                return (d0) ((C) this.purple).invoke();
            case 27:
                return (ZonesFragment) this.purple;
            case 28:
                return (d0) ((C) this.purple).invoke();
            default:
                Xe.h hVar3 = (Xe.h) this.purple;
                List hotel = hVar3.hotel();
                ArrayList arrayList = new ArrayList(3);
                AbstractC2852b abstractC2852b = hVar3.bravo;
                Collection lima = abstractC2852b.tango().lima();
                Intrinsics.delta(lima, "containingClass.typeConstructor.supertypes");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = lima.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, Y1.alpha(((kotlin.reflect.jvm.internal.impl.types.y) it.next()).olive(), null, 3));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof InterfaceC2328d) {
                        arrayList3.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    Ne.f name4 = ((InterfaceC2328d) next2).getName();
                    Object obj3 = linkedHashMap.get(name4);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(name4, obj3);
                    }
                    ((List) obj3).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Ne.f fVar = (Ne.f) entry.getKey();
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list) {
                        Boolean valueOf = Boolean.valueOf(((InterfaceC2328d) obj4) instanceof InterfaceC2345u);
                        Object obj5 = linkedHashMap2.get(valueOf);
                        if (obj5 == null) {
                            obj5 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj5);
                        }
                        ((List) obj5).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list2 = (List) entry2.getValue();
                        ?? r5 = Qe.k.charlie;
                        if (booleanValue) {
                            emptyList = new ArrayList();
                            for (Object obj6 : hotel) {
                                if (Intrinsics.areEqual(((AbstractC2863m) ((InterfaceC2345u) obj6)).getName(), fVar)) {
                                    emptyList.add(obj6);
                                }
                            }
                        } else {
                            emptyList = CollectionsKt.emptyList();
                        }
                        r5.hotel(fVar, list2, emptyList, abstractC2852b, new Xe.g(arrayList, hVar3));
                    }
                }
                return CollectionsKt.a(hotel, AbstractC2262q.delta(arrayList));
        }
    }
}
