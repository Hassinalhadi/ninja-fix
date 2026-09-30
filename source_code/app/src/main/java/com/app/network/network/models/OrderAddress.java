package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/app/network/network/models/OrderAddress;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "phone", "", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "description", "getDescription", "setDescription", "email", "getEmail", "setEmail", "latitude", "", "getLatitude", "()Ljava/lang/Float;", "setLatitude", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "longitude", "getLongitude", "setLongitude", "imageUrl", "getImageUrl", "setImageUrl", "imageUrls", "", "getImageUrls", "()Ljava/util/List;", "setImageUrls", "(Ljava/util/List;)V", "getStaticMap", "apiKey", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderAddress implements Serializable {

    @Nullable
    private String description;

    @Nullable
    private String email;

    @Nullable
    private Integer id;

    @Nullable
    private String imageUrl;

    @Nullable
    private List<String> imageUrls;

    @Nullable
    private Float latitude;

    @Nullable
    private Float longitude;

    @Nullable
    private String phone;

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final List<String> getImageUrls() {
        return this.imageUrls;
    }

    @Nullable
    public final Float getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final Float getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @NotNull
    public final String getStaticMap(@NotNull String apiKey) {
        Intrinsics.echo(apiKey, "apiKey");
        Float f5 = this.latitude;
        Float f10 = this.longitude;
        return "https://maps.googleapis.com/maps/api/staticmap?center=" + f5 + Constants.SEPARATOR_COMMA + f10 + "&zoom=15&markers=color%3Awhite%7Clabel%3AA%7C" + f5 + Constants.SEPARATOR_COMMA + f10 + "&size=650x450&key=" + apiKey;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setEmail(@Nullable String str) {
        this.email = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setImageUrls(@Nullable List<String> list) {
        this.imageUrls = list;
    }

    public final void setLatitude(@Nullable Float f5) {
        this.latitude = f5;
    }

    public final void setLongitude(@Nullable Float f5) {
        this.longitude = f5;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }
}
