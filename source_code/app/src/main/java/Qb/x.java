package Qb;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Receipt;
import com.app.network.network.models.TaskStatus;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2643e5;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQb/x;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class x extends f {

    /* renamed from: u, reason: collision with root package name */
    public OrderTask f1951u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1952v = true;

    /* renamed from: w, reason: collision with root package name */
    public final ah.b f1953w;

    /* renamed from: x, reason: collision with root package name */
    public com.google.firebase.messaging.o f1954x;

    public x() {
        ah.b registerForActivityResult = registerForActivityResult(new a4.s(0), new A8.a(26));
        Intrinsics.delta(registerForActivityResult, "registerForActivityResult(...)");
        this.f1953w = registerForActivityResult;
    }

    @Override // x9.AbstractC3307a
    public final void azure() {
        com.google.firebase.messaging.o bronze = bronze();
        ((Button) bronze.bravo).setOnClickListener(new w(this, 0));
    }

    public final com.google.firebase.messaging.o bronze() {
        com.google.firebase.messaging.o oVar = this.f1954x;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        beige();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_show_receipt, viewGroup, false);
        int i4 = R.id.btnDismiss;
        Button button = (Button) S3.bravo(R.id.btnDismiss, inflate);
        if (button != null) {
            i4 = R.id.cardView;
            if (((CardView) S3.bravo(R.id.cardView, inflate)) != null) {
                i4 = R.id.receiptImage;
                ImageView imageView = (ImageView) S3.bravo(R.id.receiptImage, inflate);
                if (imageView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    ImageButton imageButton = (ImageButton) S3.bravo(R.id.retakeImage, inflate);
                    if (imageButton != null) {
                        this.f1954x = new com.google.firebase.messaging.o(constraintLayout, button, imageView, imageButton);
                        return (ConstraintLayout) bronze().alpha;
                    }
                    i4 = R.id.retakeImage;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        String str;
        String juliet;
        super.onResume();
        OrderTask orderTask = this.f1951u;
        if (orderTask != null) {
            if (orderTask.getTaskStatus() != TaskStatus.COMPLETED) {
                ((ImageButton) bronze().delta).setOnClickListener(new w(this, 1));
                Context context = getContext();
                if (context != null && (juliet = L9.d.juliet(context, orderTask.generateImageId())) != null) {
                    AbstractC2643e5.charlie((ImageView) bronze().charlie, juliet, 0, 6);
                    return;
                }
                return;
            }
            ((ImageButton) bronze().delta).setVisibility(8);
            ImageView imageView = (ImageView) bronze().charlie;
            Receipt receipt = orderTask.getReceipt();
            if (receipt != null) {
                str = receipt.getUrl();
            } else {
                str = null;
            }
            AbstractC2643e5.charlie(imageView, str, 0, 6);
        }
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF2442x() {
        return this.f1952v;
    }
}
