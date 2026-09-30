package xa;

import J2.e;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;
import va.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxa/b;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: xa.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3315b extends AbstractC3314a {

    /* renamed from: u, reason: collision with root package name */
    public p f14112u;

    /* renamed from: v, reason: collision with root package name */
    public e f14113v;

    @Override // x9.AbstractC3307a
    public final void azure() {
        e eVar = this.f14113v;
        if (eVar != null) {
            ((MaterialButton) eVar.purple).setOnClickListener(new com.clevertap.android.sdk.inapp.fragment.a(24, this));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_sign_up, viewGroup, false);
        int i4 = R.id.btnRegister;
        MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnRegister, inflate);
        if (materialButton != null) {
            i4 = R.id.contentText;
            if (((TextView) S3.bravo(R.id.contentText, inflate)) != null) {
                i4 = R.id.logo;
                if (((ImageView) S3.bravo(R.id.logo, inflate)) != null) {
                    i4 = R.id.registerRequirements;
                    if (((TextView) S3.bravo(R.id.registerRequirements, inflate)) != null) {
                        i4 = R.id.title;
                        if (((TextView) S3.bravo(R.id.title, inflate)) != null) {
                            i4 = R.id.view;
                            View bravo = S3.bravo(R.id.view, inflate);
                            if (bravo != null) {
                                LinearLayout linearLayout = (LinearLayout) inflate;
                                this.f14113v = new e(linearLayout, materialButton, bravo, 4);
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final void onStop() {
        super.onStop();
        kilo();
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f14112u == null) {
            kilo();
        } else {
            amber();
            azure();
        }
    }
}
