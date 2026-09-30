package B9;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.PlatformListResponse;

/* loaded from: classes2.dex */
public abstract class i1 extends z1.g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f493k = 0;

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f494f;

    /* renamed from: g, reason: collision with root package name */
    public final AppCompatImageView f495g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f496h;

    /* renamed from: i, reason: collision with root package name */
    public final View f497i;

    /* renamed from: j, reason: collision with root package name */
    public PlatformListResponse f498j;

    public i1(z1.c cVar, View view, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, TextView textView, View view2) {
        super(view, 0, cVar);
        this.f494f = constraintLayout;
        this.f495g = appCompatImageView;
        this.f496h = textView;
        this.f497i = view2;
    }
}
