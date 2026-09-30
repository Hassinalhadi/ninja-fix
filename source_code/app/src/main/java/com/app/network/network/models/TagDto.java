package com.app.network.network.models;

import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/app/network/network/models/TagDto;", "Ljava/io/Serializable;", "value", "", Constants.KEY_COLOR, "foregroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getColor", "getForegroundColor", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TagDto implements Serializable {

    @Nullable
    private final String color;

    @Nullable
    private final String foregroundColor;

    @Nullable
    private final String value;

    public TagDto(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.value = str;
        this.color = str2;
        this.foregroundColor = str3;
    }

    public static /* synthetic */ TagDto copy$default(TagDto tagDto, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tagDto.value;
        }
        if ((i4 & 2) != 0) {
            str2 = tagDto.color;
        }
        if ((i4 & 4) != 0) {
            str3 = tagDto.foregroundColor;
        }
        return tagDto.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    @NotNull
    public final TagDto copy(@Nullable String value, @Nullable String color, @Nullable String foregroundColor) {
        return new TagDto(value, color, foregroundColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagDto)) {
            return false;
        }
        TagDto tagDto = (TagDto) other;
        return Intrinsics.areEqual(this.value, tagDto.value) && Intrinsics.areEqual(this.color, tagDto.color) && Intrinsics.areEqual(this.foregroundColor, tagDto.foregroundColor);
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foregroundColor;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.color;
        return P0.gold(q.india("TagDto(value=", str, ", color=", str2, ", foregroundColor="), this.foregroundColor, ")");
    }
}
