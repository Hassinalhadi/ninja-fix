package com.checkout.components.insight.data.dto;

import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.insight.a;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/insight/data/dto/ErrorDetails;", "", "", "name", Constants.KEY_MESSAGE, "stack", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/insight/data/dto/ErrorDetails;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getMessage", "c", "getStack", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String stack;

    public ErrorDetails(String name, String message, String str) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        this.name = name;
        this.message = message;
        this.stack = str;
    }

    public static /* synthetic */ ErrorDetails copy$default(ErrorDetails errorDetails, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = errorDetails.name;
        }
        if ((i4 & 2) != 0) {
            str2 = errorDetails.message;
        }
        if ((i4 & 4) != 0) {
            str3 = errorDetails.stack;
        }
        return errorDetails.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStack() {
        return this.stack;
    }

    public final ErrorDetails copy(String name, String message, String stack) {
        Intrinsics.echo(name, "name");
        Intrinsics.echo(message, "message");
        return new ErrorDetails(name, message, stack);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDetails)) {
            return false;
        }
        ErrorDetails errorDetails = (ErrorDetails) other;
        return Intrinsics.areEqual(this.name, errorDetails.name) && Intrinsics.areEqual(this.message, errorDetails.message) && Intrinsics.areEqual(this.stack, errorDetails.stack);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final String getStack() {
        return this.stack;
    }

    public final int hashCode() {
        int hashCode;
        int a6 = a.a(this.message, this.name.hashCode() * 31, 31);
        String str = this.stack;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a6 + hashCode;
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.message;
        return P0.gold(q.india("ErrorDetails(name=", str, ", message=", str2, ", stack="), this.stack, ")");
    }
}
