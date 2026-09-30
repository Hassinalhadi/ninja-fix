package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.LanguageMetaData;
import delivery.samurai.android.R;

/* loaded from: classes2.dex */
public final class B0 extends A0 {

    /* renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f76j;

    /* renamed from: h, reason: collision with root package name */
    public final AppCompatTextView f77h;

    /* renamed from: i, reason: collision with root package name */
    public long f78i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f76j = sparseIntArray;
        sparseIntArray.put(R.id.textView17, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B0(View view) {
        super(null, view, r1);
        Object[] november = z1.g.november(view, 4, null, f76j);
        TextView textView = (TextView) november[1];
        this.f78i = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) november[2];
        this.f77h = appCompatTextView;
        appCompatTextView.setTag(null);
        this.f72f.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.f78i;
            this.f78i = 0L;
        }
        LanguageMetaData languageMetaData = this.f73g;
        long j6 = j5 & 3;
        if (j6 != 0 && languageMetaData != null) {
            str = languageMetaData.getData();
            str2 = languageMetaData.getLabel();
        } else {
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f77h, str);
            J2.f.bravo(this.f72f, str2);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f78i != 0) {
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
            this.f78i = 2L;
        }
        oscar();
    }
}
