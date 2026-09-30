package com.app.network.network.models;

import P8.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/app/network/network/models/Location;", "", "latitude", "", "longitude", "accuracy", "", "speed", "time", "", "<init>", "(DDFFJ)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Location {

    @c("accuracy")
    private final float accuracy;

    @c("latitude")
    private final double latitude;

    @c("longitude")
    private final double longitude;

    @c("speed")
    private final float speed;

    @c("time")
    private final long time;

    public Location() {
        this(0.0d, 0.0d, 0.0f, 0.0f, 0L, 31, null);
    }

    public Location(double d4, double d9, float f5, float f10, long j5) {
        this.latitude = d4;
        this.longitude = d9;
        this.accuracy = f5;
        this.speed = f10;
        this.time = j5;
    }

    public /* synthetic */ Location(double d4, double d9, float f5, float f10, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0.0d : d4, (i4 & 2) != 0 ? 0.0d : d9, (i4 & 4) != 0 ? 0.0f : f5, (i4 & 8) != 0 ? 0.0f : f10, (i4 & 16) != 0 ? 0L : j5);
    }
}
