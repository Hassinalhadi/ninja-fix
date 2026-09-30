package androidx.compose.runtime;

import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.AddressNoteListItemKt;
import com.app.network.network.models.OrderTask;
import delivery.samurai.android.AndroidApp;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import s6.I5;

/* loaded from: classes3.dex */
public final /* synthetic */ class P implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ P(int i4, int i5, Object obj, Object obj2) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
        this.silver = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2;
        int i4;
        boolean z10;
        int i5;
        int i10;
        boolean z11;
        int i11;
        D0.ak akVar;
        boolean z12 = true;
        Object obj2 = this.silver;
        int i12 = this.purple;
        int i13 = 0;
        Object obj3 = this.red;
        switch (this.alpha) {
            case 0:
                InterfaceC0586s interfaceC0586s = (InterfaceC0586s) obj;
                Q q4 = (Q) obj3;
                if (q4.echo == i12) {
                    bv.ag agVar = (bv.ag) obj2;
                    if (Intrinsics.areEqual(agVar, q4.foxtrot) && (interfaceC0586s instanceof C0590w)) {
                        long[] jArr = agVar.alpha;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j5 = jArr[i14];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8;
                                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                                    int i17 = i13;
                                    while (i17 < i16) {
                                        if ((255 & j5) < 128) {
                                            int i18 = (i14 << 3) + i17;
                                            z10 = z12;
                                            Object obj4 = agVar.bravo[i18];
                                            if (agVar.charlie[i18] != i12) {
                                                z11 = z10;
                                            } else {
                                                z11 = false;
                                            }
                                            if (z11) {
                                                i10 = i15;
                                                C0590w c0590w = (C0590w) interfaceC0586s;
                                                I5.delta(c0590w.yellow, obj4, q4);
                                                if (obj4 instanceof ad) {
                                                    ad adVar = (ad) obj4;
                                                    i5 = i12;
                                                    if (!c0590w.yellow.charlie(adVar)) {
                                                        I5.echo(c0590w.f3009c, adVar);
                                                    }
                                                    bv.al alVar = q4.golf;
                                                    if (alVar != null) {
                                                        alVar.kilo(obj4);
                                                    }
                                                } else {
                                                    i5 = i12;
                                                }
                                            } else {
                                                i5 = i12;
                                                i10 = i15;
                                            }
                                            if (z11) {
                                                agVar.golf(i18);
                                            }
                                        } else {
                                            z10 = z12;
                                            i5 = i12;
                                            i10 = i15;
                                        }
                                        j5 >>= i10;
                                        i17++;
                                        i15 = i10;
                                        z12 = z10;
                                        i12 = i5;
                                    }
                                    z2 = z12;
                                    i4 = i12;
                                    if (i16 != i15) {
                                    }
                                } else {
                                    z2 = z12;
                                    i4 = i12;
                                }
                                if (i14 != length) {
                                    i14++;
                                    z12 = z2;
                                    i12 = i4;
                                    i13 = 0;
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                b.e0 e0Var = (b.e0) obj3;
                int foxtrot = e0Var.alpha.foxtrot();
                if (foxtrot < 0) {
                    foxtrot = 0;
                }
                if (foxtrot <= i12) {
                    i12 = foxtrot;
                }
                int i19 = -i12;
                boolean z13 = e0Var.purple;
                if (z13) {
                    i11 = 0;
                } else {
                    i11 = i19;
                }
                if (!z13) {
                    i19 = 0;
                }
                abstractC2366B.alpha = true;
                AbstractC2366B.kilo(abstractC2366B, (AbstractC2367C) obj2, i11, i19);
                abstractC2366B.alpha = false;
                return Unit.INSTANCE;
            case 2:
                AbstractC2366B abstractC2366B2 = (AbstractC2366B) obj;
                n.l0 l0Var = (n.l0) obj3;
                int i20 = l0Var.purple;
                n.e0 e0Var2 = (n.e0) l0Var.silver.invoke();
                if (e0Var2 != null) {
                    akVar = e0Var2.alpha;
                } else {
                    akVar = null;
                }
                AbstractC2367C abstractC2367C = (AbstractC2367C) obj2;
                Z.c lima = n.at.lima(abstractC2366B2, i20, l0Var.red, akVar, false, abstractC2367C.alpha);
                d.K k6 = d.K.alpha;
                int i21 = abstractC2367C.purple;
                n.c0 c0Var = l0Var.alpha;
                c0Var.bravo(k6, lima, i12, i21);
                AbstractC2366B.juliet(abstractC2366B2, abstractC2367C, 0, Math.round(-c0Var.alpha()));
                return Unit.INSTANCE;
            default:
                List<AddressNoteListItem> list = (List) obj;
                Intrinsics.checkNotNull(list);
                AddressNoteListItemKt.attachNoteNumbers(list);
                OrdersViewModel ordersViewModel = (OrdersViewModel) obj3;
                AndroidApp androidApp = ordersViewModel.alpha;
                int size = list.size();
                AtomicInteger atomicInteger = L9.d.alpha;
                Intrinsics.echo(androidApp, "<this>");
                androidApp.getSharedPreferences("AddressNotesPref", 0).edit().putInt("original_count_" + i12, size).apply();
                L9.d.cyan(i12, ordersViewModel.alpha, list);
                OrderTask orderTask = (OrderTask) obj2;
                orderTask.setAllAddressNotes(list);
                orderTask.setFirstAddressNote((AddressNoteListItem) CollectionsKt.green(list));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ P(n.l0 l0Var, AbstractC2367C abstractC2367C, int i4) {
        this.alpha = 2;
        this.red = l0Var;
        this.silver = abstractC2367C;
        this.purple = i4;
    }
}
