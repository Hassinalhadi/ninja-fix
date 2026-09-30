package Nc;

import B9.F;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.tickets.TicketAttachment;
import com.app.network.network.models.tickets.TicketCommentResponse;
import com.app.network.network.models.tickets.TicketResponse;
import com.app.network.network.models.tickets.TicketStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;

/* loaded from: classes2.dex */
public final class g extends Pd.i implements Xd.l {
    public /* synthetic */ Object alpha;
    public final /* synthetic */ TicketDetailsFragment purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TicketDetailsFragment ticketDetailsFragment, Nd.c cVar) {
        super(2, cVar);
        this.purple = ticketDetailsFragment;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        g gVar = new g(this.purple, cVar);
        gVar.alpha = obj;
        return gVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((C2492a) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        String str;
        List<TicketAttachment> list;
        int i4;
        boolean z2;
        boolean z10;
        Date createdAt;
        C2492a c2492a = (C2492a) this.alpha;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        List<TicketCommentResponse> list2 = null;
        if (c2492a != null) {
            num = new Integer(c2492a.alpha);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 2) {
            ConstraintLayout clLoading = this.purple.quebec().f109j;
            Intrinsics.delta(clLoading, "clLoading");
            clLoading.setVisibility(0);
        } else {
            if (num != null) {
                boolean z11 = true;
                if (num.intValue() == 1) {
                    TicketDetailsFragment ticketDetailsFragment = this.purple;
                    ticketDetailsFragment.sierra();
                    NestedScrollView nsvTicketInfo = ticketDetailsFragment.quebec().f112m;
                    Intrinsics.delta(nsvTicketInfo, "nsvTicketInfo");
                    nsvTicketInfo.setVisibility(0);
                    ConstraintLayout clAddCommentSection = ticketDetailsFragment.quebec().f108i;
                    Intrinsics.delta(clAddCommentSection, "clAddCommentSection");
                    clAddCommentSection.setVisibility(0);
                    TextView tvTicketError = ticketDetailsFragment.quebec().f120u;
                    Intrinsics.delta(tvTicketError, "tvTicketError");
                    tvTicketError.setVisibility(8);
                    TicketResponse ticketResponse = (TicketResponse) c2492a.charlie;
                    F f5 = (F) ticketDetailsFragment.quebec();
                    f5.f123x = ticketResponse;
                    synchronized (f5) {
                        f5.f129z |= 1;
                    }
                    f5.delta();
                    f5.oscar();
                    TextView tvTicketStatus = ticketDetailsFragment.quebec().f121v;
                    Intrinsics.delta(tvTicketStatus, "tvTicketStatus");
                    tvTicketStatus.setVisibility(0);
                    MaterialTextView materialTextView = ticketDetailsFragment.quebec().f118s;
                    if (ticketResponse != null && (createdAt = ticketResponse.getCreatedAt()) != null) {
                        str = new SimpleDateFormat("d MMM, yyyy hh:mm", Locale.getDefault()).format(createdAt);
                        Intrinsics.delta(str, "format(...)");
                    } else {
                        str = "";
                    }
                    materialTextView.setText(str);
                    if (ticketResponse != null) {
                        list = ticketResponse.getAttachments();
                    } else {
                        list = null;
                    }
                    Ca.c cVar = new Ca.c(6);
                    ticketDetailsFragment.quebec().f114o.setAdapter(cVar);
                    cVar.bravo(list);
                    RecyclerView rvTicketAttachments = ticketDetailsFragment.quebec().f114o;
                    Intrinsics.delta(rvTicketAttachments, "rvTicketAttachments");
                    if (list != null && !list.isEmpty()) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    rvTicketAttachments.setVisibility(i4);
                    if (ticketResponse != null) {
                        list2 = ticketResponse.getComments();
                    }
                    if (list2 != null && !list2.isEmpty()) {
                        List<TicketCommentResponse> comments = ticketResponse.getComments();
                        long j5 = ticketDetailsFragment.f12515k;
                        Oc.f fVar = ticketDetailsFragment.f12511g;
                        fVar.charlie = j5;
                        fVar.bravo(comments);
                        ticketDetailsFragment.quebec().f115p.setVisibility(0);
                        ticketDetailsFragment.f12516l = true;
                    }
                    if (ticketDetailsFragment.f12516l) {
                        ticketDetailsFragment.quebec().f115p.post(new b(ticketDetailsFragment, 4));
                    }
                    if (ticketResponse != null) {
                        z2 = Intrinsics.areEqual(ticketResponse.getActive(), Boolean.TRUE);
                    } else {
                        z2 = false;
                    }
                    if (z2 && (ticketResponse.getStatus() == TicketStatus.PENDING || ticketResponse.getStatus() == TicketStatus.ASSIGNED || ticketResponse.getStatus() == TicketStatus.RE_OPENED)) {
                        EditText etMessage = ticketDetailsFragment.quebec().f111l;
                        Intrinsics.delta(etMessage, "etMessage");
                        etMessage.setVisibility(0);
                        ImageButton btnSend = ticketDetailsFragment.quebec().f107h;
                        Intrinsics.delta(btnSend, "btnSend");
                        btnSend.setVisibility(0);
                        TextView tvReopenQuestion = ticketDetailsFragment.quebec().f117r;
                        Intrinsics.delta(tvReopenQuestion, "tvReopenQuestion");
                        tvReopenQuestion.setVisibility(8);
                        MaterialButton btnReopen = ticketDetailsFragment.quebec().f106g;
                        Intrinsics.delta(btnReopen, "btnReopen");
                        btnReopen.setVisibility(8);
                        TextView tvClosedMessage = ticketDetailsFragment.quebec().f116q;
                        Intrinsics.delta(tvClosedMessage, "tvClosedMessage");
                        tvClosedMessage.setVisibility(8);
                        ImageButton btnAddAttachment = ticketDetailsFragment.quebec().f105f;
                        Intrinsics.delta(btnAddAttachment, "btnAddAttachment");
                        btnAddAttachment.setVisibility(0);
                        ticketDetailsFragment.quebec().f105f.setEnabled(true);
                        ticketDetailsFragment.quebec().f105f.setAlpha(1.0f);
                    } else {
                        if (ticketResponse != null) {
                            z10 = Intrinsics.areEqual(ticketResponse.getActive(), Boolean.TRUE);
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            if (ticketResponse == null || !ticketResponse.getCanReopen()) {
                                z11 = false;
                            }
                            if (z11) {
                                EditText etMessage2 = ticketDetailsFragment.quebec().f111l;
                                Intrinsics.delta(etMessage2, "etMessage");
                                etMessage2.setVisibility(8);
                                ImageButton btnAddAttachment2 = ticketDetailsFragment.quebec().f105f;
                                Intrinsics.delta(btnAddAttachment2, "btnAddAttachment");
                                btnAddAttachment2.setVisibility(8);
                                ImageButton btnSend2 = ticketDetailsFragment.quebec().f107h;
                                Intrinsics.delta(btnSend2, "btnSend");
                                btnSend2.setVisibility(8);
                                TextView tvReopenQuestion2 = ticketDetailsFragment.quebec().f117r;
                                Intrinsics.delta(tvReopenQuestion2, "tvReopenQuestion");
                                tvReopenQuestion2.setVisibility(0);
                                MaterialButton btnReopen2 = ticketDetailsFragment.quebec().f106g;
                                Intrinsics.delta(btnReopen2, "btnReopen");
                                btnReopen2.setVisibility(0);
                                TextView tvClosedMessage2 = ticketDetailsFragment.quebec().f116q;
                                Intrinsics.delta(tvClosedMessage2, "tvClosedMessage");
                                tvClosedMessage2.setVisibility(8);
                            }
                        }
                        EditText etMessage3 = ticketDetailsFragment.quebec().f111l;
                        Intrinsics.delta(etMessage3, "etMessage");
                        etMessage3.setVisibility(8);
                        ImageButton btnAddAttachment3 = ticketDetailsFragment.quebec().f105f;
                        Intrinsics.delta(btnAddAttachment3, "btnAddAttachment");
                        btnAddAttachment3.setVisibility(8);
                        ImageButton btnSend3 = ticketDetailsFragment.quebec().f107h;
                        Intrinsics.delta(btnSend3, "btnSend");
                        btnSend3.setVisibility(8);
                        TextView tvReopenQuestion3 = ticketDetailsFragment.quebec().f117r;
                        Intrinsics.delta(tvReopenQuestion3, "tvReopenQuestion");
                        tvReopenQuestion3.setVisibility(8);
                        MaterialButton btnReopen3 = ticketDetailsFragment.quebec().f106g;
                        Intrinsics.delta(btnReopen3, "btnReopen");
                        btnReopen3.setVisibility(8);
                        TextView tvClosedMessage3 = ticketDetailsFragment.quebec().f116q;
                        Intrinsics.delta(tvClosedMessage3, "tvClosedMessage");
                        tvClosedMessage3.setVisibility(0);
                    }
                }
            }
            if (num != null && num.intValue() == 0) {
                String str2 = c2492a.bravo;
                if (str2 == null) {
                    str2 = this.purple.getString(R.string.error_something_went_wrong);
                    Intrinsics.delta(str2, "getString(...)");
                }
                TicketDetailsFragment ticketDetailsFragment2 = this.purple;
                ticketDetailsFragment2.sierra();
                NestedScrollView nsvTicketInfo2 = ticketDetailsFragment2.quebec().f112m;
                Intrinsics.delta(nsvTicketInfo2, "nsvTicketInfo");
                nsvTicketInfo2.setVisibility(8);
                ConstraintLayout clAddCommentSection2 = ticketDetailsFragment2.quebec().f108i;
                Intrinsics.delta(clAddCommentSection2, "clAddCommentSection");
                clAddCommentSection2.setVisibility(8);
                TextView tvTicketError2 = ticketDetailsFragment2.quebec().f120u;
                Intrinsics.delta(tvTicketError2, "tvTicketError");
                tvTicketError2.setVisibility(0);
                ticketDetailsFragment2.quebec().f120u.setText(str2);
            }
        }
        return Unit.INSTANCE;
    }
}
