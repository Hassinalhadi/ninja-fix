package com.checkout.components.redirecthandler.customtab;

import ae.o;
import com.checkout.components.redirecthandler.model.RedirectRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ RedirectCustomTabExecutor purple;
    public final /* synthetic */ RedirectRequest red;

    public /* synthetic */ a(RedirectCustomTabExecutor redirectCustomTabExecutor, RedirectRequest redirectRequest, int i4) {
        this.alpha = i4;
        this.purple = redirectCustomTabExecutor;
        this.red = redirectRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit a6;
        Unit a8;
        switch (this.alpha) {
            case 0:
                a6 = RedirectCustomTabExecutor.a(this.purple, this.red, (o) obj);
                return a6;
            default:
                a8 = RedirectCustomTabExecutor.a(this.purple, this.red, (String) obj);
                return a8;
        }
    }
}
