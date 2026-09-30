package com.clevertap.android.sdk.task;

import androidx.compose.runtime.C0564b;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;

    public /* synthetic */ a(int i4, int i5) {
        this.alpha = i5;
        this.purple = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CTExecutors executorResourceDownloader$lambda$6;
        switch (this.alpha) {
            case 0:
                executorResourceDownloader$lambda$6 = CTExecutorFactory.executorResourceDownloader$lambda$6(this.purple);
                return executorResourceDownloader$lambda$6;
            default:
                return C0564b.whiskey(this.purple);
        }
    }
}
