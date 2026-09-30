package io.getunleash.android.metrics;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import io.getunleash.android.data.Variant;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012 \b\u0002\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J!\u0010#\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052 \b\u0002\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0018HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R)\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006*"}, d2 = {"Lio/getunleash/android/metrics/CountBucket;", "Lio/getunleash/android/metrics/UnleashMetricsBucket;", "start", "Ljava/util/Date;", "yes", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "no", "variants", "Lkotlin/Pair;", "<init>", "(Ljava/util/Date;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;)V", "getStart", "()Ljava/util/Date;", "getYes", "()Ljava/util/concurrent/ConcurrentHashMap;", "getNo", "getVariants", Column.COUNT, "", "featureName", "enabled", "increment", "", "countVariant", "Lio/getunleash/android/data/Variant;", "variant", "isEmpty", "toBucket", "Lio/getunleash/android/metrics/Bucket;", "until", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CountBucket implements UnleashMetricsBucket {

    @NotNull
    private final ConcurrentHashMap<String, AtomicInteger> no;

    @NotNull
    private final Date start;

    @NotNull
    private final ConcurrentHashMap<Pair<String, String>, AtomicInteger> variants;

    @NotNull
    private final ConcurrentHashMap<String, AtomicInteger> yes;

    public CountBucket() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountBucket copy$default(CountBucket countBucket, Date date, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            date = countBucket.start;
        }
        if ((i4 & 2) != 0) {
            concurrentHashMap = countBucket.yes;
        }
        if ((i4 & 4) != 0) {
            concurrentHashMap2 = countBucket.no;
        }
        if ((i4 & 8) != 0) {
            concurrentHashMap3 = countBucket.variants;
        }
        return countBucket.copy(date, concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    public static /* synthetic */ Bucket toBucket$default(CountBucket countBucket, Date date, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            date = new Date();
        }
        return countBucket.toBucket(date);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Date getStart() {
        return this.start;
    }

    @NotNull
    public final ConcurrentHashMap<String, AtomicInteger> component2() {
        return this.yes;
    }

    @NotNull
    public final ConcurrentHashMap<String, AtomicInteger> component3() {
        return this.no;
    }

    @NotNull
    public final ConcurrentHashMap<Pair<String, String>, AtomicInteger> component4() {
        return this.variants;
    }

    @NotNull
    public final CountBucket copy(@NotNull Date start, @NotNull ConcurrentHashMap<String, AtomicInteger> yes, @NotNull ConcurrentHashMap<String, AtomicInteger> no, @NotNull ConcurrentHashMap<Pair<String, String>, AtomicInteger> variants) {
        Intrinsics.echo(start, "start");
        Intrinsics.echo(yes, "yes");
        Intrinsics.echo(no, "no");
        Intrinsics.echo(variants, "variants");
        return new CountBucket(start, yes, no, variants);
    }

    @Override // io.getunleash.android.metrics.UnleashMetricsBucket
    public boolean count(@NotNull String featureName, boolean enabled, int increment) {
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap;
        AtomicInteger putIfAbsent;
        Intrinsics.echo(featureName, "featureName");
        if (enabled) {
            concurrentHashMap = this.yes;
        } else {
            concurrentHashMap = this.no;
        }
        AtomicInteger atomicInteger = concurrentHashMap.get(featureName);
        if (atomicInteger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(featureName, (atomicInteger = new AtomicInteger(0)))) != null) {
            atomicInteger = putIfAbsent;
        }
        atomicInteger.addAndGet(increment);
        return enabled;
    }

    @Override // io.getunleash.android.metrics.UnleashMetricsBucket
    @NotNull
    public Variant countVariant(@NotNull String featureName, @NotNull Variant variant, int increment) {
        AtomicInteger putIfAbsent;
        Intrinsics.echo(featureName, "featureName");
        Intrinsics.echo(variant, "variant");
        ConcurrentHashMap<Pair<String, String>, AtomicInteger> concurrentHashMap = this.variants;
        Pair<String, String> pair = new Pair<>(featureName, variant.getName());
        AtomicInteger atomicInteger = concurrentHashMap.get(pair);
        if (atomicInteger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(pair, (atomicInteger = new AtomicInteger(0)))) != null) {
            atomicInteger = putIfAbsent;
        }
        atomicInteger.addAndGet(increment);
        return variant;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountBucket)) {
            return false;
        }
        CountBucket countBucket = (CountBucket) other;
        return Intrinsics.areEqual(this.start, countBucket.start) && Intrinsics.areEqual(this.yes, countBucket.yes) && Intrinsics.areEqual(this.no, countBucket.no) && Intrinsics.areEqual(this.variants, countBucket.variants);
    }

    @NotNull
    public final ConcurrentHashMap<String, AtomicInteger> getNo() {
        return this.no;
    }

    @NotNull
    public final Date getStart() {
        return this.start;
    }

    @NotNull
    public final ConcurrentHashMap<Pair<String, String>, AtomicInteger> getVariants() {
        return this.variants;
    }

    @NotNull
    public final ConcurrentHashMap<String, AtomicInteger> getYes() {
        return this.yes;
    }

    public int hashCode() {
        return this.variants.hashCode() + ((this.no.hashCode() + ((this.yes.hashCode() + (this.start.hashCode() * 31)) * 31)) * 31);
    }

    @Override // io.getunleash.android.metrics.UnleashMetricsBucket
    public boolean isEmpty() {
        if (this.yes.isEmpty() && this.no.isEmpty() && this.variants.isEmpty()) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Bucket toBucket(@NotNull Date until) {
        Intrinsics.echo(until, "until");
        Bucket bucket = new Bucket(this.start, until, null, 4, null);
        for (Map.Entry<String, AtomicInteger> entry : this.yes.entrySet()) {
            bucket.getToggles().put(entry.getKey(), new EvaluationCount(entry.getValue().get(), 0, null, 4, null));
        }
        for (Map.Entry<String, AtomicInteger> entry2 : this.no.entrySet()) {
            String key = entry2.getKey();
            AtomicInteger value = entry2.getValue();
            Map<String, EvaluationCount> toggles = bucket.getToggles();
            EvaluationCount evaluationCount = toggles.get(key);
            if (evaluationCount == null) {
                EvaluationCount evaluationCount2 = new EvaluationCount(0, 0, null, 4, null);
                toggles.put(key, evaluationCount2);
                evaluationCount = evaluationCount2;
            }
            evaluationCount.setNo(value.get());
        }
        for (Map.Entry<Pair<String, String>, AtomicInteger> entry3 : this.variants.entrySet()) {
            Pair<String, String> key2 = entry3.getKey();
            AtomicInteger value2 = entry3.getValue();
            Map<String, EvaluationCount> toggles2 = bucket.getToggles();
            String first = key2.getFirst();
            EvaluationCount evaluationCount3 = toggles2.get(first);
            if (evaluationCount3 == null) {
                EvaluationCount evaluationCount4 = new EvaluationCount(0, 0, null, 4, null);
                toggles2.put(first, evaluationCount4);
                evaluationCount3 = evaluationCount4;
            }
            evaluationCount3.getVariants().put(key2.getSecond(), Integer.valueOf(value2.get()));
        }
        return bucket;
    }

    @NotNull
    public String toString() {
        return "CountBucket(start=" + this.start + ", yes=" + this.yes + ", no=" + this.no + ", variants=" + this.variants + ')';
    }

    public CountBucket(@NotNull Date start, @NotNull ConcurrentHashMap<String, AtomicInteger> yes, @NotNull ConcurrentHashMap<String, AtomicInteger> no, @NotNull ConcurrentHashMap<Pair<String, String>, AtomicInteger> variants) {
        Intrinsics.echo(start, "start");
        Intrinsics.echo(yes, "yes");
        Intrinsics.echo(no, "no");
        Intrinsics.echo(variants, "variants");
        this.start = start;
        this.yes = yes;
        this.no = no;
        this.variants = variants;
    }

    public /* synthetic */ CountBucket(Date date, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new Date() : date, (i4 & 2) != 0 ? new ConcurrentHashMap() : concurrentHashMap, (i4 & 4) != 0 ? new ConcurrentHashMap() : concurrentHashMap2, (i4 & 8) != 0 ? new ConcurrentHashMap() : concurrentHashMap3);
    }
}
