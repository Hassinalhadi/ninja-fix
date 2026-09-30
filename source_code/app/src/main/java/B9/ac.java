package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.points.redeem.PointRewardResponse;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class ac extends z1.g {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f317o = 0;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f318f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f319g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f320h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f321i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f322j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f323k;

    /* renamed from: l, reason: collision with root package name */
    public final View f324l;

    /* renamed from: m, reason: collision with root package name */
    public final View f325m;

    /* renamed from: n, reason: collision with root package name */
    public PointRewardResponse f326n;

    public ac(z1.c cVar, View view, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, View view3) {
        super(view, 0, cVar);
        this.f318f = materialButton;
        this.f319g = imageView;
        this.f320h = textView;
        this.f321i = textView2;
        this.f322j = textView3;
        this.f323k = textView4;
        this.f324l = view2;
        this.f325m = view3;
    }
}
