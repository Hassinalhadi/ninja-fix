package delivery.samurai.android.ui.auth.signup;

import D8.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.inapp.fragment.a;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pf.C2361k;
import t6.AbstractC3007i3;
import t6.S3;
import wa.AbstractC3246b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/auth/signup/ApplicationSubmittedFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class ApplicationSubmittedFragment extends AbstractC3246b {
    public c e;

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_application_submitted, viewGroup, false);
        int i4 = R.id.btnContactSupport;
        if (((MaterialButton) S3.bravo(R.id.btnContactSupport, inflate)) != null) {
            i4 = R.id.btnLogin;
            MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnLogin, inflate);
            if (materialButton != null) {
                i4 = R.id.ivDone;
                if (((ImageView) S3.bravo(R.id.ivDone, inflate)) != null) {
                    i4 = R.id.tvDescription;
                    if (((TextView) S3.bravo(R.id.tvDescription, inflate)) != null) {
                        i4 = R.id.tvTitle;
                        if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            this.e = new c(constraintLayout, materialButton);
                            return constraintLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        oscar();
        AbstractC3007i3.alpha(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new C2361k(27), 2);
    }

    @Override // d3.n
    public final void oscar() {
        c cVar = this.e;
        if (cVar != null) {
            ((MaterialButton) cVar.purple).setOnClickListener(new a(20, this));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
