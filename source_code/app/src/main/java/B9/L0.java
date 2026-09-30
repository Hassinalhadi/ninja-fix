package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.Item;
import delivery.samurai.android.R;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2643e5;

/* loaded from: classes2.dex */
public final class L0 extends K0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f178l;

    /* renamed from: j, reason: collision with root package name */
    public final AppCompatTextView f179j;

    /* renamed from: k, reason: collision with root package name */
    public long f180k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f178l = sparseIntArray;
        sparseIntArray.put(R.id.cardView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L0(View view) {
        super(null, view, (ImageView) r0[2], (TextView) r0[3], (TextView) r0[1]);
        Object[] november = z1.g.november(view, 6, null, f178l);
        this.f180k = -1L;
        this.f159f.setTag(null);
        ((ConstraintLayout) november[0]).setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) november[4];
        this.f179j = appCompatTextView;
        appCompatTextView.setTag(null);
        this.f160g.setTag(null);
        this.f161h.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j5 = this.f180k;
            this.f180k = 0L;
        }
        Item item = this.f162i;
        long j6 = j5 & 3;
        String str5 = null;
        if (j6 != 0) {
            if (item != null) {
                String image = item.getImage();
                String name = item.getName();
                Integer quantity = item.getQuantity();
                str3 = item.getDescription();
                str4 = image;
                str5 = quantity;
                str2 = name;
            } else {
                str4 = null;
                str2 = null;
                str3 = null;
            }
            String str6 = str4;
            str = ((Object) str5) + " X ";
            str5 = str6;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j6 != 0) {
            ImageView imageView = this.f159f;
            Intrinsics.echo(imageView, "imageView");
            AbstractC2643e5.charlie(imageView, str5, 0, 2);
            J2.f.bravo(this.f179j, str3);
            J2.f.bravo(this.f160g, str2);
            J2.f.bravo(this.f161h, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f180k != 0) {
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
            this.f180k = 2L;
        }
        oscar();
    }
}
