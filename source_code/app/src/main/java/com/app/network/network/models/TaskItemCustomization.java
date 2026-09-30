package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/app/network/network/models/TaskItemCustomization;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "nameAr", "getNameAr", "setNameAr", "quantity", "getQuantity", "setQuantity", "price", "", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskItemCustomization implements Serializable {

    @Nullable
    private Integer id;

    @Nullable
    private String name;

    @Nullable
    private String nameAr;

    @Nullable
    private Double price;

    @Nullable
    private Integer quantity;

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameAr() {
        return this.nameAr;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final Integer getQuantity() {
        return this.quantity;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNameAr(@Nullable String str) {
        this.nameAr = str;
    }

    public final void setPrice(@Nullable Double d4) {
        this.price = d4;
    }

    public final void setQuantity(@Nullable Integer num) {
        this.quantity = num;
    }
}
