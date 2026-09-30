package com.checkout.components.ui.picker;

import Ac.n;
import B9.ab;
import F.C0113h0;
import F.O2;
import F.P2;
import F.Q1;
import F.Q2;
import F.ag;
import F4.f;
import N2.ae;
import P.e;
import T.d;
import T.s;
import Xd.l;
import Xd.m;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.d0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import bx.L;
import bz.AbstractC0779d;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.PickerViewState;
import com.checkout.components.ui.utils.constants.TestTags;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import h.AbstractC1797a;
import i.AbstractC1876y;
import i.C1860i;
import i.C1874w;
import i.InterfaceC1854c;
import i.InterfaceC1869r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import t0.AbstractC2911e0;

@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u007f\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "selectedItem", "", "filteredItems", "Lkotlin/Function1;", "", "", "onQueryChanged", "Lkotlin/Function0;", "onDismiss", "buildItemKey", "Lcom/checkout/components/ui/model/PickerViewState;", "state", "itemView", "PickerContentView", "(Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/ui/model/PickerViewState;LXd/m;Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickerContentViewKt {
    public static final <T> void PickerContentView(@Nullable T t5, @NotNull final List<? extends T> filteredItems, @NotNull final Function1<? super String, Unit> onQueryChanged, @NotNull Function0<Unit> onDismiss, @NotNull final Function1<? super T, String> buildItemKey, @NotNull final PickerViewState state, @NotNull final m itemView, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean india;
        int i16;
        Intrinsics.echo(filteredItems, "filteredItems");
        Intrinsics.echo(onQueryChanged, "onQueryChanged");
        Intrinsics.echo(onDismiss, "onDismiss");
        Intrinsics.echo(buildItemKey, "buildItemKey");
        Intrinsics.echo(state, "state");
        Intrinsics.echo(itemView, "itemView");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-2115446755);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q2.golf(t5);
            } else {
                india = c0585q2.india(t5);
            }
            if (india) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(filteredItems)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(onQueryChanged)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(onDismiss)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(buildItemKey)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.golf(state)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q2.india(itemView)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        if ((599187 & i5) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            float f5 = P2.alpha;
            ab abVar = new ab(ag.hotel(c0585q2), AbstractC0779d.juliet(400.0f, null, 5), L.alpha(c0585q2), O2.alpha, 14);
            final C1874w alpha = AbstractC1876y.alpha(c0585q2);
            boolean india2 = c0585q2.india(filteredItems);
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !c0585q2.india(t5))) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean golf = india2 | z10 | c0585q2.golf(alpha);
            Object jade = c0585q2.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new PickerContentViewKt$PickerContentView$1$1(filteredItems, t5, alpha, null);
                c0585q2.f(jade);
            }
            C0564b.foxtrot((l) jade, c0585q2, null);
            final int i17 = i5;
            c0585q = c0585q2;
            Q1.alpha(androidx.compose.ui.input.nestedscroll.a.alpha(T.a.alpha(V.charlie, AbstractC2911e0.alpha, new d0(3)), (C0113h0) abVar.teal, null), e.echo(326171617, new n(state, onDismiss, abVar, 9), c0585q2), null, null, null, 0, state.mo63getContainerColor0d7_KjU(), 0L, null, e.echo(-106666004, new m() { // from class: com.checkout.components.ui.picker.b
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit PickerContentView$lambda$7;
                    int intValue = ((Integer) obj3).intValue();
                    PickerViewState pickerViewState = PickerViewState.this;
                    Function1 function1 = onQueryChanged;
                    List list = filteredItems;
                    Function1 function12 = buildItemKey;
                    m mVar = itemView;
                    int i18 = i17;
                    PickerContentView$lambda$7 = PickerContentViewKt.PickerContentView$lambda$7(pickerViewState, function1, list, alpha, function12, mVar, i18, (androidx.compose.foundation.layout.L) obj, (InterfaceC0581m) obj2, intValue);
                    return PickerContentView$lambda$7;
                }
            }, c0585q2), c0585q, 805306416, 444);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new f((Object) t5, (List) filteredItems, (Function1) onQueryChanged, (kotlin.e) onDismiss, (kotlin.e) buildItemKey, (Object) state, (Object) itemView, i4, 5);
        }
    }

    public static final Unit PickerContentView$lambda$1(PickerViewState pickerViewState, Function0 function0, Q2 q22, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            ScreenHeaderViewKt.ScreenHeaderView(pickerViewState.getTitle().getState(), pickerViewState.getTitle().getStyle(), null, null, null, AbstractC2056a.alpha(), null, function0, q22, false, pickerViewState.getTopAppBarViewStyle(), c0585q, 805306368, FontFamily.$stable, 92);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit PickerContentView$lambda$7(PickerViewState pickerViewState, Function1 function1, List list, C1874w c1874w, Function1 function12, m mVar, int i4, androidx.compose.foundation.layout.L innerPadding, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        int i11;
        Intrinsics.echo(innerPadding, "innerPadding");
        if ((i5 & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(innerPadding)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i5 | i11;
        } else {
            i10 = i5;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i10 & 1, z2)) {
            s romeo = AbstractC0538d.romeo(V.charlie, innerPadding);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(romeo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            PickerSearchViewKt.PickerSearchView(function1, pickerViewState.getSearchField().getStyle(), pickerViewState.getSearchField().getState(), TestTags.PICKER_SEARCH_VIEW, c0585q, 3072, 0);
            if (list.isEmpty()) {
                c0585q.purple(1522562387);
                PickerItemNotFoundViewKt.PickerItemNotFoundView(pickerViewState.getNotFoundViewTitle(), pickerViewState.getNotFoundViewSubtitle(), c0585q, 0);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1522763980);
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                M delta = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, 16, 7);
                boolean india = c0585q.india(list) | c0585q.golf(function12) | c0585q.golf(mVar);
                Object jade = c0585q.jade();
                if (india || jade == C0580l.alpha) {
                    R9.a aVar = new R9.a(list, function12, mVar, i4, 4);
                    c0585q.f(aVar);
                    jade = aVar;
                }
                AbstractC2616b5.alpha(layoutWeightElement, c1874w, delta, null, null, null, false, null, (Function1) jade, c0585q, 384, HttpConstants.HTTP_GATEWAY_TIMEOUT);
                c0585q = c0585q;
                c0585q.quebec(false);
            }
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4(final List list, Function1 function1, final m mVar, final int i4, InterfaceC1869r LazyColumn) {
        Intrinsics.echo(LazyColumn, "$this$LazyColumn");
        final ae aeVar = new ae(7, function1);
        final PickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$1 pickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$1 = new Function1() { // from class: com.checkout.components.ui.picker.PickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(T t5) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((PickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$1) obj);
            }
        };
        ((C1860i) LazyColumn).quebec(list.size(), new Function1<Integer, Object>() { // from class: com.checkout.components.ui.picker.PickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i5) {
                return Function1.this.invoke(list.get(i5));
            }
        }, new Function1<Integer, Object>() { // from class: com.checkout.components.ui.picker.PickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i5) {
                return Function1.this.invoke(list.get(i5));
            }
        }, new P.d(new Xd.n() { // from class: com.checkout.components.ui.picker.PickerContentViewKt$PickerContentView$lambda$7$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
            @Override // Xd.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((InterfaceC1854c) obj, ((Number) obj2).intValue(), (InterfaceC0581m) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC1854c interfaceC1854c, int i5, InterfaceC0581m interfaceC0581m, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = (((C0585q) interfaceC0581m).golf(interfaceC1854c) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= ((C0585q) interfaceC0581m).echo(i5) ? 32 : 16;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(i11 & 1, (i11 & 147) != 146)) {
                    Object obj = list.get(i5);
                    c0585q.purple(-952435834);
                    mVar.invoke(obj, c0585q, Integer.valueOf(i4 & 8));
                    c0585q.quebec(false);
                    return;
                }
                c0585q.ochre();
            }
        }, 802480018, true));
        return Unit.INSTANCE;
    }

    public static final Unit PickerContentView$lambda$8(Object obj, List list, Function1 function1, Function0 function0, Function1 function12, PickerViewState pickerViewState, m mVar, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        PickerContentView(obj, list, function1, function0, function12, pickerViewState, mVar, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }
}
