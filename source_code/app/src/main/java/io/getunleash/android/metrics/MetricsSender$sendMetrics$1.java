package io.getunleash.android.metrics;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "io.getunleash.android.metrics.MetricsSender", f = "MetricsSender.kt", l = {55}, m = "sendMetrics")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MetricsSender$sendMetrics$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricsSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricsSender$sendMetrics$1(MetricsSender metricsSender, Nd.c<? super MetricsSender$sendMetrics$1> cVar) {
        super(cVar);
        this.this$0 = metricsSender;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.sendMetrics(null, this);
    }
}
