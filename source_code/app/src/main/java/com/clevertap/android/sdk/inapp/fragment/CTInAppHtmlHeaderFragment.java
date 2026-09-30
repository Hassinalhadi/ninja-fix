package com.clevertap.android.sdk.inapp.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.R;
import j1.C1929c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppHtmlHeaderFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialHtmlFragment;", "<init>", "()V", "getLayout", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "getView", "inflater", "Landroid/view/LayoutInflater;", "container", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppHtmlHeaderFragment extends CTInAppBasePartialHtmlFragment {
    public static final Unit getView$lambda$0(C1929c insets, ViewGroup.MarginLayoutParams mlp) {
        Intrinsics.echo(insets, "insets");
        Intrinsics.echo(mlp, "mlp");
        mlp.leftMargin = insets.alpha;
        mlp.rightMargin = insets.charlie;
        mlp.topMargin = insets.bravo;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit juliet(C1929c c1929c, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return getView$lambda$0(c1929c, marginLayoutParams);
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment
    @Nullable
    public ViewGroup getLayout(@Nullable View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.inapp_html_header_frame_layout);
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBasePartialHtmlFragment
    @NotNull
    public View getView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.inapp_html_header, container, false);
        Intrinsics.checkNotNull(inflate);
        CTXtensions.applyInsetsWithMarginAdjustment(inflate, new com.checkout.components.kmp.rememberme.di.b(13));
        return inflate;
    }
}
