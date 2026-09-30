package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001c\u0010!\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/app/network/network/models/Item;", "Ljava/io/Serializable;", "<init>", "()V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "image", "getImage", "setImage", "quantity", "getQuantity", "setQuantity", "price", "", "getPrice", "()Ljava/lang/Double;", "setPrice", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "name", "getName", "setName", "nameAr", "getNameAr", "setNameAr", "customizations", "", "Lcom/app/network/network/models/TaskItemCustomization;", "getCustomizations", "()Ljava/util/List;", "setCustomizations", "(Ljava/util/List;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Item implements Serializable {

    @Nullable
    private List<TaskItemCustomization> customizations;

    @Nullable
    private String description;

    @Nullable
    private Integer id;

    @Nullable
    private String image;

    @Nullable
    private String name;

    @Nullable
    private String nameAr;

    @Nullable
    private Double price;

    @Nullable
    private Integer quantity;

    @Nullable
    public final List<TaskItemCustomization> getCustomizations() {
        return this.customizations;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getImage() {
        return this.image;
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

    public final void setCustomizations(@Nullable List<TaskItemCustomization> list) {
        this.customizations = list;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
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
