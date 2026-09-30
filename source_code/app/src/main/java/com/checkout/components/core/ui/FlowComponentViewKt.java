package com.checkout.components.core.ui;

import Cb.s;
import D0.y;
import D0.z;
import F.K1;
import F4.b;
import F4.f;
import F4.g;
import F4.h;
import P.e;
import Q0.n;
import T.d;
import T.p;
import T1.c;
import U1.a;
import Xd.l;
import Xd.m;
import a0.C0366t;
import android.content.Context;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0555v;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0651v;
import androidx.lifecycle.d0;
import ao.ad;
import com.checkout.components.card.CardComponent;
import com.checkout.components.card.model.CardComponentConfig;
import com.checkout.components.core.C0919i;
import com.checkout.components.core.common.Fixtures;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.core.ui.FlowComponentViewModel;
import com.checkout.components.core.ui.content.FlowComponentItemViewKt;
import com.checkout.components.core.ui.model.ComponentColors;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.utils.constants.ContainerConstants;
import com.checkout.components.core.utils.constants.TestTags;
import com.checkout.components.core.utils.extension.ExtensionsKt;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.component.PaymentButtonAction;
import com.checkout.components.interfaces.error.CheckoutError;
import com.checkout.components.interfaces.insight.LogDetailsImpl;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.ComponentResult;
import com.checkout.components.interfaces.model.DisplayCvvConfiguration;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.interfaces.model.paymentsession.PaymentSession;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.checkout.components.rememberme.CheckoutRememberMeFactory;
import com.checkout.components.rememberme.model.RememberMeCallback;
import com.checkout.components.ui.data.DisplayCvvRepository;
import com.checkout.components.ui.data.SupportedSchemesRepository;
import com.checkout.components.ui.data.SupportedTypesRepository;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.utils.FlowAnimations;
import com.checkout.components.wallet.WalletComponent;
import com.checkout.components.wallet.ui.model.WalletComponentConfig;
import com.checkout.components.wallet.wrapper.GooglePayFlowCoordinator;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.F7;
import t0.AbstractC2901T;
import t6.S3;
import yf.AbstractC3428A;
import yf.N;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u009f\u0001\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00102\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/ComponentName;", "defaultPaymentMethod", "", "Lkotlin/Pair;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "components", "Lcom/checkout/components/core/ui/model/ComposeStyle;", "style", "Landroid/content/Context;", "context", "LQ0/n;", "layoutDirection", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "translation", "Lkotlin/Function1;", "", "onMethodSelected", "Lkotlin/Function0;", "Lcom/checkout/components/interfaces/model/CardMetadata;", "currentCardMetadata", "Lcom/checkout/components/interfaces/model/CallbackResult;", "onCardBinChanged", "FlowComponentView", "(Lcom/checkout/components/interfaces/model/ComponentName;Ljava/util/List;Lcom/checkout/components/core/ui/model/ComposeStyle;Landroid/content/Context;LQ0/n;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/m;II)V", "FlowComponentViewPreview", "(Landroidx/compose/runtime/m;I)V", "selectedMethod", "core_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponentViewKt {
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowComponentView(@NotNull final ComponentName defaultPaymentMethod, @NotNull final List<? extends Pair<? extends ComponentName, ? extends PaymentMethodComponent>> components, @NotNull final ComposeStyle style, @NotNull final Context context, @NotNull final n layoutDirection, @Nullable final Map<ComponentTranslationKey, String> map, @NotNull final Function1<? super PaymentMethodComponent, Unit> onMethodSelected, @Nullable Function0<CardMetadata> function0, @Nullable Function1<? super CardMetadata, ? extends CallbackResult> function1, @Nullable InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        Map<ComponentTranslationKey, String> map2;
        Function0<CardMetadata> function02;
        int i11;
        int i12;
        Function1<? super CardMetadata, ? extends CallbackResult> function12;
        int i13;
        boolean z2;
        C0585q c0585q;
        final Function1<? super CardMetadata, ? extends CallbackResult> function13;
        Q uniform;
        Function0<CardMetadata> function03;
        c cVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Intrinsics.echo(defaultPaymentMethod, "defaultPaymentMethod");
        Intrinsics.echo(components, "components");
        Intrinsics.echo(style, "style");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(layoutDirection, "layoutDirection");
        Intrinsics.echo(onMethodSelected, "onMethodSelected");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-402316705);
        if ((i4 & 6) == 0) {
            if (c0585q2.india(defaultPaymentMethod)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i10 = i20 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(components)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i10 |= i19;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(style)) {
                i18 = Barcode.FORMAT_QR_CODE;
            } else {
                i18 = 128;
            }
            i10 |= i18;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(context)) {
                i17 = 2048;
            } else {
                i17 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i17;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.echo(layoutDirection.ordinal())) {
                i16 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i16 = 8192;
            }
            i10 |= i16;
        }
        if ((196608 & i4) == 0) {
            map2 = map;
            if (c0585q2.india(map2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i10 |= i15;
        } else {
            map2 = map;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q2.india(onMethodSelected)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i10 |= i14;
        }
        int i21 = i5 & 128;
        if (i21 != 0) {
            i10 |= 12582912;
        } else if ((12582912 & i4) == 0) {
            function02 = function0;
            if (c0585q2.india(function02)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i10 |= i11;
            i12 = i5 & Barcode.FORMAT_QR_CODE;
            if (i12 == 0) {
                i10 |= 100663296;
            } else if ((100663296 & i4) == 0) {
                function12 = function1;
                if (c0585q2.india(function12)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i10 |= i13;
                if ((38347923 & i10) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c0585q2.magenta(i10 & 1, z2)) {
                    Function1<? super CardMetadata, ? extends CallbackResult> function14 = null;
                    if (i21 != 0) {
                        function03 = null;
                    } else {
                        function03 = function02;
                    }
                    if (i12 == 0) {
                        function14 = function12;
                    }
                    FlowComponentViewModelFactory flowComponentViewModelFactory = new FlowComponentViewModelFactory(defaultPaymentMethod, function03, function14);
                    d0 alpha = a.alpha(c0585q2);
                    if (alpha != null) {
                        if (alpha instanceof InterfaceC0651v) {
                            cVar = ((InterfaceC0651v) alpha).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = T1.a.bravo;
                        }
                        c0585q = c0585q2;
                        function02 = function03;
                        a(components, style, (FlowComponentViewModel) F7.bravo(u.alpha.bravo(FlowComponentViewModel.class), alpha, null, flowComponentViewModelFactory, cVar, c0585q), context, layoutDirection, map2, onMethodSelected, c0585q, (i10 & 3670016) | ((i10 >> 3) & 126) | (i10 & 7168) | (57344 & i10) | (458752 & i10));
                        function13 = function14;
                    } else {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    function13 = function12;
                }
                final Function0<CardMetadata> function04 = function02;
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new l() { // from class: F4.e
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            Unit a6;
                            int intValue = ((Integer) obj2).intValue();
                            ComponentName componentName = ComponentName.this;
                            List list = components;
                            ComposeStyle composeStyle = style;
                            Context context2 = context;
                            n nVar = layoutDirection;
                            Function1 function15 = onMethodSelected;
                            int i22 = i4;
                            int i23 = i5;
                            a6 = FlowComponentViewKt.a(componentName, list, composeStyle, context2, nVar, map, function15, function04, function13, i22, i23, (InterfaceC0581m) obj, intValue);
                            return a6;
                        }
                    };
                    return;
                }
                return;
            }
            function12 = function1;
            if ((38347923 & i10) != 38347922) {
            }
            if (c0585q2.magenta(i10 & 1, z2)) {
            }
            final Function0 function042 = function02;
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        function02 = function0;
        i12 = i5 & Barcode.FORMAT_QR_CODE;
        if (i12 == 0) {
        }
        function12 = function1;
        if ((38347923 & i10) != 38347922) {
        }
        if (c0585q2.magenta(i10 & 1, z2)) {
        }
        final Function0 function0422 = function02;
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void FlowComponentViewPreview(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(368733186);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
                PaymentMethodName googlePay = companion.getGooglePay();
                Environment environment = Environment.SANDBOX;
                Fixtures fixtures = Fixtures.INSTANCE;
                PaymentSession dUMMY_PAYMENT_SESSION$core_standardRelease = fixtures.getDUMMY_PAYMENT_SESSION$core_standardRelease();
                GooglePayFlowCoordinator googlePayFlowCoordinator = new GooglePayFlowCoordinator(context, new y(18));
                ComponentCallback componentCallback = new ComponentCallback(null, null, null, null, null, null, null, null, null, 511, null);
                PaymentState.Default r10 = PaymentState.Default.INSTANCE;
                Pair pair = new Pair(googlePay, new WalletComponent(new WalletComponentConfig(context, environment, dUMMY_PAYMENT_SESSION$core_standardRelease, "", componentCallback, googlePayFlowCoordinator, AbstractC3428A.charlie(r10), fixtures.getDUMMY_LOGGER$core_standardRelease(), new LogDetailsImpl("", "", companion.getGooglePay()), C0366t.india, false, null, null, null, null, null, 63488, null)));
                PaymentMethodName card = companion.getCard();
                ComponentCallback componentCallback2 = new ComponentCallback(null, null, null, null, null, null, null, null, null, 511, null);
                CheckoutRememberMeFactory checkoutRememberMeFactory = new CheckoutRememberMeFactory("", environment, null);
                Locale.En en = Locale.En.INSTANCE;
                i5 = 0;
                CheckoutRememberMe create = checkoutRememberMeFactory.create(null, new C0919i(null), CollectionsKt.emptyList(), CollectionsKt.emptyList(), AbstractC3428A.charlie(r10), en, null, context, new RememberMeCallback(new h(0), new h(1), null, null, null, 28, null), new z(22), new LogDetailsImpl("", "", companion.getRememberMe()), fixtures.getDUMMY_LOGGER$core_standardRelease());
                CardTypeName.Companion companion2 = CardTypeName.INSTANCE;
                CardComponentConfig cardComponentConfig = new CardComponentConfig(componentCallback2, false, true, null, "", create, true, null, new SupportedTypesRepository(companion2.getEntries(), companion2.getEntries(), new h(2)), n.alpha);
                N charlie = AbstractC3428A.charlie(r10);
                java.util.Locale locale = new java.util.Locale("en");
                Logger dUMMY_LOGGER$core_standardRelease = fixtures.getDUMMY_LOGGER$core_standardRelease();
                LogDetailsImpl logDetailsImpl = new LogDetailsImpl("", "", companion.getCard());
                PaymentButtonAction paymentButtonAction = PaymentButtonAction.PAYMENT;
                SupportedSchemesRepository supportedSchemesRepository = new SupportedSchemesRepository(CollectionsKt.z(CardScheme.getEntries()), CollectionsKt.z(CardScheme.getEntries()), new h(3));
                DisplayCvvConfiguration displayCvvConfiguration = DisplayCvvConfiguration.SHOW;
                CardComponent cardComponent = new CardComponent(cardComponentConfig, environment, "", context, null, charlie, new y(17), supportedSchemesRepository, new DisplayCvvRepository(displayCvvConfiguration, displayCvvConfiguration, new s(28)), null, locale, dUMMY_LOGGER$core_standardRelease, logDetailsImpl, paymentButtonAction, 512, null);
                context = context;
                jade = CollectionsKt.white(pair, new Pair(card, cardComponent));
                c0585q.f(jade);
            } else {
                i5 = 0;
            }
            List list = (List) jade;
            n nVar = n.alpha;
            PaymentMethodName card2 = PaymentMethodName.INSTANCE.getCard();
            ComposeStyle composeStyle = new ComposeStyle(null, null, AbstractC2094g.bravo(8), new ComponentColors(C0366t.charlie, C0366t.bravo, C0366t.hotel, C0366t.echo, C0366t.golf, null), 3, null);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new z(20);
                c0585q.f(jade2);
            }
            Function1 function1 = (Function1) jade2;
            Object jade3 = c0585q.jade();
            if (jade3 == asVar) {
                jade3 = new s(29);
                c0585q.f(jade3);
            }
            Function0 function0 = (Function0) jade3;
            Object jade4 = c0585q.jade();
            if (jade4 == asVar) {
                jade4 = new z(21);
                c0585q.f(jade4);
            }
            FlowComponentView(card2, list, composeStyle, context, nVar, null, function1, function0, (Function1) jade4, c0585q, PaymentMethodName.$stable | 115040256, 0);
        } else {
            i5 = 0;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(i4, i5);
        }
    }

    public static final Unit a(ComponentName componentName, List list, ComposeStyle composeStyle, Context context, n nVar, Map map, Function1 function1, Function0 function0, Function1 function12, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        FlowComponentView(componentName, list, composeStyle, context, nVar, map, function1, function0, function12, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit b() {
        return Unit.INSTANCE;
    }

    public static final ComponentName c() {
        return PaymentMethodName.INSTANCE.getCard();
    }

    public static final ComponentName d() {
        return PaymentMethodName.INSTANCE.getCard();
    }

    public static final ComponentName e() {
        return PaymentMethodName.INSTANCE.getCard();
    }

    public static final CardMetadata f() {
        return null;
    }

    public static final Unit a(List list, ComposeStyle composeStyle, FlowComponentViewModel flowComponentViewModel, Context context, n nVar, Map map, Function1 function1, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        a(list, composeStyle, flowComponentViewModel, context, nVar, map, function1, interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, InterfaceC0581m interfaceC0581m, int i5) {
        FlowComponentViewPreview(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    private static final String a(ComponentName componentName) {
        PaymentMethodName.Companion companion = PaymentMethodName.INSTANCE;
        if (Intrinsics.areEqual(componentName, companion.getGooglePay())) {
            return TestTags.GOOGLE_PAY_BUTTON;
        }
        if (Intrinsics.areEqual(componentName, companion.getCard())) {
            return TestTags.CARD_BUTTON;
        }
        if (componentName instanceof PaymentMethodName) {
            return P0.crimson(((PaymentMethodName) componentName).getValue(), "_button");
        }
        return null;
    }

    private static final void a(final List list, ComposeStyle composeStyle, FlowComponentViewModel flowComponentViewModel, Context context, n nVar, final Map map, final Function1 function1, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        ComposeStyle composeStyle2;
        FlowComponentViewModel flowComponentViewModel2;
        Context context2;
        n nVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1347097961);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(list) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            composeStyle2 = composeStyle;
            i5 |= c0585q.golf(composeStyle2) ? 32 : 16;
        } else {
            composeStyle2 = composeStyle;
        }
        if ((i4 & 384) == 0) {
            flowComponentViewModel2 = flowComponentViewModel;
            i5 |= c0585q.india(flowComponentViewModel2) ? Barcode.FORMAT_QR_CODE : 128;
        } else {
            flowComponentViewModel2 = flowComponentViewModel;
        }
        if ((i4 & 3072) == 0) {
            context2 = context;
            i5 |= c0585q.india(context2) ? 2048 : Barcode.FORMAT_UPC_E;
        } else {
            context2 = context;
        }
        if ((i4 & 24576) == 0) {
            i5 |= c0585q.echo(nVar.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= c0585q.india(map) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= c0585q.india(function1) ? 1048576 : 524288;
        }
        if (c0585q.magenta(i5 & 1, (599187 & i5) != 599186)) {
            final ax mike = C0564b.mike(flowComponentViewModel2.getSelectedMethod(), c0585q, 0);
            final long m94getBackground0d7_KjU = composeStyle2.getComponentColors().m94getBackground0d7_KjU();
            final long m95getBorder0d7_KjU = composeStyle2.getComponentColors().m95getBorder0d7_KjU();
            final C2093f roundedCornerShape = composeStyle2.getRoundedCornerShape();
            nVar2 = nVar;
            final ComposeStyle composeStyle3 = composeStyle2;
            final FlowComponentViewModel flowComponentViewModel3 = flowComponentViewModel2;
            final Context context3 = context2;
            C0564b.alpha(AbstractC2901T.november.alpha(nVar2), e.echo(1636678185, new l() { // from class: F4.a
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    Unit a6;
                    int intValue = ((Integer) obj2).intValue();
                    FlowComponentViewModel flowComponentViewModel4 = flowComponentViewModel3;
                    ComposeStyle composeStyle4 = composeStyle3;
                    ax axVar = mike;
                    a6 = FlowComponentViewKt.a(m94getBackground0d7_KjU, m95getBorder0d7_KjU, roundedCornerShape, list, context3, map, flowComponentViewModel4, function1, composeStyle4, axVar, (InterfaceC0581m) obj, intValue);
                    return a6;
                }
            }, c0585q), c0585q, 56);
        } else {
            nVar2 = nVar;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new f(list, composeStyle, flowComponentViewModel, context, nVar2, map, function1, i4, 0);
        }
    }

    public static final Unit a(long j5, final long j6, C2093f c2093f, final List list, final Context context, final Map map, final FlowComponentViewModel flowComponentViewModel, final Function1 function1, final ComposeStyle composeStyle, final D0 d02, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            T.s alpha = androidx.compose.animation.c.alpha(p.alpha, FlowAnimations.INSTANCE.getDefaultContentSizeSpec(), 2);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, d.f2062f, c0585q, 0);
            long j7 = c0585q.magenta;
            int i5 = (int) (j7 ^ (j7 >>> 32));
            I mike = c0585q.mike();
            T.s charlie = T.a.charlie(alpha, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i5))) {
                ad.blue(i5, c0585q, i5, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            K1.india(c2093f, K1.lima(j5, c0585q, 0), null, S3.alpha(ContainerConstants.INSTANCE.m100getBorderStrokeWidthD9Ej5fM(), j6), e.echo(653278995, new m() { // from class: F4.d
                @Override // Xd.m
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit a6;
                    int intValue = ((Integer) obj3).intValue();
                    long j10 = j6;
                    D0 d03 = d02;
                    a6 = FlowComponentViewKt.a(list, context, map, flowComponentViewModel, function1, composeStyle, j10, d03, (InterfaceC0555v) obj, (InterfaceC0581m) obj2, intValue);
                    return a6;
                }
            }, c0585q), c0585q, 196614);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(FlowComponentViewModel flowComponentViewModel, ComponentName componentName, Function1 function1, PaymentMethodComponent paymentMethodComponent) {
        flowComponentViewModel.checkOnCardBinChanged(componentName);
        flowComponentViewModel.selectMethod(componentName);
        function1.invoke(paymentMethodComponent);
        return Unit.INSTANCE;
    }

    public static final Unit a(PaymentMethodComponent paymentMethodComponent, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            paymentMethodComponent.Render(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(int i4, String str) {
        Intrinsics.echo(str, "<unused var>");
        return Unit.INSTANCE;
    }

    public static final Unit a() {
        return Unit.INSTANCE;
    }

    public static final Unit a(CheckoutError it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit a(ComponentResult componentResult, boolean z2) {
        Intrinsics.echo(componentResult, "<unused var>");
        return Unit.INSTANCE;
    }

    public static final Unit a(PaymentMethodComponent it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final CallbackResult a(CardMetadata cardMetadata) {
        Intrinsics.echo(cardMetadata, "<unused var>");
        return CallbackResult.Accepted.INSTANCE;
    }

    public static final Unit a(List list, Context context, Map map, FlowComponentViewModel flowComponentViewModel, Function1 function1, ComposeStyle composeStyle, long j5, D0 d02, InterfaceC0555v OutlinedCard, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(OutlinedCard, "$this$OutlinedCard");
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 17) != 16)) {
            int i5 = 0;
            for (Object obj : list) {
                int i10 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                ComponentName componentName = (ComponentName) pair.first;
                PaymentMethodComponent paymentMethodComponent = (PaymentMethodComponent) pair.second;
                String translatedName = ExtensionsKt.toTranslatedName(componentName, context, map);
                String paymentMethodSubtitle = ExtensionsKt.getPaymentMethodSubtitle(componentName, context);
                boolean shouldTintPaymentMethodIcon = ExtensionsKt.shouldTintPaymentMethodIcon(componentName);
                boolean areEqual = Intrinsics.areEqual(componentName, (ComponentName) d02.getValue());
                boolean india = c0585q.india(flowComponentViewModel) | c0585q.india(componentName) | c0585q.golf(function1) | c0585q.india(paymentMethodComponent);
                Object jade = c0585q.jade();
                if (india || jade == C0580l.alpha) {
                    b bVar = new b(flowComponentViewModel, componentName, function1, paymentMethodComponent, 0);
                    c0585q.f(bVar);
                    jade = bVar;
                }
                C0585q c0585q2 = c0585q;
                FlowComponentItemViewKt.FlowComponentItemView(translatedName, paymentMethodSubtitle, shouldTintPaymentMethodIcon, areEqual, (Function0) jade, e.echo(-1503151961, new F4.c(paymentMethodComponent, 0), c0585q), ExtensionsKt.getPaymentMethodIcon(componentName), composeStyle, a(componentName), c0585q2, 196608, 0);
                if (i5 < list.size() - 1) {
                    c0585q2.purple(-1984209013);
                    K1.echo(null, ContainerConstants.INSTANCE.m102getDividerThicknessD9Ej5fM(), j5, c0585q2, 48, 1);
                } else {
                    c0585q2.purple(-1991472654);
                }
                c0585q2.quebec(false);
                c0585q = c0585q2;
                i5 = i10;
            }
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
