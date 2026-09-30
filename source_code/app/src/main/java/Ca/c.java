package Ca;

import B9.A0;
import B9.AbstractC0031b0;
import B9.AbstractC0047j0;
import B9.AbstractC0051l0;
import B9.B0;
import B9.C0029a0;
import B9.C0033c0;
import B9.C0049k0;
import B9.C0053m0;
import B9.C0072w0;
import B9.L0;
import B9.U0;
import B9.V;
import B9.V0;
import B9.W;
import B9.W0;
import B9.Z;
import B9.ab;
import B9.c1;
import B9.d1;
import B9.g1;
import B9.h1;
import B9.i1;
import B9.j1;
import B9.n1;
import B9.o1;
import B9.r1;
import Fb.g;
import Hc.h;
import J2.l;
import J2.t;
import Qb.k;
import Wc.ae;
import Yb.C0311j;
import Yb.K0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import av.ao;
import c1.C0806e;
import com.app.network.network.models.Bank;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.EnvelopNotification;
import com.app.network.network.models.Item;
import com.app.network.network.models.LanguageMetaData;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderAsset;
import com.app.network.network.models.OrderStatus;
import com.app.network.network.models.PaymentType;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.models.Score;
import com.app.network.network.models.SignedAppAgreement;
import com.app.network.network.models.WithdrawHistory;
import com.app.network.network.models.WithdrawStatus;
import com.app.network.network.models.captian.Assets;
import com.app.network.network.models.captian.Instruction;
import com.app.network.network.models.points.PointingRuleResponse;
import com.app.network.network.models.points.PointsTransactionResponse;
import com.app.network.network.models.points.PointsTransactionType;
import com.app.network.network.models.tickets.CommentAttachment;
import com.app.network.network.models.tickets.TicketAttachment;
import com.app.network.network.models.trophies.TrophyMilestone;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;
import delivery.samurai.android.R;
import ha.C1837b;
import id.C1915c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k5.C2015h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import la.e;
import mc.f;
import oa.C2203b;
import qa.C2432a;
import s6.AbstractC2643e5;
import t6.S3;
import t6.U2;
import x9.AbstractC3311e;
import x9.InterfaceC3312f;
import xc.C3324b;
import z1.d;
import za.C3492a;
import za.C3496e;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.Request;
import zendesk.support.RequestStatus;

/* loaded from: classes2.dex */
public final class c extends AbstractC3311e {
    public final /* synthetic */ int charlie;

    public /* synthetic */ c(int i4) {
        this.charlie = i4;
    }

    private final void charlie(f0 f0Var, int i4) {
        b holder = (b) f0Var;
        Intrinsics.echo(holder, "holder");
        g1 g1Var = holder.alpha;
        if (g1Var != null) {
            h1 h1Var = (h1) g1Var;
            h1Var.f471i = (Country) this.alpha.get(i4);
            synchronized (h1Var) {
                h1Var.f487k |= 1;
            }
            h1Var.delta();
            h1Var.oscar();
            boolean z2 = true;
            int i5 = 0;
            if (i4 != this.alpha.size() - 1) {
                z2 = false;
            }
            View view = g1Var.f470h;
            if (z2) {
                i5 = 8;
            }
            view.setVisibility(i5);
            g1Var.f468f.setOnClickListener(new a(this, i4, 0));
        }
    }

    private final void delta(f0 f0Var, int i4) {
        Fa.a holder = (Fa.a) f0Var;
        Intrinsics.echo(holder, "holder");
        c1 c1Var = holder.alpha;
        d1 d1Var = (d1) c1Var;
        d1Var.f435i = (Bank) this.alpha.get(i4);
        synchronized (d1Var) {
            d1Var.f443k |= 1;
        }
        d1Var.delta();
        d1Var.oscar();
        boolean z2 = true;
        int i5 = 0;
        if (i4 != this.alpha.size() - 1) {
            z2 = false;
        }
        View view = c1Var.f434h;
        if (z2) {
            i5 = 8;
        }
        view.setVisibility(i5);
        c1Var.f432f.setOnClickListener(new a(this, i4, 1));
    }

