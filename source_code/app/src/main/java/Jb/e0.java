package Jb;

import android.app.Dialog;
import android.content.Context;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.clevertap.android.sdk.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJb/e0;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class e0 extends am {
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        Dialog mike = super.mike(bundle);
        mike.setCanceledOnTouchOutside(false);
        mike.setOnKeyListener(new d0(0));
        return mike;
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onActivityCreated(bundle);
        View view = getView();
        if (view != null) {
            view.post(new ga.as(15, this));
        }
        View view2 = getView();
        if (view2 != null) {
            View view3 = getView();
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                layoutParams.width = getResources().getDisplayMetrics().widthPixels - (getResources().getDimensionPixelOffset(R.dimen.spacing_12) * 2);
            } else {
                layoutParams = null;
            }
            view2.setLayoutParams(layoutParams);
        }
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        oscar(false);
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String string;
        Intrinsics.echo(inflater, "inflater");
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString(Constants.KEY_TITLE)) == null) {
            str = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("body")) != null) {
            str2 = string;
        }
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new P.d(new Ac.n(this, str, str2, 4), -1293412476, true));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        Dialog dialog2 = this.e;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (isAdded() && !isRemoving() && (context = getContext()) != null) {
            SoundPool soundPool = W9.d.alpha;
            W9.d.alpha(context, W9.e.silver);
        }
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
    }
}
