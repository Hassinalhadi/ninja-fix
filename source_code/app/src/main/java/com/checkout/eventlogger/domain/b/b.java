package com.checkout.eventlogger.domain.b;

import android.util.Log;
import com.checkout.eventlogger.domain.model.Event;
import com.checkout.eventlogger.domain.model.MessageEvent;
import com.checkout.eventlogger.domain.model.MonitoringLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements com.checkout.eventlogger.domain.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6580a;

    /* renamed from: b, reason: collision with root package name */
    public final MonitoringLevel f6581b;

    public b(@NotNull String productName, @NotNull MonitoringLevel logcatFilter) {
        Intrinsics.echo(productName, "productName");
        Intrinsics.echo(logcatFilter, "logcatFilter");
        this.f6580a = productName;
        this.f6581b = logcatFilter;
    }

    @Override // com.checkout.eventlogger.domain.a
    public void a(@NotNull Map<String, String> transactionalEventMetadata, @NotNull Event... events) {
        String f6583b;
        Intrinsics.echo(transactionalEventMetadata, "transactionalEventMetadata");
        Intrinsics.echo(events, "events");
        ArrayList arrayList = new ArrayList();
        for (Event event : events) {
            if (event.getF6582a().compareTo(this.f6581b) <= 0) {
                arrayList.add(event);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Event event2 = (Event) it.next();
            if (event2 instanceof MessageEvent) {
                f6583b = ((MessageEvent) event2).asSummary$logger_release();
            } else {
                f6583b = event2.getF6583b();
            }
            String str = this.f6580a;
            int ordinal = event2.getF6582a().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            Log.d(str, f6583b);
                        }
                    } else {
                        Log.i(str, f6583b);
                    }
                } else {
                    Log.w(str, f6583b);
                }
            } else {
                Log.e(str, f6583b);
            }
        }
    }
}
