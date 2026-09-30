package Wb;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LWb/y;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class y extends aa {

    /* renamed from: t, reason: collision with root package name */
    public final File f2216t;

    /* renamed from: u, reason: collision with root package name */
    public final Function0 f2217u;

    /* renamed from: v, reason: collision with root package name */
    public final Function1 f2218v;

    /* renamed from: w, reason: collision with root package name */
    public final Function0 f2219w;

    /* renamed from: x, reason: collision with root package name */
    public final String f2220x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2221y;

    public y() {
        this.f2221y = true;
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        File file;
        Window window;
        Intrinsics.echo(inflater, "inflater");
        if (this.f14108p && (file = this.f2216t) != null) {
            Dialog dialog = this.e;
            if (dialog != null && (window = dialog.getWindow()) != null) {
                window.setBackgroundDrawableResource(R.color.transparent);
            }
            Context requireContext = requireContext();
            Intrinsics.delta(requireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(requireContext, null, 6);
            composeView.setContent(new P.d(new Cb.a(15, this, file), 2120103862, true));
            return composeView;
        }
        kilo();
        return new View(requireContext());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        Function0 function0 = this.f2219w;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
    }

    @Override // x9.AbstractC3309c
    /* renamed from: uniform, reason: from getter */
    public final boolean getF2221y() {
        return this.f2221y;
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(File file, Function0 function0, Function1 function1, Function0 function02, String str) {
        this();
        Intrinsics.echo(file, "file");
        this.f2216t = file;
        this.f2217u = function0;
        this.f2218v = function1;
        this.f2219w = function02;
        this.f2220x = str;
        this.f14108p = true;
    }
}
