package B9;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.network.network.models.points.PointingRuleResponse;

/* loaded from: classes2.dex */
public final class W0 extends z1.g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f258k = 0;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f259f;

    /* renamed from: g, reason: collision with root package name */
    public PointingRuleResponse f260g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f261h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f262i;

    /* renamed from: j, reason: collision with root package name */
    public long f263j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 3, null, null);
        LinearLayout linearLayout = (LinearLayout) november[0];
        this.f259f = linearLayout;
        this.f263j = -1L;
        this.f259f.setTag(null);
        TextView textView = (TextView) november[1];
        this.f261h = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) november[2];
        this.f262i = textView2;
        textView2.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.f263j;
            this.f263j = 0L;
        }
        PointingRuleResponse pointingRuleResponse = this.f260g;
        long j6 = j5 & 3;
        if (j6 != 0 && pointingRuleResponse != null) {
            str = pointingRuleResponse.getDescription();
            str2 = pointingRuleResponse.getTitle();
        } else {
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f261h, str2);
            J2.f.bravo(this.f262i, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f263j != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f263j = 2L;
        }
        oscar();
    }
}
