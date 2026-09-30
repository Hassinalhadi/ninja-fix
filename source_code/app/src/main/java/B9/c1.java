package B9;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Bank;

/* loaded from: classes2.dex */
public abstract class c1 extends z1.g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f431j = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f432f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f433g;

    /* renamed from: h, reason: collision with root package name */
    public final View f434h;

    /* renamed from: i, reason: collision with root package name */
    public Bank f435i;

    public c1(z1.c cVar, View view, ConstraintLayout constraintLayout, TextView textView, View view2) {
        super(view, 0, cVar);
        this.f432f = constraintLayout;
        this.f433g = textView;
        this.f434h = view2;
    }
}
