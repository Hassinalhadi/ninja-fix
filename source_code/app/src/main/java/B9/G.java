package B9;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* loaded from: classes2.dex */
public abstract class G extends z1.g {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f132o = 0;

    /* renamed from: f, reason: collision with root package name */
    public final LinearProgressIndicator f133f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f134g;

    /* renamed from: h, reason: collision with root package name */
    public final ShapeableImageView f135h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f136i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f137j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f138k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f139l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f140m;

    /* renamed from: n, reason: collision with root package name */
    public final View f141n;

    public G(z1.c cVar, View view, LinearProgressIndicator linearProgressIndicator, RecyclerView recyclerView, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2) {
        super(view, 0, cVar);
        this.f133f = linearProgressIndicator;
        this.f134g = recyclerView;
        this.f135h = shapeableImageView;
        this.f136i = textView;
        this.f137j = textView2;
        this.f138k = textView3;
        this.f139l = textView4;
        this.f140m = textView5;
        this.f141n = view2;
    }
}
