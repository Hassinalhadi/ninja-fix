package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.OrderAsset;

/* loaded from: classes2.dex */
public abstract class Z extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f276f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f277g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f278h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f279i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f280j;

    /* renamed from: k, reason: collision with root package name */
    public OrderAsset f281k;

    public Z(z1.c cVar, View view, TextView textView, TextView textView2, ImageView imageView, TextView textView3, TextView textView4) {
        super(view, 0, cVar);
        this.f276f = textView;
        this.f277g = textView2;
        this.f278h = imageView;
        this.f279i = textView3;
        this.f280j = textView4;
    }
}
