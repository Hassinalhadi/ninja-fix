package B9;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.Order;

/* loaded from: classes2.dex */
public abstract class ao extends z1.g {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f349m = 0;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f350f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f351g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f352h;

    /* renamed from: i, reason: collision with root package name */
    public final RecyclerView f353i;

    /* renamed from: j, reason: collision with root package name */
    public final ProgressBar f354j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f355k;

    /* renamed from: l, reason: collision with root package name */
    public Order f356l;

    public ao(z1.c cVar, View view, TextView textView, ImageButton imageButton, RecyclerView recyclerView, RecyclerView recyclerView2, ProgressBar progressBar, TextView textView2) {
        super(view, 0, cVar);
        this.f350f = textView;
        this.f351g = imageButton;
        this.f352h = recyclerView;
        this.f353i = recyclerView2;
        this.f354j = progressBar;
        this.f355k = textView2;
    }
}
