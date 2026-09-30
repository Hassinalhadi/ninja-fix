package qa;

import B9.ab;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.au;
import com.app.base.BaseViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.assets.viewmodel.AssetViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import n.Y;
import pc.C2301b;
import r3.C2492a;
import ra.C2512b;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqa/k;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class k extends g {

    /* renamed from: t, reason: collision with root package name */
    public ab f13166t;

    /* renamed from: u, reason: collision with root package name */
    public final ab f13167u;

    public k() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new je.ab(29, new je.ab(28, this)));
        this.f13167u = new ab(u.alpha.bravo(AssetViewModel.class), new ga.ab(alpha, 20), new j(0, this, alpha), new ga.ab(alpha, 21));
    }

    public final ab azure() {
        ab abVar = this.f13166t;
        if (abVar != null) {
            return abVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final Dialog mike(Bundle bundle) {
        Dialog mike = super.mike(bundle);
        mike.setCancelable(false);
        return mike;
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_assets, viewGroup, false);
        int i4 = R.id.assetNumber;
        TextInputLayout textInputLayout = (TextInputLayout) S3.bravo(R.id.assetNumber, inflate);
        if (textInputLayout != null) {
            i4 = R.id.btnClose;
            ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnClose, inflate);
            if (imageButton != null) {
                i4 = R.id.btnReturn;
                MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnReturn, inflate);
                if (materialButton != null) {
                    i4 = R.id.etAsset;
                    TextInputEditText textInputEditText = (TextInputEditText) S3.bravo(R.id.etAsset, inflate);
                    if (textInputEditText != null) {
                        i4 = R.id.tvTitle;
                        if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                            this.f13166t = new ab((ConstraintLayout) inflate, textInputLayout, imageButton, materialButton, textInputEditText);
                            return (ConstraintLayout) azure().white;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.85d), (int) (getResources().getDisplayMetrics().heightPixels * 0.3d));
        }
        Dialog dialog2 = this.e;
        if (dialog2 != null && (window = dialog2.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
        ab azure = azure();
        final int i4 = 0;
        ((ImageButton) azure.purple).setOnClickListener(new View.OnClickListener(this) { // from class: qa.i
            public final /* synthetic */ k purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5;
                switch (i4) {
                    case 0:
                        this.purple.lima(false, false);
                        return;
                    default:
                        k kVar = this.purple;
                        Bundle arguments = kVar.getArguments();
                        if (arguments != null) {
                            i5 = arguments.getInt("assetsId");
                        } else {
                            i5 = 0;
                        }
                        int i10 = i5;
                        String obj = StringsKt.b(String.valueOf(((TextInputEditText) kVar.azure().teal).getText())).toString();
                        if (obj.length() == 0) {
                            ab azure2 = kVar.azure();
                            ((TextInputLayout) azure2.red).setError(kVar.getString(R.string.enter_code));
                            return;
                        } else {
                            if (obj.length() < 6) {
                                ab azure3 = kVar.azure();
                                ((TextInputLayout) azure3.red).setError(kVar.getString(R.string.code_must_be_6));
                                return;
                            }
                            AssetViewModel assetViewModel = (AssetViewModel) kVar.f13167u.getValue();
                            String returnCode = StringsKt.b(String.valueOf(((TextInputEditText) kVar.azure().teal).getText())).toString();
                            Intrinsics.echo(returnCode, "returnCode");
                            ?? auVar = new au(new C2492a(2, "loading"));
                            BaseViewModel.launchApi$default(assetViewModel, null, new C2512b(assetViewModel, i10, returnCode, auVar, null), 1, null);
                            auVar.observe(kVar, new C2301b(2, new Y(10, kVar)));
                            return;
                        }
                }
            }
        });
        ab azure2 = azure();
        final int i5 = 1;
        ((MaterialButton) azure2.silver).setOnClickListener(new View.OnClickListener(this) { // from class: qa.i
            public final /* synthetic */ k purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [androidx.lifecycle.au, androidx.lifecycle.az] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i52;
                switch (i5) {
                    case 0:
                        this.purple.lima(false, false);
                        return;
                    default:
                        k kVar = this.purple;
                        Bundle arguments = kVar.getArguments();
                        if (arguments != null) {
                            i52 = arguments.getInt("assetsId");
                        } else {
                            i52 = 0;
                        }
                        int i10 = i52;
                        String obj = StringsKt.b(String.valueOf(((TextInputEditText) kVar.azure().teal).getText())).toString();
                        if (obj.length() == 0) {
                            ab azure22 = kVar.azure();
                            ((TextInputLayout) azure22.red).setError(kVar.getString(R.string.enter_code));
                            return;
                        } else {
                            if (obj.length() < 6) {
                                ab azure3 = kVar.azure();
                                ((TextInputLayout) azure3.red).setError(kVar.getString(R.string.code_must_be_6));
                                return;
                            }
                            AssetViewModel assetViewModel = (AssetViewModel) kVar.f13167u.getValue();
                            String returnCode = StringsKt.b(String.valueOf(((TextInputEditText) kVar.azure().teal).getText())).toString();
                            Intrinsics.echo(returnCode, "returnCode");
                            ?? auVar = new au(new C2492a(2, "loading"));
                            BaseViewModel.launchApi$default(assetViewModel, null, new C2512b(assetViewModel, i10, returnCode, auVar, null), 1, null);
                            auVar.observe(kVar, new C2301b(2, new Y(10, kVar)));
                            return;
                        }
                }
            }
        });
    }
}
