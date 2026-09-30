package B9;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;

/* renamed from: B9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0032c extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final MaterialButton f424f;

    /* renamed from: g, reason: collision with root package name */
    public final ProgressBar f425g;

    /* renamed from: h, reason: collision with root package name */
    public final RecyclerView f426h;

    /* renamed from: i, reason: collision with root package name */
    public final SwipeRefreshLayout f427i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f428j;

    public AbstractC0032c(z1.c cVar, View view, MaterialButton materialButton, ProgressBar progressBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView) {
        super(view, 0, cVar);
        this.f424f = materialButton;
        this.f425g = progressBar;
        this.f426h = recyclerView;
        this.f427i = swipeRefreshLayout;
        this.f428j = textView;
    }
}
