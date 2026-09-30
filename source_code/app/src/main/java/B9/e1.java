package B9;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Country;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes2.dex */
public abstract class e1 extends z1.g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f447k = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f448f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialCardView f449g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f450h;

    /* renamed from: i, reason: collision with root package name */
    public final View f451i;

    /* renamed from: j, reason: collision with root package name */
    public Country f452j;

    public e1(z1.c cVar, View view, ConstraintLayout constraintLayout, MaterialCardView materialCardView, TextView textView, View view2) {
        super(view, 0, cVar);
        this.f448f = constraintLayout;
        this.f449g = materialCardView;
        this.f450h = textView;
        this.f451i = view2;
    }
}
