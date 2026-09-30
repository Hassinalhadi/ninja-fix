package na;

import B9.ab;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d3.C1586b;
import dagger.hilt.android.AndroidEntryPoint;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lna/c;", "Lx9/c;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: u, reason: collision with root package name */
    public C1586b f13104u;

    /* renamed from: v, reason: collision with root package name */
    public X9.l f13105v;

    /* renamed from: x, reason: collision with root package name */
    public final ab f13107x;

    /* renamed from: y, reason: collision with root package name */
    private int f13108y;

    /* renamed from: z, reason: collision with root package name */
    private long f13109z;

    /* renamed from: t, reason: collision with root package name */
    public String f13103t = "";

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13106w = true;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(136, c.class);
        Hidden0.special_clinit_136_00(c.class);
    }

    public c() {
        Lazy alpha = LazyKt.alpha(kotlin.i.purple, new je.ab(19, new je.ab(18, this)));
        this.f13107x = new ab(kotlin.jvm.internal.u.alpha.bravo(OrdersViewModel.class), new ga.ab(alpha, 14), new Xa.f(23, this, alpha), new ga.ab(alpha, 15));
    }

    public native void Archers_Autobids_Fast(Double d4, Double d9, Double d10);

    public final native OrdersViewModel azure();

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w
    public final native Dialog mike(Bundle bundle);

    @Override // androidx.fragment.app.ai
    public final native void onActivityCreated(Bundle bundle);

    @Override // x9.AbstractC3309c, androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.ai
    public final native View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, android.content.DialogInterface.OnDismissListener
    public final native void onDismiss(DialogInterface dialogInterface);

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w, androidx.fragment.app.ai
    public final native void onStart();

    @Override // x9.AbstractC3309c, androidx.fragment.app.ai
    public final native void onViewCreated(View view, Bundle bundle);

    @Override // x9.AbstractC3309c
    public final native boolean uniform();

    @Override // x9.AbstractC3309c
    public final native void yankee();
}
