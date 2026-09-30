package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.network.network.models.WithdrawHistory;

/* loaded from: classes2.dex */
public abstract class n1 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final TextView f576f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f577g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f578h;

    /* renamed from: i, reason: collision with root package name */
    public final View f579i;

    /* renamed from: j, reason: collision with root package name */
    public WithdrawHistory f580j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f581k;

    public n1(z1.c cVar, View view, TextView textView, ImageView imageView, TextView textView2, View view2) {
        super(view, 0, cVar);
        this.f576f = textView;
        this.f577g = imageView;
        this.f578h = textView2;
        this.f579i = view2;
    }

    public abstract void romeo(Boolean bool);
}
