package com.airbnb.lottie.compose;

import Q0.c;
import ao.ad;
import av.q;
import com.airbnb.lottie.LottieComposition;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J4;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "()V", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "Frame", "Marker", "Markers", "Progress", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LottieClipSpec {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001dJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006!"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", Constants.PRIORITY_MAX, "maxInclusive", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "actualMaxFrame", "Ljava/lang/Integer;", "getMax", "()Ljava/lang/Integer;", "getMaxInclusive", "()Z", "getMin", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "equals", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "toString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Frame extends LottieClipSpec {
        public static final int $stable = 0;

        @Nullable
        private final Integer actualMaxFrame;

        @Nullable
        private final Integer max;
        private final boolean maxInclusive;

        @Nullable
        private final Integer min;

        public Frame() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ Frame copy$default(Frame frame, Integer num, Integer num2, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                num = frame.min;
            }
            if ((i4 & 2) != 0) {
                num2 = frame.max;
            }
            if ((i4 & 4) != 0) {
                z2 = frame.maxInclusive;
            }
            return frame.copy(num, num2, z2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Integer getMin() {
            return this.min;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getMax() {
            return this.max;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @NotNull
        public final Frame copy(@Nullable Integer min, @Nullable Integer max, boolean maxInclusive) {
            return new Frame(min, max, maxInclusive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return Intrinsics.areEqual(this.min, frame.min) && Intrinsics.areEqual(this.max, frame.max) && this.maxInclusive == frame.maxInclusive;
        }

        @Nullable
        public final Integer getMax() {
            return this.max;
        }

        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.echo(composition, "composition");
            if (this.actualMaxFrame == null) {
                return 1.0f;
            }
            return J4.charlie(r0.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Nullable
        public final Integer getMin() {
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.echo(composition, "composition");
            if (this.min == null) {
                return 0.0f;
            }
            return J4.charlie(r0.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            Integer num = this.min;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.max;
            return ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + (this.maxInclusive ? 1231 : 1237);
        }

        @NotNull
        public String toString() {
            Integer num = this.min;
            Integer num2 = this.max;
            boolean z2 = this.maxInclusive;
            StringBuilder sb2 = new StringBuilder("Frame(min=");
            sb2.append(num);
            sb2.append(", max=");
            sb2.append(num2);
            sb2.append(", maxInclusive=");
            return c.romeo(sb2, z2, ")");
        }

        public /* synthetic */ Frame(Integer num, Integer num2, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : num, (i4 & 2) != 0 ? null : num2, (i4 & 4) != 0 ? true : z2);
        }

        public Frame(@Nullable Integer num, @Nullable Integer num2, boolean z2) {
            super(null);
            this.min = num;
            this.max = num2;
            this.maxInclusive = z2;
            if (num2 == null) {
                num2 = null;
            } else if (!z2) {
                num2 = Integer.valueOf(num2.intValue() - 1);
            }
            this.actualMaxFrame = num2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "marker", "", "(Ljava/lang/String;)V", "getMarker", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Marker extends LottieClipSpec {
        public static final int $stable = 0;

        @NotNull
        private final String marker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Marker(@NotNull String marker) {
            super(null);
            Intrinsics.echo(marker, "marker");
            this.marker = marker;
        }

        public static /* synthetic */ Marker copy$default(Marker marker, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = marker.marker;
            }
            return marker.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMarker() {
            return this.marker;
        }

        @NotNull
        public final Marker copy(@NotNull String marker) {
            Intrinsics.echo(marker, "marker");
            return new Marker(marker);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Marker) && Intrinsics.areEqual(this.marker, ((Marker) other).marker);
        }

        @NotNull
        public final String getMarker() {
            return this.marker;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.echo(composition, "composition");
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.marker);
            if (marker == null) {
                return 1.0f;
            }
            return J4.charlie((marker.startFrame + marker.durationFrames) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            float f5;
            Intrinsics.echo(composition, "composition");
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.marker);
            if (marker != null) {
                f5 = marker.startFrame;
            } else {
                f5 = 0.0f;
            }
            return J4.charlie(f5 / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            return this.marker.hashCode();
        }

        @NotNull
        public String toString() {
            return ad.gray("Marker(marker=", this.marker, ")");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0010¢\u0006\u0002\b\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", Constants.PRIORITY_MAX, "maxInclusive", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMax", "()Ljava/lang/String;", "getMaxInclusive", "()Z", "getMin", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Markers extends LottieClipSpec {
        public static final int $stable = 0;

        @Nullable
        private final String max;
        private final boolean maxInclusive;

        @Nullable
        private final String min;

        public Markers() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ Markers copy$default(Markers markers, String str, String str2, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = markers.min;
            }
            if ((i4 & 2) != 0) {
                str2 = markers.max;
            }
            if ((i4 & 4) != 0) {
                z2 = markers.maxInclusive;
            }
            return markers.copy(str, str2, z2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getMin() {
            return this.min;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getMax() {
            return this.max;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @NotNull
        public final Markers copy(@Nullable String min, @Nullable String max, boolean maxInclusive) {
            return new Markers(min, max, maxInclusive);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Markers)) {
                return false;
            }
            Markers markers = (Markers) other;
            return Intrinsics.areEqual(this.min, markers.min) && Intrinsics.areEqual(this.max, markers.max) && this.maxInclusive == markers.maxInclusive;
        }

        @Nullable
        public final String getMax() {
            return this.max;
        }

        public final boolean getMaxInclusive() {
            return this.maxInclusive;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            int i4;
            float f5;
            Intrinsics.echo(composition, "composition");
            String str = this.max;
            if (str == null) {
                return 1.0f;
            }
            if (this.maxInclusive) {
                i4 = 0;
            } else {
                i4 = -1;
            }
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            if (marker != null) {
                f5 = marker.startFrame + i4;
            } else {
                f5 = 0.0f;
            }
            return J4.charlie(f5 / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Nullable
        public final String getMin() {
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            float f5;
            Intrinsics.echo(composition, "composition");
            String str = this.min;
            if (str == null) {
                return 0.0f;
            }
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            if (marker != null) {
                f5 = marker.startFrame;
            } else {
                f5 = 0.0f;
            }
            return J4.charlie(f5 / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            String str = this.min;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.max;
            return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.maxInclusive ? 1231 : 1237);
        }

        @NotNull
        public String toString() {
            String str = this.min;
            String str2 = this.max;
            return c.romeo(q.india("Markers(min=", str, ", max=", str2, ", maxInclusive="), this.maxInclusive, ")");
        }

        public /* synthetic */ Markers(String str, String str2, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? true : z2);
        }

        public Markers(@Nullable String str, @Nullable String str2, boolean z2) {
            super(null);
            this.min = str;
            this.max = str2;
            this.maxInclusive = z2;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0010¢\u0006\u0002\b\u0015J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "min", "", Constants.PRIORITY_MAX, "(FF)V", "getMax", "()F", "getMin", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "getMaxProgress", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "hashCode", "", "toString", "", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Progress extends LottieClipSpec {
        public static final int $stable = 0;
        private final float max;
        private final float min;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Progress() {
            this(r2, r2, 3, null);
            float f5 = 0.0f;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, float f5, float f10, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                f5 = progress.min;
            }
            if ((i4 & 2) != 0) {
                f10 = progress.max;
            }
            return progress.copy(f5, f10);
        }

        /* renamed from: component1, reason: from getter */
        public final float getMin() {
            return this.min;
        }

        /* renamed from: component2, reason: from getter */
        public final float getMax() {
            return this.max;
        }

        @NotNull
        public final Progress copy(float min, float max) {
            return new Progress(min, max);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return Float.compare(this.min, progress.min) == 0 && Float.compare(this.max, progress.max) == 0;
        }

        public final float getMax() {
            return this.max;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.echo(composition, "composition");
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.echo(composition, "composition");
            return this.min;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.max) + (Float.floatToIntBits(this.min) * 31);
        }

        @NotNull
        public String toString() {
            return "Progress(min=" + this.min + ", max=" + this.max + ")";
        }

        public /* synthetic */ Progress(float f5, float f10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0.0f : f5, (i4 & 2) != 0 ? 1.0f : f10);
        }

        public Progress(float f5, float f10) {
            super(null);
            this.min = f5;
            this.max = f10;
        }
    }

    public /* synthetic */ LottieClipSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition);

    public abstract float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition);

    private LottieClipSpec() {
    }
}
