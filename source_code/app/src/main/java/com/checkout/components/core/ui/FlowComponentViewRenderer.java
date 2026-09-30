package com.checkout.components.core.ui;

import F4.i;
import F4.j;
import P.d;
import P.e;
import T.p;
import Xd.l;
import Xd.n;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.checkout.components.card.CardComponent;
import com.checkout.components.core.C0920j;
import com.checkout.components.core.C0921k;
import com.checkout.components.core.C0922l;
import com.checkout.components.core.ui.FlowComponentViewRenderer;
import com.checkout.components.core.ui.model.ComposeStyle;
import com.checkout.components.core.ui.model.FlowComponentConfig;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.model.CallbackResult;
import com.checkout.components.interfaces.model.CardMetadata;
import com.checkout.components.interfaces.model.ComponentName;
import com.checkout.components.interfaces.model.PaymentMethodName;
import com.checkout.components.interfaces.ui.ViewRenderer;
import com.checkout.components.rememberme.CheckoutRememberMe;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/core/ui/FlowComponentViewRenderer;", "Lcom/checkout/components/interfaces/ui/ViewRenderer;", "Lcom/checkout/components/core/ui/model/FlowComponentConfig;", Constants.KEY_CONFIG, "Lkotlin/Function1;", "Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "", "onMethodSelected", "Lcom/checkout/components/core/ui/FlowComponent;", "flowComponent", "<init>", "(Lcom/checkout/components/core/ui/model/FlowComponentConfig;Lkotlin/jvm/functions/Function1;Lcom/checkout/components/core/ui/FlowComponent;)V", "Render", "(Landroidx/compose/runtime/m;I)V", "getDefaultSelectedComponent$core_standardRelease", "()Lcom/checkout/components/interfaces/api/PaymentMethodComponent;", "defaultSelectedComponent", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowComponentViewRenderer implements ViewRenderer {
    public static final int $stable = 8;

    /* renamed from: a */
    private final FlowComponentConfig f5035a;

    /* renamed from: b */
    private final Function1 f5036b;

    /* renamed from: c */
    private final FlowComponent f5037c;

    public FlowComponentViewRenderer(@NotNull FlowComponentConfig config, @NotNull Function1<? super PaymentMethodComponent, Unit> onMethodSelected, @NotNull FlowComponent flowComponent) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(onMethodSelected, "onMethodSelected");
        Intrinsics.echo(flowComponent, "flowComponent");
        this.f5035a = config;
        this.f5036b = onMethodSelected;
        this.f5037c = flowComponent;
    }

    public static final Unit a(FlowComponentViewRenderer flowComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        flowComponentViewRenderer.Render(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit b(FlowComponentViewRenderer flowComponentViewRenderer, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        flowComponentViewRenderer.a(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final CardMetadata c(FlowComponentViewRenderer flowComponentViewRenderer) {
        CardComponent cardComponent;
        PaymentMethodComponent paymentMethodComponent = flowComponentViewRenderer.f5035a.getComponents$core_standardRelease().get(PaymentMethodName.INSTANCE.getCard());
        if (paymentMethodComponent instanceof CardComponent) {
            cardComponent = (CardComponent) paymentMethodComponent;
        } else {
            cardComponent = null;
        }
        if (cardComponent == null) {
            return null;
        }
        return cardComponent.getCurrentCardMetadata();
    }

    @Override // com.checkout.components.interfaces.ui.ViewRenderer
    public final void Render(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1189473292);
        if ((i4 & 6) == 0) {
            if (c0585q.india(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            CheckoutRememberMe rememberMe$core_standardRelease = this.f5035a.getRememberMe$core_standardRelease();
            Unit unit = null;
            if (rememberMe$core_standardRelease == null) {
                c0585q.purple(-2118549717);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-622529642);
                p pVar = p.alpha;
                final int i11 = 0;
                d echo = e.echo(542940356, new l(this) { // from class: F4.k
                    public final /* synthetic */ FlowComponentViewRenderer purple;

                    {
                        this.purple = this;
                    }

                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit a6;
                        Unit b2;
                        int i12 = i11;
                        InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i12) {
                            case 0:
                                a6 = FlowComponentViewRenderer.a(this.purple, interfaceC0581m2, intValue);
                                return a6;
                            default:
                                b2 = FlowComponentViewRenderer.b(this.purple, interfaceC0581m2, intValue);
                                return b2;
                        }
                    }
                }, c0585q);
                final int i12 = 1;
                d echo2 = e.echo(-1559513147, new l(this) { // from class: F4.k
                    public final /* synthetic */ FlowComponentViewRenderer purple;

                    {
                        this.purple = this;
                    }

                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        Unit a6;
                        Unit b2;
                        int i122 = i12;
                        InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i122) {
                            case 0:
                                a6 = FlowComponentViewRenderer.a(this.purple, interfaceC0581m2, intValue);
                                return a6;
                            default:
                                b2 = FlowComponentViewRenderer.b(this.purple, interfaceC0581m2, intValue);
                                return b2;
                        }
                    }
                }, c0585q);
                boolean india = c0585q.india(this);
                Object jade = c0585q.jade();
                as asVar = C0580l.alpha;
                if (india || jade == asVar) {
                    jade = new C0920j(this, null);
                    c0585q.f(jade);
                }
                n nVar = (n) jade;
                boolean india2 = c0585q.india(this);
                Object jade2 = c0585q.jade();
                if (india2 || jade2 == asVar) {
                    jade2 = new C0921k(this, null);
                    c0585q.f(jade2);
                }
                l lVar = (l) jade2;
                boolean india3 = c0585q.india(this);
                Object jade3 = c0585q.jade();
                if (india3 || jade3 == asVar) {
                    jade3 = new i(this, 1);
                    c0585q.f(jade3);
                }
                Function0<Boolean> function0 = (Function0) jade3;
                boolean india4 = c0585q.india(this);
                Object jade4 = c0585q.jade();
                if (india4 || jade4 == asVar) {
                    jade4 = new i(this, 2);
                    c0585q.f(jade4);
                }
                rememberMe$core_standardRelease.RememberMeView(pVar, echo, echo2, nVar, lVar, function0, (Function0) jade4, c0585q, (CheckoutRememberMe.$stable << 21) | 438, 0);
                c0585q.quebec(false);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                c0585q.purple(-622495712);
                a(c0585q, i5 & 14);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-622530215);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(this, i4, 1);
        }
    }

    @NotNull
    public final PaymentMethodComponent getDefaultSelectedComponent$core_standardRelease() {
        return (PaymentMethodComponent) CollectionsKt.fuchsia(this.f5035a.getComponents$core_standardRelease().values());
    }

    public static final Unit a(FlowComponentViewRenderer flowComponentViewRenderer, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            flowComponentViewRenderer.a(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(FlowComponentViewRenderer flowComponentViewRenderer, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(i4 & 1, (i4 & 3) != 2)) {
            PaymentMethodComponent paymentMethodComponent = flowComponentViewRenderer.f5035a.getComponents$core_standardRelease().get(PaymentMethodName.INSTANCE.getCard());
            CardComponent cardComponent = paymentMethodComponent instanceof CardComponent ? (CardComponent) paymentMethodComponent : null;
            if (cardComponent == null) {
                c0585q.purple(-794856375);
            } else {
                c0585q.purple(251454136);
                cardComponent.RenderAddCardView(c0585q, CardComponent.$stable);
            }
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }

    public static final boolean a(FlowComponentViewRenderer flowComponentViewRenderer) {
        PaymentMethodComponent paymentMethodComponent = flowComponentViewRenderer.f5035a.getComponents$core_standardRelease().get(PaymentMethodName.INSTANCE.getCard());
        CardComponent cardComponent = paymentMethodComponent instanceof CardComponent ? (CardComponent) paymentMethodComponent : null;
        if (cardComponent != null) {
            return cardComponent.isTokenizationInProgress();
        }
        return false;
    }

    private final void a(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1671977538);
        if ((i4 & 6) == 0) {
            i5 = (c0585q.india(this) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if (c0585q.magenta(i5 & 1, (i5 & 3) != 2)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new SnapshotStateList();
                c0585q.f(jade);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) jade;
            Unit unit = Unit.INSTANCE;
            boolean india = c0585q.india(this);
            Object jade2 = c0585q.jade();
            if (india || jade2 == asVar) {
                jade2 = new C0922l(this, snapshotStateList, null);
                c0585q.f(jade2);
            }
            C0564b.foxtrot((l) jade2, c0585q, unit);
            ComposeStyle style$core_standardRelease = this.f5035a.getStyle$core_standardRelease();
            Context context$core_standardRelease = this.f5035a.getContext$core_standardRelease();
            Q0.n layoutDirection$core_standardRelease = this.f5035a.getLayoutDirection$core_standardRelease();
            Map<ComponentTranslationKey, String> translation$core_standardRelease = this.f5035a.getTranslation$core_standardRelease();
            Function1 function1 = this.f5036b;
            ComponentName name = getDefaultSelectedComponent$core_standardRelease().getName();
            Function1<CardMetadata, CallbackResult> onCardBinChanged = this.f5035a.getComponentCallback$core_standardRelease().getOnCardBinChanged();
            boolean india2 = c0585q.india(this);
            Object jade3 = c0585q.jade();
            if (india2 || jade3 == asVar) {
                jade3 = new i(this, 0);
                c0585q.f(jade3);
            }
            FlowComponentViewKt.FlowComponentView(name, snapshotStateList, style$core_standardRelease, context$core_standardRelease, layoutDirection$core_standardRelease, translation$core_standardRelease, function1, (Function0) jade3, onCardBinChanged, c0585q, 48, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new j(this, i4, 0);
        }
    }

    public static final CardMetadata b(FlowComponentViewRenderer flowComponentViewRenderer) {
        PaymentMethodComponent paymentMethodComponent = flowComponentViewRenderer.f5035a.getComponents$core_standardRelease().get(PaymentMethodName.INSTANCE.getCard());
        CardComponent cardComponent = paymentMethodComponent instanceof CardComponent ? (CardComponent) paymentMethodComponent : null;
        if (cardComponent != null) {
            return cardComponent.getCurrentCardMetadata();
        }
        return null;
    }
}
