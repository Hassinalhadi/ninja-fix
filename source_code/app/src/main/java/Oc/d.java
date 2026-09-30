package Oc;

import A2.q;
import B9.AbstractC0039f0;
import B9.C0041g0;
import B9.T;
import B9.U;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.tickets.ActorType;
import com.app.network.network.models.tickets.TicketCommentResponse;
import delivery.samurai.android.R;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import z1.g;

/* loaded from: classes2.dex */
public final class d extends f0 {
    public final /* synthetic */ f alpha;
    public final /* synthetic */ int bravo;
    public final g charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, ViewGroup itemView) {
        super(itemView);
        Intrinsics.echo(itemView, "itemView");
        this.alpha = fVar;
    }

    private final void charlie(TicketCommentResponse ticketCommentResponse) {
        U u4 = (U) ((T) this.charlie);
        u4.f234h = ticketCommentResponse;
        synchronized (u4) {
            u4.f240k |= 1;
        }
        u4.delta();
        u4.oscar();
        Ca.c cVar = new Ca.c(5);
        ((T) this.charlie).f232f.setAdapter(cVar);
        cVar.bravo(ticketCommentResponse.getTicketCommentAttachments());
        View view = ((T) this.charlie).red;
        Intrinsics.charlie(view, "null cannot be cast to non-null type android.view.ViewGroup");
        alpha((ViewGroup) view, ticketCommentResponse);
    }

    public final void alpha(ViewGroup view, TicketCommentResponse ticketCommentResponse) {
        long j5;
        Intrinsics.echo(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        Date createdAt = ticketCommentResponse.getCreatedAt();
        if (createdAt != null) {
            j5 = createdAt.getTime();
        } else {
            j5 = 0;
        }
        if (ticketCommentResponse.getActorType() == ActorType.ADMIN && j5 > this.alpha.charlie) {
            long j6 = currentTimeMillis - j5;
            if (j6 <= 10000) {
                int color = view.getContext().getColor(R.color.new_admin_message_background);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(color);
                gradientDrawable.setCornerRadius(16.0f);
                view.setBackground(gradientDrawable);
                view.setElevation(4.0f);
                long j7 = 10000 - j6;
                if (j7 > 0) {
                    view.postDelayed(new q(13, view), j7);
                    return;
                }
                return;
            }
        }
        view.setBackground(null);
        view.setElevation(0.0f);
    }

    public final void bravo(TicketCommentResponse ticketCommentResponse) {
        switch (this.bravo) {
            case 0:
                charlie(ticketCommentResponse);
                return;
            default:
                C0041g0 c0041g0 = (C0041g0) ((AbstractC0039f0) this.charlie);
                c0041g0.f458h = ticketCommentResponse;
                synchronized (c0041g0) {
                    c0041g0.f466k |= 1;
                }
                c0041g0.delta();
                c0041g0.oscar();
                Ca.c cVar = new Ca.c(5);
                ((AbstractC0039f0) this.charlie).f456f.setAdapter(cVar);
                this.itemView.getContext();
                ((AbstractC0039f0) this.charlie).f456f.setLayoutManager(new LinearLayoutManager(0, true));
                cVar.bravo(ticketCommentResponse.getTicketCommentAttachments());
                View view = ((AbstractC0039f0) this.charlie).red;
                Intrinsics.charlie(view, "null cannot be cast to non-null type android.view.ViewGroup");
                alpha((ViewGroup) view, ticketCommentResponse);
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(f fVar, T t5) {
        this(fVar, (ViewGroup) r0);
        this.bravo = 0;
        View view = t5.red;
        Intrinsics.charlie(view, "null cannot be cast to non-null type android.view.ViewGroup");
        this.charlie = t5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(f fVar, AbstractC0039f0 abstractC0039f0) {
        this(fVar, (ViewGroup) r0);
        this.bravo = 1;
        View view = abstractC0039f0.red;
        Intrinsics.charlie(view, "null cannot be cast to non-null type android.view.ViewGroup");
        this.charlie = abstractC0039f0;
    }
}
