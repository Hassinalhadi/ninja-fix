package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/app/network/network/models/HandshakeItemGroup;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ICON, "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", Constants.KEY_KEY, "getKey", "setKey", "value", "getValue", "setValue", "weight", "", "getWeight", "()Ljava/lang/Integer;", "setWeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "items", "", "Lcom/app/network/network/models/HandshakeItem;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandshakeItemGroup implements Serializable {

    @Nullable
    private String icon;

    @Nullable
    private List<HandshakeItem> items;

    @Nullable
    private String key;

    @Nullable
    private String value;

    @Nullable
    private Integer weight;

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final List<HandshakeItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setItems(@Nullable List<HandshakeItem> list) {
        this.items = list;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setWeight(@Nullable Integer num) {
        this.weight = num;
    }
}
