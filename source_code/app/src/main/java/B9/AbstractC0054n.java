package B9;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.network.network.models.EnvelopNotification;

/* renamed from: B9.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0054n extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f565f;

    /* renamed from: g, reason: collision with root package name */
    public final Toolbar f566g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f567h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f568i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f569j;

    /* renamed from: k, reason: collision with root package name */
    public EnvelopNotification f570k;

    public AbstractC0054n(z1.c cVar, View view, ImageView imageView, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3) {
        super(view, 0, cVar);
        this.f565f = imageView;
        this.f566g = toolbar;
        this.f567h = textView;
        this.f568i = textView2;
        this.f569j = textView3;
    }

    public abstract void romeo(EnvelopNotification envelopNotification);
}
