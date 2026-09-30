package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.PlatformListResponse;

/* loaded from: classes2.dex */
public abstract class Q0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f218f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f219g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f220h;

    /* renamed from: i, reason: collision with root package name */
    public PlatformListResponse f221i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f222j;

    public Q0(z1.c cVar, View view, ImageView imageView, ImageView imageView2, TextView textView) {
        super(view, 0, cVar);
        this.f218f = imageView;
        this.f219g = imageView2;
        this.f220h = textView;
    }

    public abstract void romeo(Boolean bool);
}
