package com.clevertap.android.sdk.variables;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.au;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    public /* synthetic */ b(Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$startFilesDownload$1;
        switch (this.alpha) {
            case 0:
                lambda$startFilesDownload$1 = VarCache.lambda$startFilesDownload$1(this.purple, (Map) obj);
                return lambda$startFilesDownload$1;
            case 1:
                au KeyboardActions = (au) obj;
                Intrinsics.echo(KeyboardActions, "$this$KeyboardActions");
                this.purple.invoke();
                return Unit.INSTANCE;
            case 2:
                au KeyboardActions2 = (au) obj;
                Intrinsics.echo(KeyboardActions2, "$this$KeyboardActions");
                this.purple.invoke();
                return Unit.INSTANCE;
            default:
                return (Z.b) this.purple.invoke();
        }
    }
}
