package com.incognia.internal;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class z9 extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(String str) {
        super(0);
        this.f11888b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AtomicBoolean atomicBoolean = eSs.f10363b;
        if (atomicBoolean.get()) {
            Log.i("Incognia", "Setting accountId.");
        }
        if (this.f11888b.length() == 0) {
            if (atomicBoolean.get()) {
                Log.w("Incognia", "Invalid account id received: account won't be set. \nTo clear the account id, please call clearAccountId()");
            }
        } else {
            rfS.b(this.f11888b, "accountId");
            zC b2 = X8.b();
            String str = this.f11888b;
            if (!Intrinsics.areEqual((String) b2.f11894W.f9573f9.get(), str)) {
                b2.b(dlT.f10328W, new HKV(b2, str));
            }
        }
        return Unit.INSTANCE;
    }
}
