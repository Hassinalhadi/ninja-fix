package B9;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.tickets.TicketResponse;
import com.app.network.network.models.tickets.TicketStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import delivery.samurai.android.R;
import s6.AbstractC2679i5;

/* loaded from: classes2.dex */
public final class F extends E {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f129z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.nsv_ticket_info, 4);
        sparseIntArray.put(R.id.cv_ticket_info, 5);
        sparseIntArray.put(R.id.tv_ticket_create_date, 6);
        sparseIntArray.put(R.id.divider, 7);
        sparseIntArray.put(R.id.rv_ticket_attachments, 8);
        sparseIntArray.put(R.id.rv_ticket_messages, 9);
        sparseIntArray.put(R.id.cl_add_comment_section, 10);
        sparseIntArray.put(R.id.rv_attachments, 11);
        sparseIntArray.put(R.id.et_message, 12);
        sparseIntArray.put(R.id.btn_add_attachment, 13);
        sparseIntArray.put(R.id.btn_send, 14);
        sparseIntArray.put(R.id.tv_reopen_question, 15);
        sparseIntArray.put(R.id.btn_reopen, 16);
        sparseIntArray.put(R.id.tv_closed_message, 17);
        sparseIntArray.put(R.id.tv_ticket_error, 18);
        sparseIntArray.put(R.id.cl_loading, 19);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(View view) {
        super(null, view, r0, r4, r5, r6, r7, (View) r21[7], (EditText) r21[12], (NestedScrollView) r21[4], (RecyclerView) r21[11], (RecyclerView) r21[8], (RecyclerView) r21[9], (TextView) r21[17], (TextView) r21[15], (MaterialTextView) r21[6], (MaterialTextView) r21[3], (TextView) r21[18], (TextView) r21[1], (MaterialTextView) r21[2]);
        Object[] november = z1.g.november(view, 20, null, A);
        ImageButton imageButton = (ImageButton) november[13];
        MaterialButton materialButton = (MaterialButton) november[16];
        ImageButton imageButton2 = (ImageButton) november[14];
        ConstraintLayout constraintLayout = (ConstraintLayout) november[10];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) november[19];
        this.f129z = -1L;
        ((ConstraintLayout) november[0]).setTag(null);
        this.f119t.setTag(null);
        this.f121v.setTag(null);
        this.f122w.setTag(null);
        papa(view);
        lima();
    }

    @Override // z1.g
    public final void foxtrot() {
        long j5;
        TicketStatus ticketStatus;
        String str;
        String str2;
        synchronized (this) {
            j5 = this.f129z;
            this.f129z = 0L;
        }
        TicketResponse ticketResponse = this.f123x;
        long j6 = j5 & 3;
        if (j6 != 0 && ticketResponse != null) {
            ticketStatus = ticketResponse.getStatus();
            str = ticketResponse.getTitle();
            str2 = ticketResponse.getContent();
        } else {
            ticketStatus = null;
            str = null;
            str2 = null;
        }
        if (j6 != 0) {
            J2.f.bravo(this.f119t, str2);
            AbstractC2679i5.bravo(this.f121v, ticketStatus);
            J2.f.bravo(this.f122w, str);
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f129z != 0) {
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
            this.f129z = 2L;
        }
        oscar();
    }
}
