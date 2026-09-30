package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.OrderTask;

/* loaded from: classes2.dex */
public abstract class M0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f183f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f184g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f185h;

    /* renamed from: i, reason: collision with root package name */
    public final RelativeLayout f186i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f187j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f188k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f189l;

    /* renamed from: m, reason: collision with root package name */
    public OrderTask f190m;

    public M0(z1.c cVar, View view, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, RelativeLayout relativeLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(view, 0, cVar);
        this.f183f = constraintLayout;
        this.f184g = imageView;
        this.f185h = textView;
        this.f186i = relativeLayout;
        this.f187j = textView2;
        this.f188k = textView3;
        this.f189l = textView4;
    }
}
