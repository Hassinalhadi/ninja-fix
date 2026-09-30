package com.app.network.network.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/app/network/network/models/Attribute;", "Landroid/os/Parcelable;", "<init>", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", Constants.KEY_KEY, "", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "displayName", "getDisplayName", "setDisplayName", "hint", "getHint", "setHint", "inputType", "getInputType", "setInputType", "writeToParcel", "", "flags", "", "describeContents", "CREATOR", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Attribute implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String displayName;

    @Nullable
    private String hint;

    @Nullable
    private String inputType;

    @Nullable
    private String key;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/app/network/network/models/Attribute$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/app/network/network/models/Attribute;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/app/network/network/models/Attribute;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.app.network.network.models.Attribute$CREATOR, reason: from kotlin metadata */
    /* loaded from: classes3.dex */
    public static final class Companion implements Parcelable.Creator<Attribute> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Attribute createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new Attribute(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Attribute[] newArray(int size) {
            return new Attribute[size];
        }
    }

    public Attribute() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getHint() {
        return this.hint;
    }

    @Nullable
    public final String getInputType() {
        return this.inputType;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setHint(@Nullable String str) {
        this.hint = str;
    }

    public final void setInputType(@Nullable String str) {
        this.inputType = str;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.echo(parcel, "parcel");
        parcel.writeString(this.key);
        parcel.writeString(this.displayName);
        parcel.writeString(this.hint);
        parcel.writeString(this.inputType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Attribute(@NotNull Parcel parcel) {
        this();
        Intrinsics.echo(parcel, "parcel");
        this.key = parcel.readString();
        this.displayName = parcel.readString();
        this.hint = parcel.readString();
        this.inputType = parcel.readString();
    }
}
