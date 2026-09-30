package B9;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.textview.MaterialTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2679i5;

/* renamed from: B9.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0074x0 extends z1.g {

    /* renamed from: f, reason: collision with root package name */
    public final MaterialTextView f719f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialTextView f720g;

    /* renamed from: h, reason: collision with root package name */
    public final MaterialTextView f721h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f722i;

    /* renamed from: j, reason: collision with root package name */
    public final MaterialTextView f723j;

    /* renamed from: k, reason: collision with root package name */
    public long f724k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074x0(View view) {
        super(view, 0, null);
        Object[] november = z1.g.november(view, 6, null, null);
        MaterialTextView materialTextView = (MaterialTextView) november[5];
        MaterialTextView materialTextView2 = (MaterialTextView) november[4];
        MaterialTextView materialTextView3 = (MaterialTextView) november[1];
        TextView textView = (TextView) november[2];
        MaterialTextView materialTextView4 = (MaterialTextView) november[3];
        this.f719f = materialTextView;
        this.f720g = materialTextView2;
        this.f721h = materialTextView3;
        this.f722i = textView;
        this.f723j = materialTextView4;
        this.f724k = -1L;
        ((CardView) november[0]).setTag(null);
        this.f719f.setTag(null);
        this.f720g.setTag(null);
        this.f721h.setTag(null);
        this.f722i.setTag(null);
        this.f723j.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        synchronized (this) {
            j5 = this.f724k;
            this.f724k = 0L;
        }
        long j6 = j5 & 3;
        if (j6 == 0) {
            if (j6 != 0) {
                J2.f.bravo(this.f719f, null);
                J2.f.bravo(this.f720g, null);
                J2.f.bravo(this.f721h, null);
                AbstractC2679i5.bravo(this.f722i, null);
                J2.f.bravo(this.f723j, null);
                return;
            }
            return;
        }
        Intrinsics.echo(null, "<this>");
        Intrinsics.delta(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format((Date) null), "format(...)");
        throw null;
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f724k != 0) {
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
            this.f724k = 2L;
        }
        oscar();
    }
}
