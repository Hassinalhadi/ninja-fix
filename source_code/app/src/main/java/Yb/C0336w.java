package Yb;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Receipt;
import com.app.network.network.models.TaskType;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s6.AbstractC2643e5;
import t6.S2;
import t6.S3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYb/w;", "Lx9/a;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* renamed from: Yb.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0336w extends ax {

    /* renamed from: u, reason: collision with root package name */
    public OrderTask f2439u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f2440v;

    /* renamed from: w, reason: collision with root package name */
    public Function1 f2441w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2442x = true;

    /* renamed from: y, reason: collision with root package name */
    public av.ao f2443y;

    @Override // x9.AbstractC3307a
    public final void azure() {
        OrderTask orderTask;
        if (!this.f14101q || (orderTask = this.f2439u) == null) {
            return;
        }
        final int i4 = 0;
        ((ImageButton) bronze().red).setOnClickListener(new View.OnClickListener(this) { // from class: Yb.v
            public final /* synthetic */ C0336w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
            
                if (r2 != null) goto L35;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                String str;
                switch (i4) {
                    case 0:
                        this.purple.juliet();
                        return;
                    default:
                        C0336w c0336w = this.purple;
                        ((TextInputLayout) c0336w.bronze().teal).setError("");
                        if (S2.bravo((TextInputLayout) c0336w.bronze().teal).length() == 0 && c0336w.coral()) {
                            ((TextInputLayout) c0336w.bronze().teal).setError(c0336w.getString(R.string.field_required));
                            return;
                        }
                        if (S2.bravo((TextInputLayout) c0336w.bronze().teal).length() == 1 && StringsKt.beige(S2.bravo((TextInputLayout) c0336w.bronze().teal), ".", false) && c0336w.coral()) {
                            ((TextInputLayout) c0336w.bronze().teal).setError(c0336w.getString(R.string.invalid_amount));
                            return;
                        }
                        if (Intrinsics.alpha(kotlin.text.r.sierra(S2.bravo((TextInputLayout) c0336w.bronze().teal)), 0.0f) && c0336w.coral()) {
                            ((TextInputLayout) c0336w.bronze().teal).setError(c0336w.getString(R.string.value_can_not_be_zereo));
                            return;
                        }
                        OrderTask orderTask2 = c0336w.f2439u;
                        if (orderTask2 != null) {
                            Context context = c0336w.getContext();
                            String str2 = null;
                            if (context != null) {
                                str = L9.d.juliet(context, orderTask2.generateImageId());
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                Receipt receipt = orderTask2.getReceipt();
                                if (receipt != null) {
                                    str2 = receipt.getUrl();
                                    break;
                                }
                            }
                            Function1 function1 = c0336w.f2440v;
                            if (function1 != null) {
                                function1.invoke(S2.bravo((TextInputLayout) c0336w.bronze().teal));
                            }
                            c0336w.juliet();
                            return;
                        }
                        String string = c0336w.getString(R.string.attach_receipt_msg);
                        Intrinsics.delta(string, "getString(...)");
                        c0336w.black(string);
                        return;
                }
            }
        });
        final int i5 = 1;
        ((MaterialButton) bronze().silver).setOnClickListener(new View.OnClickListener(this) { // from class: Yb.v
            public final /* synthetic */ C0336w purple;

            {
                this.purple = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d4, code lost:
            
                if (r2 != null) goto L35;
             */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                String str;
                switch (i5) {
                    case 0:
                        this.purple.juliet();
                        return;
                    default:
                        C0336w c0336w = this.purple;
                        ((TextInputLayout) c0336w.bronze().teal).setError("");
                        if (S2.bravo((TextInputLayout) c0336w.bronze().teal).length() == 0 && c0336w.coral()) {
                            ((TextInputLayout) c0336w.bronze().teal).setError(c0336w.getString(R.string.field_required));
                            return;
                        }
                        if (S2.bravo((TextInputLayout) c0336w.bronze().teal).length() == 1 && StringsKt.beige(S2.bravo((TextInputLayout) c0336w.bronze().teal), ".", false) && c0336w.coral()) {
                            ((TextInputLayout) c0336w.bronze().teal).setError(c0336w.getString(R.string.invalid_amount));
                            return;
                        }
                        if (Intrinsics.alpha(kotlin.text.r.sierra(S2.bravo((TextInputLayout) c0336w.bronze().teal)), 0.0f) && c0336w.coral()) {
                            ((TextInputLayout) c0336w.bronze().teal).setError(c0336w.getString(R.string.value_can_not_be_zereo));
                            return;
                        }
                        OrderTask orderTask2 = c0336w.f2439u;
                        if (orderTask2 != null) {
                            Context context = c0336w.getContext();
                            String str2 = null;
                            if (context != null) {
                                str = L9.d.juliet(context, orderTask2.generateImageId());
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                Receipt receipt = orderTask2.getReceipt();
                                if (receipt != null) {
                                    str2 = receipt.getUrl();
                                    break;
                                }
                            }
                            Function1 function1 = c0336w.f2440v;
                            if (function1 != null) {
                                function1.invoke(S2.bravo((TextInputLayout) c0336w.bronze().teal));
                            }
                            c0336w.juliet();
                            return;
                        }
                        String string = c0336w.getString(R.string.attach_receipt_msg);
                        Intrinsics.delta(string, "getString(...)");
                        c0336w.black(string);
                        return;
                }
            }
        });
        ((TextView) bronze().purple).setOnClickListener(new Kb.k(6, this, orderTask));
    }

    public final av.ao bronze() {
        av.ao aoVar = this.f2443y;
        if (aoVar != null) {
            return aoVar;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final boolean coral() {
        TaskType taskType;
        OrderTask orderTask = this.f2439u;
        if (orderTask != null) {
            taskType = orderTask.getTaskType();
        } else {
            taskType = null;
        }
        if (taskType == TaskType.ON_DEMAND_PICK_UP) {
            return true;
        }
        return false;
    }

    public final void crimson() {
        int i4;
        String str;
        OrderTask orderTask = this.f2439u;
        if (orderTask == null) {
            return;
        }
        TextInputLayout textInputLayout = (TextInputLayout) bronze().teal;
        if (coral()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textInputLayout.setVisibility(i4);
        Context context = getContext();
        if (context != null) {
            str = L9.d.juliet(context, orderTask.generateImageId());
        } else {
            str = null;
        }
        if (str != null) {
            AbstractC2643e5.charlie((ImageView) bronze().white, str, 0, 6);
            ((TextView) bronze().purple).setText(R.string.replace_invoice);
            ((TextView) bronze().purple).setClickable(true);
        } else {
            ((TextView) bronze().purple).setText(R.string.select_image);
            ((TextView) bronze().purple).setClickable(true);
        }
    }

    @Override // androidx.fragment.app.ai
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        amber();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.dialog_confirm_pickup_v2, viewGroup, false);
        int i4 = R.id.btnAddAttachment;
        TextView textView = (TextView) S3.bravo(R.id.btnAddAttachment, inflate);
        if (textView != null) {
            i4 = R.id.btnClose;
            ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnClose, inflate);
            if (imageButton != null) {
                i4 = R.id.btnNext;
                MaterialButton materialButton = (MaterialButton) S3.bravo(R.id.btnNext, inflate);
                if (materialButton != null) {
                    i4 = R.id.cardView;
                    if (((CardView) S3.bravo(R.id.cardView, inflate)) != null) {
                        i4 = R.id.ilPayedAmount;
                        TextInputLayout textInputLayout = (TextInputLayout) S3.bravo(R.id.ilPayedAmount, inflate);
                        if (textInputLayout != null) {
                            i4 = R.id.receiptImage;
                            ImageView imageView = (ImageView) S3.bravo(R.id.receiptImage, inflate);
                            if (imageView != null) {
                                i4 = R.id.tvTitle;
                                if (((TextView) S3.bravo(R.id.tvTitle, inflate)) != null) {
                                    this.f2443y = new av.ao((ScrollView) inflate, textView, imageButton, materialButton, textInputLayout, imageView);
                                    return (ScrollView) bronze().alpha;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // x9.AbstractC3307a, androidx.fragment.app.ai
    public final void onResume() {
        super.onResume();
        crimson();
    }

    @Override // x9.AbstractC3307a
    /* renamed from: xray, reason: from getter */
    public final boolean getF12972v() {
        return this.f2442x;
    }
}
