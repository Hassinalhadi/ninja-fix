package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/Platform;", "Lcom/app/network/network/models/Language;", "<init>", "()V", "image", "Lcom/app/network/network/models/Image;", "getImage", "()Lcom/app/network/network/models/Image;", "setImage", "(Lcom/app/network/network/models/Image;)V", "country", "Lcom/app/network/network/models/Country;", "getCountry", "()Lcom/app/network/network/models/Country;", "setCountry", "(Lcom/app/network/network/models/Country;)V", "settings", "Lcom/app/network/network/models/PlatformSettings;", "getSettings", "()Lcom/app/network/network/models/PlatformSettings;", "setSettings", "(Lcom/app/network/network/models/PlatformSettings;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Platform extends Language {

    @Nullable
    private Country country;

    @Nullable
    private Image image;

    @Nullable
    private PlatformSettings settings;

    public Platform() {
        super(null, 1, null);
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    @Nullable
    public final PlatformSettings getSettings() {
        return this.settings;
    }

    public final void setCountry(@Nullable Country country) {
        this.country = country;
    }

    public final void setImage(@Nullable Image image) {
        this.image = image;
    }

    public final void setSettings(@Nullable PlatformSettings platformSettings) {
        this.settings = platformSettings;
    }
}
