package com.checkout.components.kmp.rememberme.view.dialog;

import Cb.ac;
import Cb.g;
import Ec.af;
import F.K1;
import F.ak;
import O0.l;
import T.d;
import T.i;
import T.p;
import T.s;
import W4.b;
import W4.c;
import Wf.ad;
import Wf.e;
import Wf.m;
import a0.C0360n;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import com.checkout.components.kmp.rememberme.generated.resources.Drawable0_commonMainKt;
import com.checkout.components.kmp.rememberme.generated.resources.Res;
import com.checkout.components.kmp.rememberme.generated.resources.String0_commonMainKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ExtensionsKt;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.ui.EnvironmentProviderViewKt;
import com.checkout.components.kmp.rememberme.view.ui.TextViewKt;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import i.InterfaceC1854c;
import i.InterfaceC1869r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2616b5;
import t6.W3;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\",\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LT/s;", "modifier", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "Lkotlin/Function0;", "", "onButtonClick", "InfoDialogView", "(LT/s;Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/m;II)V", "", "Lkotlin/Triple;", "LWf/e;", "LWf/ad;", "infoRowsContent", "Ljava/util/List;", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfoDialogViewKt {

    @NotNull
    private static final List<Triple<e, ad, ad>> infoRowsContent;

    static {
        Res.drawable drawableVar = Res.drawable.INSTANCE;
        e cko_ic_check = Drawable0_commonMainKt.getCko_ic_check(drawableVar);
        Res.string stringVar = Res.string.INSTANCE;
        infoRowsContent = CollectionsKt.listOf(new Triple(cko_ic_check, String0_commonMainKt.getCko_remember_me_modal_line1_subtitle(stringVar), String0_commonMainKt.getCko_remember_me_modal_line1_body(stringVar)), new Triple(Drawable0_commonMainKt.getCko_ic_thunder(drawableVar), String0_commonMainKt.getCko_remember_me_modal_line2_subtitle(stringVar), String0_commonMainKt.getCko_remember_me_modal_line2_body(stringVar)), new Triple(Drawable0_commonMainKt.getCko_ic_shield(drawableVar), String0_commonMainKt.getCko_remember_me_modal_line3_subtitle(stringVar), String0_commonMainKt.getCko_remember_me_modal_line3_body(stringVar)));
    }

    public static final void InfoDialogView(@Nullable s sVar, @NotNull DesignTokens designTokens, @NotNull ResourceProvider resourceProvider, @NotNull Function0<Unit> onButtonClick, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(designTokens, "designTokens");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(onButtonClick, "onButtonClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1626265385);
        int i15 = i5 & 1;
        if (i15 != 0) {
            i10 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(designTokens)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(resourceProvider)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onButtonClick)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i12;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i15 != 0) {
                sVar = p.alpha;
            }
            EnvironmentProviderViewKt.EnvironmentProviderView(P.e.echo(518330027, new b(sVar, designTokens, resourceProvider, onButtonClick), c0585q), c0585q, 6);
        } else {
            c0585q.ochre();
        }
        s sVar2 = sVar;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(sVar2, designTokens, resourceProvider, onButtonClick, i4, i5);
        }
    }

    public static final Unit InfoDialogView$lambda$7(s sVar, DesignTokens designTokens, ResourceProvider resourceProvider, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            i iVar = d.f2062f;
            C0537c c0537c = AbstractC0542h.charlie;
            boolean golf = c0585q.golf(designTokens) | c0585q.india(resourceProvider) | c0585q.golf(function0);
            Object jade = c0585q.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new ac(designTokens, resourceProvider, function0, 9);
                c0585q.f(jade);
            }
            AbstractC2616b5.alpha(sVar, null, null, c0537c, iVar, null, false, null, (Function1) jade, c0585q, 221184, 462);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$7$lambda$6$lambda$5(DesignTokens designTokens, ResourceProvider resourceProvider, Function0 function0, InterfaceC1869r LazyColumn) {
        int collectionSizeOrDefault;
        Intrinsics.echo(LazyColumn, "$this$LazyColumn");
        j.bravo(LazyColumn, null, ComposableSingletons$InfoDialogViewKt.INSTANCE.getLambda$1676766272$rememberme_release(), 3);
        j.bravo(LazyColumn, null, new P.d(new Cb.d(8, designTokens), -1271804233, true), 3);
        List<Triple<e, ad, ad>> list = infoRowsContent;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            j.bravo(LazyColumn, null, new P.d(new g(designTokens, (e) triple.first, resourceProvider, (ad) triple.second, (ad) triple.third, 4), 711928237, true), 3);
            arrayList.add(Unit.INSTANCE);
        }
        j.bravo(LazyColumn, null, new P.d(new W4.d(designTokens, function0, resourceProvider), -1782816392, true), 3);
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$0(DesignTokens designTokens, InterfaceC1854c item, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(item, "$this$item");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            W3.alpha(m.alpha(Drawable0_commonMainKt.getCko_where_the_world_checks_out(Res.drawable.INSTANCE), c0585q, 0), null, AbstractC0538d.whiskey(p.alpha, 0.0f, 32, 0.0f, 36, 5), null, null, 0.0f, new C0360n(ExtensionsKt.primaryColor(designTokens), 5), c0585q, 432, 56);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$2$lambda$1(DesignTokens designTokens, e eVar, ResourceProvider resourceProvider, ad adVar, ad adVar2, InterfaceC1854c item, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(item, "$this$item");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            InfoDialogRowViewKt.InfoDialogRowView(null, designTokens, eVar, resourceProvider.getString(adVar, c0585q, 0), resourceProvider.getString(adVar2, c0585q, 0), c0585q, 0, 1);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4(DesignTokens designTokens, Function0 function0, ResourceProvider resourceProvider, InterfaceC1854c item, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(item, "$this$item");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            float f5 = 16;
            float f10 = 12;
            K1.bravo(function0, AbstractC0538d.whiskey(V.charlie(p.alpha, 1.0f), 0.0f, 48, 0.0f, 0.0f, 13), false, ExtensionsKt.buttonShape(designTokens), new ak(ExtensionsKt.actionColor(designTokens), ExtensionsKt.inverseColor(designTokens), ExtensionsKt.disabledColor(designTokens), ExtensionsKt.disabledColor(designTokens)), null, null, new M(f5, f10, f5, f10), P.e.echo(1502410088, new af(5, designTokens, resourceProvider), c0585q), c0585q, 817889328, 356);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4$lambda$3(DesignTokens designTokens, ResourceProvider resourceProvider, T Button, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(Button, "$this$Button");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            TextViewKt.m126TextView7O2jLU0((s) null, ExtensionsKt.inverseColor(designTokens), designTokens.getFonts().getLabel(), resourceProvider.getString(String0_commonMainKt.getCko_remember_me_modal_close_cta(Res.string.INSTANCE), c0585q, 0), 0, (l) null, c0585q, 0, 49);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$8(s sVar, DesignTokens designTokens, ResourceProvider resourceProvider, Function0 function0, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        InfoDialogView(sVar, designTokens, resourceProvider, function0, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
