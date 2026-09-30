package com.checkout.components.ui.model;

import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/checkout/components/ui/model/PatternType;", "", "<init>", "()V", "Exact", "Range", "Lcom/checkout/components/ui/model/PatternType$Exact;", "Lcom/checkout/components/ui/model/PatternType$Range;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PatternType {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/ui/model/PatternType$Exact;", "Lcom/checkout/components/ui/model/PatternType;", "value", "", "<init>", "(I)V", "getValue", "()I", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Exact extends PatternType {
        public static final int $stable = 0;
        private final int value;

        public Exact(int i4) {
            super(null);
            this.value = i4;
        }

        public static /* synthetic */ Exact copy$default(Exact exact, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = exact.value;
            }
            return exact.copy(i4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final Exact copy(int value) {
            return new Exact(value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exact) && this.value == ((Exact) other).value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        @NotNull
        public String toString() {
            return q.delta(this.value, "Exact(value=", ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/ui/model/PatternType$Range;", "Lcom/checkout/components/ui/model/PatternType;", "start", "", "end", "<init>", "(II)V", "getStart", "()I", "getEnd", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Range extends PatternType {
        public static final int $stable = 0;
        private final int end;
        private final int start;

        public Range(int i4, int i5) {
            super(null);
            this.start = i4;
            this.end = i5;
        }

        public static /* synthetic */ Range copy$default(Range range, int i4, int i5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i4 = range.start;
            }
            if ((i10 & 2) != 0) {
                i5 = range.end;
            }
            return range.copy(i4, i5);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        @NotNull
        public final Range copy(int start, int end) {
            return new Range(start, end);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return this.start == range.start && this.end == range.end;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return this.end + (this.start * 31);
        }

        @NotNull
        public String toString() {
            return P0.azure(this.start, this.end, "Range(start=", ", end=", ")");
        }
    }

    public /* synthetic */ PatternType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PatternType() {
    }
}
