package B9;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Country;

/* loaded from: classes2.dex */
public abstract class g1 extends z1.g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f467j = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f468f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f469g;

    /* renamed from: h, reason: collision with root package name */
    public final View f470h;

    /* renamed from: i, reason: collision with root package name */
    public Country f471i;

    public g1(z1.c cVar, View view, ConstraintLayout constraintLayout, TextView textView, View view2) {
        super(view, 0, cVar);
        this.f468f = constraintLayout;
        this.f469g = textView;
        this.f470h = view2;
    }
}
