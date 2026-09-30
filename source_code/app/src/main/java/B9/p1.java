package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.app.network.network.models.WithdrawTransaction;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class p1 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f597f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialButton f598g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f599h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f600i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f601j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f602k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f603l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f604m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f605n;

    /* renamed from: o, reason: collision with root package name */
    public WithdrawTransaction f606o;

    public p1(z1.c cVar, View view, AppCompatImageView appCompatImageView, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(view, 0, cVar);
        this.f597f = appCompatImageView;
        this.f598g = materialButton;
        this.f599h = imageView;
        this.f600i = textView;
        this.f601j = textView2;
        this.f602k = textView3;
        this.f603l = textView4;
        this.f604m = textView5;
        this.f605n = textView6;
    }

    public abstract void romeo(WithdrawTransaction withdrawTransaction);
}
