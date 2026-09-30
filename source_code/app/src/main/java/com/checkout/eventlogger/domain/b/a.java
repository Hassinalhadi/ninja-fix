package com.checkout.eventlogger.domain.b;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.eventlogger.CheckoutEventLoggerKt;
import com.checkout.eventlogger.data.e.c;
import com.checkout.eventlogger.domain.model.Event;
import com.checkout.eventlogger.domain.model.MonitoringLevel;
import com.clevertap.android.sdk.leanplum.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.ab;
import vf.ad;

/* loaded from: classes3.dex */
public final class a implements com.checkout.eventlogger.domain.a {

    /* renamed from: a, reason: collision with root package name */
    public final MonitoringLevel f6578a;

    /* renamed from: b, reason: collision with root package name */
    public final com.checkout.eventlogger.data.a f6579b;

    public a(@NotNull com.checkout.eventlogger.data.a loggingService) {
        Intrinsics.echo(loggingService, "loggingService");
        this.f6579b = loggingService;
        this.f6578a = MonitoringLevel.INFO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.checkout.eventlogger.data.d, java.lang.Object] */
    @Override // com.checkout.eventlogger.domain.a
    public void a(@NotNull Map<String, String> transactionalEventMetadata, @NotNull Event... events) {
        String str;
        ?? r12;
        Intrinsics.echo(transactionalEventMetadata, "transactionalEventMetadata");
        Intrinsics.echo(events, "events");
        ArrayList arrayList = new ArrayList();
        for (Event event : events) {
            if (event.getF6582a().compareTo(this.f6578a) <= 0) {
                arrayList.add(event);
            }
        }
        if (!arrayList.isEmpty()) {
            com.checkout.eventlogger.data.a aVar = this.f6579b;
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                c cVar = null;
                if (it.hasNext()) {
                    Event event2 = (Event) it.next();
                    ?? r82 = aVar.f6553d;
                    r82.getClass();
                    Intrinsics.echo(event2, "event");
                    int ordinal = event2.getF6582a().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    str = null;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                str = Constants.INFO_PARAM;
                            }
                        } else {
                            str = "warn";
                        }
                    } else {
                        str = RedirectCustomTabEventLogger.RESULT_ERROR;
                    }
                    if (str != null) {
                        r82.f6560c.getClass();
                        String uuid = UUID.randomUUID().toString();
                        Intrinsics.delta(uuid, "UUID.randomUUID().toString()");
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(com.checkout.components.insight.common.Constants.DATE_TIME_PATTERN, Locale.ROOT);
                        String str2 = transactionalEventMetadata.get(CheckoutEventLoggerKt.METADATA_CORRELATION_ID);
                        if (str2 != null) {
                            r12 = new LinkedHashMap();
                            for (Map.Entry<String, String> entry : transactionalEventMetadata.entrySet()) {
                                if (!Intrinsics.areEqual(entry.getKey(), CheckoutEventLoggerKt.METADATA_CORRELATION_ID)) {
                                    r12.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            r12 = transactionalEventMetadata;
                        }
                        com.checkout.eventlogger.data.e.a aVar2 = new com.checkout.eventlogger.data.e.a(str2, str);
                        String str3 = r82.f6559b.getProductIdentifier() + '.' + event2.getF6583b();
                        String str4 = r82.f6558a;
                        String format = simpleDateFormat.format(event2.getE());
                        Intrinsics.delta(format, "sdf.format(event.time)");
                        cVar = new c("1.0", uuid, str3, str4, format, r82.a(r12, event2), aVar2);
                    }
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                } else if (arrayList2.isEmpty()) {
                    MonitoringLevel monitoringLevel = MonitoringLevel.DEBUG;
                    Intrinsics.echo(monitoringLevel, "monitoringLevel");
                    return;
                } else {
                    ad.zulu((ab) aVar.f6550a.getValue(), null, null, new com.checkout.eventlogger.data.b(aVar, arrayList2, null), 3);
                    return;
                }
            }
        }
    }
}
