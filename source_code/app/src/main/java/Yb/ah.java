package Yb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.app.network.network.models.OrderAddress;
import com.app.network.network.models.OrderTask;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class ah implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ OrderTask purple;
    public final /* synthetic */ Context red;

    public /* synthetic */ ah(OrderTask orderTask, Context context, int i4) {
        this.alpha = i4;
        this.purple = orderTask;
        this.red = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String phone;
        Context context = this.red;
        OrderTask orderTask = this.purple;
        switch (this.alpha) {
            case 0:
                OrderAddress address = orderTask.getAddress();
                if (address != null) {
                    Float latitude = address.getLatitude();
                    Intrinsics.checkNotNull(latitude);
                    Float longitude = address.getLongitude();
                    Intrinsics.checkNotNull(longitude);
                    L9.d.bronze(context, latitude, longitude);
                }
                return Unit.INSTANCE;
            case 1:
                OrderAddress address2 = orderTask.getAddress();
                if (address2 != null) {
                    Float latitude2 = address2.getLatitude();
                    Intrinsics.checkNotNull(latitude2);
                    Float longitude2 = address2.getLongitude();
                    Intrinsics.checkNotNull(longitude2);
                    L9.d.bronze(context, latitude2, longitude2);
                }
                return Unit.INSTANCE;
            default:
                OrderAddress address3 = orderTask.getAddress();
                if (address3 != null && (phone = address3.getPhone()) != null) {
                    AtomicInteger atomicInteger = L9.d.alpha;
                    Intrinsics.echo(context, "<this>");
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(phone)));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    L9.d.orange(context, intent, 6);
                }
                return Unit.INSTANCE;
        }
    }
}
