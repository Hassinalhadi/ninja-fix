package com.checkout.components.card.ui.component.base;

import A0.o;
import Ac.h;
import Ec.ar;
import F.AbstractC0122j1;
import F.C0103e2;
import P.b;
import P.d;
import T.p;
import T.s;
import Xd.l;
import Zb.k;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.ad;
import com.checkout.components.card.K;
import com.checkout.components.card.L;
import com.checkout.components.card.M;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.model.DerivedCardInputState;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.card.ui.component.cardnumber.InfoBottomSheetViewKt;
import com.checkout.components.card.ui.component.cardnumber.SchemeChoiceSelectionViewKt;
import com.checkout.components.card.ui.component.cardnumber.SchemeComponentViewKt;
import com.checkout.components.card.utils.constants.TestTags;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.StyledImageViewKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.clevertap.android.sdk.Constants;
import f.InterfaceC1673j;
import ge.InterfaceC1775g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.C2007a;
import k5.C2015h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.a;
import pf.C2361k;
import q0.ap;
import s.C2530i;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import vf.ab;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0081\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0019²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"Lcom/checkout/components/card/ui/component/base/InputComponentViewModel;", "VM", "Lcom/checkout/components/card/di/base/Injector;", "diInjector", "", Constants.KEY_KEY, "", "InputComponent", "(Lcom/checkout/components/card/di/base/Injector;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "Lcom/checkout/components/card/ui/component/cardnumber/CardNumberViewModel;", "cardNumberViewModel", "RenderCardNumberInput", "(Lcom/checkout/components/card/ui/component/cardnumber/CardNumberViewModel;Landroidx/compose/runtime/m;I)V", "", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "supportedSchemeIconImageStyles", "", "Lcom/checkout/components/ui/model/CardScheme;", "schemeSelectionIconImageStyles", "activeCardScheme", "preferredCardScheme", "", "showBottomSheet", "Lcom/checkout/components/card/model/DerivedCardInputState;", "derivedState", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputComponentViewKt {
    public static final <VM extends InputComponentViewModel> void InputComponent(Injector diInjector, String key, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(diInjector, "diInjector");
        Intrinsics.echo(key, "key");
        new InputComponentViewModelFactory(diInjector);
        Intrinsics.juliet();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r4)) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0321, code lost:
    
        if (r9 == r5) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderCardNumberInput(CardNumberViewModel cardNumberViewModel, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        ax axVar;
        C0103e2 c0103e2;
        ax axVar2;
        ab abVar;
        Object dVar;
        boolean z10;
        Object obj;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1134891889);
        if ((i4 & 6) == 0) {
            if (c0585q.india(cardNumberViewModel)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i4 | i12;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if (((Configuration) c0585q.kilo(AndroidCompositionLocals_androidKt.alpha)).screenWidthDp < 360) {
                i10 = 295;
            } else {
                i10 = 342;
            }
            int i13 = i10;
            Object jade = c0585q.jade();
            Object obj2 = C0580l.alpha;
            if (jade == obj2) {
                jade = ad.xray(c0585q);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
            ax mike = C0564b.mike(cardNumberViewModel.getCardSchemeIconImageStyles(), c0585q, 0);
            ax mike2 = C0564b.mike(cardNumberViewModel.getCardSchemeSelectionIconImageStyles(), c0585q, 0);
            ax mike3 = C0564b.mike(cardNumberViewModel.getPaymentStateManager().getCardScheme(), c0585q, 0);
            ax mike4 = C0564b.mike(cardNumberViewModel.getPaymentStateManager().getPreferredCardScheme(), c0585q, 0);
            Object jade2 = c0585q.jade();
            if (jade2 == obj2) {
                jade2 = C0564b.zulu(Boolean.FALSE);
                c0585q.f(jade2);
            }
            ax axVar3 = (ax) jade2;
            C0103e2 foxtrot = AbstractC0122j1.foxtrot(true, c0585q, 6, 2);
            Object jade3 = c0585q.jade();
            if (jade3 == obj2) {
                jade3 = C0564b.november(c0585q);
                c0585q.f(jade3);
            }
            ab abVar2 = (ab) jade3;
            Object jade4 = c0585q.jade();
            if (jade4 == obj2) {
                jade4 = C0564b.quebec(new a(7, mike2, mike));
                c0585q.f(jade4);
            }
            D0 d02 = (D0) jade4;
            boolean hasSchemeChoices = ((DerivedCardInputState) d02.getValue()).getHasSchemeChoices();
            boolean hasMinimumSchemes = ((DerivedCardInputState) d02.getValue()).getHasMinimumSchemes();
            boolean shouldShowInfoRow = ((DerivedCardInputState) d02.getValue()).getShouldShowInfoRow();
            Map map = (Map) mike2.getValue();
            boolean echo = c0585q.echo(((CardScheme) mike4.getValue()).ordinal()) | c0585q.golf(map);
            Object jade5 = c0585q.jade();
            if (!echo && jade5 != obj2) {
                c0103e2 = foxtrot;
                axVar2 = mike;
                abVar = abVar2;
                dVar = jade5;
                axVar = axVar3;
            } else {
                axVar = axVar3;
                c0103e2 = foxtrot;
                axVar2 = mike;
                abVar = abVar2;
                dVar = new d(new h(cardNumberViewModel, cardNumberViewModel, mike2, mike4, 13), 84498427, true);
                c0585q.f(dVar);
            }
            l lVar = (l) dVar;
            boolean echo2 = c0585q.echo(((CardScheme) mike3.getValue()).ordinal()) | c0585q.hotel(hasMinimumSchemes) | c0585q.golf((List) axVar2.getValue());
            Object jade6 = c0585q.jade();
            if (echo2 || jade6 == obj2) {
                if (hasMinimumSchemes) {
                    jade6 = a((CardScheme) mike3.getValue(), (List) axVar2.getValue());
                } else {
                    jade6 = null;
                }
                c0585q.f(jade6);
            }
            l lVar2 = (l) jade6;
            boolean hotel = c0585q.hotel(hasSchemeChoices) | c0585q.golf(lVar) | c0585q.golf(lVar2);
            Object jade7 = c0585q.jade();
            if (hotel || jade7 == obj2) {
                if (!hasSchemeChoices) {
                    lVar = lVar2;
                }
                c0585q.f(lVar);
                jade7 = lVar;
            }
            l lVar3 = (l) jade7;
            s romeo = V.romeo(cardNumberViewModel.getViewStyleState$card_standardRelease().getContainerModifier());
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i14 = (int) (j5 ^ (j5 >>> 32));
            I mike5 = c0585q.mike();
            s charlie = T.a.charlie(romeo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike5);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q.lime) {
                z10 = hasMinimumSchemes;
            } else {
                z10 = hasMinimumSchemes;
            }
            ad.blue(i14, c0585q, i14, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            p pVar = p.alpha;
            if (shouldShowInfoRow) {
                c0585q.purple(-1241872282);
                s charlie2 = V.charlie(pVar, 1.0f);
                Object jade8 = c0585q.jade();
                if (jade8 == obj2) {
                    jade8 = new C2530i(axVar, 3);
                    c0585q.f(jade8);
                }
                s charlie3 = androidx.compose.foundation.a.charlie(charlie2, interfaceC1673j, null, false, null, (Function0) jade8, 28);
                Object jade9 = c0585q.jade();
                if (jade9 == obj2) {
                    jade9 = new C2361k(11);
                    c0585q.f(jade9);
                }
                s alpha2 = androidx.compose.ui.platform.a.alpha(o.bravo(charlie3, false, (Function1) jade9), TestTags.INFO_VIEW);
                ap delta = AbstractC0547m.delta(T.d.white, false);
                long j6 = c0585q.magenta;
                int i15 = (int) (j6 ^ (j6 >>> 32));
                I mike6 = c0585q.mike();
                s charlie4 = T.a.charlie(alpha2, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, delta);
                C0564b.blue(c2549i2, c0585q, mike6);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                    ad.blue(i15, c0585q, i15, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie4);
                S alpha3 = Q.alpha(AbstractC0542h.golf(4), T.d.f2061d, c0585q, 54);
                long j7 = c0585q.magenta;
                int i16 = (int) (j7 ^ (j7 >>> 32));
                I mike7 = c0585q.mike();
                s charlie5 = T.a.charlie(pVar, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i, c0585q, alpha3);
                C0564b.blue(c2549i2, c0585q, mike7);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i16))) {
                    ad.blue(i16, c0585q, i16, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q, charlie5);
                ImageStyle infoImageStyle = cardNumberViewModel.getViewStyleState$card_standardRelease().getInfoImageStyle();
                int i17 = ImageStyle.$stable;
                StyledImageViewKt.StyledImageView(infoImageStyle, null, c0585q, i17, 2);
                TextLabelViewStyle textLabelStyle = cardNumberViewModel.getViewStyleState$card_standardRelease().getTextLabelStyle();
                TextLabelState textLabelState = cardNumberViewModel.getViewStyleState$card_standardRelease().getTextLabelState();
                int i18 = TextLabelViewStyle.$stable;
                int i19 = TextLabelState.$stable;
                TextLabelViewKt.TextLabelView(textLabelStyle, textLabelState, c0585q, (i19 << 3) | i18);
                z11 = true;
                c0585q.quebec(true);
                c0585q.quebec(true);
                if (((Boolean) axVar.getValue()).booleanValue()) {
                    c0585q.purple(-1240836634);
                    boolean india = c0585q.india(abVar) | c0585q.golf(c0103e2);
                    Object jade10 = c0585q.jade();
                    if (!india) {
                        obj = obj2;
                    } else {
                        obj = obj2;
                    }
                    jade10 = new Ac.l(abVar, c0103e2, axVar, 19);
                    c0585q.f(jade10);
                    z11 = true;
                    InfoBottomSheetViewKt.InfoBottomSheetView((Function0) jade10, c0103e2, cardNumberViewModel.getViewStyleState$card_standardRelease().getInfoBottomSheetViewStyleState(), V.november(V.charlie(pVar, 1.0f), 0.0f, i13, 0.0f, 13), c0585q, (i17 | ((i18 | (i18 | i19)) | i19)) << 6, 0);
                    z12 = false;
                    c0585q.quebec(false);
                    i11 = -1250174950;
                } else {
                    obj = obj2;
                    i11 = -1250174950;
                    z12 = false;
                    c0585q.purple(-1250174950);
                    c0585q.quebec(false);
                }
            } else {
                obj = obj2;
                z11 = true;
                i11 = -1250174950;
                z12 = false;
                c0585q.purple(-1250174950);
            }
            c0585q.quebec(z12);
            InputComponentViewStyle style$card_standardRelease = cardNumberViewModel.getStyle$card_standardRelease();
            InputComponentState copy$default = InputComponentState.copy$default(cardNumberViewModel.getState$card_standardRelease(), InputFieldState.copy$default(cardNumberViewModel.getState$card_standardRelease().getInputFieldState(), null, null, null, lVar3, null, 23, null), null, 2, null);
            boolean india2 = c0585q.india(cardNumberViewModel);
            Object jade11 = c0585q.jade();
            if (india2 || jade11 == obj) {
                jade11 = new L(cardNumberViewModel);
                c0585q.f(jade11);
            }
            Function1 function1 = (Function1) ((InterfaceC1775g) jade11);
            boolean india3 = c0585q.india(cardNumberViewModel);
            Object jade12 = c0585q.jade();
            if (india3 || jade12 == obj) {
                jade12 = new C2007a(12, cardNumberViewModel, axVar);
                c0585q.f(jade12);
            }
            InputContainerViewKt.InputComponentContainerView(style$card_standardRelease, copy$default, function1, (Function1) jade12, TestTags.CARD_NUMBER_INPUT, c0585q, InputComponentViewStyle.$stable | 24576 | (InputComponentState.$stable << 3), 0);
            c0585q = c0585q;
            if (!z10) {
                c0585q.purple(-1239393305);
                z13 = false;
                SchemeComponentViewKt.SchemeComponentView((List) axVar2.getValue(), androidx.compose.ui.platform.a.alpha(V.romeo(AbstractC0538d.whiskey(pVar, 0.0f, 10, 0.0f, 0.0f, 13)), TestTags.SCHEME_COMPONENT_BELOW_CARD_NUMBER), c0585q, 48, 0);
            } else {
                z13 = false;
                c0585q.purple(i11);
            }
            c0585q.quebec(z13);
            c0585q.quebec(z11);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(cardNumberViewModel, i4, 12);
        }
    }

    public static final Unit RenderCardNumberInput$lambda$30$lambda$15$lambda$14(CardNumberViewModel cardNumberViewModel, CardNumberViewModel cardNumberViewModel2, D0 d02, D0 d03, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            s romeo = V.romeo(AbstractC0538d.whiskey(p.alpha, 0.0f, 0.0f, 8, 0.0f, 11));
            Map map = (Map) d02.getValue();
            boolean india = c0585q.india(cardNumberViewModel);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new M(cardNumberViewModel);
                c0585q.f(jade);
            }
            SchemeChoiceSelectionViewKt.m78SchemeChoiceSelectionViewyrwZFoE(romeo, map, (Function1) ((InterfaceC1775g) jade), (CardScheme) d03.getValue(), cardNumberViewModel2.getViewStyleState$card_standardRelease().m71getSelectedBorderColor0d7_KjU(), c0585q, 6, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(CardNumberViewModel cardNumberViewModel, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        RenderCardNumberInput(cardNumberViewModel, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit createTrailingIcon$lambda$32(List list, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            SchemeComponentViewKt.SchemeComponentView(list, androidx.compose.ui.platform.a.alpha(V.romeo(AbstractC0538d.whiskey(p.alpha, 0.0f, 0.0f, 8, 0.0f, 11)), TestTags.TRAILING_ICON_SCHEME_COMPONENT), c0585q, 48, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit createTrailingIcon$lambda$34(List list, CardScheme cardScheme, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        Object obj;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, z2)) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((ImageStyle) obj).getImage(), cardScheme.getImageId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            StyledImageViewKt.StyledImageView((ImageStyle) obj, null, c0585q, ImageStyle.$stable, 2);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(ax axVar) {
        axVar.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit a(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        A0.ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit a(ab abVar, C0103e2 c0103e2, ax axVar) {
        vf.ad.zulu(abVar, null, null, new K(c0103e2, axVar, null), 3);
        return Unit.INSTANCE;
    }

    private static final b a(CardScheme cardScheme, List list) {
        if (cardScheme == CardScheme.UNKNOWN) {
            return new d(new k(list), -42957502, true);
        }
        return new d(new C2015h(5, list, cardScheme), -2023025255, true);
    }

    public static final DerivedCardInputState a(D0 d02, D0 d03) {
        boolean isEmpty = ((Map) d02.getValue()).isEmpty();
        return new DerivedCardInputState(!isEmpty, !isEmpty && ((Map) d02.getValue()).size() > 1, ((List) d03.getValue()).size() <= 3);
    }

    public static final Unit a(CardNumberViewModel cardNumberViewModel, ax axVar, boolean z2) {
        if (!((Boolean) axVar.getValue()).booleanValue()) {
            cardNumberViewModel.onFocusChanged$card_standardRelease(z2);
        }
        return Unit.INSTANCE;
    }
}
