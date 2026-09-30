package com.checkout.components.insight.data.dto;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/checkout/components/insight/data/dto/Events;", "", "", "Lcom/checkout/components/insight/data/dto/EventData;", Column.DATA, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", Constants.COPY_TYPE, "(Ljava/util/List;)Lcom/checkout/components/insight/data/dto/Events;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getData", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Events {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List data;

    public Events(List<? extends EventData> data) {
        Intrinsics.echo(data, "data");
        this.data = data;
    }

    public static Events copy$default(Events events, List data, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            data = events.data;
        }
        events.getClass();
        Intrinsics.echo(data, "data");
        return new Events(data);
    }

    public final List<EventData> component1() {
        return this.data;
    }

    public final Events copy(List<? extends EventData> data) {
        Intrinsics.echo(data, "data");
        return new Events(data);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Events) && Intrinsics.areEqual(this.data, ((Events) other).data);
    }

    public final List<EventData> getData() {
        return this.data;
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        return "Events(data=" + this.data + ")";
    }
}
