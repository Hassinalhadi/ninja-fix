package delivery.samurai.android.ui.orders.v2;

import B9.ab;
import E9.b;
import E9.c;
import E9.d;
import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import S.t;
import Yb.C0322o0;
import Yb.C0329s0;
import Yb.C0333u0;
import Yb.C0335v0;
import Yb.S;
import Yb.ag;
import Yb.w0;
import a4.s;
import ah.a;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import com.app.base.BaseViewModel;
import com.app.feature.location.LocationBroadcastConfig;
import com.app.feature.location.store.LastSentLocationStore;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.TaskStatus;
import d3.k;
import dagger.hilt.android.AndroidEntryPoint;
import dc.C1608a;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.allocation.OrdersViewModel;
import delivery.samurai.android.ui.orders.note.vm.AllAddressNoteViewModel;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import kotlin.text.StringsKt;
import q3.g;
import s6.L5;
import vf.Y;

/* compiled from: Dex2C */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ldelivery/samurai/android/ui/orders/v2/ProcessOrderActivityV2;", "Ld3/k;", "", "<init>", "()V", "U8/a", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@AndroidEntryPoint
/* loaded from: classes.dex */
public final class ProcessOrderActivityV2 extends k {

    /* renamed from: N0, reason: collision with root package name */
    public static final int f12378N0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public final ax f12379A0;

    /* renamed from: B0, reason: collision with root package name */
    public final ax f12380B0;

    /* renamed from: C0, reason: collision with root package name */
    public final t f12381C0;

    /* renamed from: D0, reason: collision with root package name */
    public final t f12382D0;

    /* renamed from: E0, reason: collision with root package name */
    public final LinkedHashMap f12383E0;

    /* renamed from: F0, reason: collision with root package name */
    public final C0329s0 f12384F0;

    /* renamed from: G0, reason: collision with root package name */
    public final C0329s0 f12385G0;

    /* renamed from: H, reason: collision with root package name */
    public boolean f12386H = false;

    /* renamed from: H0, reason: collision with root package name */
    public final C0333u0 f12387H0;

    /* renamed from: I, reason: collision with root package name */
    public b f12388I;

    /* renamed from: I0, reason: collision with root package name */
    public final ah.b f12389I0;

    /* renamed from: J, reason: collision with root package name */
    public d f12390J;

    /* renamed from: J0, reason: collision with root package name */
    public final ah.b f12391J0;

    /* renamed from: K, reason: collision with root package name */
    public c f12392K;

    /* renamed from: K0, reason: collision with root package name */
    public final C0329s0 f12393K0;

    /* renamed from: L, reason: collision with root package name */
    public LastSentLocationStore f12394L;

    /* renamed from: L0, reason: collision with root package name */
    public final C0335v0 f12395L0;

    /* renamed from: M, reason: collision with root package name */
    public LocationBroadcastConfig f12396M;

    /* renamed from: M0, reason: collision with root package name */
    public final C0335v0 f12397M0;

    /* renamed from: N, reason: collision with root package name */
    public C1608a f12398N;

    /* renamed from: O, reason: collision with root package name */
    public g f12399O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f12400P;
    public AlertDialog Q;

    /* renamed from: R, reason: collision with root package name */
    public List f12401R;

    /* renamed from: S, reason: collision with root package name */
    public final ax f12402S;

    /* renamed from: T, reason: collision with root package name */
    public final ax f12403T;

    /* renamed from: U, reason: collision with root package name */
    public final C0333u0 f12404U;

    /* renamed from: V, reason: collision with root package name */
    public final Lazy f12405V;

    /* renamed from: W, reason: collision with root package name */
    public final ah.b f12406W;

    /* renamed from: X, reason: collision with root package name */
    public final ax f12407X;

    /* renamed from: Y, reason: collision with root package name */
    public Y f12408Y;

    /* renamed from: Z, reason: collision with root package name */
    public OrderTask f12409Z;

    /* renamed from: a0, reason: collision with root package name */
    public OrderTask f12410a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Lazy f12411b0;

    /* renamed from: c0, reason: collision with root package name */
    public L5 f12412c0;

