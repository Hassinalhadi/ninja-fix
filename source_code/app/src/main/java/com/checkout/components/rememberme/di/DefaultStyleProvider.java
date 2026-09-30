package com.checkout.components.rememberme.di;

import D0.an;
import androidx.compose.runtime.C0564b;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.rememberme.di.DefaultStyleProvider;
import com.checkout.components.ui.R;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.Shape;
import com.checkout.components.ui.model.TextAlign;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.DefaultTextLabelStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001cJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0017J\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010\u0017J\r\u0010#\u001a\u00020\u0015¢\u0006\u0004\b#\u0010\u0017J\r\u0010$\u001a\u00020\u0015¢\u0006\u0004\b$\u0010\u0017R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001b\u00109\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R\u001b\u0010<\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00102R\u001b\u0010A\u001a\u00020=8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u0010@R\u001b\u0010E\u001a\u00020\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u0010IR\u001b\u0010M\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bK\u00100\u001a\u0004\bL\u00102R\u001b\u0010P\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bN\u00100\u001a\u0004\bO\u00102R\u001b\u0010S\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bQ\u00100\u001a\u0004\bR\u00102R\u001b\u0010V\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bT\u00100\u001a\u0004\bU\u00102R\u001b\u0010Y\u001a\u00020\f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bW\u00100\u001a\u0004\bX\u00102R\u001b\u0010\\\u001a\u00020F8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bZ\u00100\u001a\u0004\b[\u0010I¨\u0006]"}, d2 = {"Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "Lcom/checkout/components/ui/mapper/InputComponentViewStyleMapper;", "inputComponentViewStyleMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "Lcom/checkout/components/ui/mapper/InputComponentStateMapper;", "inputComponentStateMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "textLabelStyleToViewStyleMapper", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStyleToStateMapper", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)V", "Lcom/checkout/components/ui/model/TextLabelViewItem;", "prefilledEmailLabelViewItem", "()Lcom/checkout/components/ui/model/TextLabelViewItem;", "prefilledPhoneLabelViewItem", "editLabelViewItem", "Lcom/checkout/components/ui/model/InputComponentViewItem;", "emailInputViewItem", "()Lcom/checkout/components/ui/model/InputComponentViewItem;", "countryCodeViewItem", "phoneNumberViewItem", "saveCardLabelViewItem", "prefilledPhoneTextViewItem", "prefilledEmailTextViewItem", "useDifferentPaymentMethodViewItem", "useSavedPaymentMethodViewItem", "legalTextViewItem", "b", "Lcom/checkout/components/interfaces/mapper/Mapper;", "getInputComponentViewStyleMapper$rememberme_standardRelease", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "c", "getInputComponentStateMapper$rememberme_standardRelease", "f", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "getDesignTokens$rememberme_standardRelease", "()Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "h", "Lkotlin/Lazy;", "getSecondaryLabel$rememberme_standardRelease", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "secondaryLabel", "i", "getErrorLabel$rememberme_standardRelease", "errorLabel", "l", "getSetDefaultPaymentStyle$rememberme_standardRelease", "setDefaultPaymentStyle", Constants.INAPP_WINDOW, "getPrimaryCenterLabel$rememberme_standardRelease", "primaryCenterLabel", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "x", "getPayButtonItem$rememberme_standardRelease", "()Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "payButtonItem", "y", "getCvvInputFieldComponent$rememberme_standardRelease", "()Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "cvvInputFieldComponent", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", CtApi.QUERY_PARAM_Z_KEY, "getOverflowImageStyle$rememberme_standardRelease", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "overflowImageStyle", "A", "getWalletItemExpiredLabelStyle$rememberme_standardRelease", "walletItemExpiredLabelStyle", "B", "getWalletItemDefaultLabelStyle$rememberme_standardRelease", "walletItemDefaultLabelStyle", "C", "getWalletEmailHeading$rememberme_standardRelease", "walletEmailHeading", "D", "getActionHeading$rememberme_standardRelease", "actionHeading", "E", "getSecondaryFootnote$rememberme_standardRelease", "secondaryFootnote", "F", "getWalletItemInfoImageStyle$rememberme_standardRelease", "walletItemInfoImageStyle", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultStyleProvider {
    public static final int $stable = 8;

    /* renamed from: A, reason: from kotlin metadata */
    private final Lazy walletItemExpiredLabelStyle;

    /* renamed from: B, reason: from kotlin metadata */
    private final Lazy walletItemDefaultLabelStyle;

    /* renamed from: C, reason: from kotlin metadata */
    private final Lazy walletEmailHeading;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Lazy actionHeading;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy secondaryFootnote;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final Lazy walletItemInfoImageStyle;

    /* renamed from: a, reason: collision with root package name */
    private final ResourceProvider f5890a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Mapper inputComponentViewStyleMapper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Mapper inputComponentStateMapper;

    /* renamed from: d, reason: collision with root package name */
    private final Mapper f5893d;
    private final TextLabelStyleToStateMapper e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final DesignTokens designTokens;

    /* renamed from: g, reason: collision with root package name */
    private final Lazy f5895g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy secondaryLabel;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorLabel;

    /* renamed from: j, reason: collision with root package name */
    private final Lazy f5898j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f5899k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy setDefaultPaymentStyle;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f5901m;

    /* renamed from: n, reason: collision with root package name */
    private final Lazy f5902n;

    /* renamed from: o, reason: collision with root package name */
    private final Lazy f5903o;

    /* renamed from: p, reason: collision with root package name */
    private final Lazy f5904p;

    /* renamed from: q, reason: collision with root package name */
    private final Lazy f5905q;

    /* renamed from: r, reason: collision with root package name */
    private final Lazy f5906r;

    /* renamed from: s, reason: collision with root package name */
    private final Lazy f5907s;

    /* renamed from: t, reason: collision with root package name */
    private final Lazy f5908t;

    /* renamed from: u, reason: collision with root package name */
    private final Lazy f5909u;

    /* renamed from: v, reason: collision with root package name */
    private final Lazy f5910v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy primaryCenterLabel;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy payButtonItem;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy cvvInputFieldComponent;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy overflowImageStyle;

    public DefaultStyleProvider(@NotNull ResourceProvider resourceProvider, @NotNull Mapper<InputComponentStyle, InputComponentViewStyle> inputComponentViewStyleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> inputComponentStateMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleToViewStyleMapper, @NotNull TextLabelStyleToStateMapper textLabelStyleToStateMapper, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(inputComponentViewStyleMapper, "inputComponentViewStyleMapper");
        Intrinsics.echo(inputComponentStateMapper, "inputComponentStateMapper");
        Intrinsics.echo(textLabelStyleToViewStyleMapper, "textLabelStyleToViewStyleMapper");
        Intrinsics.echo(textLabelStyleToStateMapper, "textLabelStyleToStateMapper");
        this.f5890a = resourceProvider;
        this.inputComponentViewStyleMapper = inputComponentViewStyleMapper;
        this.inputComponentStateMapper = inputComponentStateMapper;
        this.f5893d = textLabelStyleToViewStyleMapper;
        this.e = textLabelStyleToStateMapper;
        this.designTokens = designTokens;
        final int i4 = 0;
        this.f5895g = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i5;
                InputComponentStyle d4;
                switch (i4) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i5 = DefaultStyleProvider.i(this.purple);
                        return i5;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i5 = 2;
        this.secondaryLabel = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i5) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i10 = 9;
        this.errorLabel = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i10) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i11 = 10;
        this.f5898j = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i11) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i12 = 12;
        this.f5899k = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i12) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i13 = 13;
        this.setDefaultPaymentStyle = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i13) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i14 = 14;
        this.f5901m = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i14) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i15 = 15;
        this.f5902n = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i15) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i16 = 16;
        this.f5903o = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i16) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i17 = 17;
        this.f5904p = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i17) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i18 = 11;
        this.f5905q = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i18) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i19 = 18;
        this.f5906r = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i19) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i20 = 19;
        this.f5907s = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i20) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i21 = 20;
        this.f5908t = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i21) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i22 = 21;
        this.f5909u = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i22) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i23 = 22;
        this.f5910v = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i23) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i24 = 23;
        this.primaryCenterLabel = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i24) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i25 = 24;
        this.payButtonItem = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i25) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i26 = 25;
        this.cvvInputFieldComponent = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i26) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i27 = 1;
        this.overflowImageStyle = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i27) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i28 = 3;
        this.walletItemExpiredLabelStyle = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i28) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i29 = 4;
        this.walletItemDefaultLabelStyle = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i29) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i30 = 5;
        this.walletEmailHeading = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i30) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i31 = 6;
        this.actionHeading = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i31) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i32 = 7;
        this.secondaryFootnote = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i32) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
        final int i33 = 8;
        this.walletItemInfoImageStyle = LazyKt.lazy(new Function0(this) { // from class: c5.a
            public final /* synthetic */ DefaultStyleProvider purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextLabelStyle o5;
                ImageStyle h4;
                TextLabelStyle u4;
                TextLabelStyle y10;
                TextLabelStyle x4;
                TextLabelStyle w4;
                TextLabelStyle a6;
                TextLabelStyle s3;
                ImageStyle z2;
                TextLabelStyle g2;
                TextLabelStyle r4;
                InputComponentViewItem k6;
                TextLabelStyle q4;
                TextLabelStyle v4;
                InputComponentStyle j5;
                InputComponentStyle e;
                InputComponentStyle b2;
                TextLabelViewItem p4;
                InputComponentViewItem f5;
                TextLabelViewItem l10;
                TextLabelViewItem m4;
                TextLabelViewItem t5;
                InputComponentViewItem c3;
                TextLabelStyle n5;
                ButtonStyle i52;
                InputComponentStyle d4;
                switch (i33) {
                    case 0:
                        o5 = DefaultStyleProvider.o(this.purple);
                        return o5;
                    case 1:
                        h4 = DefaultStyleProvider.h(this.purple);
                        return h4;
                    case 2:
                        u4 = DefaultStyleProvider.u(this.purple);
                        return u4;
                    case 3:
                        y10 = DefaultStyleProvider.y(this.purple);
                        return y10;
                    case 4:
                        x4 = DefaultStyleProvider.x(this.purple);
                        return x4;
                    case 5:
                        w4 = DefaultStyleProvider.w(this.purple);
                        return w4;
                    case 6:
                        a6 = DefaultStyleProvider.a(this.purple);
                        return a6;
                    case 7:
                        s3 = DefaultStyleProvider.s(this.purple);
                        return s3;
                    case 8:
                        z2 = DefaultStyleProvider.z(this.purple);
                        return z2;
                    case 9:
                        g2 = DefaultStyleProvider.g(this.purple);
                        return g2;
                    case 10:
                        r4 = DefaultStyleProvider.r(this.purple);
                        return r4;
                    case 11:
                        k6 = DefaultStyleProvider.k(this.purple);
                        return k6;
                    case 12:
                        q4 = DefaultStyleProvider.q(this.purple);
                        return q4;
                    case 13:
                        v4 = DefaultStyleProvider.v(this.purple);
                        return v4;
                    case 14:
                        j5 = DefaultStyleProvider.j(this.purple);
                        return j5;
                    case 15:
                        e = DefaultStyleProvider.e(this.purple);
                        return e;
                    case 16:
                        b2 = DefaultStyleProvider.b(this.purple);
                        return b2;
                    case 17:
                        p4 = DefaultStyleProvider.p(this.purple);
                        return p4;
                    case 18:
                        f5 = DefaultStyleProvider.f(this.purple);
                        return f5;
                    case 19:
                        l10 = DefaultStyleProvider.l(this.purple);
                        return l10;
                    case 20:
                        m4 = DefaultStyleProvider.m(this.purple);
                        return m4;
                    case 21:
                        t5 = DefaultStyleProvider.t(this.purple);
                        return t5;
                    case 22:
                        c3 = DefaultStyleProvider.c(this.purple);
                        return c3;
                    case 23:
                        n5 = DefaultStyleProvider.n(this.purple);
                        return n5;
                    case 24:
                        i52 = DefaultStyleProvider.i(this.purple);
                        return i52;
                    default:
                        d4 = DefaultStyleProvider.d(this.purple);
                        return d4;
                }
            }
        });
    }

    private final TextLabelViewItem a(String str) {
        TextLabelViewItem textLabelViewItem = (TextLabelViewItem) this.f5909u.getValue();
        TextLabelState copy$default = TextLabelState.copy$default(((TextLabelViewItem) this.f5909u.getValue()).getState(), C0564b.zulu(str), null, null, 6, null);
        TextLabelViewStyle style = ((TextLabelViewItem) this.f5909u.getValue()).getStyle();
        an style2 = ((TextLabelViewItem) this.f5909u.getValue()).getStyle().getStyle();
        return textLabelViewItem.copy(TextLabelViewStyle.m180copyQstMH_w$default(style, null, 0, false, 0, null, an.alpha(style2 == null ? new an(0L, 0L, null, null, null, 0L, 0, 0L, 0, 16777215) : style2, 0L, 0L, null, null, 0L, 3, 0L, null, null, 16740351), false, 95, null), copy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentStyle b(DefaultStyleProvider defaultStyleProvider) {
        return DefaultStyle.INSTANCE.createPickerFieldStyle(new Padding(0, 0, 0, 0, 15, null), defaultStyleProvider.f5890a.getString(R.string.cko_address_country_select), defaultStyleProvider.designTokens);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentViewItem c(DefaultStyleProvider defaultStyleProvider) {
        InputComponentViewStyle inputComponentViewStyle = (InputComponentViewStyle) defaultStyleProvider.inputComponentViewStyleMapper.map((InputComponentStyle) defaultStyleProvider.f5903o.getValue());
        return new InputComponentViewItem((InputComponentState) defaultStyleProvider.inputComponentStateMapper.map((InputComponentStyle) defaultStyleProvider.f5903o.getValue()), InputComponentViewStyle.copy$default(inputComponentViewStyle, InputFieldViewStyle.copy$default(inputComponentViewStyle.getInputFieldStyle(), null, false, false, null, null, null, null, null, null, false, 2, 1, null, null, null, 29183, null), null, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentStyle d(DefaultStyleProvider defaultStyleProvider) {
        BorderRadius borderRadius;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = defaultStyleProvider.f5890a.getString(R.string.cko_card_security_code_placeholder);
        DesignTokens designTokens = defaultStyleProvider.designTokens;
        ColorTokens colorTokens = null;
        if (designTokens != null) {
            borderRadius = designTokens.getBorderFormRadius();
        } else {
            borderRadius = null;
        }
        DesignTokens designTokens2 = defaultStyleProvider.designTokens;
        if (designTokens2 != null) {
            colorTokens = designTokens2.getColorTokens();
        }
        ColorTokens colorTokens2 = colorTokens;
        Utils utils = Utils.INSTANCE;
        return new InputComponentStyle(DefaultStyle.inputFieldStyle$default(defaultStyle, null, null, string, null, null, false, true, defaultStyle.trailingIconStyle(Long.valueOf(utils.primaryColor(defaultStyleProvider.designTokens)), Integer.valueOf(R.drawable.cko_ic_cvv)), null, borderRadius, colorTokens2, utils.labelFont(defaultStyleProvider.designTokens), utils.labelFont(defaultStyleProvider.designTokens), 315, null), DefaultTextLabelStyle.INSTANCE.error(utils.errorColor(defaultStyleProvider.designTokens)), (Integer) CollectionsKt.purple(CardScheme.UNKNOWN.getCvvLength()), new aw(3, 7, 115), null, ContainerStyle.copy$default(defaultStyle.containerStyle(), 0L, null, null, new Padding(10, 0, 0, 16, 6, null), 7, null), 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentStyle e(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        return DefaultStyle.createInputComponentStyle$default(defaultStyle, defaultStyleProvider.f5890a.getString(R.string.cko_form_email), defaultStyleProvider.designTokens, null, aw.alpha(aw.delta, 6, 7, 115), DefaultStyle.emptyContainerStyle$default(defaultStyle, null, 1, null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentViewItem f(DefaultStyleProvider defaultStyleProvider) {
        return new InputComponentViewItem((InputComponentState) defaultStyleProvider.inputComponentStateMapper.map((InputComponentStyle) defaultStyleProvider.f5902n.getValue()), (InputComponentViewStyle) defaultStyleProvider.inputComponentViewStyleMapper.map((InputComponentStyle) defaultStyleProvider.f5902n.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle g(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.errorColor(defaultStyleProvider.designTokens), utils.labelFont(defaultStyleProvider.designTokens), null, null, null, null, 243, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageStyle h(DefaultStyleProvider defaultStyleProvider) {
        return new ImageStyle(Integer.valueOf(R.drawable.cko_ic_overflow), Long.valueOf(Utils.INSTANCE.secondaryColor(defaultStyleProvider.designTokens)), null, null, null, null, null, null, 252, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ButtonStyle i(DefaultStyleProvider defaultStyleProvider) {
        Utils utils = Utils.INSTANCE;
        return new ButtonStyle(utils.actionColor(defaultStyleProvider.designTokens), utils.disabledColor(defaultStyleProvider.designTokens), utils.successColor(defaultStyleProvider.designTokens), utils.inverseColor(defaultStyleProvider.designTokens), utils.inverseColor(defaultStyleProvider.designTokens), Shape.RoundCorner, utils.borderButtonRadius(defaultStyleProvider.designTokens), DefaultStyle.textLabelStyle$default(DefaultStyle.INSTANCE, defaultStyleProvider.f5890a.getString(R.string.cko_pay_button), null, utils.inverseColor(defaultStyleProvider.designTokens), utils.buttonFont(defaultStyleProvider.designTokens), null, null, null, null, 242, null), null, Barcode.FORMAT_QR_CODE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentStyle j(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        return defaultStyle.createInputComponentStyle(defaultStyleProvider.f5890a.getString(R.string.cko_form_phone_number), defaultStyleProvider.designTokens, new Padding(0, 0, 4, 0, 11, null), aw.alpha(aw.delta, 4, 7, 115), DefaultStyle.emptyContainerStyle$default(defaultStyle, null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputComponentViewItem k(DefaultStyleProvider defaultStyleProvider) {
        return new InputComponentViewItem((InputComponentState) defaultStyleProvider.inputComponentStateMapper.map((InputComponentStyle) defaultStyleProvider.f5901m.getValue()), (InputComponentViewStyle) defaultStyleProvider.inputComponentViewStyleMapper.map((InputComponentStyle) defaultStyleProvider.f5901m.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelViewItem l(DefaultStyleProvider defaultStyleProvider) {
        TextLabelStyle copy$default = TextLabelStyle.copy$default((TextLabelStyle) defaultStyleProvider.secondaryLabel.getValue(), defaultStyleProvider.f5890a.getString(R.string.cko_form_email), null, null, false, 14, null);
        return new TextLabelViewItem((TextLabelViewStyle) defaultStyleProvider.f5893d.map(copy$default), defaultStyleProvider.e.map(copy$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelViewItem m(DefaultStyleProvider defaultStyleProvider) {
        TextLabelStyle copy$default = TextLabelStyle.copy$default((TextLabelStyle) defaultStyleProvider.secondaryLabel.getValue(), defaultStyleProvider.f5890a.getString(R.string.cko_form_phone_number), null, null, false, 14, null);
        return new TextLabelViewItem((TextLabelViewStyle) defaultStyleProvider.f5893d.map(copy$default), defaultStyleProvider.e.map(copy$default));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle n(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = defaultStyleProvider.f5890a.getString(com.checkout.components.rememberme.R.string.cko_remember_me_logout);
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, string, null, utils.primaryColor(defaultStyleProvider.designTokens), utils.labelFont(defaultStyleProvider.designTokens), null, null, null, TextAlign.Center, 114, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle o(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.primaryColor(defaultStyleProvider.designTokens), utils.inputFont(defaultStyleProvider.designTokens), null, null, null, null, 243, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelViewItem p(DefaultStyleProvider defaultStyleProvider) {
        return new TextLabelViewItem((TextLabelViewStyle) defaultStyleProvider.f5893d.map((TextLabelStyle) defaultStyleProvider.f5899k.getValue()), defaultStyleProvider.e.map((TextLabelStyle) defaultStyleProvider.f5899k.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle q(DefaultStyleProvider defaultStyleProvider) {
        return DefaultStyle.checkboxLabelStyle$default(DefaultStyle.INSTANCE, defaultStyleProvider.f5890a.getString(com.checkout.components.rememberme.R.string.cko_card_store_for_remember_me_cta), null, defaultStyleProvider.designTokens, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle r(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.secondaryColor(defaultStyleProvider.designTokens), utils.labelFont(defaultStyleProvider.designTokens), null, null, null, TextAlign.Center, 115, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle s(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.secondaryColor(defaultStyleProvider.designTokens), utils.footnoteFont(defaultStyleProvider.designTokens), null, null, null, null, 243, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelViewItem t(DefaultStyleProvider defaultStyleProvider) {
        return new TextLabelViewItem((TextLabelViewStyle) defaultStyleProvider.f5893d.map((TextLabelStyle) defaultStyleProvider.f5898j.getValue()), defaultStyleProvider.e.map((TextLabelStyle) defaultStyleProvider.f5898j.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle u(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.secondaryColor(defaultStyleProvider.designTokens), utils.labelFont(defaultStyleProvider.designTokens), null, null, null, null, 243, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle v(DefaultStyleProvider defaultStyleProvider) {
        return DefaultStyle.checkboxLabelStyle$default(DefaultStyle.INSTANCE, defaultStyleProvider.f5890a.getString(com.checkout.components.rememberme.R.string.cko_remember_me_set_default), null, defaultStyleProvider.designTokens, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle w(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.primaryColor(defaultStyleProvider.designTokens), utils.subheadingFont(defaultStyleProvider.designTokens), null, null, null, null, 243, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle x(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = defaultStyleProvider.f5890a.getString(com.checkout.components.rememberme.R.string.cko_tag_default);
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, string, null, utils.primaryColor(defaultStyleProvider.designTokens), utils.subheadingFont(defaultStyleProvider.designTokens), null, null, null, null, 242, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle y(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = defaultStyleProvider.f5890a.getString(com.checkout.components.rememberme.R.string.cko_tag_expired);
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, string, null, utils.inverseColor(defaultStyleProvider.designTokens), utils.subheadingFont(defaultStyleProvider.designTokens), null, null, null, null, 242, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageStyle z(DefaultStyleProvider defaultStyleProvider) {
        return new ImageStyle(Integer.valueOf(R.drawable.cko_ic_info), Long.valueOf(Utils.INSTANCE.secondaryColor(defaultStyleProvider.designTokens)), null, null, null, null, null, null, 252, null);
    }

    @NotNull
    public final InputComponentViewItem countryCodeViewItem() {
        return InputComponentViewItem.copy$default((InputComponentViewItem) this.f5910v.getValue(), null, null, 3, null);
    }

    @NotNull
    public final TextLabelViewItem editLabelViewItem() {
        return a(this.f5890a.getString(com.checkout.components.rememberme.R.string.cko_form_edit));
    }

    @NotNull
    public final InputComponentViewItem emailInputViewItem() {
        return InputComponentViewItem.copy$default((InputComponentViewItem) this.f5906r.getValue(), null, null, 3, null);
    }

    @NotNull
    public final TextLabelStyle getActionHeading$rememberme_standardRelease() {
        return (TextLabelStyle) this.actionHeading.getValue();
    }

    @NotNull
    public final InputComponentStyle getCvvInputFieldComponent$rememberme_standardRelease() {
        return (InputComponentStyle) this.cvvInputFieldComponent.getValue();
    }

    @Nullable
    /* renamed from: getDesignTokens$rememberme_standardRelease, reason: from getter */
    public final DesignTokens getDesignTokens() {
        return this.designTokens;
    }

    @NotNull
    public final TextLabelStyle getErrorLabel$rememberme_standardRelease() {
        return (TextLabelStyle) this.errorLabel.getValue();
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentState> getInputComponentStateMapper$rememberme_standardRelease() {
        return this.inputComponentStateMapper;
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentViewStyle> getInputComponentViewStyleMapper$rememberme_standardRelease() {
        return this.inputComponentViewStyleMapper;
    }

    @NotNull
    public final ImageStyle getOverflowImageStyle$rememberme_standardRelease() {
        return (ImageStyle) this.overflowImageStyle.getValue();
    }

    @NotNull
    public final ButtonStyle getPayButtonItem$rememberme_standardRelease() {
        return (ButtonStyle) this.payButtonItem.getValue();
    }

    @NotNull
    public final TextLabelStyle getPrimaryCenterLabel$rememberme_standardRelease() {
        return (TextLabelStyle) this.primaryCenterLabel.getValue();
    }

    @NotNull
    public final TextLabelStyle getSecondaryFootnote$rememberme_standardRelease() {
        return (TextLabelStyle) this.secondaryFootnote.getValue();
    }

    @NotNull
    public final TextLabelStyle getSecondaryLabel$rememberme_standardRelease() {
        return (TextLabelStyle) this.secondaryLabel.getValue();
    }

    @NotNull
    public final TextLabelStyle getSetDefaultPaymentStyle$rememberme_standardRelease() {
        return (TextLabelStyle) this.setDefaultPaymentStyle.getValue();
    }

    @NotNull
    public final TextLabelStyle getWalletEmailHeading$rememberme_standardRelease() {
        return (TextLabelStyle) this.walletEmailHeading.getValue();
    }

    @NotNull
    public final TextLabelStyle getWalletItemDefaultLabelStyle$rememberme_standardRelease() {
        return (TextLabelStyle) this.walletItemDefaultLabelStyle.getValue();
    }

    @NotNull
    public final TextLabelStyle getWalletItemExpiredLabelStyle$rememberme_standardRelease() {
        return (TextLabelStyle) this.walletItemExpiredLabelStyle.getValue();
    }

    @NotNull
    public final ImageStyle getWalletItemInfoImageStyle$rememberme_standardRelease() {
        return (ImageStyle) this.walletItemInfoImageStyle.getValue();
    }

    @NotNull
    public final TextLabelViewItem legalTextViewItem() {
        return new TextLabelViewItem((TextLabelViewStyle) this.f5893d.map((TextLabelStyle) this.secondaryFootnote.getValue()), TextLabelState.copy$default(this.e.map((TextLabelStyle) this.secondaryFootnote.getValue()), C0564b.zulu(this.f5890a.getString(com.checkout.components.rememberme.R.string.cko_remember_me_legal_text)), null, null, 6, null));
    }

    @NotNull
    public final InputComponentViewItem phoneNumberViewItem() {
        return InputComponentViewItem.copy$default((InputComponentViewItem) this.f5905q.getValue(), null, null, 3, null);
    }

    @NotNull
    public final TextLabelViewItem prefilledEmailLabelViewItem() {
        return (TextLabelViewItem) this.f5907s.getValue();
    }

    @NotNull
    public final TextLabelViewItem prefilledEmailTextViewItem() {
        return new TextLabelViewItem((TextLabelViewStyle) this.f5893d.map((TextLabelStyle) this.f5895g.getValue()), this.e.map((TextLabelStyle) this.f5895g.getValue()));
    }

    @NotNull
    public final TextLabelViewItem prefilledPhoneLabelViewItem() {
        return (TextLabelViewItem) this.f5908t.getValue();
    }

    @NotNull
    public final TextLabelViewItem prefilledPhoneTextViewItem() {
        return new TextLabelViewItem((TextLabelViewStyle) this.f5893d.map((TextLabelStyle) this.f5895g.getValue()), this.e.map((TextLabelStyle) this.f5895g.getValue()));
    }

    @NotNull
    public final TextLabelViewItem saveCardLabelViewItem() {
        return TextLabelViewItem.copy$default((TextLabelViewItem) this.f5904p.getValue(), null, null, 3, null);
    }

    @NotNull
    public final TextLabelViewItem useDifferentPaymentMethodViewItem() {
        return a(this.f5890a.getString(com.checkout.components.rememberme.R.string.cko_remember_me_without_saved_method));
    }

    @NotNull
    public final TextLabelViewItem useSavedPaymentMethodViewItem() {
        return a(this.f5890a.getString(com.checkout.components.rememberme.R.string.cko_remember_me_use_saved_method));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextLabelStyle a(DefaultStyleProvider defaultStyleProvider) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.actionColor(defaultStyleProvider.designTokens), utils.subheadingFont(defaultStyleProvider.designTokens), null, null, null, null, 243, null);
    }
}
