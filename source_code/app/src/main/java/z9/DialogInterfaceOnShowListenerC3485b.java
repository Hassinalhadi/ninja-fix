package z9;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0450d0;
import com.app.network.network.models.AppUpdate;
import com.google.android.material.button.MaterialButton;
import delivery.samurai.android.R;
import id.C1915c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: z9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC3485b implements DialogInterface.OnShowListener {
    public final /* synthetic */ AlertDialog alpha;
    public final /* synthetic */ boolean bravo;
    public final /* synthetic */ C1915c charlie;
    public final /* synthetic */ AppUpdate delta;
    public final /* synthetic */ d3.k echo;
    public final /* synthetic */ Function0 foxtrot;
    public final /* synthetic */ C3488e golf;

    public /* synthetic */ DialogInterfaceOnShowListenerC3485b(AlertDialog alertDialog, boolean z2, C1915c c1915c, AppUpdate appUpdate, d3.k kVar, Function0 function0, C3488e c3488e) {
        this.alpha = alertDialog;
        this.bravo = z2;
        this.charlie = c1915c;
        this.delta = appUpdate;
        this.echo = kVar;
        this.foxtrot = function0;
        this.golf = c3488e;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        final boolean z2 = this.bravo;
        final AlertDialog alertDialog = this.alpha;
        alertDialog.setCancelable(false);
        C1915c c1915c = this.charlie;
        MaterialButton materialButton = (MaterialButton) c1915c.red;
        MaterialButton materialButton2 = (MaterialButton) c1915c.purple;
        if (z2) {
            alertDialog.setCancelable(false);
            materialButton2.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            C0450d0 c0450d0 = (C0450d0) layoutParams;
            c0450d0.setMarginEnd(0);
            materialButton.setLayoutParams(c0450d0);
        }
        if (((ViewGroup) alertDialog.findViewById(R.id.updateDialogRoot)) != null) {
            TextView textView = (TextView) c1915c.silver;
            final AppUpdate appUpdate = this.delta;
            textView.setText(appUpdate.getMessage());
            materialButton2.setText(appUpdate.getSkipButtonTitle());
            final d3.k kVar = this.echo;
            final Function0 function0 = this.foxtrot;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: z9.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (z2) {
                        kVar.finish();
                        return;
                    }
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    alertDialog.dismiss();
                }
            });
            materialButton.setText(appUpdate.getUpdateButtonTitle());
            final C3488e c3488e = this.golf;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: z9.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String storeUrl = AppUpdate.this.getStoreUrl();
                    if (storeUrl != null && !StringsKt.gray(storeUrl)) {
                        alertDialog.dismiss();
                        if (z2) {
                            kVar.finishAffinity();
                        }
                        C3489f c3489f = c3488e.alpha;
                        c3489f.getClass();
                        String beige = L9.d.beige(storeUrl);
                        if (beige != null) {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(beige));
                            intent.addFlags(268435456);
                            L9.d.orange(c3489f.alpha, intent, 6);
                            return;
                        }
                        return;
                    }
                    Function0 function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }
            });
        }
    }
}