    /* renamed from: d0, reason: collision with root package name */
    public final ah.b f12413d0;

    /* renamed from: e0, reason: collision with root package name */
    public final ah.b f12414e0;

    /* renamed from: f0, reason: collision with root package name */
    public final ah.b f12415f0;

    /* renamed from: g0, reason: collision with root package name */
    public final ah.b f12416g0;

    /* renamed from: h0, reason: collision with root package name */
    public final ah.b f12417h0;

    /* renamed from: i0, reason: collision with root package name */
    public Order f12418i0;

    /* renamed from: j0, reason: collision with root package name */
    public OrderTask f12419j0;

    /* renamed from: k0, reason: collision with root package name */
    public String f12420k0;

    /* renamed from: l0, reason: collision with root package name */
    public CountDownTimer f12421l0;

    /* renamed from: m0, reason: collision with root package name */
    public final ax f12422m0;

    /* renamed from: n0, reason: collision with root package name */
    public final ax f12423n0;

    /* renamed from: o0, reason: collision with root package name */
    public final ax f12424o0;

    /* renamed from: p0, reason: collision with root package name */
    public final ax f12425p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f12426q0;

    /* renamed from: r0, reason: collision with root package name */
    public final SnapshotStateSet f12427r0;

    /* renamed from: s0, reason: collision with root package name */
    public final ax f12428s0;

    /* renamed from: t0, reason: collision with root package name */
    public final ax f12429t0;

    /* renamed from: u0, reason: collision with root package name */
    public final ab f12430u0;
    public final ab v0;

    /* renamed from: w0, reason: collision with root package name */
    public final ax f12431w0;

    /* renamed from: x0, reason: collision with root package name */
    public final ax f12432x0;

    /* renamed from: y0, reason: collision with root package name */
    public final ax f12433y0;

