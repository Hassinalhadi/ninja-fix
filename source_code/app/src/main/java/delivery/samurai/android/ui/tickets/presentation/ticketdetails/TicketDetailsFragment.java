package delivery.samurai.android.ui.tickets.presentation.ticketdetails;

import Aa.h;
import B2.s;
import B9.E;
import B9.ab;
import Hc.b;
import Lb.C;
import Nc.a;
import Nc.c;
import Oc.f;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.T;
import com.google.android.material.button.MaterialButton;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.tickets.presentation.ticketdetails.TicketDetailsFragment;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt;
import s1.al;
import s1.au;
import vf.ad;
import x9.AbstractC3311e;
import z1.d;
import z1.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/ui/tickets/presentation/ticketdetails/TicketDetailsFragment;", "Ld3/n;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes2.dex */
public final class TicketDetailsFragment extends a {
    public final ab e;

    /* renamed from: f, reason: collision with root package name */
    public E f12510f;

    /* renamed from: g, reason: collision with root package name */
    public final f f12511g;

    /* renamed from: h, reason: collision with root package name */
    public int f12512h;

    /* renamed from: i, reason: collision with root package name */
    public final b f12513i;

    /* renamed from: j, reason: collision with root package name */
    public List f12514j;

    /* renamed from: k, reason: collision with root package name */
    public long f12515k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12516l;

    /* JADX WARN: Type inference failed for: r0v3, types: [Oc.f, x9.e] */
    public TicketDetailsFragment() {
        Lazy alpha = LazyKt.alpha(i.purple, new C(3, new C(2, this)));
        this.e = new ab(u.alpha.bravo(TicketDetailsViewModel.class), new h(alpha, 28), new Aa.i(20, this, alpha), new h(alpha, 29));
        this.f12511g = new AbstractC3311e();
        this.f12512h = -1;
        int i4 = 1;
        this.f12513i = new b(i4, new c(this, i4));
        this.f12514j = CollectionsKt.emptyList();
    }

