package com.checkout.components.kmp.rememberme.shared;

import Ec.ar;
import Lb.F;
import Q0.c;
import T.p;
import T.s;
import Yb.C0312j0;
import androidx.annotation.Keep;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.recyclerview.widget.RecyclerView;
import b.c0;
import com.checkout.components.kmp.rememberme.data.usecase.CreateHintUseCase;
import com.checkout.components.kmp.rememberme.di.DependencyResolver;
import com.checkout.components.kmp.rememberme.di.KoinInitializer;
import com.checkout.components.kmp.rememberme.shared.model.ClickTarget;
import com.checkout.components.kmp.rememberme.shared.model.RememberMeConfig;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.authentication.AuthenticationViewKt;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogViewKt;
import com.checkout.components.kmp.rememberme.view.ui.InfoTextViewKt;
import com.checkout.components.kmp.rememberme.view.ui.SecuredTextViewKt;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import eg.a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fJ'\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR'\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/CheckoutKMPRememberMe;", "", "Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;", Constants.KEY_CONFIG, "<init>", "(Lcom/checkout/components/kmp/rememberme/shared/model/RememberMeConfig;)V", "", "AuthenticationView", "(Landroidx/compose/runtime/m;I)V", "LT/s;", "modifier", "SecuredTextView", "(LT/s;Landroidx/compose/runtime/m;II)V", "InfoTextView", "Lkotlin/Function0;", "onButtonClick", "InfoDialogView", "(Lkotlin/jvm/functions/Function0;LT/s;Landroidx/compose/runtime/m;II)V", "", "email", "Lkotlin/Result;", "", "isAccountAvailable-gIAlu-s", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "isAccountAvailable", "cleanup", "()V", "Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintUseCase;", "createHintUseCase$delegate", "Lkotlin/Lazy;", "getCreateHintUseCase", "()Lcom/checkout/components/kmp/rememberme/data/usecase/CreateHintUseCase;", "createHintUseCase", "Lkotlin/Function1;", "Lcom/checkout/components/kmp/rememberme/shared/model/ClickTarget;", "clickHandler$delegate", "getClickHandler", "()Lkotlin/jvm/functions/Function1;", "clickHandler", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens$delegate", "getDesignTokens", "()Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "designTokens", "Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider$delegate", "getResourceProvider", "()Lcom/checkout/components/kmp/rememberme/utils/ResourceProvider;", "resourceProvider", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckoutKMPRememberMe {
    public static final int $stable = 8;

    /* renamed from: clickHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy clickHandler;

    /* renamed from: createHintUseCase$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy createHintUseCase;

    /* renamed from: designTokens$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy designTokens;

    /* renamed from: resourceProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resourceProvider;

    public CheckoutKMPRememberMe(@NotNull RememberMeConfig config) {
        Intrinsics.echo(config, "config");
        this.createHintUseCase = LazyKt.lazy(new c0(9));
        this.clickHandler = LazyKt.lazy(new c0(10));
        this.designTokens = LazyKt.lazy(new c0(11));
        this.resourceProvider = LazyKt.lazy(new c0(12));
        KoinInitializer.INSTANCE.initialize(config);
    }

    public static final Unit AuthenticationView$lambda$4(CheckoutKMPRememberMe checkoutKMPRememberMe, int i4, InterfaceC0581m interfaceC0581m, int i5) {
        checkoutKMPRememberMe.AuthenticationView(interfaceC0581m, C0564b.cyan(i4 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit InfoDialogView$lambda$9(CheckoutKMPRememberMe checkoutKMPRememberMe, Function0 function0, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        checkoutKMPRememberMe.InfoDialogView(function0, sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit InfoTextView$lambda$7$lambda$6(CheckoutKMPRememberMe checkoutKMPRememberMe) {
        checkoutKMPRememberMe.getClickHandler().invoke(ClickTarget.INFO_TEXT);
        return Unit.INSTANCE;
    }

    public static final Unit InfoTextView$lambda$8(CheckoutKMPRememberMe checkoutKMPRememberMe, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        checkoutKMPRememberMe.InfoTextView(sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Unit SecuredTextView$lambda$5(CheckoutKMPRememberMe checkoutKMPRememberMe, s sVar, int i4, int i5, InterfaceC0581m interfaceC0581m, int i10) {
        checkoutKMPRememberMe.SecuredTextView(sVar, interfaceC0581m, C0564b.cyan(i4 | 1), i5);
        return Unit.INSTANCE;
    }

    public static final Function1 clickHandler_delegate$lambda$1() {
        DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
        a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
        if (koin$rememberme_release != null) {
            try {
                return (Function1) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(Function1.class), null);
            } catch (Exception e) {
                throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(Function1.class).kilo(), ": ", e.getMessage()));
            }
        }
        throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
    }

    public static final CreateHintUseCase createHintUseCase_delegate$lambda$0() {
        DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
        a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
        if (koin$rememberme_release != null) {
            try {
                return (CreateHintUseCase) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(CreateHintUseCase.class), null);
            } catch (Exception e) {
                throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(CreateHintUseCase.class).kilo(), ": ", e.getMessage()));
            }
        }
        throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
    }

    public static final DesignTokens designTokens_delegate$lambda$2() {
        DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
        a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
        if (koin$rememberme_release != null) {
            try {
                return (DesignTokens) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(DesignTokens.class), null);
            } catch (Exception e) {
                throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(DesignTokens.class).kilo(), ": ", e.getMessage()));
            }
        }
        throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
    }

    private final Function1<ClickTarget, Unit> getClickHandler() {
        return (Function1) this.clickHandler.getValue();
    }

    private final CreateHintUseCase getCreateHintUseCase() {
        return (CreateHintUseCase) this.createHintUseCase.getValue();
    }

    private final DesignTokens getDesignTokens() {
        return (DesignTokens) this.designTokens.getValue();
    }

    private final ResourceProvider getResourceProvider() {
        return (ResourceProvider) this.resourceProvider.getValue();
    }

    public static final ResourceProvider resourceProvider_delegate$lambda$3() {
        DependencyResolver dependencyResolver = DependencyResolver.INSTANCE;
        a koin$rememberme_release = KoinInitializer.INSTANCE.getKoin$rememberme_release();
        if (koin$rememberme_release != null) {
            try {
                return (ResourceProvider) koin$rememberme_release.charlie.delta.alpha(u.alpha.bravo(ResourceProvider.class), null);
            } catch (Exception e) {
                throw new IllegalStateException(c.papa("Failed to resolve dependency ", u.alpha.bravo(ResourceProvider.class).kilo(), ": ", e.getMessage()));
            }
        }
        throw new IllegalStateException("RememberMe Koin context not initialized. Make sure CheckoutKMPRememberMe is instantiated first.");
    }

    public final void AuthenticationView(@Nullable InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(448904134);
        int i5 = i4 & 1;
        if (i5 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5, z2)) {
            AuthenticationViewKt.AuthenticationView(c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new ar(this, i4, 4);
        }
    }

    public final void InfoDialogView(@NotNull Function0<Unit> onButtonClick, @Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        s sVar2;
        int i12;
        s sVar3;
        int i13;
        int i14;
        Intrinsics.echo(onButtonClick, "onButtonClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-389316711);
        if ((i4 & 6) == 0) {
            if (c0585q.india(onButtonClick)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(this)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i10 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i15 != 0) {
                i12 = i10;
                sVar3 = p.alpha;
            } else {
                i12 = i10;
                sVar3 = sVar;
            }
            int i16 = i12;
            InfoDialogViewKt.InfoDialogView(sVar3, getDesignTokens(), getResourceProvider(), onButtonClick, c0585q, ((i16 >> 3) & 14) | ((i16 << 9) & 7168), 0);
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new F(this, onButtonClick, sVar2, i4, i5, 4);
        }
    }

    public final void InfoTextView(@Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        s sVar2;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-166721934);
        int i13 = i5 & 1;
        if (i13 != 0) {
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
            if (c0585q.india(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i13 != 0) {
                sVar = p.alpha;
            }
            s sVar3 = sVar;
            int i14 = i10;
            ResourceProvider resourceProvider = getResourceProvider();
            DesignTokens designTokens = getDesignTokens();
            boolean india = c0585q.india(this);
            Object jade = c0585q.jade();
            if (india || jade == C0580l.alpha) {
                jade = new C0312j0(14, this);
                c0585q.f(jade);
            }
            InfoTextViewKt.InfoTextView(resourceProvider, designTokens, sVar3, (Function0) jade, c0585q, (i14 << 6) & 896, 0);
            sVar2 = sVar3;
        } else {
            c0585q.ochre();
            sVar2 = sVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a5.u(this, sVar2, i4, i5, 2);
        }
    }

    public final void SecuredTextView(@Nullable s sVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        boolean z2;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(469027509);
        int i13 = i5 & 1;
        if (i13 != 0) {
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
            if (c0585q.india(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            if (i13 != 0) {
                sVar = p.alpha;
            }
            SecuredTextViewKt.SecuredTextView(getDesignTokens(), sVar, c0585q, (i10 << 3) & 112, 0);
        } else {
            c0585q.ochre();
        }
        s sVar2 = sVar;
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a5.u(this, sVar2, i4, i5, 1);
        }
    }

    public final void cleanup() {
        KoinInitializer.INSTANCE.cleanup();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /* renamed from: isAccountAvailable-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m117isAccountAvailablegIAlus(@NotNull String str, @NotNull Nd.c<? super Result<Boolean>> cVar) {
        CheckoutKMPRememberMe$isAccountAvailable$1 checkoutKMPRememberMe$isAccountAvailable$1;
        int i4;
        if (cVar instanceof CheckoutKMPRememberMe$isAccountAvailable$1) {
            checkoutKMPRememberMe$isAccountAvailable$1 = (CheckoutKMPRememberMe$isAccountAvailable$1) cVar;
            int i5 = checkoutKMPRememberMe$isAccountAvailable$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                checkoutKMPRememberMe$isAccountAvailable$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = checkoutKMPRememberMe$isAccountAvailable$1.result;
                Od.a aVar = Od.a.alpha;
                i4 = checkoutKMPRememberMe$isAccountAvailable$1.label;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        return ((Result) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                CreateHintUseCase createHintUseCase = getCreateHintUseCase();
                checkoutKMPRememberMe$isAccountAvailable$1.L$0 = null;
                checkoutKMPRememberMe$isAccountAvailable$1.label = 1;
                Object m116invokegIAlus$rememberme_release = createHintUseCase.m116invokegIAlus$rememberme_release(str, checkoutKMPRememberMe$isAccountAvailable$1);
                if (m116invokegIAlus$rememberme_release == aVar) {
                    return aVar;
                }
                return m116invokegIAlus$rememberme_release;
            }
        }
        checkoutKMPRememberMe$isAccountAvailable$1 = new CheckoutKMPRememberMe$isAccountAvailable$1(this, cVar);
        Object obj2 = checkoutKMPRememberMe$isAccountAvailable$1.result;
        Od.a aVar2 = Od.a.alpha;
        i4 = checkoutKMPRememberMe$isAccountAvailable$1.label;
        if (i4 == 0) {
        }
    }
}
