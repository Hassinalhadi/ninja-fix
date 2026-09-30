package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.tickets.TicketCommentResponse;
import delivery.samurai.android.R;
import java.util.Date;
import s6.AbstractC2634d5;

/* renamed from: B9.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0041g0 extends AbstractC0039f0 {

    /* renamed from: l, reason: collision with root package name */
    public static final SparseIntArray f464l;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f465j;

    /* renamed from: k, reason: collision with root package name */
    public long f466k;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f464l = sparseIntArray;
        sparseIntArray.put(R.id.cv_admin_message, 3);
        sparseIntArray.put(R.id.rv_captain_attachments, 4);
        sparseIntArray.put(R.id.cv_admin_icon, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0041g0(View view) {
        super(null, view, (RecyclerView) r0[4], (TextView) r0[1]);
        Object[] november = z1.g.november(view, 6, null, f464l);
        this.f466k = -1L;
        ((LinearLayout) november[0]).setTag(null);
        TextView textView = (TextView) november[2];
        this.f465j = textView;
        textView.setTag(null);
        this.f457g.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        String str;
        synchronized (this) {
            j5 = this.f466k;
            this.f466k = 0L;
        }
        TicketCommentResponse ticketCommentResponse = this.f458h;
        long j6 = j5 & 3;
        String str2 = null;
        Date date = null;
        if (j6 != 0) {
            if (ticketCommentResponse != null) {
                date = ticketCommentResponse.getCreatedAt();
                str = ticketCommentResponse.getMessage();
            } else {
                str = null;
            }
            str2 = AbstractC2634d5.delta(date);
        } else {
            str = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f465j, str2);
            J2.f.bravo(this.f457g, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f466k != 0) {
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
            this.f466k = 2L;
        }
        oscar();
    }
}
