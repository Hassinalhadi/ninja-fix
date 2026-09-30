package zf;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xf.EnumC3340a;
import yf.az;

/* renamed from: zf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3511a {
    public c[] alpha;
    public int purple;
    public int red;
    public ad silver;

    public final c charlie() {
        c cVar;
        ad adVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.alpha;
                if (cVarArr == null) {
                    cVarArr = echo();
                    this.alpha = cVarArr;
                } else if (this.purple >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    Intrinsics.delta(copyOf, "copyOf(...)");
                    this.alpha = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i4 = this.red;
                do {
                    cVar = cVarArr[i4];
                    if (cVar == null) {
                        cVar = delta();
                        cVarArr[i4] = cVar;
                    }
                    i4++;
                    if (i4 >= cVarArr.length) {
                        i4 = 0;
                    }
                } while (!cVar.alpha(this));
                this.red = i4;
                this.purple++;
                adVar = this.silver;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (adVar != null) {
            adVar.uniform(1);
        }
        return cVar;
    }

    public abstract c delta();

    public abstract c[] echo();

    public final void foxtrot(c cVar) {
        ad adVar;
        int i4;
        Nd.c[] bravo;
        synchronized (this) {
            try {
                int i5 = this.purple - 1;
                this.purple = i5;
                adVar = this.silver;
                if (i5 == 0) {
                    this.red = 0;
                }
                Intrinsics.charlie(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                bravo = cVar.bravo(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Nd.c cVar2 : bravo) {
            if (cVar2 != null) {
                Result.Companion companion = Result.INSTANCE;
                cVar2.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
            }
        }
        if (adVar != null) {
            adVar.uniform(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [yf.az, zf.ad] */
    public final ad golf() {
        ad adVar;
        synchronized (this) {
            ad adVar2 = this.silver;
            adVar = adVar2;
            if (adVar2 == null) {
                int i4 = this.purple;
                ?? azVar = new az(1, LottieConstants.IterateForever, EnumC3340a.purple);
                azVar.alpha(Integer.valueOf(i4));
                this.silver = azVar;
                adVar = azVar;
            }
        }
        return adVar;
    }
}
