package Yb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t6.AbstractC3041p2;
import t6.AbstractC3046q2;

/* loaded from: classes2.dex */
public final /* synthetic */ class al implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2347a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0329s0 f2348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f2349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Xd.l f2350d;
    public final /* synthetic */ Function1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Long f2352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f2353h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f2354i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f2355j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2356k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2357l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2358m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2359n;
    public final /* synthetic */ OrderTask purple;
    public final /* synthetic */ Order red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Map white;
    public final /* synthetic */ boolean yellow;

    public /* synthetic */ al(OrderTask orderTask, Order order, int i4, int i5, Map map, boolean z2, boolean z10, C0329s0 c0329s0, Set set, Xd.l lVar, Function1 function1, Function1 function12, Integer num, int i10, Long l10, double d4, double d9, Function0 function0, int i11, int i12) {
        this.purple = orderTask;
        this.red = order;
        this.silver = i4;
        this.teal = i5;
        this.white = map;
        this.yellow = z2;
        this.f2347a = z10;
        this.f2348b = c0329s0;
        this.f2349c = set;
        this.f2350d = lVar;
        this.e = function1;
        this.f2358m = function12;
        this.f2359n = num;
        this.f2351f = i10;
        this.f2352g = l10;
        this.f2353h = d4;
        this.f2354i = d9;
        this.f2355j = function0;
        this.f2356k = i11;
        this.f2357l = i12;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.f2356k | 1);
                int cyan2 = C0564b.cyan(this.f2357l);
                OrderTask orderTask = this.purple;
                Order order = this.red;
                double d4 = this.f2354i;
                Function0 function0 = this.f2355j;
                AbstractC3041p2.bravo(orderTask, order, (List) this.f2358m, this.silver, this.teal, this.white, this.yellow, this.f2347a, this.f2348b, this.e, (T.s) this.f2359n, this.f2349c, this.f2350d, this.f2351f, this.f2352g, this.f2353h, d4, function0, (InterfaceC0581m) obj, cyan, cyan2);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.f2356k | 1);
                int cyan4 = C0564b.cyan(this.f2357l);
                OrderTask orderTask2 = this.purple;
                Order order2 = this.red;
                T.p pVar = T.p.alpha;
                double d9 = this.f2354i;
                Function0 function02 = this.f2355j;
                AbstractC3046q2.alpha(orderTask2, order2, this.silver, this.teal, this.white, this.yellow, this.f2347a, this.f2348b, pVar, this.f2349c, this.f2350d, this.e, (Function1) this.f2358m, (Integer) this.f2359n, this.f2351f, this.f2352g, this.f2353h, d9, function02, (InterfaceC0581m) obj, cyan3, cyan4);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ al(OrderTask orderTask, Order order, List list, int i4, int i5, Map map, boolean z2, boolean z10, C0329s0 c0329s0, Function1 function1, T.s sVar, Set set, Xd.l lVar, int i10, Long l10, double d4, double d9, Function0 function0, int i11, int i12) {
        this.purple = orderTask;
        this.red = order;
        this.f2358m = list;
        this.silver = i4;
        this.teal = i5;
        this.white = map;
        this.yellow = z2;
        this.f2347a = z10;
        this.f2348b = c0329s0;
        this.e = function1;
        this.f2359n = sVar;
        this.f2349c = set;
        this.f2350d = lVar;
        this.f2351f = i10;
        this.f2352g = l10;
        this.f2353h = d4;
        this.f2354i = d9;
        this.f2355j = function0;
        this.f2356k = i11;
        this.f2357l = i12;
    }
}
