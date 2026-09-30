package com.incognia.internal;

import android.os.Looper;
import android.util.Log;
import com.incognia.RequestTokenStatus;
import com.incognia.RequestTokenWithStatus;
import h9.RunnableC1826d;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class EP {
    public static RequestTokenWithStatus b(String str, long j5, boolean z2) {
        if (!z2) {
            str = null;
        }
        try {
            if (Looper.getMainLooper().equals(Looper.myLooper())) {
                if (eSs.f10363b.get()) {
                    Log.e("Incognia", "You must not call this method from the main thread. Consider moving it to another thread or using the corresponding asynchronous method.");
                }
                return new RequestTokenWithStatus("AQEpJH0JsVaN_UZoh3MqdSwQHDqys1kr-rTqiQT9drBV0G63-eslAD17y-w8BHxb0l0Pizwukfibel9Wl_Q3J_I7MBf48I6PfgGxVAGmtYwbtQYkg9UTmnINRJJZIVgLxCVB6dLfPQL8VQE4XHhEs6YZCouKimFDTqVU6N3gc3B0SRmU3fRo_eHoee9HXF453T5DjaeNdJ5ymqiI7lRW1HZGrdbFQFUHjxTsMt7LIyQCcppFVgr1fETK2IsFHkbX6dgp46SnFLqRxW3a2yiXAgXdx_Qtk18DJSZWIgOwa4tzmHhgmr-q7FTfzHZc4gcmRQTJXzRANenQQDootdfPEY1CHhsAGxltpFMhmTcIcwHwsNAG_uK-u3zqtt_KrnEP0ECV8yOKsA1Da5kLAG2zHuMPOSfhS2g8Ni0hRUFZVesXX6ttc7CvOoFntWlGU3e0mvUtLBSgn_-F0cEG-agLCvA", RequestTokenStatus.TOKEN_CALL_SYNC_ON_MAIN_THREAD);
            }
            if (!rfS.b(str)) {
                ow owVar = (ow) DDS.f8521b.get();
                if (Intrinsics.areEqual(owVar, RXl.f9550b) ? true : Intrinsics.areEqual(owVar, d3Z.f10279b)) {
                    return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
                }
                if (Intrinsics.areEqual(owVar, f0.f10395b)) {
                    return new RequestTokenWithStatus("AZ92B1-cMXHtqzVE49Hp2UeYiSNNShBCODw0wwl62JCTPebIs-SSeBS7GzaYtlequkPKS-b1J8VzCz4UFSBkwMuNPr1yfwrifeHe2saKv6sO3HUBmth37t4AJ4rmIArTjI1ZYBHlP8614JukKE5djOQga4OrCdLOn38TIJ_aWC49XXqSaQvlFmkf92XccjQ1qZya7ow_xV9y4elxFoGVJDUtn7WAHNwm2WGi0dWDyXyz1S558qrzkykkkxyZ0CWIlIlNAo4IOxI06cvjCihlHByT-4xNr85qr3Kwz_s6SMZrGmlOLVt1TV6T8JLtpONyr62htaqInPf7M9WvtE2U6Eo4y4MDIE51lzZQM0QQV86gY3Fwhje9ZYWFmxA6SIxZ0r3jBf1MMeKcdqjccjBDf_i0jvBERsaItILWDBANhqnS9p7FuTPpvHp7cKKVPEmwCw", RequestTokenStatus.SDK_NOT_INITIALIZED);
                }
                return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
            }
            if (eSs.f10363b.get()) {
                Log.i("Incognia", "Generating request token");
            }
            return b(j5);
        } catch (Throwable unused) {
            b((String) null);
            return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
        }
    }

    public static void b(String str, long j5, boolean z2, Function1 function1) {
        if (!z2) {
            str = null;
        }
        try {
            boolean z10 = true;
            if (!rfS.b(str)) {
                ow owVar = (ow) DDS.f8521b.get();
                if (!Intrinsics.areEqual(owVar, RXl.f9550b)) {
                    z10 = Intrinsics.areEqual(owVar, d3Z.f10279b);
                }
                if (z10) {
                    function1.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
                    return;
                } else if (Intrinsics.areEqual(owVar, f0.f10395b)) {
                    function1.invoke(new RequestTokenWithStatus("AZ92B1-cMXHtqzVE49Hp2UeYiSNNShBCODw0wwl62JCTPebIs-SSeBS7GzaYtlequkPKS-b1J8VzCz4UFSBkwMuNPr1yfwrifeHe2saKv6sO3HUBmth37t4AJ4rmIArTjI1ZYBHlP8614JukKE5djOQga4OrCdLOn38TIJ_aWC49XXqSaQvlFmkf92XccjQ1qZya7ow_xV9y4elxFoGVJDUtn7WAHNwm2WGi0dWDyXyz1S558qrzkykkkxyZ0CWIlIlNAo4IOxI06cvjCihlHByT-4xNr85qr3Kwz_s6SMZrGmlOLVt1TV6T8JLtpONyr62htaqInPf7M9WvtE2U6Eo4y4MDIE51lzZQM0QQV86gY3Fwhje9ZYWFmxA6SIxZ0r3jBf1MMeKcdqjccjBDf_i0jvBERsaItILWDBANhqnS9p7FuTPpvHp7cKKVPEmwCw", RequestTokenStatus.SDK_NOT_INITIALIZED));
                    return;
                } else {
                    function1.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
                    return;
                }
            }
            if (eSs.f10363b.get()) {
                Log.i("Incognia", "Generating request token");
            }
            AtomicReference atomicReference = new AtomicReference(null);
            if (j5 > 0) {
                atomicReference.set(new ZJ(new RunnableC1826d(0, function1)));
                new pl2(Pgh.f9443b, true).b(j5, (d7p) atomicReference.get());
            }
            ((Q6I) X8.W()).vZZ.b(new CRN(new WLO(atomicReference, function1)));
        } catch (Throwable unused) {
            b((String) null);
            function1.invoke(new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR));
        }
    }

    public static void b(String str) {
        if (str == null) {
            str = "An unexpected error occurred during the request token generation.";
        }
        if (eSs.f10363b.get()) {
            Log.e("Incognia", "Error while generating request token. Reason: ".concat(str));
        }
    }

    public static final void b(Function1 function1) {
        b("Request token generation timed out.");
        function1.invoke(new RequestTokenWithStatus("AQwUZ-iksTYVRW03UG4jbk9C40roF_HuD-nDIH5e1t7Hq92fcsXSskPYQzhyv6GjOuelwXcC_T5enZYy43clKa9wAOE797TWKcjUoCC5r-kceTFDOrKIwkoCs6SFb1CQdeX1LhlJoO0bV1oZBUkh0G0IjIBpEteFNWCgewy6i0HRneZXifJ5TR0nEY0z9bevxNIo_q29b3fq12_sjJpRdc1mYg3YTtMG5nBfmJrS594XpRm3s5Y_rMZj6c5sQD23uq0w2-h8mEgsudgf3bC5_-ez0LsjRe0sd1OEqO2gkTKRiy-EUhrNyunaExg20DNpwjK667Iw2eXLPzOSuSxldY5LfMVMRjU18uSME6ndD7uIsPw6Fna2nIi_pwLt-CWAZ6v1aYqAjwfSYlE0ufzEaMTluO0pb99G12RWYVh2QVtjricLdoIaKNr_7bXpa5wCrQ", RequestTokenStatus.TIMEOUT));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RequestTokenWithStatus b(syj syjVar) {
        Cs5 cs5;
        Object m206constructorimpl;
        String str = O69.f9286b;
        String str2 = null;
        try {
            cs5 = ((Q6I) X8.W()).f9479i.b(syjVar);
        } catch (Throwable unused) {
            cs5 = null;
        }
        if (cs5 != null) {
            qhx qhxVar = qhx.f11164b;
            int i4 = cs5.f8491f9;
            Integer num = cs5.sVU;
            synchronized (qhxVar) {
                try {
                    ArrayList B = CollectionsKt.B(qhx.b().f9307b);
                    B.add(Integer.valueOf(i4));
                    ArrayList B6 = CollectionsKt.B(qhx.b().f9306W);
                    if (num != null) {
                        B6.add(Integer.valueOf(num.intValue()));
                    }
                    QHn.f9492b.b(qhx.f11163W, new ORV(B, B6), g6x.f10460b);
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                X8.W();
                long currentTimeMillis = System.currentTimeMillis();
                Cu cu = O69.f9285W;
                AtomicLong atomicLong = O69.f9287f9;
                long andIncrement = atomicLong.getAndIncrement();
                cu.getClass();
                JSONObject jSONObject = cs5.f8490b;
                jSONObject.put(Cu.f8495b, cs5.f8489W.f9077b);
                jSONObject.put(Cu.f8494W, andIncrement);
                jSONObject.put(Cu.f8496f9, currentTimeMillis);
                String jSONObject2 = jSONObject.toString();
                QHn.f9493f9.b(O69.f9286b, Long.valueOf(atomicLong.get()));
                str2 = ICR.f9(jSONObject2);
            } catch (Throwable unused2) {
            }
            if (str2 != null) {
                m206constructorimpl = Result.m206constructorimpl(str2);
                if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
                    return new RequestTokenWithStatus((String) m206constructorimpl, RequestTokenStatus.SUCCESS);
                }
                return new RequestTokenWithStatus("AcD6PmlVdDAQr3cBMrWbEw8oQPYHX3RZrLLGheI9I7LMwL_Xav24TCOH9NLmh7YzfufrrrSLB-k2JE4aXGodTH_YofIai1wyuJzIsHB4U5LrEb8G4nvkilmktCg8QR-_4sB3cnIe4c3pVQXamwwhwyTsvA27KH2pvqtC3QQaqu6Tti3KGJbKebvVw9RQRwOoMsfH_xyKE6Ukoewt0RKQkhzkxooi3esUukMF9-CwsIEbv3p_2CJrsov7pD1ZClWRPMIba3Wg8pBKisa3mziukjfi7vRdDE24d10NLkcIve6X3NUqqaf4lJc_3leDSamRxU_JMquzIone4E-zvFTjDayk_WqW3ldspVbd1_rLQzHjCalUp94wt_qMy9Kb-4L8OF7wczhMcprY6qQxExm2Ra7KFh3NSH7WLoE_mOHUrGxEcvQDBHqzFpIRQqO7xmK09g", RequestTokenStatus.INTERNAL_ERROR);
            }
        }
        Result.Companion companion = Result.INSTANCE;
        m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(new oMh()));
        if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
        }
    }

    public static RequestTokenWithStatus b(long j5) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ((Q6I) X8.W()).vZZ.b(new CRN(new Kpk(objectRef, countDownLatch)));
        countDownLatch.await(j5, TimeUnit.MILLISECONDS);
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) objectRef.alpha;
        if (requestTokenWithStatus != null) {
            return requestTokenWithStatus;
        }
        b("Request token generation timed out.");
        return new RequestTokenWithStatus("AQwUZ-iksTYVRW03UG4jbk9C40roF_HuD-nDIH5e1t7Hq92fcsXSskPYQzhyv6GjOuelwXcC_T5enZYy43clKa9wAOE797TWKcjUoCC5r-kceTFDOrKIwkoCs6SFb1CQdeX1LhlJoO0bV1oZBUkh0G0IjIBpEteFNWCgewy6i0HRneZXifJ5TR0nEY0z9bevxNIo_q29b3fq12_sjJpRdc1mYg3YTtMG5nBfmJrS594XpRm3s5Y_rMZj6c5sQD23uq0w2-h8mEgsudgf3bC5_-ez0LsjRe0sd1OEqO2gkTKRiy-EUhrNyunaExg20DNpwjK667Iw2eXLPzOSuSxldY5LfMVMRjU18uSME6ndD7uIsPw6Fna2nIi_pwLt-CWAZ6v1aYqAjwfSYlE0ufzEaMTluO0pb99G12RWYVh2QVtjricLdoIaKNr_7bXpa5wCrQ", RequestTokenStatus.TIMEOUT);
    }
}
