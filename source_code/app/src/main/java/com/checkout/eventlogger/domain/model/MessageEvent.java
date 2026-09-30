package com.checkout.eventlogger.domain.model;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b3\u00104J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0006JZ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\bR\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010\bR%\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010*\u001a\u0004\b+\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b-\u0010\fR\"\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0006R\u001c\u0010\u001a\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b1\u0010\u0014R\u001c\u0010\u0017\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b2\u0010\b¨\u00065"}, d2 = {"Lcom/checkout/eventlogger/domain/model/MessageEvent;", "Lcom/checkout/eventlogger/domain/model/Event;", "", "", "", "asEventMap", "()Ljava/util/Map;", "asSummary$logger_release", "()Ljava/lang/String;", "asSummary", "Lcom/checkout/eventlogger/domain/model/MonitoringLevel;", "component1", "()Lcom/checkout/eventlogger/domain/model/MonitoringLevel;", "component2", "component3", "", "component4", "()Ljava/lang/Throwable;", "Ljava/util/Date;", "component5", "()Ljava/util/Date;", "component6", "monitoringLevel", "typeIdentifier", Constants.KEY_MESSAGE, "cause", "time", "metadata", Constants.COPY_TYPE, "(Lcom/checkout/eventlogger/domain/model/MonitoringLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Date;Ljava/util/Map;)Lcom/checkout/eventlogger/domain/model/MessageEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Throwable;", "getCause", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getMetadata", "Lcom/checkout/eventlogger/domain/model/MonitoringLevel;", "getMonitoringLevel", "getProperties", "properties", "Ljava/util/Date;", "getTime", "getTypeIdentifier", "<init>", "(Lcom/checkout/eventlogger/domain/model/MonitoringLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Date;Ljava/util/Map;)V", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* loaded from: classes3.dex */
public final /* data */ class MessageEvent implements Event {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final MonitoringLevel f6582a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f6583b;

    /* renamed from: c, reason: collision with root package name and from toString */
    @NotNull
    public final String message;

    /* renamed from: d, reason: collision with root package name and from toString */
    @Nullable
    public final Throwable cause;

    @NotNull
    public final Date e;

    /* renamed from: f, reason: collision with root package name and from toString */
    @NotNull
    public final Map<String, Object> metadata;

    public MessageEvent(@NotNull MonitoringLevel monitoringLevel, @NotNull String typeIdentifier, @NotNull String message, @Nullable Throwable th, @NotNull Date time, @NotNull Map<String, ? extends Object> metadata) {
        Intrinsics.echo(monitoringLevel, "monitoringLevel");
        Intrinsics.echo(typeIdentifier, "typeIdentifier");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(time, "time");
        Intrinsics.echo(metadata, "metadata");
        this.f6582a = monitoringLevel;
        this.f6583b = typeIdentifier;
        this.message = message;
        this.cause = th;
        this.e = time;
        this.metadata = metadata;
    }

    public static /* synthetic */ MessageEvent copy$default(MessageEvent messageEvent, MonitoringLevel monitoringLevel, String str, String str2, Throwable th, Date date, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            monitoringLevel = messageEvent.getF6582a();
        }
        if ((i4 & 2) != 0) {
            str = messageEvent.getF6583b();
        }
        if ((i4 & 4) != 0) {
            str2 = messageEvent.message;
        }
        if ((i4 & 8) != 0) {
            th = messageEvent.cause;
        }
        if ((i4 & 16) != 0) {
            date = messageEvent.getE();
        }
        if ((i4 & 32) != 0) {
            map = messageEvent.metadata;
        }
        Date date2 = date;
        Map map2 = map;
        return messageEvent.copy(monitoringLevel, str, str2, th, date2, map2);
    }

    @NotNull
    public final String asSummary$logger_release() {
        String access$toStackTraceString;
        Throwable th = this.cause;
        if (th != null && (access$toStackTraceString = MessageEventKt.access$toStackTraceString(th)) != null) {
            String str = this.message + " - " + access$toStackTraceString;
            if (str != null) {
                return str;
            }
        }
        return this.message;
    }

    @NotNull
    public final MonitoringLevel component1() {
        return getF6582a();
    }

    @NotNull
    public final String component2() {
        return getF6583b();
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final Date component5() {
        return getE();
    }

    @NotNull
    public final Map<String, Object> component6() {
        return this.metadata;
    }

    @NotNull
    public final MessageEvent copy(@NotNull MonitoringLevel monitoringLevel, @NotNull String typeIdentifier, @NotNull String message, @Nullable Throwable cause, @NotNull Date time, @NotNull Map<String, ? extends Object> metadata) {
        Intrinsics.echo(monitoringLevel, "monitoringLevel");
        Intrinsics.echo(typeIdentifier, "typeIdentifier");
        Intrinsics.echo(message, "message");
        Intrinsics.echo(time, "time");
        Intrinsics.echo(metadata, "metadata");
        return new MessageEvent(monitoringLevel, typeIdentifier, message, cause, time, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageEvent)) {
            return false;
        }
        MessageEvent messageEvent = (MessageEvent) other;
        return Intrinsics.areEqual(getF6582a(), messageEvent.getF6582a()) && Intrinsics.areEqual(getF6583b(), messageEvent.getF6583b()) && Intrinsics.areEqual(this.message, messageEvent.message) && Intrinsics.areEqual(this.cause, messageEvent.cause) && Intrinsics.areEqual(getE(), messageEvent.getE()) && Intrinsics.areEqual(this.metadata, messageEvent.metadata);
    }

    @Nullable
    public final Throwable getCause() {
        return this.cause;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, Object> getMetadata() {
        return this.metadata;
    }

    @Override // com.checkout.eventlogger.domain.model.Event
    @NotNull
    /* renamed from: getMonitoringLevel, reason: from getter */
    public MonitoringLevel getF6582a() {
        return this.f6582a;
    }

    @Override // com.checkout.eventlogger.domain.model.Event
    @NotNull
    public Map<String, Object> getProperties() {
        String access$toStackTraceString;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.KEY_MESSAGE, this.message);
        Throwable th = this.cause;
        if (th != null && (access$toStackTraceString = MessageEventKt.access$toStackTraceString(th)) != null) {
            linkedHashMap.put("exception", access$toStackTraceString);
        }
        linkedHashMap.putAll(this.metadata);
        return linkedHashMap;
    }

    @Override // com.checkout.eventlogger.domain.model.Event
    @NotNull
    /* renamed from: getTime, reason: from getter */
    public Date getE() {
        return this.e;
    }

    @Override // com.checkout.eventlogger.domain.model.Event
    @NotNull
    /* renamed from: getTypeIdentifier, reason: from getter */
    public String getF6583b() {
        return this.f6583b;
    }

    public int hashCode() {
        MonitoringLevel f6582a = getF6582a();
        int hashCode = (f6582a != null ? f6582a.hashCode() : 0) * 31;
        String f6583b = getF6583b();
        int hashCode2 = (hashCode + (f6583b != null ? f6583b.hashCode() : 0)) * 31;
        String str = this.message;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.cause;
        int hashCode4 = (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
        Date e = getE();
        int hashCode5 = (hashCode4 + (e != null ? e.hashCode() : 0)) * 31;
        Map<String, Object> map = this.metadata;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MessageEvent(monitoringLevel=" + getF6582a() + ", typeIdentifier=" + getF6583b() + ", message=" + this.message + ", cause=" + this.cause + ", time=" + getE() + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ MessageEvent(MonitoringLevel monitoringLevel, String str, String str2, Throwable th, Date date, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(monitoringLevel, str, str2, (i4 & 8) != 0 ? null : th, (i4 & 16) != 0 ? new Date() : date, (i4 & 32) != 0 ? t.alpha : map);
    }
}
