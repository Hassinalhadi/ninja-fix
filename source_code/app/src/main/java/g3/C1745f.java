package g3;

import Yb.C0331t0;
import android.content.Context;
import ge.InterfaceC1775g;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1745f {
    public static final C1745f alpha = new Object();

    public final C1743d alpha(Context context) {
        Intrinsics.echo(context, "context");
        Iterator it = CollectionsKt.listOf(new C0331t0(1, this, C1745f.class, "ruleApproximateOnly", "ruleApproximateOnly(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 7), new C0331t0(1, this, C1745f.class, "ruleNoPermission", "ruleNoPermission(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 8), new C0331t0(1, this, C1745f.class, "ruleFineRequired", "ruleFineRequired(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 9), new C0331t0(1, this, C1745f.class, "ruleBackgroundPermission29Plus", "ruleBackgroundPermission29Plus(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 10), new C0331t0(1, this, C1745f.class, "ruleBackgroundAccessLevel31Plus", "ruleBackgroundAccessLevel31Plus(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 11), new C0331t0(1, this, C1745f.class, "ruleForegroundServiceLocation34Plus", "ruleForegroundServiceLocation34Plus(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 12), new C0331t0(1, this, C1745f.class, "ruleSystemLocationEnabled", "ruleSystemLocationEnabled(Landroid/content/Context;)Lcom/app/core/location/LocationComplianceChecker$Failure;", 0, 13)).iterator();
        while (it.hasNext()) {
            C1744e c1744e = (C1744e) ((Function1) ((InterfaceC1775g) it.next())).invoke(context);
            if (c1744e != null) {
                return new C1743d(false, ArraysKt.b(new u[]{c1744e.alpha}), c1744e.bravo);
            }
        }
        return new C1743d(true, CollectionsKt.emptyList(), null);
    }
}