    @Override // androidx.fragment.app.ai
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.echo(inflater, "inflater");
        int i4 = E.f104y;
        DataBinderMapperImpl dataBinderMapperImpl = d.alpha;
        E e = (E) g.kilo(inflater, R.layout.fragment_ticket_details, viewGroup, false, null);
        Intrinsics.delta(e, "inflate(...)");
        this.f12510f = e;
        return quebec().red;
    }

    @Override // d3.n, androidx.fragment.app.ai
    public final void onViewCreated(View view, Bundle bundle) {
        int i4;
        Intrinsics.echo(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i4 = arguments.getInt("TICKET_ID");
        } else {
            i4 = -1;
        }
        this.f12512h = i4;
        this.f12515k = System.currentTimeMillis();
        romeo().alpha(this.f12512h, true);
        ad.zulu(T.foxtrot(this), null, null, new Nc.h(this, null), 3);
        TicketDetailsViewModel romeo = romeo();
        romeo.golf.observe(getViewLifecycleOwner(), new Aa.f(11, new c(this, 0)));
        quebec().f115p.setAdapter(this.f12511g);
        quebec().f113n.setAdapter(this.f12513i);
        E quebec = quebec();
        s sVar = new s(17, this);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(quebec.red, sVar);
    }

    @Override // d3.n
    public final void oscar() {
        E quebec = quebec();
        final int i4 = 0;
        quebec.f105f.setOnClickListener(new View.OnClickListener(this) { // from class: Nc.d
            public final /* synthetic */ TicketDetailsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        TicketDetailsFragment ticketDetailsFragment = this.purple;
                        ticketDetailsFragment.getClass();
                        c cVar = new c(ticketDetailsFragment, 2);
                        Gc.g gVar = new Gc.g();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_gallery", true);
                        bundle.putBoolean("show_camera", true);
                        gVar.setArguments(bundle);
                        gVar.f1375r = cVar;
                        gVar.romeo(ticketDetailsFragment.getChildFragmentManager(), Gc.g.class.getSimpleName());
                        return;
                    case 1:
                        TicketDetailsFragment ticketDetailsFragment2 = this.purple;
                        ticketDetailsFragment2.getClass();
                        ad.zulu(T.foxtrot(ticketDetailsFragment2), null, null, new f(ticketDetailsFragment2, null), 3);
                        return;
                    default:
                        TicketDetailsFragment ticketDetailsFragment3 = this.purple;
                        EditText etMessage = ticketDetailsFragment3.quebec().f111l;
                        Intrinsics.delta(etMessage, "etMessage");
                        etMessage.setVisibility(0);
                        ImageButton btnAddAttachment = ticketDetailsFragment3.quebec().f105f;
                        Intrinsics.delta(btnAddAttachment, "btnAddAttachment");
                        btnAddAttachment.setVisibility(0);
                        ImageButton btnSend = ticketDetailsFragment3.quebec().f107h;
                        Intrinsics.delta(btnSend, "btnSend");
                        btnSend.setVisibility(0);
                        TextView tvReopenQuestion = ticketDetailsFragment3.quebec().f117r;
                        Intrinsics.delta(tvReopenQuestion, "tvReopenQuestion");
                        tvReopenQuestion.setVisibility(8);
                        MaterialButton btnReopen = ticketDetailsFragment3.quebec().f106g;
                        Intrinsics.delta(btnReopen, "btnReopen");
                        btnReopen.setVisibility(8);
                        TextView tvClosedMessage = ticketDetailsFragment3.quebec().f116q;
                        Intrinsics.delta(tvClosedMessage, "tvClosedMessage");
                        tvClosedMessage.setVisibility(8);
                        ticketDetailsFragment3.quebec().f111l.requestFocus();
                        return;
                }
            }
        });
        EditText etMessage = quebec().f111l;
        Intrinsics.delta(etMessage, "etMessage");
        etMessage.addTextChangedListener(new Ba.h(5, this));
        E quebec2 = quebec();
        final int i5 = 1;
        quebec2.f107h.setOnClickListener(new View.OnClickListener(this) { // from class: Nc.d
            public final /* synthetic */ TicketDetailsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        TicketDetailsFragment ticketDetailsFragment = this.purple;
                        ticketDetailsFragment.getClass();
                        c cVar = new c(ticketDetailsFragment, 2);
                        Gc.g gVar = new Gc.g();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_gallery", true);
                        bundle.putBoolean("show_camera", true);
                        gVar.setArguments(bundle);
                        gVar.f1375r = cVar;
                        gVar.romeo(ticketDetailsFragment.getChildFragmentManager(), Gc.g.class.getSimpleName());
                        return;
                    case 1:
                        TicketDetailsFragment ticketDetailsFragment2 = this.purple;
                        ticketDetailsFragment2.getClass();
                        ad.zulu(T.foxtrot(ticketDetailsFragment2), null, null, new f(ticketDetailsFragment2, null), 3);
                        return;
                    default:
                        TicketDetailsFragment ticketDetailsFragment3 = this.purple;
                        EditText etMessage2 = ticketDetailsFragment3.quebec().f111l;
                        Intrinsics.delta(etMessage2, "etMessage");
                        etMessage2.setVisibility(0);
                        ImageButton btnAddAttachment = ticketDetailsFragment3.quebec().f105f;
                        Intrinsics.delta(btnAddAttachment, "btnAddAttachment");
                        btnAddAttachment.setVisibility(0);
                        ImageButton btnSend = ticketDetailsFragment3.quebec().f107h;
                        Intrinsics.delta(btnSend, "btnSend");
                        btnSend.setVisibility(0);
                        TextView tvReopenQuestion = ticketDetailsFragment3.quebec().f117r;
                        Intrinsics.delta(tvReopenQuestion, "tvReopenQuestion");
                        tvReopenQuestion.setVisibility(8);
                        MaterialButton btnReopen = ticketDetailsFragment3.quebec().f106g;
                        Intrinsics.delta(btnReopen, "btnReopen");
                        btnReopen.setVisibility(8);
                        TextView tvClosedMessage = ticketDetailsFragment3.quebec().f116q;
                        Intrinsics.delta(tvClosedMessage, "tvClosedMessage");
                        tvClosedMessage.setVisibility(8);
                        ticketDetailsFragment3.quebec().f111l.requestFocus();
                        return;
                }
            }
        });
        E quebec3 = quebec();
        final int i10 = 2;
        quebec3.f106g.setOnClickListener(new View.OnClickListener(this) { // from class: Nc.d
            public final /* synthetic */ TicketDetailsFragment purple;

            {
                this.purple = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        TicketDetailsFragment ticketDetailsFragment = this.purple;
                        ticketDetailsFragment.getClass();
                        c cVar = new c(ticketDetailsFragment, 2);
                        Gc.g gVar = new Gc.g();
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_gallery", true);
                        bundle.putBoolean("show_camera", true);
                        gVar.setArguments(bundle);
                        gVar.f1375r = cVar;
                        gVar.romeo(ticketDetailsFragment.getChildFragmentManager(), Gc.g.class.getSimpleName());
                        return;
                    case 1:
                        TicketDetailsFragment ticketDetailsFragment2 = this.purple;
                        ticketDetailsFragment2.getClass();
                        ad.zulu(T.foxtrot(ticketDetailsFragment2), null, null, new f(ticketDetailsFragment2, null), 3);
                        return;
                    default:
                        TicketDetailsFragment ticketDetailsFragment3 = this.purple;
                        EditText etMessage2 = ticketDetailsFragment3.quebec().f111l;
                        Intrinsics.delta(etMessage2, "etMessage");
                        etMessage2.setVisibility(0);
                        ImageButton btnAddAttachment = ticketDetailsFragment3.quebec().f105f;
                        Intrinsics.delta(btnAddAttachment, "btnAddAttachment");
                        btnAddAttachment.setVisibility(0);
                        ImageButton btnSend = ticketDetailsFragment3.quebec().f107h;
                        Intrinsics.delta(btnSend, "btnSend");
                        btnSend.setVisibility(0);
                        TextView tvReopenQuestion = ticketDetailsFragment3.quebec().f117r;
                        Intrinsics.delta(tvReopenQuestion, "tvReopenQuestion");
                        tvReopenQuestion.setVisibility(8);
                        MaterialButton btnReopen = ticketDetailsFragment3.quebec().f106g;
                        Intrinsics.delta(btnReopen, "btnReopen");
                        btnReopen.setVisibility(8);
                        TextView tvClosedMessage = ticketDetailsFragment3.quebec().f116q;
                        Intrinsics.delta(tvClosedMessage, "tvClosedMessage");
                        tvClosedMessage.setVisibility(8);
                        ticketDetailsFragment3.quebec().f111l.requestFocus();
                        return;
                }
            }
        });
    }

    public final E quebec() {
        E e = this.f12510f;
        if (e != null) {
            return e;
        }
        Intrinsics.lima("binding");
        throw null;
    }

    public final TicketDetailsViewModel romeo() {
        return (TicketDetailsViewModel) this.e.getValue();
    }

    public final void sierra() {
        ConstraintLayout clLoading = quebec().f109j;
        Intrinsics.delta(clLoading, "clLoading");
        clLoading.setVisibility(8);
    }

    public final void tango() {
        String str;
        boolean z2;
        int i4;
        String obj;
        Editable text = quebec().f111l.getText();
        if (text != null && (obj = text.toString()) != null) {
            str = StringsKt.b(obj).toString();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        quebec().f107h.setEnabled(!z2);
        E quebec = quebec();
        if (!z2) {
            i4 = R.drawable.bg_send_button_active;
        } else {
            i4 = R.drawable.bg_send_button;
        }
        quebec.f107h.setBackgroundResource(i4);
    }
}