    private final void echo(f0 f0Var, int i4) {
        g holder = (g) f0Var;
        Intrinsics.echo(holder, "holder");
        C0072w0 c0072w0 = holder.alpha;
        if (c0072w0 != null) {
            c0072w0.f713i = (EnvelopNotification) this.alpha.get(i4);
            synchronized (c0072w0) {
                c0072w0.f715k |= 1;
            }
            c0072w0.delta();
            c0072w0.oscar();
            c0072w0.red.setOnClickListener(new a(this, i4, 2));
        }
    }

    private final void foxtrot(f0 f0Var, int i4) {
        Qb.g holder = (Qb.g) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        LanguageMetaData languageMetaData = (LanguageMetaData) obj;
        A0 a02 = holder.alpha;
        if (a02 != null) {
            B0 b02 = (B0) a02;
            b02.f73g = languageMetaData;
            synchronized (b02) {
                b02.f78i |= 1;
            }
            b02.delta();
            b02.oscar();
        }
    }

    private final void golf(f0 f0Var, final int i4) {
        String str;
        k holder = (k) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        final Order order = (Order) obj;
        final AbstractC0051l0 abstractC0051l0 = (AbstractC0051l0) d.alpha(holder.alpha);
        if (abstractC0051l0 != null) {
            C0053m0 c0053m0 = (C0053m0) abstractC0051l0;
            c0053m0.f539t = order;
            synchronized (c0053m0) {
                c0053m0.f559u |= 1;
            }
            c0053m0.delta();
            c0053m0.oscar();
            TextView textView = abstractC0051l0.f536q;
            PaymentType paymentType = order.getPaymentType();
            if (paymentType != null) {
                int type = paymentType.getType();
                Context context = abstractC0051l0.red.getContext();
                Intrinsics.delta(context, "getContext(...)");
                str = context.getString(type);
            } else {
                str = null;
            }
            textView.setText(str);
            abstractC0051l0.f525f.setText("#" + order.getBackendNo());
            String status = order.getStatus();
            if (status != null) {
                TextView textView2 = abstractC0051l0.f537r;
                OrderStatus orderStatusEnum = order.getOrderStatusEnum();
                if (orderStatusEnum != null) {
                    Context context2 = abstractC0051l0.red.getContext();
                    Intrinsics.delta(context2, "getContext(...)");
                    String string = context2.getString(orderStatusEnum.getToString());
                    if (string != null) {
                        status = string;
                    }
                }
                textView2.setText(status);
            }
            abstractC0051l0.f529j.setSelected(true);
            abstractC0051l0.f530k.setSelected(true);
            abstractC0051l0.f531l.setSelected(true);
            abstractC0051l0.f532m.setSelected(true);
            abstractC0051l0.f526g.setOnClickListener(new View.OnClickListener() { // from class: Qb.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InterfaceC3312f interfaceC3312f = Ca.c.this.bravo;
                    if (interfaceC3312f != null) {
                        View view2 = abstractC0051l0.red;
                        Intrinsics.delta(view2, "getRoot(...)");
                        interfaceC3312f.black(view2, i4, order);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void hotel(f0 f0Var, int i4) {
        WithdrawStatus withdrawStatus;
        boolean z2;
        ae holder = (ae) f0Var;
        Intrinsics.echo(holder, "holder");
        n1 n1Var = holder.alpha;
        if (n1Var != null) {
            o1 o1Var = (o1) n1Var;
            o1Var.f580j = (WithdrawHistory) this.alpha.get(i4);
            synchronized (o1Var) {
                o1Var.f589m |= 2;
            }
            o1Var.delta();
            o1Var.oscar();
            WithdrawHistory withdrawHistory = n1Var.f580j;
            WithdrawStatus withdrawStatus2 = null;
            if (withdrawHistory != null) {
                withdrawStatus = withdrawHistory.getStatus();
            } else {
                withdrawStatus = null;
            }
            int i5 = 0;
            if (withdrawStatus != WithdrawStatus.FAILED) {
                WithdrawHistory withdrawHistory2 = n1Var.f580j;
                if (withdrawHistory2 != null) {
                    withdrawStatus2 = withdrawHistory2.getStatus();
                }
                if (withdrawStatus2 != WithdrawStatus.REJECTED) {
                    z2 = false;
                    n1Var.romeo(Boolean.valueOf(z2));
                    View view = n1Var.f579i;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Intrinsics.charlie(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    C0806e c0806e = (C0806e) layoutParams;
                    if (i4 != 0) {
                        c0806e.india = n1Var.f577g.getId();
                        if (this.alpha.size() <= 1) {
                            i5 = n1Var.f577g.getId();
                        }
                        c0806e.lima = i5;
                    } else if (i4 == this.alpha.size() - 1) {
                        c0806e.india = 0;
                        c0806e.lima = n1Var.f577g.getId();
                    } else {
                        c0806e.india = 0;
                        c0806e.lima = 0;
                    }
                    view.setLayoutParams(c0806e);
                }
            }
            z2 = true;
            n1Var.romeo(Boolean.valueOf(z2));
            View view2 = n1Var.f579i;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            Intrinsics.charlie(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C0806e c0806e2 = (C0806e) layoutParams2;
            if (i4 != 0) {
            }
            view2.setLayoutParams(c0806e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, com.squareup.picasso.Transformation] */
    private final void india(f0 f0Var, int i4) {
        String imageUrl;
        C0311j holder = (C0311j) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        OrderAsset orderAsset = (OrderAsset) obj;
        Z z2 = holder.bravo;
        if (z2 != null) {
            C0029a0 c0029a0 = (C0029a0) z2;
            c0029a0.f281k = orderAsset;
            synchronized (c0029a0) {
                c0029a0.f314l |= 1;
            }
            c0029a0.delta();
            c0029a0.oscar();
        }
        if (holder.charlie.getVisibility() == 0 && (imageUrl = orderAsset.getImageUrl()) != null && imageUrl.length() != 0) {
            Picasso.get().load(orderAsset.getImageUrl()).placeholder(R.drawable.ic_camera).error(R.drawable.ic_camera).transform((Transformation) new Object()).into(holder.charlie);
            holder.charlie.setOnClickListener(new Kb.k(5, holder, orderAsset));
        }
    }

    private final void juliet(f0 f0Var, int i4) {
        K0 holder = (K0) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        Item item = (Item) obj;
        B9.K0 k02 = holder.bravo;
        if (k02 != null) {
            L0 l02 = (L0) k02;
            l02.f162i = item;
            synchronized (l02) {
                l02.f180k |= 1;
            }
            l02.delta();
            l02.oscar();
        }
    }

    private final void kilo(f0 f0Var, int i4) {
        e holder = (e) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        SignedAppAgreement signedAppAgreement = (SignedAppAgreement) obj;
        V v4 = holder.bravo;
        if (v4 != null) {
            W w4 = (W) v4;
            w4.f253h = signedAppAgreement;
            synchronized (w4) {
                w4.f257i |= 1;
            }
            w4.delta();
            w4.oscar();
            v4.hotel();
        }
        holder.itemView.setOnClickListener(new a(this, i4, 9));
    }

    private final void lima(f0 f0Var, int i4) {
        mc.b holder = (mc.b) f0Var;
        Intrinsics.echo(holder, "holder");
        W0 w02 = holder.alpha;
        w02.f260g = (PointingRuleResponse) this.alpha.get(i4);
        synchronized (w02) {
            w02.f263j |= 1;
        }
        w02.delta();
        w02.oscar();
    }

    private final void mike(f0 f0Var, int i4) {
        int i5;
        f holder = (f) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        PointsTransactionResponse pointsTransactionResponse = (PointsTransactionResponse) obj;
        U0 u02 = holder.alpha;
        V0 v0 = (V0) u02;
        v0.f250n = pointsTransactionResponse;
        synchronized (v0) {
            v0.f255p |= 2;
        }
        v0.delta();
        v0.oscar();
        PointsTransactionType transactionType = pointsTransactionResponse.getTransactionType();
        if (transactionType == null) {
            i5 = -1;
        } else {
            i5 = mc.e.$EnumSwitchMapping$0[transactionType.ordinal()];
        }
        if (i5 != -1) {
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4 && i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    f.alpha(u02, R.color.amber_700, R.drawable.bg_amber_badge);
                    return;
                }
            } else {
                f.alpha(u02, R.color.red, R.drawable.bg_red_badge);
                return;
            }
        }
        f.alpha(u02, R.color.colorGreen, R.drawable.bg_green_badge);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, com.squareup.picasso.Transformation] */
    private final void november(f0 f0Var, int i4) {
        C2432a holder = (C2432a) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        Assets assets = (Assets) obj;
        AbstractC0031b0 abstractC0031b0 = holder.charlie;
        if (abstractC0031b0 != null) {
            C0033c0 c0033c0 = (C0033c0) abstractC0031b0;
            c0033c0.f421k = assets;
            synchronized (c0033c0) {
                c0033c0.f430l |= 1;
            }
            c0033c0.delta();
            c0033c0.oscar();
        }
        holder.itemView.setOnClickListener(new a(this, i4, 10));
        if (holder.bravo.getVisibility() == 0 && assets.getImageUrl() != null) {
            Picasso.get().load(assets.getImageUrl()).placeholder(R.drawable.ic_camera).error(R.drawable.ic_camera).transform((Transformation) new Object()).into(holder.bravo);
        }
        holder.bravo.setOnClickListener(new Kb.k(11, holder, assets));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r7 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void oscar(f0 f0Var, int i4) {
        C3324b holder = (C3324b) f0Var;
        Intrinsics.echo(holder, "holder");
        Object obj = this.alpha.get(i4);
        Intrinsics.delta(obj, "get(...)");
        Score score = (Score) obj;
        r1 r1Var = holder.alpha;
        r1Var.f618i = score;
        synchronized (r1Var) {
            r1Var.f619j |= 1;
        }
        r1Var.delta();
        r1Var.oscar();
        try {
            String hexColor = score.getHexColor();
            if (hexColor != null) {
                if (!r.quebec(hexColor, "#", false)) {
                    hexColor = "#".concat(hexColor);
                }
            }
            hexColor = Constants.WHITE;
            r1Var.f615f.setBackgroundColor(Color.parseColor(hexColor));
        } catch (Exception unused) {
            r1Var.f615f.setBackgroundColor(-1);
        }
    }

    private final void papa(f0 f0Var, int i4) {
        C3492a holder = (C3492a) f0Var;
        Intrinsics.echo(holder, "holder");
        AbstractC0047j0 abstractC0047j0 = holder.alpha;
        C0049k0 c0049k0 = (C0049k0) abstractC0047j0;
        c0049k0.f507i = (City) this.alpha.get(i4);
        synchronized (c0049k0) {
            c0049k0.f513k |= 1;
        }
        c0049k0.delta();
        c0049k0.oscar();
        boolean z2 = true;
        int i5 = 0;
        if (i4 != this.alpha.size() - 1) {
            z2 = false;
        }
        View view = abstractC0047j0.f506h;
        if (z2) {
            i5 = 8;
        }
        view.setVisibility(i5);
        abstractC0047j0.f504f.setOnClickListener(new a(this, i4, 12));
    }

    @Override // x9.AbstractC3311e, androidx.recyclerview.widget.az
    public int getItemCount() {
        switch (this.charlie) {
            case 9:
                return this.alpha.size();
            default:
                return super.getItemCount();
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        String str;
        int i5;
        Pair pair;
        int i10;
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LinearLayout.LayoutParams layoutParams;
        String str2 = null;
        LinearLayout.LayoutParams layoutParams2 = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.charlie) {
            case 0:
                charlie(f0Var, i4);
                return;
            case 1:
                delta(f0Var, i4);
                return;
            case 2:
                echo(f0Var, i4);
                return;
            case 3:
                Hc.d holder = (Hc.d) f0Var;
                Intrinsics.echo(holder, "holder");
                View view = holder.itemView;
                Object obj = this.alpha.get(i4);
                Intrinsics.delta(obj, "get(...)");
                Request request = (Request) obj;
                ao aoVar = holder.alpha;
                TextView textView = (TextView) aoVar.teal;
                Date updatedAt = request.getUpdatedAt();
                if (updatedAt != null) {
                    str = new SimpleDateFormat("d MMM, yyyy hh:mm", Locale.getDefault()).format(updatedAt);
                    Intrinsics.delta(str, "format(...)");
                } else {
                    str = null;
                }
                textView.setText(str);
                ((TextView) aoVar.white).setText(request.getSubject());
                ((TextView) aoVar.purple).setText(request.getDescription());
                RequestStatus status = request.getStatus();
                if (status != null) {
                    str2 = status.name();
                }
                TextView textView2 = (TextView) aoVar.silver;
                textView2.setText(str2);
                RequestStatus status2 = request.getStatus();
                if (status2 == null) {
                    i5 = -1;
                } else {
                    i5 = Hc.e.$EnumSwitchMapping$0[status2.ordinal()];
                }
                switch (i5) {
                    case -1:
                        pair = new Pair(Integer.valueOf(R.color.zs_color_black), Integer.valueOf(R.drawable.ic_baseline_close_24));
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        pair = new Pair(Integer.valueOf(R.color.colorOrange), Integer.valueOf(R.drawable.ic_clock_icon_pending));
                        break;
                    case 2:
                        pair = new Pair(Integer.valueOf(R.color.colorOrange), Integer.valueOf(R.drawable.ic_clock_icon_pending));
                        break;
                    case 3:
                        pair = new Pair(Integer.valueOf(R.color.colorOrange), Integer.valueOf(R.drawable.ic_clock_icon_pending));
                        break;
                    case 4:
                        pair = new Pair(Integer.valueOf(R.color.colorGreen), Integer.valueOf(R.drawable.ic_clock_icon));
                        break;
                    case 5:
                        pair = new Pair(Integer.valueOf(R.color.colorGreen), Integer.valueOf(R.drawable.ic_done_icon));
                        break;
                    case 6:
                        pair = new Pair(Integer.valueOf(R.color.zs_color_black), Integer.valueOf(R.drawable.ic_baseline_close_24));
                        break;
                }
                Context context = view.getContext();
                Intrinsics.delta(context, "getContext(...)");
                textView2.setTextColor(context.getColor(((Number) pair.getFirst()).intValue()));
                ((ImageView) aoVar.red).setImageResource(((Number) pair.getSecond()).intValue());
                view.setOnClickListener(new Hc.c(i4, i13, this, request));
                return;
            case 4:
                h holder2 = (h) f0Var;
                Intrinsics.echo(holder2, "holder");
                ArrayList arrayList = this.alpha;
                Object obj2 = arrayList.get(i4);
                Intrinsics.delta(obj2, "get(...)");
                CommentResponse commentResponse = (CommentResponse) obj2;
                boolean areEqual = Intrinsics.areEqual(commentResponse.getAuthorId(), ((CommentResponse) CollectionsKt.ochre(arrayList)).getAuthorId());
                Context context2 = holder2.itemView.getContext();
                C1915c c1915c = holder2.alpha;
                ((TextView) c1915c.silver).setText(commentResponse.getBody());
                Resources resources = context2.getResources();
                int i14 = R.dimen.spacing_zero;
                if (areEqual) {
                    i10 = R.dimen.spacing_43;
                } else {
                    i10 = R.dimen.spacing_zero;
                }
                int dimensionPixelOffset = resources.getDimensionPixelOffset(i10);
                Resources resources2 = context2.getResources();
                if (!areEqual) {
                    i14 = R.dimen.spacing_43;
                }
                int dimensionPixelOffset2 = resources2.getDimensionPixelOffset(i14);
                if (areEqual) {
                    i11 = 8388613;
                } else {
                    i11 = 8388611;
                }
                FrameLayout frameLayout = (FrameLayout) c1915c.purple;
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart(dimensionPixelOffset);
                    marginLayoutParams.setMarginEnd(dimensionPixelOffset2);
                    frameLayout.setLayoutParams(marginLayoutParams);
                }
                TextView textView3 = (TextView) c1915c.silver;
                ViewGroup.LayoutParams layoutParams4 = textView3.getLayoutParams();
                if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams4;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.gravity = i11;
                    textView3.setLayoutParams(layoutParams);
                }
                RecyclerView recyclerView = (RecyclerView) c1915c.red;
                ViewGroup.LayoutParams layoutParams5 = recyclerView.getLayoutParams();
                if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                    layoutParams2 = (LinearLayout.LayoutParams) layoutParams5;
                }
                if (layoutParams2 != null) {
                    layoutParams2.gravity = i11;
                    recyclerView.setLayoutParams(layoutParams2);
                }
                Hc.g gVar = new Hc.g(i11);
                List<Attachment> attachments = commentResponse.getAttachments();
                Intrinsics.delta(attachments, "getAttachments(...)");
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = attachments.iterator();
                while (it.hasNext()) {
                    String contentUrl = ((Attachment) it.next()).getContentUrl();
                    if (contentUrl != null) {
                        arrayList2.add(contentUrl);
                    }
                }
                gVar.bravo(arrayList2);
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(gVar);
                return;
            case 5:
                Oc.b holder3 = (Oc.b) f0Var;
                Intrinsics.echo(holder3, "holder");
                Object obj3 = this.alpha.get(i4);
                Intrinsics.delta(obj3, "get(...)");
                CommentAttachment commentAttachment = (CommentAttachment) obj3;
                J2.e eVar = holder3.alpha;
                AbstractC2643e5.charlie((ImageView) eVar.red, commentAttachment.getFileUrl(), 0, 6);
                ((ImageView) eVar.red).setOnClickListener(new Kb.k(i12, holder3, commentAttachment));
                return;
            case 6:
                Oc.c holder4 = (Oc.c) f0Var;
                Intrinsics.echo(holder4, "holder");
                Object obj4 = this.alpha.get(i4);
                Intrinsics.delta(obj4, "get(...)");
                AbstractC2643e5.charlie((ImageView) holder4.alpha.purple, ((TicketAttachment) obj4).getFileUrl(), 0, 6);
                return;
            case 7:
                foxtrot(f0Var, i4);
                return;
            case 8:
                golf(f0Var, i4);
                return;
            case 9:
                Ub.g holder5 = (Ub.g) f0Var;
                Intrinsics.echo(holder5, "holder");
                Object obj5 = this.alpha.get(i4);
                Intrinsics.delta(obj5, "get(...)");
                String str3 = (String) obj5;
                t tVar = holder5.alpha;
                AbstractC2643e5.charlie((ImageView) tVar.purple, str3, 0, 6);
                ((ImageView) tVar.purple).setOnClickListener(new Kb.k(3, holder5, str3));
                return;
            case 10:
                hotel(f0Var, i4);
                return;
            case 11:
                india(f0Var, i4);
                return;
            case 12:
                juliet(f0Var, i4);
                return;
            case 13:
                C1837b holder6 = (C1837b) f0Var;
                Intrinsics.echo(holder6, "holder");
                Object obj6 = this.alpha.get(i4);
                Intrinsics.delta(obj6, "get(...)");
                TrophyMilestone trophyMilestone = (TrophyMilestone) obj6;
                ab abVar = holder6.alpha;
                ((TextView) abVar.silver).setText(trophyMilestone.getMilestoneTitle());
                ((LinearProgressIndicator) abVar.white).setProgress(Zd.a.charlie(trophyMilestone.getProgress()));
                ((TextView) abVar.teal).setText(((MaterialCardView) abVar.purple).getContext().getString(R.string.trophy_progress_label, Integer.valueOf(Zd.a.charlie(trophyMilestone.getProgress()))));
                String description = trophyMilestone.getDescription();
                if (description != null && !StringsKt.gray(description)) {
                    String description2 = trophyMilestone.getDescription();
                    TextView textView4 = (TextView) abVar.red;
                    textView4.setText(description2);
                    textView4.setVisibility(0);
                    return;
                }
                return;
            case 14:
                kilo(f0Var, i4);
                return;
            case 15:
                lima(f0Var, i4);
                return;
            case 16:
                mike(f0Var, i4);
                return;
            case 17:
                C2203b holder7 = (C2203b) f0Var;
                Intrinsics.echo(holder7, "holder");
                Object obj7 = this.alpha.get(i4);
                Intrinsics.delta(obj7, "get(...)");
                holder7.alpha.setContent(new P.d(new C2015h(i12, obj7, holder7), -811712232, true));
                return;
            case 18:
                november(f0Var, i4);
                return;
            case 19:
                qa.h holder8 = (qa.h) f0Var;
                Intrinsics.echo(holder8, "holder");
                Object obj8 = this.alpha.get(i4);
                Intrinsics.delta(obj8, "get(...)");
                holder8.bravo.setText(((Instruction) obj8).getContent());
                return;
            case 20:
                oscar(f0Var, i4);
                return;
            case 21:
                papa(f0Var, i4);
                return;
            default:
                C3496e holder9 = (C3496e) f0Var;
                Intrinsics.echo(holder9, "holder");
                i1 i1Var = holder9.alpha;
                j1 j1Var = (j1) i1Var;
                j1Var.f498j = (PlatformListResponse) this.alpha.get(i4);
                synchronized (j1Var) {
                    j1Var.f509l |= 1;
                }
                j1Var.delta();
                j1Var.oscar();
                if (i4 != this.alpha.size() - 1) {
                    i12 = 0;
                }
                View view2 = i1Var.f497i;
                if (i12 != 0) {
                    i13 = 8;
                }
                view2.setVisibility(i13);
                i1Var.f494f.setOnClickListener(new a(this, i4, 13));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.recyclerview.widget.f0, Qb.g] */
    /* JADX WARN: Type inference failed for: r11v13, types: [androidx.recyclerview.widget.f0, Qb.k] */
    /* JADX WARN: Type inference failed for: r11v15, types: [Wc.ae, androidx.recyclerview.widget.f0] */
    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from = LayoutInflater.from(parent.getContext());
                int i5 = g1.f467j;
                g1 g1Var = (g1) d.charlie(from, R.layout.row_select_nationality, parent, false);
                Intrinsics.delta(g1Var, "inflate(...)");
                return new b(g1Var);
            case 1:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from2 = LayoutInflater.from(parent.getContext());
                int i10 = c1.f431j;
                c1 c1Var = (c1) d.charlie(from2, R.layout.row_select_bank, parent, false);
                Intrinsics.delta(c1Var, "inflate(...)");
                return new Fa.a(c1Var);
            case 2:
                Intrinsics.echo(parent, "parent");
                return new g(U2.charlie(parent, R.layout.row_notification));
            case 3:
                Intrinsics.echo(parent, "parent");
                View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_support_item, parent, false);
                int i11 = R.id.description;
                TextView textView = (TextView) S3.bravo(R.id.description, inflate);
                if (textView != null) {
                    i11 = R.id.statusIndicator;
                    ImageView imageView = (ImageView) S3.bravo(R.id.statusIndicator, inflate);
                    if (imageView != null) {
                        i11 = R.id.statusText;
                        TextView textView2 = (TextView) S3.bravo(R.id.statusText, inflate);
                        if (textView2 != null) {
                            i11 = R.id.ticketDateTime;
                            TextView textView3 = (TextView) S3.bravo(R.id.ticketDateTime, inflate);
                            if (textView3 != null) {
                                i11 = R.id.title;
                                TextView textView4 = (TextView) S3.bravo(R.id.title, inflate);
                                if (textView4 != null) {
                                    return new Hc.d(new ao((CardView) inflate, textView, imageView, textView2, textView3, textView4));
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
            case 4:
                Intrinsics.echo(parent, "parent");
                View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_comments_item, parent, false);
                int i12 = R.id.attachmentsView;
                RecyclerView recyclerView = (RecyclerView) S3.bravo(R.id.attachmentsView, inflate2);
                if (recyclerView != null) {
                    i12 = R.id.container;
                    if (((LinearLayout) S3.bravo(R.id.container, inflate2)) != null) {
                        i12 = R.id.tvMsgText;
                        TextView textView5 = (TextView) S3.bravo(R.id.tvMsgText, inflate2);
                        if (textView5 != null) {
                            return new h(new C1915c((FrameLayout) inflate2, recyclerView, textView5, 9));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i12)));
            case 5:
                Intrinsics.echo(parent, "parent");
                View inflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_comment_attachment, parent, false);
                ImageView imageView2 = (ImageView) S3.bravo(R.id.iv_comment_attachment, inflate3);
                if (imageView2 != null) {
                    return new Oc.b(new J2.e(5, (ConstraintLayout) inflate3, imageView2));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(R.id.iv_comment_attachment)));
            case 6:
                Intrinsics.echo(parent, "parent");
                View inflate4 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_ticket_attachment, parent, false);
                ImageView imageView3 = (ImageView) S3.bravo(R.id.iv_ticket_attachment, inflate4);
                if (imageView3 != null) {
                    return new Oc.c(new l((ConstraintLayout) inflate4, imageView3));
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(R.id.iv_ticket_attachment)));
            case 7:
                Intrinsics.echo(parent, "parent");
                View charlie = U2.charlie(parent, R.layout.row_order_meta_data);
                ?? f0Var = new f0(charlie);
                f0Var.alpha = (A0) d.alpha(charlie);
                return f0Var;
            case 8:
                Intrinsics.echo(parent, "parent");
                View charlie2 = U2.charlie(parent, R.layout.row_completed_order);
                ?? f0Var2 = new f0(charlie2);
                f0Var2.alpha = charlie2;
                return f0Var2;
            case 9:
                Intrinsics.echo(parent, "parent");
                View inflate5 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_address_note_large_image, parent, false);
                int i13 = R.id.cvPhotoContainer;
                if (((CardView) S3.bravo(R.id.cvPhotoContainer, inflate5)) != null) {
                    i13 = R.id.ivPhoto;
                    ImageView imageView4 = (ImageView) S3.bravo(R.id.ivPhoto, inflate5);
                    if (imageView4 != null) {
                        i13 = R.id.vOverlay;
                        View bravo = S3.bravo(R.id.vOverlay, inflate5);
                        if (bravo != null) {
                            return new Ub.g(new t((ConstraintLayout) inflate5, imageView4, bravo));
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i13)));
            case 10:
                Intrinsics.echo(parent, "parent");
                View charlie3 = U2.charlie(parent, R.layout.row_withdraw_history_item);
                ?? f0Var3 = new f0(charlie3);
                f0Var3.alpha = (n1) d.alpha(charlie3);
                return f0Var3;
            case 11:
                Intrinsics.echo(parent, "parent");
                return new C0311j(U2.charlie(parent, R.layout.row_asset_order_v2));
            case 12:
                Intrinsics.echo(parent, "parent");
                return new K0(U2.charlie(parent, R.layout.row_order_shopping_list_v2));
            case 13:
                Intrinsics.echo(parent, "parent");
                View inflate6 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_trophy_milestone, parent, false);
                MaterialCardView materialCardView = (MaterialCardView) inflate6;
                int i14 = R.id.lpi_trophy_progress;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) S3.bravo(R.id.lpi_trophy_progress, inflate6);
                if (linearProgressIndicator != null) {
                    i14 = R.id.tv_milestone_desc;
                    TextView textView6 = (TextView) S3.bravo(R.id.tv_milestone_desc, inflate6);
                    if (textView6 != null) {
                        i14 = R.id.tv_milestone_title;
                        TextView textView7 = (TextView) S3.bravo(R.id.tv_milestone_title, inflate6);
                        if (textView7 != null) {
                            i14 = R.id.tv_progress_label;
                            TextView textView8 = (TextView) S3.bravo(R.id.tv_progress_label, inflate6);
                            if (textView8 != null) {
                                return new C1837b(new ab(materialCardView, linearProgressIndicator, textView6, textView7, textView8));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate6.getResources().getResourceName(i14)));
            case 14:
                Intrinsics.echo(parent, "parent");
                return new e(U2.charlie(parent, R.layout.row_agreement_item));
            case 15:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from3 = LayoutInflater.from(parent.getContext());
                int i15 = W0.f258k;
                W0 w02 = (W0) d.charlie(from3, R.layout.row_pointing_rule, parent, false);
                Intrinsics.delta(w02, "inflate(...)");
                return new mc.b(w02);
            case 16:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from4 = LayoutInflater.from(parent.getContext());
                int i16 = U0.f241o;
                U0 u02 = (U0) d.charlie(from4, R.layout.row_point_transaction, parent, false);
                Intrinsics.delta(u02, "inflate(...)");
                return new f(u02);
            case 17:
                Intrinsics.echo(parent, "parent");
                return new C2203b(U2.charlie(parent, R.layout.row_area_v2));
            case 18:
                Intrinsics.echo(parent, "parent");
                return new C2432a(U2.charlie(parent, R.layout.row_assets_item));
            case 19:
                Intrinsics.echo(parent, "parent");
                View inflate7 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_instruction, parent, false);
                Intrinsics.checkNotNull(inflate7);
                return new qa.h(inflate7);
            case 20:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from5 = LayoutInflater.from(parent.getContext());
                int i17 = r1.f614k;
                r1 r1Var = (r1) d.charlie(from5, R.layout.score_item, parent, false);
                Intrinsics.delta(r1Var, "inflate(...)");
                return new C3324b(r1Var);
            case 21:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from6 = LayoutInflater.from(parent.getContext());
                int i18 = AbstractC0047j0.f503j;
                AbstractC0047j0 abstractC0047j0 = (AbstractC0047j0) d.charlie(from6, R.layout.row_city_selection, parent, false);
                Intrinsics.delta(abstractC0047j0, "inflate(...)");
                return new C3492a(abstractC0047j0);
            default:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from7 = LayoutInflater.from(parent.getContext());
                int i19 = i1.f493k;
                i1 i1Var = (i1) d.charlie(from7, R.layout.row_select_platform, parent, false);
                Intrinsics.delta(i1Var, "inflate(...)");
                return new C3496e(i1Var);
        }
    }
}
