package com.app.feature.location.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p3.EnumC2270b;
import p3.ah;
import yf.InterfaceC3439i;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/app/feature/location/api/StompStateHolder;", "", "Lp3/ah;", "getState", "()Lp3/ah;", "state", "", "setState", "(Lp3/ah;)V", "Lp3/b;", "getGpsQuality", "()Lp3/b;", "quality", "setGpsQuality", "(Lp3/b;)V", "Lyf/i;", "stateFlow", "()Lyf/i;", "gpsQualityFlow", "feature-location_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StompStateHolder {
    @NotNull
    EnumC2270b getGpsQuality();

    @NotNull
    ah getState();

    @NotNull
    InterfaceC3439i gpsQualityFlow();

    void setGpsQuality(@NotNull EnumC2270b quality);

    void setState(@NotNull ah state);

    @NotNull
    InterfaceC3439i stateFlow();
}
