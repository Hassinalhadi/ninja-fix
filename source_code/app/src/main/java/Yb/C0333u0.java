package Yb;

import com.app.network.network.models.Order;
import com.app.network.network.models.OrderTask;
import com.app.network.network.models.Receipt;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Yb.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0333u0 {
    public final /* synthetic */ ProcessOrderActivityV2 alpha;

    public /* synthetic */ C0333u0(ProcessOrderActivityV2 processOrderActivityV2) {
        this.alpha = processOrderActivityV2;
    }

    public String alpha() {
        return androidx.appcompat.widget.P0.crimson(this.alpha.getPackageName(), ".provider");
    }

    public E9.b bravo() {
        E9.b bVar = this.alpha.f12388I;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.lima("imagePreparer");
        throw null;
    }

    public E9.c charlie() {
        E9.c cVar = this.alpha.f12392K;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.lima("imageStorageProvider");
        throw null;
    }

    public String delta(int i4) {
        String string = this.alpha.getString(i4);
        Intrinsics.delta(string, "getString(...)");
        return string;
    }

    public boolean echo(OrderTask orderTask) {
        String str;
        String juliet = L9.d.juliet(this.alpha, orderTask.generateImageId());
        if (juliet == null || !new File(juliet).exists()) {
            Receipt receipt = orderTask.getReceipt();
            if (receipt != null) {
                str = receipt.getUrl();
            } else {
                str = null;
            }
            if (str == null) {
                return false;
            }
        }
        return true;
    }

    public void foxtrot(OrderTask orderTask, Order order, Function1 function1, Function1 function12) {
        Intrinsics.echo(order, "order");
        C0336w c0336w = new C0336w();
        c0336w.f2439u = orderTask;
        c0336w.f2440v = function1;
        c0336w.f2441w = function12;
        c0336w.f14101q = true;
        c0336w.romeo(this.alpha.getSupportFragmentManager(), null);
    }

    public void golf() {
        ProcessOrderActivityV2 processOrderActivityV2 = this.alpha;
        C0322o0 c0322o0 = new C0322o0(processOrderActivityV2, 15);
        C0322o0 c0322o02 = new C0322o0(processOrderActivityV2, 16);
        I0 i02 = new I0();
        i02.f2329p = c0322o0;
        i02.f2330q = c0322o02;
        i02.f2331r = true;
        i02.romeo(processOrderActivityV2.getSupportFragmentManager(), "ScanQrCodeSheet");
    }
}
