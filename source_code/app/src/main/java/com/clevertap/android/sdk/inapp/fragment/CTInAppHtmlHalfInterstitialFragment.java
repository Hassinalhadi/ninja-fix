package com.clevertap.android.sdk.inapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.CTXtensions;
import j1.C1929c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppHtmlHalfInterstitialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFullHtmlFragment;", "<init>", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppHtmlHalfInterstitialFragment extends CTInAppBaseFullHtmlFragment {
    public static /* synthetic */ Unit kilo(C1929c c1929c, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return onCreateView$lambda$0(c1929c, marginLayoutParams);
    }

    public static final Unit onCreateView$lambda$0(C1929c insets, ViewGroup.MarginLayoutParams mlp) {
        Intrinsics.echo(insets, "insets");
        Intrinsics.echo(mlp, "mlp");
        mlp.leftMargin = insets.alpha;
        mlp.rightMargin = insets.charlie;
        mlp.topMargin = insets.bravo;
        mlp.bottomMargin = insets.delta;
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullHtmlFragment, androidx.fragment.app.ai
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.echo(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (!getIsFullscreen() && onCreateView != null) {
            CTXtensions.applyInsetsWithMarginAdjustment(onCreateView, new com.checkout.components.kmp.rememberme.di.b(12));
        }
        return onCreateView;
    }
}
