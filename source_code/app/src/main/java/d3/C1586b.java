package d3;

import Jb.W;
import android.os.Handler;
import android.os.Looper;
import ao.ad;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;
import z9.C3488e;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1586b implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ k purple;
    public final /* synthetic */ String red;

    public /* synthetic */ C1586b(k kVar, String str, int i4) {
        this.alpha = i4;
        this.purple = kVar;
        this.red = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                k kVar = this.purple;
                kVar.white.remove(this.red);
                if (!kVar.white.isEmpty()) {
                    new Handler(Looper.getMainLooper()).postDelayed(new W(kVar, 2), 150L);
                } else {
                    C3462a.alpha("ALLOCATION_QUEUE", 12, "[DONE] Queue empty", null);
                    if (!kVar.yellow.isEmpty()) {
                        new Handler(Looper.getMainLooper()).postDelayed(new W(kVar, 3), 150L);
                    }
                }
                return Unit.INSTANCE;
            default:
                k kVar2 = this.purple;
                if (L9.d.sierra(((z9.j) kVar2.quebec()).alpha) == null) {
                    kVar2.f12054t = false;
                    return Unit.INSTANCE;
                }
                C3488e mike = kVar2.mike();
                String string = kVar2.getString(R.string.app_name);
                Intrinsics.delta(string, "getString(...)");
                StringBuilder beige = ad.beige(kVar2.getString(R.string.delete_fake_gps_apps_message), " :\n");
                beige.append(this.red);
                String sb2 = beige.toString();
                String string2 = kVar2.getString(R.string.ok_message);
                Intrinsics.delta(string2, "getString(...)");
                com.google.android.material.datepicker.j.uniform(mike, kVar2, string, sb2, string2, new X9.l(kVar2, 2));
                return Unit.INSTANCE;
        }
    }
}
