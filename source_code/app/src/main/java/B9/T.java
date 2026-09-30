package B9;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.tickets.TicketCommentResponse;

/* loaded from: classes2.dex */
public abstract class T extends z1.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f231i = 0;

    /* renamed from: f, reason: collision with root package name */
    public final RecyclerView f232f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f233g;

    /* renamed from: h, reason: collision with root package name */
    public TicketCommentResponse f234h;

    public T(z1.c cVar, View view, RecyclerView recyclerView, TextView textView) {
        super(view, 0, cVar);
        this.f232f = recyclerView;
        this.f233g = textView;
    }
}
