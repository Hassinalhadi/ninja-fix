package Yb;

import android.content.DialogInterface;
import android.content.IntentFilter;
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
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/T;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class T extends ay {

    /* renamed from: t, reason: collision with root package name */
    public B9.an f2342t;

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        xray();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_order_cancelled_v2, viewGroup, false);
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
                    this.f2342t = new B9.an(constraintLayout, button, textView, textView2);
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        boolean z2;
        Intrinsics.echo(dialog, "dialog");
        super.onDismiss(dialog);
        if (getActivity() instanceof ProcessOrderActivityV2) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                z2 = arguments.getBoolean("isReturnable");
            } else {
                z2 = false;
            }
            if (z2) {
                d3.k tango = tango();
                IntentFilter intentFilter = d3.k.C;
                tango.amber(false);
                return;
            } else {
                androidx.fragment.app.an activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
        }
        tango().yankee();
    }

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z2;
        String str2;
        String string;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        B9.an anVar = this.f2342t;
        String str3 = null;
        if (anVar != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str = arguments.getString(Constants.KEY_TITLE);
            } else {
                str = null;
            }
            if (str == null) {
                str = getString(R.string.order_cancelled);
                Intrinsics.delta(str, "getString(...)");
            }
            anVar.charlie.setText(str);
            B9.an anVar2 = this.f2342t;
            if (anVar2 != null) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    z2 = arguments2.getBoolean("isReturnable");
                } else {
                    z2 = false;
                }
                if (z2) {
                    string = getString(R.string.order_updated);
                } else {
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null) {
                        str2 = arguments3.getString(Constants.KEY_MESSAGE);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && !StringsKt.gray(str2)) {
                        Bundle arguments4 = getArguments();
                        if (arguments4 != null) {
                            str3 = arguments4.getString(Constants.KEY_MESSAGE);
                        }
                        string = str3;
                    } else {
                        string = getString(R.string.order_cancelled);
                    }
                }
                anVar2.bravo.setText(string);
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
        B9.an anVar = this.f2342t;
        if (anVar != null) {
            anVar.alpha.setOnClickListener(new Fb.b(this, 25));
        } else {
            Intrinsics.lima("binding");
            throw null;
        }
    }
}
