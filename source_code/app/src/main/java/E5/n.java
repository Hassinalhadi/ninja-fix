package E5;

import bd.ExecutorC0752e;
import com.checkout.components.card.operations.network.utils.OkHttpConstants;
import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import r6.u;

/* loaded from: classes3.dex */
public final class n implements G5.b {
    public final /* synthetic */ int alpha;

    @Override // Kd.a
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return new ExecutorC0752e(Executors.newSingleThreadExecutor());
            default:
                u uVar = new u(6);
                HashMap hashMap = new HashMap();
                B5.d dVar = B5.d.alpha;
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(dVar, new K5.c(OkHttpConstants.READ_TIMEOUT_MS, Constants.ONE_DAY_IN_MILLIS, set));
                    B5.d dVar2 = B5.d.red;
                    if (set != null) {
                        hashMap.put(dVar2, new K5.c(1000L, Constants.ONE_DAY_IN_MILLIS, set));
                        B5.d dVar3 = B5.d.purple;
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(K5.e.purple)));
                            if (unmodifiableSet != null) {
                                hashMap.put(dVar3, new K5.c(Constants.ONE_DAY_IN_MILLIS, Constants.ONE_DAY_IN_MILLIS, unmodifiableSet));
                                if (hashMap.keySet().size() >= B5.d.values().length) {
                                    new HashMap();
                                    return new K5.b(uVar, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
        }
    }
}
