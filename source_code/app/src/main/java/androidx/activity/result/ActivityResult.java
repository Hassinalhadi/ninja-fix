package androidx.activity.result;

import Y5.a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class ActivityResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a(4);
    public final int alpha;
    public final Intent purple;

    public ActivityResult(Intent intent, int i4) {
        this.alpha = i4;
        this.purple = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.alpha;
        if (i4 != -1) {
            if (i4 != 0) {
                str = String.valueOf(i4);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb2.append(str);
        sb2.append(", data=");
        sb2.append(this.purple);
        sb2.append('}');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        int i5;
        Intrinsics.echo(dest, "dest");
        dest.writeInt(this.alpha);
        Intent intent = this.purple;
        if (intent == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        dest.writeInt(i5);
        if (intent != null) {
            intent.writeToParcel(dest, i4);
        }
    }
}
