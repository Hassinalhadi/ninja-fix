package Gb;

import B9.am;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGb/g;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class g extends x {

    /* renamed from: t, reason: collision with root package name */
    public Ac.g f1365t;

    /* renamed from: u, reason: collision with root package name */
    public C9.a f1366u;

    /* renamed from: v, reason: collision with root package name */
    public am f1367v;

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xray();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_envelope_preview, viewGroup, false);
        if (inflate != null) {
            ComposeView composeView = (ComposeView) inflate;
            this.f1367v = new am(composeView, composeView);
            return composeView;
        }
        throw new NullPointerException("rootView");
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("body");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str7 = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("image_url");
        } else {
            str2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("category");
        } else {
            str3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str4 = arguments4.getString("category_bg");
        } else {
            str4 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            str5 = arguments5.getString("category_fg");
        } else {
            str5 = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            str6 = arguments6.getString("timestamp");
        } else {
            str6 = null;
        }
        am amVar = this.f1367v;
        if (amVar != null) {
            amVar.alpha.setContent(new P.d(new f(str7, str2, str3, str4, str5, str6, this, 0), 1339819638, true));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }

    @Override // x9.AbstractC3309c
    public final void yankee() {
    }
}
