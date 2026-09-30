package com.checkout.eventlogger.data;

import com.checkout.eventlogger.domain.model.Event;
import com.checkout.eventlogger.domain.model.RemoteProcessorMetadata;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f6558a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteProcessorMetadata f6559b;

    /* renamed from: c, reason: collision with root package name */
    public final c f6560c;

    public d(@NotNull String productName, @NotNull RemoteProcessorMetadata remoteProcessorMetadata, @NotNull c eventIdGenerator) {
        Intrinsics.echo(productName, "productName");
        Intrinsics.echo(remoteProcessorMetadata, "remoteProcessorMetadata");
        Intrinsics.echo(eventIdGenerator, "eventIdGenerator");
        this.f6558a = productName;
        this.f6559b = remoteProcessorMetadata;
        this.f6560c = eventIdGenerator;
    }

    public final com.checkout.eventlogger.data.e.b a(Map<String, String> map, Event event) {
        RemoteProcessorMetadata metadata = this.f6559b;
        LinkedHashMap uniform = y.uniform(event.getProperties(), map);
        Intrinsics.echo(metadata, "metadata");
        return new com.checkout.eventlogger.data.e.b(metadata.getProductVersion(), metadata.getEnvironment(), metadata.getAppPackageName(), metadata.getAppPackageVersion(), metadata.getAppInstallId(), metadata.getDeviceName(), metadata.getPlatform(), metadata.getOsVersion(), uniform);
    }
}
