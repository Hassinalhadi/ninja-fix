package Yb;

import F.C0103e2;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0639i;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.NavHostFragment;
import b.C0704t;
import b.C0705u;
import c2.C0826d;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPViewModel;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabExecutor;
import com.checkout.components.rememberme.C0939f;
import com.checkout.components.rememberme.M1;
import com.checkout.components.rememberme.T1;
import com.checkout.components.rememberme.model.WalletListItem;
import com.checkout.components.rememberme.usecase.MapJWTTokenToWalletUseCase;
import com.checkout.components.rememberme.utils.NavControllerWrapper;
import com.checkout.components.rememberme.wallet.WalletScreenViewModel;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.view.InputFieldViewKt;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import d.C1530f0;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.AccountQrCodeActivity;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2557q;
import vf.C3207k;
import vf.InterfaceC3206j;

/* renamed from: Yb.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0312j0 implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ C0312j0(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [Y1.ag, Y1.r, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC3206j azure;
        long j5;
        int i4;
        Unit InfoTextView$lambda$7$lambda$6;
        Unit OTPView$lambda$5$lambda$4;
        Unit onAppLaunchEventSent$lambda$0;
        String InputFieldView$lambda$8$lambda$7$lambda$6;
        C0704t c0704t = null;
        Bundle bundle = null;
        switch (this.alpha) {
            case 0:
                int i5 = ProcessOrderActivityV2.f12378N0;
                ((C0310i0) this.purple).invoke();
                return Unit.INSTANCE;
            case 1:
                int i10 = ProcessOrderActivityV2.f12378N0;
                ((C0310i0) this.purple).invoke();
                return Unit.INSTANCE;
            case 2:
                ((Zb.b) this.purple).juliet();
                return Unit.INSTANCE;
            case 3:
                return Float.valueOf(((Number) ((LottieAnimationState) this.purple).getValue()).floatValue());
            case 4:
                return M1.a((WalletListItem) this.purple);
            case 5:
                return T1.a((NavControllerWrapper) this.purple);
            case 6:
                return C0939f.a((C0103e2) this.purple);
            case 7:
                androidx.compose.runtime.Y y10 = (androidx.compose.runtime.Y) this.purple;
                synchronized (y10.bravo) {
                    azure = y10.azure();
                    if (((androidx.compose.runtime.S) y10.tango.getValue()).compareTo(androidx.compose.runtime.S.purple) <= 0) {
                        throw vf.ad.alpha("Recomposer shutdown; frame clock awaiter will never resume", y10.delta);
                    }
                }
                if (azure != null) {
                    Result.Companion companion = Result.INSTANCE;
                    ((C3207k) azure).resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                }
                return Unit.INSTANCE;
            case 8:
                ((C0639i) this.purple).bravo = null;
                return Unit.INSTANCE;
            case 9:
                return androidx.lifecycle.T.golf((androidx.lifecycle.d0) this.purple);
            case 10:
                androidx.compose.runtime.aa aaVar = b.V.alpha;
                b.h0 h0Var = (b.h0) this.purple;
                C0705u c0705u = (C0705u) AbstractC2557q.echo(h0Var, aaVar);
                h0Var.e = c0705u;
                if (c0705u != null) {
                    c0704t = new C0704t(c0705u.alpha, c0705u.bravo, c0705u.charlie, c0705u.delta);
                }
                h0Var.f3304f = c0704t;
                return Unit.INSTANCE;
            case 11:
                return Float.valueOf(bz.P.golf(((vf.ab) this.purple).charlie()));
            case 12:
                bz.F f5 = (bz.F) this.purple;
                bz.a0 a0Var = f5.teal;
                if (a0Var != null) {
                    j5 = ((Number) a0Var.lima.getValue()).longValue();
                } else {
                    j5 = 0;
                }
                f5.white = j5;
                return Unit.INSTANCE;
            case 13:
                NavHostFragment navHostFragment = (NavHostFragment) this.purple;
                Context context = navHostFragment.getContext();
                if (context != null) {
                    ?? rVar = new Y1.r(context);
                    rVar.hotel(navHostFragment);
                    androidx.lifecycle.c0 viewModelStore = navHostFragment.getViewModelStore();
                    Intrinsics.delta(viewModelStore, "<get-viewModelStore>(...)");
                    rVar.india(viewModelStore);
                    androidx.navigation.internal.g gVar = rVar.bravo;
                    Y1.au auVar = gVar.sierra;
                    Context requireContext = navHostFragment.requireContext();
                    Intrinsics.delta(requireContext, "requireContext(...)");
                    androidx.fragment.app.L childFragmentManager = navHostFragment.getChildFragmentManager();
                    Intrinsics.delta(childFragmentManager, "getChildFragmentManager(...)");
                    auVar.alpha(new C0826d(requireContext, childFragmentManager));
                    Context requireContext2 = navHostFragment.requireContext();
                    Intrinsics.delta(requireContext2, "requireContext(...)");
                    androidx.fragment.app.L childFragmentManager2 = navHostFragment.getChildFragmentManager();
                    Intrinsics.delta(childFragmentManager2, "getChildFragmentManager(...)");
                    int id2 = navHostFragment.getId();
                    if (id2 == 0 || id2 == -1) {
                        id2 = R.id.nav_host_fragment_container;
                    }
                    gVar.sierra.alpha(new FragmentNavigator(requireContext2, childFragmentManager2, id2));
                    Bundle alpha = navHostFragment.getSavedStateRegistry().alpha("android-support-nav:fragment:navControllerState");
                    if (alpha != null) {
                        rVar.foxtrot(alpha);
                    }
                    navHostFragment.getSavedStateRegistry().charlie("android-support-nav:fragment:navControllerState", new S1.a(2, rVar));
                    Bundle alpha2 = navHostFragment.getSavedStateRegistry().alpha("android-support-nav:fragment:graphId");
                    if (alpha2 != null) {
                        navHostFragment.red = alpha2.getInt("android-support-nav:fragment:graphId");
                    }
                    navHostFragment.getSavedStateRegistry().charlie("android-support-nav:fragment:graphId", new S1.a(3, navHostFragment));
                    int i11 = navHostFragment.red;
                    Lazy lazy = rVar.hotel;
                    if (i11 != 0) {
                        gVar.romeo(((Y1.ah) lazy.getValue()).bravo(i11), null);
                    } else {
                        Bundle arguments = navHostFragment.getArguments();
                        if (arguments != null) {
                            i4 = arguments.getInt("android-support-nav:fragment:graphId");
                        } else {
                            i4 = 0;
                        }
                        if (arguments != null) {
                            bundle = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
                        }
                        if (i4 != 0) {
                            gVar.romeo(((Y1.ah) lazy.getValue()).bravo(i4), bundle);
                        }
                    }
                    return rVar;
                }
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            case 14:
                InfoTextView$lambda$7$lambda$6 = CheckoutKMPRememberMe.InfoTextView$lambda$7$lambda$6((CheckoutKMPRememberMe) this.purple);
                return InfoTextView$lambda$7$lambda$6;
            case 15:
                OTPView$lambda$5$lambda$4 = OTPViewKt.OTPView$lambda$5$lambda$4((OTPViewModel) this.purple);
                return OTPView$lambda$5$lambda$4;
            case 16:
                return RedirectCustomTabExecutor.bravo((RedirectCustomTabExecutor) this.purple);
            case 17:
                return CountryPickerViewModel.alpha((CountryPickerViewModel) this.purple);
            case 18:
                return MediaPlayerRecyclerView.quebec((MediaPlayerRecyclerView) this.purple);
            case 19:
                onAppLaunchEventSent$lambda$0 = InAppController.onAppLaunchEventSent$lambda$0((InAppController) this.purple);
                return onAppLaunchEventSent$lambda$0;
            case 20:
                return CTExecutorFactory.alpha((CleverTapInstanceConfig) this.purple);
            case 21:
                return (d.ay) xf.l.alpha(((xf.e) this.purple).alpha());
            case 22:
                return Boolean.valueOf(((C1530f0) this.purple).isAttached());
            case 23:
                return MapJWTTokenToWalletUseCase.alpha((MapJWTTokenToWalletUseCase) this.purple);
            case 24:
                return StatePickerViewModel.bravo((StatePickerViewModel) this.purple);
            case 25:
                int i12 = AccountQrCodeActivity.f12107I;
                ((AccountQrCodeActivity) this.purple).finish();
                return Unit.INSTANCE;
            case 26:
                return ((vd.d) ((vd.e) this.purple)).echo();
            case 27:
                return WalletScreenViewModel.bravo((WalletScreenViewModel) this.purple);
            case 28:
                return (Z.c) this.purple;
            default:
                InputFieldView$lambda$8$lambda$7$lambda$6 = InputFieldViewKt.InputFieldView$lambda$8$lambda$7$lambda$6((InputFieldState) this.purple);
                return InputFieldView$lambda$8$lambda$7$lambda$6;
        }
    }
}
