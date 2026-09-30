package io.getunleash.android.tasks;

import Nd.c;
import com.clevertap.android.sdk.Constants;
import io.getunleash.android.data.DataStrategy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001e\b\u0002\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR-\u0010\t\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lio/getunleash/android/tasks/DataJob;", "", "", Constants.KEY_ID, "Lio/getunleash/android/data/DataStrategy;", "strategy", "Lkotlin/Function1;", "LNd/c;", "", Constants.KEY_ACTION, "<init>", "(Ljava/lang/String;Lio/getunleash/android/data/DataStrategy;Lkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lio/getunleash/android/data/DataStrategy;", "component3", "()Lkotlin/jvm/functions/Function1;", Constants.COPY_TYPE, "(Ljava/lang/String;Lio/getunleash/android/data/DataStrategy;Lkotlin/jvm/functions/Function1;)Lio/getunleash/android/tasks/DataJob;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lio/getunleash/android/data/DataStrategy;", "getStrategy", "Lkotlin/jvm/functions/Function1;", "getAction", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DataJob {

    @NotNull
    private final Function1<c<? super Unit>, Object> action;

    @NotNull
    private final String id;

    @NotNull
    private final DataStrategy strategy;

    /* JADX WARN: Multi-variable type inference failed */
    public DataJob(@NotNull String id2, @NotNull DataStrategy strategy, @NotNull Function1<? super c<? super Unit>, ? extends Object> action) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(strategy, "strategy");
        Intrinsics.echo(action, "action");
        this.id = id2;
        this.strategy = strategy;
        this.action = action;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataJob copy$default(DataJob dataJob, String str, DataStrategy dataStrategy, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = dataJob.id;
        }
        if ((i4 & 2) != 0) {
            dataStrategy = dataJob.strategy;
        }
        if ((i4 & 4) != 0) {
            function1 = dataJob.action;
        }
        return dataJob.copy(str, dataStrategy, function1);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DataStrategy getStrategy() {
        return this.strategy;
    }

    @NotNull
    public final Function1<c<? super Unit>, Object> component3() {
        return this.action;
    }

    @NotNull
    public final DataJob copy(@NotNull String id2, @NotNull DataStrategy strategy, @NotNull Function1<? super c<? super Unit>, ? extends Object> action) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(strategy, "strategy");
        Intrinsics.echo(action, "action");
        return new DataJob(id2, strategy, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataJob)) {
            return false;
        }
        DataJob dataJob = (DataJob) other;
        return Intrinsics.areEqual(this.id, dataJob.id) && Intrinsics.areEqual(this.strategy, dataJob.strategy) && Intrinsics.areEqual(this.action, dataJob.action);
    }

    @NotNull
    public final Function1<c<? super Unit>, Object> getAction() {
        return this.action;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final DataStrategy getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return this.action.hashCode() + ((this.strategy.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "DataJob(id=" + this.id + ", strategy=" + this.strategy + ", action=" + this.action + ')';
    }
}
