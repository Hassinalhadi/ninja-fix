package B9;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.PlatformListResponse;

/* loaded from: classes2.dex */
public abstract class S0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f228f;

    /* renamed from: g, reason: collision with root package name */
    public PlatformListResponse f229g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f230h;

    public S0(z1.c cVar, View view, ConstraintLayout constraintLayout) {
        super(view, 0, cVar);
        this.f228f = constraintLayout;
    }

    public abstract void romeo(Boolean bool);
}
