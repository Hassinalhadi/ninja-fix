package Qb;

import B9.an;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb/r;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class r extends e {

    /* renamed from: t, reason: collision with root package name */
    public an f1941t;

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xray();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_order_reminder, viewGroup, false);
        int i4 = R.id.btnOk;
        Button button = (Button) S3.bravo(R.id.btnOk, inflate);
        if (button != null) {
            i4 = R.id.info;
            TextView textView = (TextView) S3.bravo(R.id.info, inflate);
            if (textView != null) {
                i4 = R.id.title;
                TextView textView2 = (TextView) S3.bravo(R.id.title, inflate);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f1941t = new an(constraintLayout, button, textView, textView2);
                    Intrinsics.delta(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        an anVar = this.f1941t;
        String str2 = null;
        if (anVar != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString(Constants.KEY_TITLE);
            } else {
                str = null;
            }
            anVar.charlie.setText(str);
            an anVar2 = this.f1941t;
            if (anVar2 != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str2 = arguments2.getString(Constants.KEY_MESSAGE);
                }
                if (str2 == null) {
                    str2 = "";
                }
                anVar2.bravo.setText(str2);
                return;
            }
            Intrinsics.lima("binding");
            throw null;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
        an anVar = this.f1941t;
        if (anVar != null) {
            anVar.alpha.setOnClickListener(new Fb.b(this, 12));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
