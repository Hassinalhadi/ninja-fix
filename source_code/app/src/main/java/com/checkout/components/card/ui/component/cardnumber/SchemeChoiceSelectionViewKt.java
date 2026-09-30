package com.checkout.components.card.ui.component.cardnumber;

import Cb.i;
import D0.n;
import F.K1;
import F.at;
import F4.g;
import P.e;
import T.d;
import T.j;
import T.k;
import T.p;
import T.s;
import Xd.l;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.InterfaceC0555v;
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
import av.q;
import b.ab;
import com.checkout.components.card.a0;
import com.checkout.components.card.utils.Fixtures;
import com.checkout.components.card.utils.constants.TestTags;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.utils.extensions.CardSchemeExtensionsKt;
import com.checkout.components.ui.view.StyledImageViewKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import i.C1860i;
import i.InterfaceC1854c;
import i.InterfaceC1869r;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import t6.S3;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aQ\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a=\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LT/s;", "modifier", "", "Lcom/checkout/components/ui/model/CardScheme;", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "cardSchemeIcons", "Lkotlin/Function1;", "", "onCardSchemeSelected", "selectedCardScheme", "La0/t;", "selectedBorderColor", "SchemeChoiceSelectionView-yrwZFoE", "(LT/s;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/ui/model/CardScheme;JLandroidx/compose/runtime/m;II)V", "SchemeChoiceSelectionView", "imageStyle", "", "isSelected", "Lkotlin/Function0;", "onClick", "SelectableCardSchemeItem-ww6aTOc", "(Lcom/checkout/components/ui/model/style/base/ImageStyle;ZLkotlin/jvm/functions/Function0;JLcom/checkout/components/ui/model/CardScheme;Landroidx/compose/runtime/m;I)V", "SelectableCardSchemeItem", "SelectableCardSchemeGridPreview", "(Landroidx/compose/runtime/m;I)V", "selectedScheme", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SchemeChoiceSelectionViewKt {
    /* renamed from: SchemeChoiceSelectionView-yrwZFoE */
    public static final void m78SchemeChoiceSelectionViewyrwZFoE(@Nullable s sVar, @NotNull final Map<CardScheme, ImageStyle> cardSchemeIcons, @NotNull final Function1<? super CardScheme, Unit> onCardSchemeSelected, @NotNull final CardScheme selectedCardScheme, final long j5, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        s sVar2;
        int i10;
        int i11;
        boolean z2;
        C0585q c0585q;
        final s sVar3;
        s sVar4;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        Intrinsics.echo(cardSchemeIcons, "cardSchemeIcons");
        Intrinsics.echo(onCardSchemeSelected, "onCardSchemeSelected");
        Intrinsics.echo(selectedCardScheme, "selectedCardScheme");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1635087309);
        int i16 = i5 & 1;
        if (i16 != 0) {
            i10 = i4 | 6;
            sVar2 = sVar;
        } else if ((i4 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i4;
        } else {
            sVar2 = sVar;
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(cardSchemeIcons)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(onCardSchemeSelected)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.echo(selectedCardScheme.ordinal())) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.foxtrot(j5)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i10 |= i12;
        }
        boolean z12 = true;
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
            if (i16 != 0) {
                sVar4 = p.alpha;
            } else {
                sVar4 = sVar2;
            }
            s alpha = androidx.compose.ui.platform.a.alpha(sVar4, TestTags.SCHEME_CHOICE_VIEW);
            j jVar = d.f2061d;
            boolean india = c0585q2.india(cardSchemeIcons);
            if ((i10 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z13 = india | z10;
            if ((i10 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = z13 | z11;
            if ((57344 & i10) != 16384) {
                z12 = false;
            }
            boolean z15 = z14 | z12;
            Object jade = c0585q2.jade();
            if (z15 || jade == C0580l.alpha) {
                n nVar = new n(cardSchemeIcons, selectedCardScheme, onCardSchemeSelected, j5);
                c0585q2.f(nVar);
                jade = nVar;
            }
            c0585q = c0585q2;
            AbstractC2616b5.charlie(alpha, null, null, null, jVar, null, false, null, (Function1) jade, c0585q, 196608, 478);
            sVar3 = sVar4;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            sVar3 = sVar2;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l() { // from class: com.checkout.components.card.ui.component.cardnumber.c
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit a6;
                    int intValue = ((Integer) obj2).intValue();
                    Map map = cardSchemeIcons;
                    Function1 function1 = onCardSchemeSelected;
                    CardScheme cardScheme = selectedCardScheme;
                    int i17 = i4;
                    int i18 = i5;
                    a6 = SchemeChoiceSelectionViewKt.a(s.this, map, function1, cardScheme, j5, i17, i18, (InterfaceC0581m) obj, intValue);
                    return a6;
                }
            };
        }
    }

    public static final void SelectableCardSchemeGridPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1715167789);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu(CardScheme.MASTERCARD);
                c0585q.f(jade);
            }
            ax axVar = (ax) jade;
            Map<CardScheme, ImageStyle> cardSchemesMap = Fixtures.INSTANCE.getCardSchemesMap();
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new i(axVar, 20);
                c0585q.f(jade2);
            }
            m78SchemeChoiceSelectionViewyrwZFoE(null, cardSchemesMap, (Function1) jade2, (CardScheme) axVar.getValue(), ao.delta(4279790335L), c0585q, 24960, 1);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, 22);
        }
    }

    /* renamed from: SelectableCardSchemeItem-ww6aTOc */
    public static final void m79SelectableCardSchemeItemww6aTOc(final ImageStyle imageStyle, final boolean z2, final Function0<Unit> function0, final long j5, final CardScheme cardScheme, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        Function0<Unit> function02;
        boolean z10;
        ab abVar;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean india;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1949729348);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(imageStyle);
            } else {
                india = c0585q.india(imageStyle);
            }
            if (india) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            function02 = function0;
            if (c0585q.india(function02)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        } else {
            function02 = function0;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.foxtrot(j5)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.echo(cardScheme.ordinal())) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        if ((i5 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = ad.xray(c0585q);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
            C2093f bravo = AbstractC2094g.bravo(4);
            if (z2) {
                abVar = S3.alpha(2, j5);
            } else {
                abVar = null;
            }
            ab abVar2 = abVar;
            at lima = K1.lima(C0366t.juliet, c0585q, 6);
            s charlie = androidx.compose.foundation.a.charlie(V.lima(p.alpha, 44, 34), interfaceC1673j, null, false, null, function02, 28);
            if (z2) {
                str = q.echo("card_scheme_item_selected_", CardSchemeExtensionsKt.toSchemeName(cardScheme));
            } else {
                str = "";
            }
            K1.charlie(androidx.compose.ui.platform.a.alpha(charlie, str), bravo, lima, null, abVar2, e.echo(-30682862, new Cb.d(12, imageStyle), c0585q), c0585q, 196608, 8);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new l() { // from class: com.checkout.components.card.ui.component.cardnumber.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit a6;
                    int intValue = ((Integer) obj2).intValue();
                    CardScheme cardScheme2 = cardScheme;
                    int i15 = i4;
                    a6 = SchemeChoiceSelectionViewKt.a(ImageStyle.this, z2, function0, j5, cardScheme2, i15, (InterfaceC0581m) obj, intValue);
                    return a6;
                }
            };
        }
    }

    public static final Unit SelectableCardSchemeItem_ww6aTOc$lambda$7(ImageStyle imageStyle, InterfaceC0555v Card, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Intrinsics.echo(Card, "$this$Card");
        if ((i4 & 17) != 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            k kVar = d.teal;
            s sierra = AbstractC0538d.sierra(V.charlie, 2);
            ap delta = AbstractC0547m.delta(kVar, false);
            long j5 = c0585q.magenta;
            int i5 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            StyledImageViewKt.StyledImageView(imageStyle, null, c0585q, ImageStyle.$stable, 2);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(s sVar, Map map, Function1 function1, CardScheme cardScheme, long j5, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        m78SchemeChoiceSelectionViewyrwZFoE(sVar, map, function1, cardScheme, j5, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        SelectableCardSchemeGridPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(ImageStyle imageStyle, boolean z2, Function0 function0, long j5, CardScheme cardScheme, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        m79SelectableCardSchemeItemww6aTOc(imageStyle, z2, function0, j5, cardScheme, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(Map map, final CardScheme cardScheme, final Function1 function1, final long j5, InterfaceC1869r LazyRow) {
        Intrinsics.echo(LazyRow, "$this$LazyRow");
        final List z2 = CollectionsKt.z(map.entrySet());
        final SchemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$1 schemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$1 = new Function1() { // from class: com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Map.Entry<? extends CardScheme, ? extends ImageStyle> entry) {
                return null;
            }
        };
        ((C1860i) LazyRow).quebec(z2.size(), null, new Function1<Integer, Object>() { // from class: com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Integer num) {
                return Function1.this.invoke(z2.get(num.intValue()));
            }

            public final Object invoke(int i4) {
                return Function1.this.invoke(z2.get(i4));
            }
        }, new P.d(new Xd.n() { // from class: com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt$SchemeChoiceSelectionView_yrwZFoE$lambda$3$lambda$2$$inlined$items$default$4
            @Override // Xd.n
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((InterfaceC1854c) obj, ((Number) obj2).intValue(), (InterfaceC0581m) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC1854c interfaceC1854c, int i4, InterfaceC0581m interfaceC0581m, int i5) {
                int i10;
                if ((i5 & 6) == 0) {
                    i10 = (((C0585q) interfaceC0581m).golf(interfaceC1854c) ? 4 : 2) | i5;
                } else {
                    i10 = i5;
                }
                if ((i5 & 48) == 0) {
                    i10 |= ((C0585q) interfaceC0581m).echo(i4) ? 32 : 16;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(i10 & 1, (i10 & 147) != 146)) {
                    Map.Entry entry = (Map.Entry) z2.get(i4);
                    c0585q.purple(-749203650);
                    CardScheme cardScheme2 = (CardScheme) entry.getKey();
                    ImageStyle imageStyle = (ImageStyle) entry.getValue();
                    boolean z10 = cardScheme2 == cardScheme;
                    boolean golf = c0585q.golf(function1) | c0585q.echo(cardScheme2.ordinal());
                    Object jade = c0585q.jade();
                    if (golf || jade == C0580l.alpha) {
                        jade = new a0(function1, cardScheme2);
                        c0585q.f(jade);
                    }
                    SchemeChoiceSelectionViewKt.m79SelectableCardSchemeItemww6aTOc(imageStyle, z10, (Function0) jade, j5, cardScheme, c0585q, ImageStyle.$stable);
                    c0585q.quebec(false);
                    return;
                }
                c0585q.ochre();
            }
        }, 802480018, true));
        return Unit.INSTANCE;
    }

    public static final Unit a(ax axVar, CardScheme newScheme) {
        Intrinsics.echo(newScheme, "newScheme");
        axVar.setValue(newScheme);
        return Unit.INSTANCE;
    }
}
