package io.getunleash.android.metrics;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lio/getunleash/android/metrics/EvaluationCount;", "", "yes", "", "no", "variants", "", "", "<init>", "(IILjava/util/Map;)V", "getYes", "()I", "setYes", "(I)V", "getNo", "setNo", "getVariants", "()Ljava/util/Map;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class EvaluationCount {
    private int no;

    @NotNull
    private final Map<String, Integer> variants;
    private int yes;

    public EvaluationCount(int i4, int i5, @NotNull Map<String, Integer> variants) {
        Intrinsics.echo(variants, "variants");
        this.yes = i4;
        this.no = i5;
        this.variants = variants;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationCount copy$default(EvaluationCount evaluationCount, int i4, int i5, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = evaluationCount.yes;
        }
        if ((i10 & 2) != 0) {
            i5 = evaluationCount.no;
        }
        if ((i10 & 4) != 0) {
            map = evaluationCount.variants;
        }
        return evaluationCount.copy(i4, i5, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getYes() {
        return this.yes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNo() {
        return this.no;
    }

    @NotNull
    public final Map<String, Integer> component3() {
        return this.variants;
    }

    @NotNull
    public final EvaluationCount copy(int yes, int no, @NotNull Map<String, Integer> variants) {
        Intrinsics.echo(variants, "variants");
        return new EvaluationCount(yes, no, variants);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluationCount)) {
            return false;
        }
        EvaluationCount evaluationCount = (EvaluationCount) other;
        return this.yes == evaluationCount.yes && this.no == evaluationCount.no && Intrinsics.areEqual(this.variants, evaluationCount.variants);
    }

    public final int getNo() {
        return this.no;
    }

    @NotNull
    public final Map<String, Integer> getVariants() {
        return this.variants;
    }

    public final int getYes() {
        return this.yes;
    }

    public int hashCode() {
        return this.variants.hashCode() + (((this.yes * 31) + this.no) * 31);
    }

    public final void setNo(int i4) {
        this.no = i4;
    }

    public final void setYes(int i4) {
        this.yes = i4;
    }

    @NotNull
    public String toString() {
        return "EvaluationCount(yes=" + this.yes + ", no=" + this.no + ", variants=" + this.variants + ')';
    }

    public /* synthetic */ EvaluationCount(int i4, int i5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, i5, (i10 & 4) != 0 ? new LinkedHashMap() : map);
    }
}
