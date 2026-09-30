package Hc;

import B9.M0;
import B9.N0;
import B9.ab;
import B9.p1;
import J2.t;
import Kb.k;
import Wc.ad;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.Image;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Platform;
import com.app.network.network.models.TaskType;
import com.app.network.network.models.WithdrawTransaction;
import com.app.network.network.models.trophies.Trophy;
import com.bumptech.glide.j;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import ha.C1836a;
import id.C1915c;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2643e5;
import t6.S3;
import t6.U2;
import x9.AbstractC3311e;
import x9.InterfaceC3312f;

/* loaded from: classes2.dex */
public final class b extends AbstractC3311e {
    public final /* synthetic */ int charlie;
    public Object delta;

    public /* synthetic */ b(int i4) {
        this.charlie = i4;
    }

    public static String charlie(int i4) {
        return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((i4 / 3600) % 24), Integer.valueOf((i4 / 60) % 60), Integer.valueOf(i4 % 60)}, 3));
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, final int i4) {
        int i5;
        int i10;
        int i11;
        Image image;
        int i12 = 8;
        final int i13 = 1;
        final int i14 = 0;
        switch (this.charlie) {
            case 0:
                a holder = (a) f0Var;
                Intrinsics.echo(holder, "holder");
                C1915c c1915c = holder.alpha;
                AbstractC2643e5.charlie((ImageView) c1915c.silver, (String) this.alpha.get(i4), 0, 6);
                ((ImageButton) c1915c.red).setOnClickListener(new Ca.a(this, i4, 3));
                return;
            case 1:
                Oc.a holder2 = (Oc.a) f0Var;
                Intrinsics.echo(holder2, "holder");
                t tVar = holder2.alpha;
                AbstractC2643e5.charlie((ImageView) tVar.red, (String) this.alpha.get(i4), 0, 6);
                ((ImageButton) tVar.purple).setOnClickListener(new Ca.a(this, i4, 4));
                return;
            case 2:
                Rb.a holder3 = (Rb.a) f0Var;
                Intrinsics.echo(holder3, "holder");
                Object obj = this.alpha.get(i4);
                Intrinsics.delta(obj, "get(...)");
                OrderTask orderTask = (OrderTask) obj;
                M0 m02 = holder3.bravo;
                if (m02 != null) {
                    N0 n02 = (N0) m02;
                    n02.f190m = orderTask;
                    synchronized (n02) {
                        n02.f207n |= 1;
                    }
                    n02.delta();
                    n02.oscar();
                    TextView textView = m02.f187j;
                    Context context = m02.red.getContext();
                    Intrinsics.delta(context, "getContext(...)");
                    TaskType taskType = orderTask.getTaskType();
                    if (taskType == null) {
                        i5 = -1;
                    } else {
                        i5 = Rb.b.$EnumSwitchMapping$0[taskType.ordinal()];
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            i10 = R.string.pickup_from;
                        } else {
                            i10 = R.string.area_location;
                        }
                    } else {
                        i10 = R.string.deliver_to;
                    }
                    textView.setText(context.getString(i10));
                    if (orderTask.getTaskType() != TaskType.DELIVERY) {
                        ImageView imageView3 = m02.f184g;
                        Intrinsics.delta(imageView3, "imageView3");
                        Order order = (Order) this.delta;
                        String str = null;
                        if (order != null) {
                            Platform platform = order.getPlatform();
                            if (platform != null && (image = platform.getImage()) != null) {
                                str = image.getUrl();
                            }
                            AbstractC2643e5.charlie(imageView3, str, 0, 6);
                        } else {
                            Intrinsics.lima("order");
                            throw null;
                        }
                    } else {
                        m02.f184g.setImageResource(R.drawable.ic_location_icon);
                    }
                    Integer estimatedCompletionSeconds = orderTask.getEstimatedCompletionSeconds();
                    Integer actualCompletionSeconds = orderTask.getActualCompletionSeconds();
                    if (estimatedCompletionSeconds == null || actualCompletionSeconds == null) {
                        i13 = 0;
                    }
                    RelativeLayout relativeLayout = m02.f186i;
                    if (i13 != 0) {
                        i12 = 0;
                    }
                    relativeLayout.setVisibility(i12);
                    if (i13 != 0) {
                        m02.f189l.setText(charlie(estimatedCompletionSeconds.intValue()));
                        m02.f188k.setText(charlie(actualCompletionSeconds.intValue()));
                        TextView textView2 = m02.f188k;
                        Context context2 = m02.red.getContext();
                        Intrinsics.delta(context2, "getContext(...)");
                        if (actualCompletionSeconds.intValue() <= estimatedCompletionSeconds.intValue()) {
                            i11 = R.color.colorGreen;
                        } else {
                            i11 = R.color.colorRed;
                        }
                        textView2.setTextColor(context2.getColor(i11));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ad holder4 = (ad) f0Var;
                Intrinsics.echo(holder4, "holder");
                p1 p1Var = holder4.alpha;
                if (p1Var != null) {
                    p1Var.romeo((WithdrawTransaction) this.alpha.get(i4));
                    p1Var.f598g.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.ac
                        public final /* synthetic */ Hc.b purple;

                        {
                            this.purple = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    Hc.b bVar = this.purple;
                                    WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) bVar.delta;
                                    if (withDrawHistoryFragment != null) {
                                        Object obj2 = bVar.alpha.get(i4);
                                        Intrinsics.delta(obj2, "get(...)");
                                        WithdrawTransaction withdrawTransaction = (WithdrawTransaction) obj2;
                                        Context context3 = withDrawHistoryFragment.getContext();
                                        if (context3 != null) {
                                            String string = withDrawHistoryFragment.getString(R.string.alert);
                                            Intrinsics.delta(string, "getString(...)");
                                            String string2 = withDrawHistoryFragment.getString(R.string.confirm_cancel_withdraw_msg);
                                            Intrinsics.delta(string2, "getString(...)");
                                            String string3 = withDrawHistoryFragment.getString(R.string.cancel_request);
                                            Intrinsics.delta(string3, "getString(...)");
                                            L9.d.olive(context3, string, string2, string3, new Ac.g(27, withdrawTransaction, withDrawHistoryFragment), withDrawHistoryFragment.getString(R.string.dont_cancel_request), null, 96);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    Hc.b bVar2 = this.purple;
                                    InterfaceC3312f interfaceC3312f = bVar2.bravo;
                                    if (interfaceC3312f != null) {
                                        ArrayList arrayList = bVar2.alpha;
                                        int i15 = i4;
                                        Object obj3 = arrayList.get(i15);
                                        Intrinsics.delta(obj3, "get(...)");
                                        Intrinsics.checkNotNull(view);
                                        interfaceC3312f.black(view, i15, obj3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    p1Var.red.setOnClickListener(new View.OnClickListener(this) { // from class: Wc.ac
                        public final /* synthetic */ Hc.b purple;

                        {
                            this.purple = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    Hc.b bVar = this.purple;
                                    WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) bVar.delta;
                                    if (withDrawHistoryFragment != null) {
                                        Object obj2 = bVar.alpha.get(i4);
                                        Intrinsics.delta(obj2, "get(...)");
                                        WithdrawTransaction withdrawTransaction = (WithdrawTransaction) obj2;
                                        Context context3 = withDrawHistoryFragment.getContext();
                                        if (context3 != null) {
                                            String string = withDrawHistoryFragment.getString(R.string.alert);
                                            Intrinsics.delta(string, "getString(...)");
                                            String string2 = withDrawHistoryFragment.getString(R.string.confirm_cancel_withdraw_msg);
                                            Intrinsics.delta(string2, "getString(...)");
                                            String string3 = withDrawHistoryFragment.getString(R.string.cancel_request);
                                            Intrinsics.delta(string3, "getString(...)");
                                            L9.d.olive(context3, string, string2, string3, new Ac.g(27, withdrawTransaction, withDrawHistoryFragment), withDrawHistoryFragment.getString(R.string.dont_cancel_request), null, 96);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                default:
                                    Hc.b bVar2 = this.purple;
                                    InterfaceC3312f interfaceC3312f = bVar2.bravo;
                                    if (interfaceC3312f != null) {
                                        ArrayList arrayList = bVar2.alpha;
                                        int i15 = i4;
                                        Object obj3 = arrayList.get(i15);
                                        Intrinsics.delta(obj3, "get(...)");
                                        Intrinsics.checkNotNull(view);
                                        interfaceC3312f.black(view, i15, obj3);
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                C1836a holder5 = (C1836a) f0Var;
                Intrinsics.echo(holder5, "holder");
                Object obj2 = this.alpha.get(i4);
                Intrinsics.delta(obj2, "get(...)");
                Trophy trophy = (Trophy) obj2;
                ab abVar = holder5.alpha;
                ((LinearProgressIndicator) abVar.white).setProgress(Zd.a.charlie(trophy.getCaptainProgress()));
                LinearLayout linearLayout = (LinearLayout) abVar.purple;
                ((TextView) abVar.silver).setText(linearLayout.getContext().getString(R.string.trophy_progress_label, Integer.valueOf(Zd.a.charlie(trophy.getCaptainProgress()))));
                ((TextView) abVar.red).setText(trophy.localizedTitle());
                ShapeableImageView shapeableImageView = (ShapeableImageView) abVar.teal;
                ((j) ((j) com.bumptech.glide.b.foxtrot(shapeableImageView).quebec(trophy.localizedImage()).bravo()).lima(R.drawable.img_place_holder)).azure(shapeableImageView);
                linearLayout.setOnClickListener(new k(8, holder5.bravo, trophy));
                return;
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(parent, "parent");
                View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_attachent, parent, false);
                int i5 = R.id.btnDeleteSelection;
                ImageButton imageButton = (ImageButton) S3.bravo(R.id.btnDeleteSelection, inflate);
                if (imageButton != null) {
                    i5 = R.id.image;
                    ImageView imageView = (ImageView) S3.bravo(R.id.image, inflate);
                    if (imageView != null) {
                        return new a(new C1915c((ConstraintLayout) inflate, imageButton, imageView, 8));
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
            case 1:
                Intrinsics.echo(parent, "parent");
                View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_captain_comment_attachment, parent, false);
                int i10 = R.id.btnDeleteSelection;
                ImageButton imageButton2 = (ImageButton) S3.bravo(R.id.btnDeleteSelection, inflate2);
                if (imageButton2 != null) {
                    i10 = R.id.image;
                    ImageView imageView2 = (ImageView) S3.bravo(R.id.image, inflate2);
                    if (imageView2 != null) {
                        return new Oc.a(new t((ConstraintLayout) inflate2, imageButton2, imageView2));
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i10)));
            case 2:
                Intrinsics.echo(parent, "parent");
                return new Rb.a(U2.charlie(parent, R.layout.row_pick_up_place));
            case 3:
                Intrinsics.echo(parent, "parent");
                return new ad(U2.charlie(parent, R.layout.row_withdraw_item));
            default:
                Intrinsics.echo(parent, "parent");
                View inflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_trophy, parent, false);
                int i11 = R.id.lpi_trophy_progress;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) S3.bravo(R.id.lpi_trophy_progress, inflate3);
                if (linearProgressIndicator != null) {
                    i11 = R.id.siv_trophy_icon;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) S3.bravo(R.id.siv_trophy_icon, inflate3);
                    if (shapeableImageView != null) {
                        i11 = R.id.tv_days_count;
                        TextView textView = (TextView) S3.bravo(R.id.tv_days_count, inflate3);
                        if (textView != null) {
                            i11 = R.id.tv_progress_label;
                            TextView textView2 = (TextView) S3.bravo(R.id.tv_progress_label, inflate3);
                            if (textView2 != null) {
                                return new C1836a(this, new ab((LinearLayout) inflate3, linearProgressIndicator, shapeableImageView, textView, textView2));
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i11)));
        }
    }

    public /* synthetic */ b(int i4, Object obj) {
        this.charlie = i4;
        this.delta = obj;
    }
}