    /* renamed from: z0, reason: collision with root package name */
    public final ax f12434z0;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(129, ProcessOrderActivityV2.class);
        Hidden0.special_clinit_129_00(ProcessOrderActivityV2.class);
    }

    public ProcessOrderActivityV2() {
        final int i4 = 0;
        addOnContextAvailableListener(new Eb.b(this, 21));
        this.f12401R = CollectionsKt.emptyList();
        Boolean bool = Boolean.FALSE;
        this.f12402S = C0564b.zulu(bool);
        this.f12403T = C0564b.zulu(bool);
        this.f12404U = new C0333u0(this);
        this.f12405V = LazyKt.lazy(new C0322o0(this, 12));
        final int i5 = 7;
        final int i10 = 4;
        this.f12406W = registerForActivityResult(new s(i5), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i10) {
                    case 0:
                        int i11 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i12 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i13 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i14 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i15 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12407X = C0564b.zulu(null);
        this.f12411b0 = LazyKt.lazy(new C0322o0(this, 14));
        final int i11 = 5;
        this.f12413d0 = registerForActivityResult(new s(i10), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i11) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i12 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i13 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i14 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i15 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i12 = 6;
        this.f12414e0 = registerForActivityResult(new s(i10), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i12) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i122 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i13 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i14 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i15 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12415f0 = registerForActivityResult(new s(i5), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i5) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i122 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i13 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i14 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i15 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12416g0 = registerForActivityResult(new s(i11), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i4) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i122 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i13 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i14 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i15 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        final int i13 = 1;
        this.f12417h0 = registerForActivityResult(new s(i11), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i13) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i122 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i132 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i14 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i15 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12422m0 = C0564b.zulu("00:00:00");
        this.f12423n0 = C0564b.zulu("");
        Double valueOf = Double.valueOf(0.0d);
        this.f12424o0 = C0564b.zulu(valueOf);
        this.f12425p0 = C0564b.zulu(valueOf);
        this.f12427r0 = new SnapshotStateSet();
        this.f12428s0 = C0564b.zulu(0);
        this.f12429t0 = C0564b.zulu(bool);
        w0 w0Var = new w0(this, i4);
        v vVar = u.alpha;
        final int i14 = 2;
        this.f12430u0 = new ab(vVar.bravo(OrdersViewModel.class), new w0(this, i13), w0Var, new w0(this, i14));
        final int i15 = 3;
        this.v0 = new ab(vVar.bravo(AllAddressNoteViewModel.class), new w0(this, i10), new w0(this, i15), new w0(this, i11));
        this.f12431w0 = C0564b.zulu(null);
        this.f12432x0 = C0564b.zulu(bool);
        this.f12433y0 = C0564b.zulu(null);
        this.f12434z0 = C0564b.zulu(null);
        this.f12379A0 = C0564b.zulu(null);
        this.f12380B0 = C0564b.zulu(bool);
        this.f12381C0 = new t();
        this.f12382D0 = new t();
        this.f12383E0 = new LinkedHashMap();
        this.f12384F0 = new C0329s0(this);
        this.f12385G0 = new C0329s0(this);
        this.f12387H0 = new C0333u0(this);
        this.f12389I0 = registerForActivityResult(new s(i4), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i14) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i122 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i132 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i142 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i152 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12391J0 = registerForActivityResult(new s(i10), new a(this) { // from class: Yb.h0
            public final /* synthetic */ ProcessOrderActivityV2 purple;

            {
                this.purple = this;
            }

            @Override // ah.a
            public final void charlie(Object obj) {
                String stringExtra;
                Integer id2;
                String str;
                Order order;
                List<OrderTask> tasks;
                Object obj2;
                String juliet;
                File file;
                File file2;
                boolean z2 = false;
                String str2 = null;
                ProcessOrderActivityV2 processOrderActivityV2 = this.purple;
                switch (i15) {
                    case 0:
                        int i112 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo((ActivityResult) obj, "result");
                        processOrderActivityV2.amber(false);
                        return;
                    case 1:
                        ActivityResult result = (ActivityResult) obj;
                        int i122 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result, "result");
                        ProcessOrderActivityV2 processOrderActivityV22 = this.purple;
                        if (result.alpha == -1) {
                            OrderTask orderTask = processOrderActivityV22.f12410a0;
                            Intent intent = result.purple;
                            if (orderTask != null) {
                                if (intent == null || (str = intent.getStringExtra("SCAN_RESULT")) == null) {
                                    if (intent != null) {
                                        str = intent.getStringExtra("SCAN_RESULT_B64");
                                    } else {
                                        str = null;
                                    }
                                    if (str == null) {
                                        return;
                                    }
                                }
                                processOrderActivityV22.f12410a0 = null;
                                Integer id3 = orderTask.getId();
                                if (id3 != null) {
                                    int intValue = id3.intValue();
                                    processOrderActivityV22.getSharedPreferences("on_demand_invoice_qr", 0).edit().putString("qr_for_task_" + intValue, str).apply();
                                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) processOrderActivityV22.f12428s0;
                                    t0Var.setValue(Integer.valueOf(((Number) t0Var.getValue()).intValue() + 1));
                                    return;
                                }
                                return;
                            }
                            if (intent != null && (stringExtra = intent.getStringExtra("SCAN_RESULT")) != null) {
                                OrderTask orderTask2 = processOrderActivityV22.f12409Z;
                                if (orderTask2 != null) {
                                    processOrderActivityV22.f12409Z = null;
                                    AtomicBoolean atomicBoolean = R9.k.bravo;
                                    R9.k.charlie(processOrderActivityV22, "AT_DESTINATION", processOrderActivityV22.november());
                                    Integer id4 = orderTask2.getId();
                                    if (id4 != null) {
                                        ProcessOrderActivityV2.peach(processOrderActivityV22, id4.intValue(), TaskStatus.AT_DESTINATION, null, stringExtra, null, 108);
                                        return;
                                    }
                                    return;
                                }
                                OrderTask orderTask3 = processOrderActivityV22.f12419j0;
                                if (orderTask3 != null && (id2 = orderTask3.getId()) != null) {
                                    ProcessOrderActivityV2.peach(processOrderActivityV22, id2.intValue(), TaskStatus.COMPLETED, null, stringExtra, null, 108);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV22.f12409Z = null;
                        processOrderActivityV22.f12410a0 = null;
                        return;
                    case 2:
                        a4.w result2 = (a4.w) obj;
                        int i132 = ProcessOrderActivityV2.f12378N0;
                        Intrinsics.echo(result2, "result");
                        Exception exc = result2.red;
                        if (exc == null) {
                            z2 = true;
                        }
                        if (z2) {
                            processOrderActivityV2.f12412c0 = null;
                            Uri uri = result2.purple;
                            if (uri != null && !processOrderActivityV2.isFinishing() && !processOrderActivityV2.isDestroyed() && (order = processOrderActivityV2.f12418i0) != null && (tasks = order.getTasks()) != null) {
                                Iterator<T> it = tasks.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (Intrinsics.areEqual(((OrderTask) obj2).generateImageId(), processOrderActivityV2.f12420k0)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                OrderTask orderTask4 = (OrderTask) obj2;
                                if (orderTask4 != null) {
                                    String str3 = processOrderActivityV2.f12420k0;
                                    if (str3 != null && (juliet = L9.d.juliet(processOrderActivityV2, str3)) != null) {
                                        File file3 = new File(juliet);
                                        if (!file3.exists()) {
                                            file3 = null;
                                        }
                                        if (file3 != null) {
                                            file3.delete();
                                        }
                                    }
                                    processOrderActivityV2.indigo().echo = orderTask4;
                                    S indigo = processOrderActivityV2.indigo();
                                    OrderTask orderTask5 = indigo.echo;
                                    if (orderTask5 != null) {
                                        J2.c cVar = indigo.alpha;
                                        if (!cVar.victor() && !cVar.uniform()) {
                                            C0333u0 c0333u0 = (C0333u0) cVar.purple;
                                            c0333u0.alpha.bronze();
                                            vf.Y y10 = indigo.foxtrot;
                                            if (y10 != null) {
                                                y10.foxtrot(null);
                                            }
                                            indigo.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u0.alpha), null, null, new Q(indigo, uri, orderTask5, null), 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        processOrderActivityV2.f12412c0 = null;
                        if (exc != null) {
                            str2 = exc.getMessage();
                        }
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (!StringsKt.beige(str2, "canceled", true) && !StringsKt.beige(str2, "cancelled", true) && !StringsKt.gray(str2)) {
                            L9.d.pink(processOrderActivityV2, str2);
                            return;
                        }
                        return;
                    case 3:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        int i142 = ProcessOrderActivityV2.f12378N0;
                        if (booleanValue) {
                            OrderTask orderTask6 = processOrderActivityV2.green().foxtrot;
                            if (orderTask6 != null) {
                                processOrderActivityV2.magenta(orderTask6);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_required), 0).show();
                        processOrderActivityV2.green().alpha();
                        return;
                    case 4:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        int i152 = ProcessOrderActivityV2.f12378N0;
                        ag green = processOrderActivityV2.green();
                        if (!booleanValue2) {
                            green.alpha();
                            return;
                        }
                        File file4 = green.bravo;
                        if (file4 != null && file4.exists() && file4.length() > 0) {
                            file = file4;
                        } else {
                            file = null;
                        }
                        C0333u0 c0333u02 = (C0333u0) green.alpha.purple;
                        if (file == null) {
                            String string = c0333u02.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(c0333u02.alpha, string);
                            green.alpha();
                            return;
                        }
                        I9.b.echo(file, "camera", "delivery_proof");
                        OrderTask orderTask7 = green.foxtrot;
                        if (orderTask7 != null && !c0333u02.alpha.isFinishing() && !c0333u02.alpha.isDestroyed()) {
                            c0333u02.alpha.bronze();
                            vf.Y y11 = green.golf;
                            if (y11 != null) {
                                y11.foxtrot(null);
                            }
                            green.golf = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u02.alpha), null, null, new ae(green, file, file, orderTask7, null), 3);
                            return;
                        }
                        return;
                    case 5:
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        L5 l52 = processOrderActivityV2.f12412c0;
                        if (l52 != null) {
                            l52.alpha(booleanValue3);
                            if (!booleanValue3) {
                                processOrderActivityV2.f12412c0 = null;
                                processOrderActivityV2.indigo().alpha();
                                return;
                            }
                            return;
                        }
                        if (booleanValue3) {
                            OrderTask orderTask8 = processOrderActivityV2.indigo().echo;
                            if (orderTask8 != null) {
                                processOrderActivityV2.maroon(orderTask8);
                                return;
                            }
                            return;
                        }
                        Toast.makeText(processOrderActivityV2, processOrderActivityV2.getString(R.string.camera_permission_denied_try_again), 0).show();
                        processOrderActivityV2.indigo().alpha();
                        return;
                    case 6:
                        boolean booleanValue4 = ((Boolean) obj).booleanValue();
                        L5 l53 = processOrderActivityV2.f12412c0;
                        if (l53 != null) {
                            l53.bravo(booleanValue4);
                            return;
                        }
                        return;
                    default:
                        boolean booleanValue5 = ((Boolean) obj).booleanValue();
                        int i16 = ProcessOrderActivityV2.f12378N0;
                        S indigo2 = processOrderActivityV2.indigo();
                        if (!booleanValue5) {
                            indigo2.alpha();
                            return;
                        }
                        File file5 = indigo2.bravo;
                        if (file5 != null && file5.exists() && file5.length() > 0) {
                            file2 = file5;
                        } else {
                            file2 = null;
                        }
                        J2.c cVar2 = indigo2.alpha;
                        C0333u0 c0333u03 = (C0333u0) cVar2.purple;
                        if (file2 == null) {
                            String string2 = c0333u03.alpha.getString(R.string.image_load_failed);
                            Intrinsics.delta(string2, "getString(...)");
                            L9.d.pink(c0333u03.alpha, string2);
                            indigo2.alpha();
                            return;
                        }
                        I9.b.echo(file2, "camera", "invoice");
                        OrderTask orderTask9 = indigo2.echo;
                        if (orderTask9 != null && !cVar2.victor() && !cVar2.uniform()) {
                            c0333u03.alpha.bronze();
                            vf.Y y12 = indigo2.foxtrot;
                            if (y12 != null) {
                                y12.foxtrot(null);
                            }
                            indigo2.foxtrot = vf.ad.zulu(androidx.lifecycle.T.foxtrot(c0333u03.alpha), null, null, new K(indigo2, file2, file2, orderTask9, null), 3);
                            return;
                        }
                        return;
                }
            }
        });
        this.f12393K0 = new C0329s0(this);
        this.f12395L0 = new C0335v0(this, i13);
        this.f12397M0 = new C0335v0(this, i4);
    }

    public static native /* synthetic */ void peach(ProcessOrderActivityV2 processOrderActivityV2, int i4, TaskStatus taskStatus, String str, String str2, File file, int i5);

    public final native void ArchersExpandDelivery();

    @Override // d3.k
    public final native void amber(boolean z2);

    @Override // d3.k
    public final native BaseViewModel black();

    @Override // d3.k
    public final native boolean blue();

    @Override // d3.q
    public final native void foxtrot();

    public final native void gold(OrderTask orderTask);

    public final native void gray();

    public final native ag green();

    public final native S indigo();

    public final native OrdersViewModel ivory();

    public final native void jade();

    public final native void lavender(Order order);

    public final native void lime();

    public final native void magenta(OrderTask orderTask);

    public final native void maroon(OrderTask orderTask);

    public final native void navy(int i4, TaskStatus taskStatus, String str, String str2, String str3, File file, String str4);

    public final native void ochre(OrderTask orderTask, TaskStatus taskStatus, File file);

    public final native void olive(Order order);

    @Override // d3.k, d3.q, androidx.fragment.app.an, ae.o, f1.i, android.app.Activity
    public final native void onCreate(Bundle bundle);

    @Override // d3.k, d3.q, androidx.appcompat.app.i, androidx.fragment.app.an, android.app.Activity
    public final native void onDestroy();

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onPause();

    @Override // d3.k, androidx.fragment.app.an, android.app.Activity
    public final native void onResume();

    public final native void orange(int i4, TaskStatus taskStatus, String str, String str2, String str3, File file, String str4);
}
