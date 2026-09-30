package com.canhub.cropper;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/canhub/cropper/CropImage$ActivityResult", "La4/w;", "Landroid/os/Parcelable;", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class CropImage$ActivityResult extends w implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new Y5.a(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        Intrinsics.echo(dest, "dest");
        dest.writeParcelable(this.alpha, i4);
        dest.writeParcelable(this.purple, i4);
        dest.writeSerializable(this.red);
        dest.writeFloatArray(this.silver);
        dest.writeParcelable(this.teal, i4);
        dest.writeParcelable(this.white, i4);
        dest.writeInt(this.yellow);
        dest.writeInt(this.f2618a);
    }
}
