package B9;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.MapView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class N extends z1.g {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f191t = 0;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialCardView f192f;

    /* renamed from: g, reason: collision with root package name */
    public final MapView f193g;

    /* renamed from: h, reason: collision with root package name */
    public final LinearLayout f194h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f195i;

    /* renamed from: j, reason: collision with root package name */
    public final RecyclerView f196j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f197k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f198l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f199m;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f200n;

    /* renamed from: o, reason: collision with root package name */
    public final View f201o;

    /* renamed from: p, reason: collision with root package name */
    public int f202p;

    /* renamed from: q, reason: collision with root package name */
    public int f203q;

    /* renamed from: r, reason: collision with root package name */
    public String f204r;

    /* renamed from: s, reason: collision with root package name */
    public String f205s;

    public N(z1.c cVar, View view, MaterialCardView materialCardView, MapView mapView, LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        super(view, 0, cVar);
        this.f192f = materialCardView;
        this.f193g = mapView;
        this.f194h = linearLayout;
        this.f195i = linearLayout2;
        this.f196j = recyclerView;
        this.f197k = textView;
        this.f198l = textView2;
        this.f199m = textView3;
        this.f200n = textView4;
        this.f201o = view2;
    }

    public abstract void romeo(int i4);

    public abstract void sierra(String str);

    public abstract void tango(int i4);
}
