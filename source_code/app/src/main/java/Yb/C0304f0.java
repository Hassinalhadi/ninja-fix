package Yb;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/f0;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Yb.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0304f0 extends A {

    /* renamed from: t, reason: collision with root package name */
    public final int f2409t;

    /* renamed from: u, reason: collision with root package name */
    public final Function1 f2410u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2411v;

    public C0304f0() {
        this.f2411v = true;
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.echo(inflater, "inflater");
        if (!this.f14108p) {
            return new View(requireContext());
        }
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        Context requireContext = requireContext();
        Intrinsics.delta(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new P.d(new Ac.k(18, this), -1350901050, true));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setSoftInputMode(20);
        }
        Dialog dialog2 = this.e;
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }

    @Override // x9.AbstractC3309c
    /* renamed from: uniform, reason: from getter */
    public final boolean getF13962w() {
        return this.f2411v;
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
    }

    public C0304f0(int i4, Function1 function1) {
        this();
        this.f2409t = i4;
        this.f2410u = function1;
        this.f14108p = true;
    }
}
