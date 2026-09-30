package com.checkout.eventlogger;

import com.checkout.eventlogger.data.c;
import com.checkout.eventlogger.data.d;
import com.checkout.eventlogger.domain.a;
import com.checkout.eventlogger.domain.b.b;
import com.checkout.eventlogger.domain.model.Event;
import com.checkout.eventlogger.domain.model.MonitoringLevel;
import com.checkout.eventlogger.domain.model.RemoteProcessorMetadata;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000B\u000f\u0012\u0006\u0010 \u001a\u00020\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\"\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/checkout/eventlogger/CheckoutEventLogger;", "", "metadata", "value", "", "addMetadata", "(Ljava/lang/String;Ljava/lang/String;)V", "clearMetadata", "()V", "Lcom/checkout/eventlogger/domain/model/MonitoringLevel;", "monitoringLevel", "enableLocalProcessor", "(Lcom/checkout/eventlogger/domain/model/MonitoringLevel;)V", "Lcom/checkout/eventlogger/Environment;", "environment", "Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;", "remoteProcessorMetadata", "enableRemoteProcessor", "(Lcom/checkout/eventlogger/Environment;Lcom/checkout/eventlogger/domain/model/RemoteProcessorMetadata;)V", "", "Lcom/checkout/eventlogger/domain/LogEventProcessor;", "getProcessors", "()Ljava/util/List;", "", "Lcom/checkout/eventlogger/domain/model/Event;", "events", "logEvent", "([Lcom/checkout/eventlogger/domain/model/Event;)V", "removeMetadata", "(Ljava/lang/String;)V", "localProcessor", "Lcom/checkout/eventlogger/domain/LogEventProcessor;", "productName", "Ljava/lang/String;", "remoteProcessor", "", "transactionalEventMetadata", "Ljava/util/Map;", "<init>", "logger_release"}, k = 1, mv = {1, 1, 15}, pn = "", xi = 0, xs = "")
/* loaded from: classes3.dex */
public final class CheckoutEventLogger {

    /* renamed from: a, reason: collision with root package name */
    public a f6545a;

    /* renamed from: b, reason: collision with root package name */
    public a f6546b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f6547c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6548d;

    public CheckoutEventLogger(@NotNull String productName) {
        Intrinsics.echo(productName, "productName");
        this.f6548d = productName;
        this.f6547c = new LinkedHashMap();
    }

    public final List<a> a() {
        return CollectionsKt.peach(this.f6545a, this.f6546b);
    }

    public final void addMetadata(@NotNull String metadata, @NotNull String value) {
        Intrinsics.echo(metadata, "metadata");
        Intrinsics.echo(value, "value");
        this.f6547c.put(metadata, value);
    }

    public final void clearMetadata() {
        this.f6547c.clear();
    }

    public final void enableLocalProcessor(@NotNull MonitoringLevel monitoringLevel) {
        Intrinsics.echo(monitoringLevel, "monitoringLevel");
        this.f6545a = new b(this.f6548d, monitoringLevel);
    }

    public final void enableRemoteProcessor(@NotNull Environment environment, @NotNull RemoteProcessorMetadata remoteProcessorMetadata) {
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(remoteProcessorMetadata, "remoteProcessorMetadata");
        this.f6546b = new com.checkout.eventlogger.domain.b.a(new com.checkout.eventlogger.data.a(new com.checkout.eventlogger.network.a(environment.getF6549a()), new d(this.f6548d, remoteProcessorMetadata, new c())));
    }

    public final void logEvent(@NotNull Event... events) {
        Intrinsics.echo(events, "events");
        Iterator<T> it = a().iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this.f6547c, (Event[]) Arrays.copyOf(events, events.length));
        }
    }

    public final void removeMetadata(@NotNull String metadata) {
        Intrinsics.echo(metadata, "metadata");
        this.f6547c.remove(metadata);
    }
}
