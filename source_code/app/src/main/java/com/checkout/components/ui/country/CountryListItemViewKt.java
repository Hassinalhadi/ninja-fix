package com.checkout.components.ui.country;

import A0.ab;
import A0.o;
import D0.an;
import F.I1;
import F.K1;
import T.d;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import b.c0;
import bz.h0;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001ag\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Country;", "country", "", "isSelected", "showDialingCode", "Lkotlin/Function0;", "", "onClick", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "emojiStyle", "countryNameStyle", "dialingCodeStyle", "isRTL", "La0/t;", "selectedRadioButtonColor", "unSelectedRadioButtonColor", "CountryListItemView-0S3VyRs", "(Lcom/checkout/components/interfaces/model/contact/Country;ZZLkotlin/jvm/functions/Function0;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;ZJJLandroidx/compose/runtime/m;II)V", "CountryListItemView", "CountryListItemPreview", "(Landroidx/compose/runtime/m;I)V", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryListItemViewKt {
    public static final void CountryListItemPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1880838014);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            TextLabelViewStyle textLabelViewStyle = new TextLabelViewStyle(null, 0, false, 1, null, new an(0L, AbstractC2636d7.charlie(16), null, null, null, 0L, 0, 0L, 0, 16777213), false, 87, null);
            long charlie = AbstractC2636d7.charlie(16);
            long j5 = C0366t.charlie;
            TextLabelViewStyle textLabelViewStyle2 = new TextLabelViewStyle(null, 0, false, 1, null, new an(j5, charlie, null, null, null, 0L, 0, 0L, 0, 16777212), false, 87, null);
            TextLabelViewStyle textLabelViewStyle3 = new TextLabelViewStyle(null, 0, false, 0, null, new an(0L, AbstractC2636d7.charlie(24), null, null, null, 0L, 0, 0L, 0, 16777213), false, 95, null);
            p pVar = p.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            long j6 = c0585q.magenta;
            int i5 = (int) (j6 ^ (j6 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(pVar, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            Country country = Country.ITALY;
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new c0(18);
                c0585q.f(jade);
            }
            long j7 = C0366t.foxtrot;
            m132CountryListItemView0S3VyRs(country, true, false, (Function0) jade, textLabelViewStyle3, textLabelViewStyle, textLabelViewStyle2, false, j7, j5, c0585q, 918556086, 0);
            Country country2 = Country.GERMANY;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new c0(19);
                c0585q.f(jade2);
            }
            m132CountryListItemView0S3VyRs(country2, false, true, (Function0) jade2, textLabelViewStyle3, textLabelViewStyle, textLabelViewStyle2, false, j7, j5, c0585q, 918556086, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.view.otp.c(i4, 9);
        }
    }

    public static final Unit CountryListItemPreview$lambda$15(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        CountryListItemPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: CountryListItemView-0S3VyRs */
    public static final void m132CountryListItemView0S3VyRs(@NotNull final Country country, final boolean z2, boolean z10, @NotNull final Function0<Unit> onClick, @NotNull final TextLabelViewStyle emojiStyle, @NotNull final TextLabelViewStyle countryNameStyle, @NotNull final TextLabelViewStyle dialingCodeStyle, final boolean z11, long j5, long j6, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        char c3;
        boolean z12;
        int i11;
        boolean z13;
        long j7;
        long j10;
        C0585q c0585q;
        final boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Intrinsics.echo(country, "country");
        Intrinsics.echo(onClick, "onClick");
        Intrinsics.echo(emojiStyle, "emojiStyle");
        Intrinsics.echo(countryNameStyle, "countryNameStyle");
        Intrinsics.echo(dialingCodeStyle, "dialingCodeStyle");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1123754060);
        if ((i4 & 6) == 0) {
            if (c0585q2.echo(country.ordinal())) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i10 = i20 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.hotel(z2)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i10 |= i19;
        }
        int i21 = i5 & 4;
        if (i21 != 0) {
            i10 |= 384;
            z12 = z10;
            c3 = ' ';
        } else {
            c3 = ' ';
            if ((i4 & 384) == 0) {
                z12 = z10;
                if (c0585q2.hotel(z12)) {
                    i11 = Barcode.FORMAT_QR_CODE;
                } else {
                    i11 = 128;
                }
                i10 |= i11;
            } else {
                z12 = z10;
            }
        }
        int i22 = i10;
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(onClick)) {
                i18 = 2048;
            } else {
                i18 = Barcode.FORMAT_UPC_E;
            }
            i22 |= i18;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.golf(emojiStyle)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i22 |= i17;
        }
        if ((196608 & i4) == 0) {
            if (c0585q2.golf(countryNameStyle)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i22 |= i16;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q2.golf(dialingCodeStyle)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i22 |= i15;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q2.hotel(z11)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i22 |= i14;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q2.foxtrot(j5)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i22 |= i13;
        }
        if ((805306368 & i4) == 0) {
            if (c0585q2.foxtrot(j6)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i22 |= i12;
        }
        int i23 = i22;
        if ((i23 & 306783379) != 306783378) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0585q2.magenta(i23 & 1, z13)) {
            if (i21 != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            Object jade = c0585q2.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(country.emoji());
                c0585q2.f(jade);
            }
            ax axVar = (ax) jade;
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.zulu(Utils.INSTANCE.dialingCode(country, z11));
                c0585q2.f(jade2);
            }
            ax axVar2 = (ax) jade2;
            Object jade3 = c0585q2.jade();
            if (jade3 == asVar) {
                jade3 = C0564b.zulu(country.displayName());
                c0585q2.f(jade3);
            }
            ax axVar3 = (ax) jade3;
            p pVar = p.alpha;
            if ((i23 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            Object jade4 = c0585q2.jade();
            if (z16 || jade4 == asVar) {
                jade4 = new Bb.a(onClick, 29);
                c0585q2.f(jade4);
            }
            boolean z18 = z15;
            s echo = androidx.compose.foundation.a.echo(15, pVar, null, (Function0) jade4, false);
            Object jade5 = c0585q2.jade();
            if (jade5 == asVar) {
                jade5 = new h0(17);
                c0585q2.f(jade5);
            }
            s bravo = o.bravo(echo, false, (Function1) jade5);
            String lowerCase = ((String) axVar3.getValue()).toLowerCase(Locale.ROOT);
            Intrinsics.delta(lowerCase, "toLowerCase(...)");
            s charlie = V.charlie(androidx.compose.ui.platform.a.alpha(bravo, lowerCase), 1.0f);
            ap delta = AbstractC0547m.delta(d.alpha, false);
            long j11 = c0585q2.magenta;
            int i24 = (int) (j11 ^ (j11 >>> c3));
            I mike = c0585q2.mike();
            s charlie2 = T.a.charlie(charlie, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i24))) {
                ad.blue(i24, c0585q2, i24, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie2);
            s sierra = AbstractC0538d.sierra(pVar, 16);
            S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(12), d.f2061d, c0585q2, 54);
            long j12 = c0585q2.magenta;
            int i25 = (int) (j12 ^ (j12 >>> c3));
            I mike2 = c0585q2.mike();
            s charlie3 = T.a.charlie(sierra, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i25))) {
                ad.blue(i25, c0585q2, i25, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie3);
            TextLabelViewKt.TextLabelView(emojiStyle, new TextLabelState(axVar, null, null, 6, null), c0585q2, (i23 >> 12) & 14);
            if (z18) {
                c0585q2.purple(-2020995958);
                TextLabelViewKt.TextLabelView(dialingCodeStyle, new TextLabelState(axVar2, null, null, 6, null), c0585q2, (i23 >> 18) & 14);
                z17 = false;
            } else {
                z17 = false;
                c0585q2.purple(-2023516072);
            }
            c0585q2.quebec(z17);
            TextLabelState textLabelState = new TextLabelState(axVar3, null, null, 6, null);
            s modifier = countryNameStyle.getModifier();
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            s then = modifier.then(new LayoutWeightElement(1.0f, true));
            c0585q = c0585q2;
            boolean z19 = z17;
            j10 = j6;
            TextLabelViewKt.TextLabelView(TextLabelViewStyle.m180copyQstMH_w$default(countryNameStyle, then, 0, false, 0, null, null, false, 126, null), textLabelState, c0585q, z19 ? 1 : 0);
            j7 = j5;
            I1.alpha(z2, null, null, false, K1.papa(j7, j10, c0585q), c0585q2, ((i23 >> 3) & 14) | 48, 44);
            c0585q.quebec(true);
            c0585q.quebec(true);
            z14 = z18;
        } else {
            j7 = j5;
            j10 = j6;
            c0585q = c0585q2;
            c0585q.ochre();
            z14 = z12;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final long j13 = j10;
            final long j14 = j7;
            uniform.delta = new l() { // from class: com.checkout.components.ui.country.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit CountryListItemView_0S3VyRs$lambda$9;
                    int intValue = ((Integer) obj2).intValue();
                    Country country2 = Country.this;
                    Function0 function0 = onClick;
                    TextLabelViewStyle textLabelViewStyle = emojiStyle;
                    TextLabelViewStyle textLabelViewStyle2 = countryNameStyle;
                    TextLabelViewStyle textLabelViewStyle3 = dialingCodeStyle;
                    int i26 = i4;
                    int i27 = i5;
                    CountryListItemView_0S3VyRs$lambda$9 = CountryListItemViewKt.CountryListItemView_0S3VyRs$lambda$9(country2, z2, z14, function0, textLabelViewStyle, textLabelViewStyle2, textLabelViewStyle3, z11, j14, j13, i26, i27, (InterfaceC0581m) obj, intValue);
                    return CountryListItemView_0S3VyRs$lambda$9;
                }
            };
        }
    }

    public static final Unit CountryListItemView_0S3VyRs$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit CountryListItemView_0S3VyRs$lambda$6$lambda$5(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit CountryListItemView_0S3VyRs$lambda$9(Country country, boolean z2, boolean z10, Function0 function0, TextLabelViewStyle textLabelViewStyle, TextLabelViewStyle textLabelViewStyle2, TextLabelViewStyle textLabelViewStyle3, boolean z11, long j5, long j6, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m132CountryListItemView0S3VyRs(country, z2, z10, function0, textLabelViewStyle, textLabelViewStyle2, textLabelViewStyle3, z11, j5, j6, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }
}
