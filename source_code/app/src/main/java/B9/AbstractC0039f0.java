package B9;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.tickets.TicketCommentResponse;

/* renamed from: B9.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0039f0 extends z1.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f455i = 0;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f456f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f457g;

    /* renamed from: h, reason: collision with root package name */
    public TicketCommentResponse f458h;

    public AbstractC0039f0(z1.c cVar, View view, RecyclerView recyclerView, TextView textView) {
        super(view, 0, cVar);
        this.f456f = recyclerView;
        this.f457g = textView;
    }
}
