package B9;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.network.network.models.EnvelopNotification;

/* renamed from: B9.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0050l extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final Toolbar f522f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f523g;

    /* renamed from: h, reason: collision with root package name */
    public EnvelopNotification f524h;

    public AbstractC0050l(z1.c cVar, View view, Toolbar toolbar, TextView textView) {
        super(view, 0, cVar);
        this.f522f = toolbar;
        this.f523g = textView;
    }

    public abstract void romeo(EnvelopNotification envelopNotification);
}
