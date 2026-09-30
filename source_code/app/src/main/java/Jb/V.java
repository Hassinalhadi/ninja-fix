package Jb;

import android.content.Context;
import androidx.compose.runtime.t0;
import com.app.base.BaseViewModel;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.homev2.HomeViewModelV2;
import delivery.samurai.android.ui.homev2.OrdersFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;
import z3.C3462a;

/* loaded from: classes2.dex */
public final /* synthetic */ class V implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ V(long j5, int i4, Object obj) {
        this.alpha = i4;
        this.red = obj;
        this.purple = j5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                C2492a c2492a = (C2492a) obj;
                int i4 = c2492a.alpha;
                OrdersFragmentV2 ordersFragmentV2 = (OrdersFragmentV2) this.red;
                long j5 = this.purple;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ordersFragmentV2.kilo().bronze();
                        }
                    } else {
                        if (j5 != ordersFragmentV2.f12314v.purple) {
                            return Unit.INSTANCE;
                        }
                        ordersFragmentV2.kilo().tango();
                        d3.k kilo = ordersFragmentV2.kilo();
                        S s3 = new S(ordersFragmentV2, 7);
                        BaseViewModel black = kilo.black();
                        if (black != null) {
                            BaseViewModel.launchApi$default(black, null, new d3.j(kilo, s3, null), 1, null);
                        }
                        Context context = ordersFragmentV2.getContext();
                        if (context != null) {
                            String string = ordersFragmentV2.getString(R.string.status_changed);
                            Intrinsics.delta(string, "getString(...)");
                            L9.d.pink(context, string);
                        }
                        HomeViewModelV2 whiskey = ordersFragmentV2.whiskey();
                        String romeo = L9.d.romeo(whiskey.alpha);
                        if (romeo != null && !StringsKt.gray(romeo)) {
                            BaseViewModel.launchApi$default(whiskey, null, new M(whiskey, romeo, null), 1, null);
                        } else {
                            C3462a.alpha("API", 12, "updateDevice skipped: installation UUID is null or blank", null);
                        }
                        ordersFragmentV2.beige();
                    }
                } else {
                    Nb.i iVar = ordersFragmentV2.f12314v;
                    if (j5 != iVar.purple) {
                        return Unit.INSTANCE;
                    }
                    Boolean bool = Boolean.FALSE;
                    yf.N n5 = (yf.N) iVar.red;
                    n5.getClass();
                    n5.juliet(null, bool);
                    iVar.teal = null;
                    ordersFragmentV2.kilo().tango();
                    Context context2 = ordersFragmentV2.getContext();
                    if (context2 != null) {
                        String str = c2492a.bravo;
                        if (str == null) {
                            str = ordersFragmentV2.getString(R.string.error_on_changing_status);
                            Intrinsics.delta(str, "getString(...)");
                        }
                        L9.d.pink(context2, str);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                c0.d dVar = (c0.d) obj;
                n.ax axVar = (n.ax) this.red;
                if (((Boolean) ((t0) axVar.sierra).getValue()).booleanValue() || ((Boolean) ((t0) axVar.tango).getValue()).booleanValue()) {
                    ao.ad.november(dVar, this.purple, 0L, 0L, 0.0f, null, 126);
                }
                return Unit.INSTANCE;
            default:
                Throwable err = (Throwable) obj;
                Intrinsics.echo(err, "err");
                p3.ab abVar = (p3.ab) this.red;
                abVar.alpha.charlie.alpha("LocationFlow", "[WARMUP_SEND_FAILED] Controller#" + abVar.juliet + " Warmup send failed seq=" + this.purple + " error=" + err.getMessage());
                return Unit.INSTANCE;
        }
    }
}
