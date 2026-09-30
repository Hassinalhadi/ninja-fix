package com.checkout.components.card.ui.component.address;

import A0.ab;
import A0.o;
import N2.ae;
import P.e;
import T.d;
import T.p;
import T.s;
import T1.c;
import U1.a;
import Xd.l;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import ao.ad;
import bx.aa;
import com.checkout.address.AddressComponent;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.utils.constants.TestTags;
import com.checkout.components.interfaces.component.AddressConfiguration;
import com.checkout.components.interfaces.model.AddressComponentConfig;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.contact.ContactData;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.C1298c;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Locale;
import k5.C2008a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.C2361k;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.F7;
import t4.b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001ae\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0005\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/card/di/base/Injector;", "injector", "", Constants.KEY_KEY, "", "AddressView", "(Lcom/checkout/components/card/di/base/Injector;Ljava/lang/String;Landroidx/compose/runtime/m;I)V", "", "isCheckBoxChecked", "isCheckBoxShown", "Lkotlin/Function1;", "onCheckedChange", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "style", "Lcom/checkout/components/ui/model/state/TextLabelState;", "state", "Lcom/checkout/address/AddressComponent;", "addressComponent", "", "primaryColor", "actionColor", "checkmarkColor", "(ZZLkotlin/jvm/functions/Function1;Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;Lcom/checkout/components/ui/model/state/TextLabelState;Lcom/checkout/address/AddressComponent;JJJLandroidx/compose/runtime/m;I)V", "AddressViewPreview", "(Landroidx/compose/runtime/m;I)V", "card_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressViewKt {
    public static final void AddressView(@NotNull Injector injector, @NotNull String key, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        c cVar;
        Intrinsics.echo(injector, "injector");
        Intrinsics.echo(key, "key");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1789371259);
        if ((i4 & 6) == 0) {
            i5 = ((i4 & 8) == 0 ? c0585q.golf(injector) : c0585q.india(injector) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.golf(key) ? 32 : 16;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 19) != 18)) {
            AddressViewModelFactory addressViewModelFactory = new AddressViewModelFactory(injector);
            String concat = "AddressViewModel-".concat(key);
            d0 alpha = a.alpha(c0585q);
            if (alpha != null) {
                if (alpha instanceof InterfaceC0651v) {
                    cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                } else {
                    cVar = T1.a.bravo;
                }
                AddressViewModel addressViewModel = (AddressViewModel) F7.bravo(u.alpha.bravo(AddressViewModel.class), alpha, concat, addressViewModelFactory, cVar, c0585q);
                ax mike = C0564b.mike(addressViewModel.isCheckBoxChecked(), c0585q, 0);
                ax mike2 = C0564b.mike(addressViewModel.isCheckBoxShown(), c0585q, 0);
                TextLabelViewStyle labelStyle = addressViewModel.getLabelStyle();
                TextLabelState labelState = addressViewModel.getLabelState();
                AddressComponent addressComponent = addressViewModel.getAddressComponent();
                boolean booleanValue = ((Boolean) mike.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) mike2.getValue()).booleanValue();
                boolean india = c0585q.india(addressViewModel);
                Object jade = c0585q.jade();
                if (india || jade == C0580l.alpha) {
                    jade = new b(addressViewModel, 0);
                    c0585q.f(jade);
                }
                Function1 function1 = (Function1) jade;
                ColorTokens colorTokens = addressViewModel.getColorTokens();
                long colorFormBorder = colorTokens != null ? colorTokens.getColorFormBorder() : 4287927444L;
                ColorTokens colorTokens2 = addressViewModel.getColorTokens();
                long colorAction = colorTokens2 != null ? colorTokens2.getColorAction() : 4279790335L;
                ColorTokens colorTokens3 = addressViewModel.getColorTokens();
                AddressView(booleanValue, booleanValue2, function1, labelStyle, labelState, addressComponent, colorFormBorder, colorAction, colorTokens3 != null ? colorTokens3.getColorInverse() : 4294967295L, c0585q, (TextLabelViewStyle.$stable << 9) | (TextLabelState.$stable << 12) | (AddressComponent.$stable << 15));
                c0585q = c0585q;
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.card.ui.component.cardnumber.a(injector, key, i4, 3);
        }
    }

    public static final Unit AddressView$lambda$11$lambda$10(AddressComponent addressComponent, aa AnimatedVisibility, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(AnimatedVisibility, "$this$AnimatedVisibility");
        s whiskey = AbstractC0538d.whiskey(p.alpha, 0.0f, 0.0f, 0.0f, 8, 7);
        ap delta = AbstractC0547m.delta(d.alpha, false);
        C0585q c0585q = (C0585q) interfaceC0581m;
        long j5 = c0585q.magenta;
        int i5 = (int) (j5 ^ (j5 >>> 32));
        I mike = c0585q.mike();
        s charlie = T.a.charlie(whiskey, interfaceC0581m);
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j = C2551k.bravo;
        C1298c c1298c = c0585q.alpha;
        c0585q.white();
        if (c0585q.lime) {
            c0585q.lima(c2550j);
        } else {
            c0585q.i();
        }
        C0564b.blue(C2551k.foxtrot, interfaceC0581m, delta);
        C0564b.blue(C2551k.echo, interfaceC0581m, mike);
        C2549i c2549i = C2551k.golf;
        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
            ad.blue(i5, c0585q, i5, c2549i);
        }
        C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
        if (addressComponent == null) {
            c0585q.purple(-2110728078);
        } else {
            c0585q.purple(1594479983);
            addressComponent.Render(interfaceC0581m, AddressComponent.$stable);
        }
        c0585q.quebec(false);
        c0585q.quebec(true);
        return Unit.INSTANCE;
    }

    private static final void AddressViewPreview(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-266204804);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu("Use shipping address as billing address");
                c0585q.f(jade);
            }
            ax axVar = (ax) jade;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new C2361k(5);
                c0585q.f(jade2);
            }
            ComponentName.Address address = new ComponentName.Address(new AddressConfiguration(null, null, (Function1) jade2, 3, null));
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.delta(ENGLISH, "ENGLISH");
            AddressComponent addressComponent = new AddressComponent(new AddressComponentConfig(address, ENGLISH, null, null, true, 12, null));
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new C2361k(6);
                c0585q.f(jade3);
            }
            AddressView(false, true, (Function1) jade3, new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null), new TextLabelState(axVar, null, null, 6, null), addressComponent, 4287927444L, 4279790335L, 4294967295L, c0585q, (TextLabelViewStyle.$stable << 9) | 114819510 | (TextLabelState.$stable << 12) | (AddressComponent.$stable << 15));
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.view.otp.c(i4, 18);
        }
    }

    public static final Unit a(boolean z2, boolean z10, Function1 function1, TextLabelViewStyle textLabelViewStyle, TextLabelState textLabelState, AddressComponent addressComponent, long j5, long j6, long j7, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AddressView(z2, z10, function1, textLabelViewStyle, textLabelState, addressComponent, j5, j6, j7, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(Function1 function1, boolean z2) {
        function1.invoke(Boolean.valueOf(!z2));
        return Unit.INSTANCE;
    }

    public static final Unit a(Injector injector, String str, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AddressView(injector, str, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        AddressViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(AddressViewModel addressViewModel, boolean z2) {
        addressViewModel.onCheckBoxCheckedChange(z2);
        return Unit.INSTANCE;
    }

    public static final Unit a(A0.ad semantics) {
        Intrinsics.echo(semantics, "$this$semantics");
        ab.alpha(semantics);
        return Unit.INSTANCE;
    }

    public static final Unit a(Function1 function1, boolean z2) {
        function1.invoke(Boolean.valueOf(z2));
        return Unit.INSTANCE;
    }

    public static final Unit a(ContactData contactData) {
        return Unit.INSTANCE;
    }

    public static final Unit a(boolean z2) {
        return Unit.INSTANCE;
    }

    private static final void AddressView(final boolean z2, final boolean z10, final Function1<? super Boolean, Unit> function1, final TextLabelViewStyle textLabelViewStyle, final TextLabelState textLabelState, AddressComponent addressComponent, final long j5, final long j6, final long j7, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        AddressComponent addressComponent2;
        boolean z11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(634342267);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.hotel(z2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= c0585q.hotel(z10) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= c0585q.india(function1) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= (i4 & 4096) == 0 ? c0585q.golf(textLabelViewStyle) : c0585q.india(textLabelViewStyle) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i5 |= (32768 & i4) == 0 ? c0585q.golf(textLabelState) : c0585q.india(textLabelState) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= (262144 & i4) == 0 ? c0585q.golf(addressComponent) : c0585q.india(addressComponent) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q.foxtrot(j5) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= c0585q.foxtrot(j6) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= c0585q.foxtrot(j7) ? 67108864 : 33554432;
        }
        if (c0585q.magenta(i5 & 1, (38347923 & i5) != 38347922)) {
            p pVar = p.alpha;
            s charlie = V.charlie(pVar, 1.0f);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new C2361k(4);
                c0585q.f(jade);
            }
            s alpha = androidx.compose.ui.platform.a.alpha(o.bravo(charlie, false, (Function1) jade), TestTags.ADDRESS_CHECKBOX);
            int i10 = i5 & 896;
            int i11 = i5 & 14;
            boolean z12 = (i11 == 4) | (i10 == 256);
            Object jade2 = c0585q.jade();
            if (z12 || jade2 == asVar) {
                jade2 = new C2008a(function1, z2, 2);
                c0585q.f(jade2);
            }
            s echo = androidx.compose.foundation.a.echo(15, alpha, null, (Function0) jade2, false);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(8), d.f2062f, c0585q, 6);
            long j10 = c0585q.magenta;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(echo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            if (z10) {
                c0585q.purple(959139303);
                s whiskey = AbstractC0538d.whiskey(pVar, 0.0f, 0.0f, 16, 0.0f, 11);
                long delta = ao.delta(j5);
                long delta2 = ao.delta(j6);
                long delta3 = ao.delta(j7);
                boolean z13 = i10 == 256;
                Object jade3 = c0585q.jade();
                if (z13 || jade3 == asVar) {
                    jade3 = new ae(10, function1);
                    c0585q.f(jade3);
                }
                int i13 = i5 >> 3;
                z11 = false;
                CheckboxLabelViewKt.m192CheckboxLabelViewsTxsimY(z2, (Function1) jade3, textLabelViewStyle, textLabelState, delta, delta2, delta3, whiskey, null, c0585q, i11 | 12582912 | (TextLabelViewStyle.$stable << 6) | (i13 & 896) | (TextLabelState.$stable << 9) | (i13 & 7168), Barcode.FORMAT_QR_CODE);
                c0585q = c0585q;
            } else {
                z11 = false;
                c0585q.purple(955427549);
            }
            c0585q.quebec(z11);
            addressComponent2 = addressComponent;
            androidx.compose.animation.b.charlie(!z2, null, null, null, null, e.echo(831754989, new Cb.d(20, addressComponent2), c0585q), c0585q, 1572870, 30);
            c0585q.quebec(true);
        } else {
            addressComponent2 = addressComponent;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final AddressComponent addressComponent3 = addressComponent2;
            uniform.delta = new l() { // from class: t4.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit a6;
                    int intValue = ((Integer) obj2).intValue();
                    long j11 = j7;
                    int i14 = i4;
                    a6 = AddressViewKt.a(z2, z10, function1, textLabelViewStyle, textLabelState, addressComponent3, j5, j6, j11, i14, (InterfaceC0581m) obj, intValue);
                    return a6;
                }
            };
        }
    }
}
