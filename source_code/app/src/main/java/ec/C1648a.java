package ec;

import Gb.k;
import Gb.l;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.ax;
import com.app.network.network.models.EnvelopNotification;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import x9.InterfaceC3312f;

/* renamed from: ec.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1648a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ Serializable silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ C1648a(l lVar, EnvelopNotification envelopNotification, int i4, k kVar) {
        this.alpha = 2;
        this.purple = lVar;
        this.silver = envelopNotification;
        this.red = i4;
        this.teal = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4;
        int i5;
        switch (this.alpha) {
            case 0:
                Context context = (Context) this.purple;
                Intrinsics.echo(context, "context");
                SharedPreferences.Editor edit = context.getSharedPreferences("on_demand_intro", 0).edit();
                String str = "shown_window_for_order_" + this.red;
                Integer num = (Integer) this.silver;
                if (num != null) {
                    i4 = num.intValue();
                } else {
                    i4 = -1;
                }
                edit.putInt(str, i4).apply();
                ((ax) this.teal).setValue(null);
                return Unit.INSTANCE;
            case 1:
                Context context2 = (Context) this.purple;
                Intrinsics.echo(context2, "context");
                SharedPreferences.Editor edit2 = context2.getSharedPreferences("on_demand_intro", 0).edit();
                String str2 = "shown_window_for_order_" + this.red;
                Integer num2 = (Integer) this.silver;
                if (num2 != null) {
                    i5 = num2.intValue();
                } else {
                    i5 = -1;
                }
                edit2.putInt(str2, i5).apply();
                ((ax) this.teal).setValue(null);
                return Unit.INSTANCE;
            default:
                InterfaceC3312f interfaceC3312f = ((l) this.purple).bravo;
                if (interfaceC3312f != null) {
                    interfaceC3312f.black(((k) this.teal).alpha, this.red, (EnvelopNotification) this.silver);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1648a(Context context, int i4, Integer num, ax axVar, int i5) {
        this.alpha = i5;
        this.purple = context;
        this.red = i4;
        this.silver = num;
        this.teal = axVar;
    }
}
