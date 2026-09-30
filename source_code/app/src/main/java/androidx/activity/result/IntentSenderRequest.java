package androidx.activity.result;

import Y5.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class IntentSenderRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b(4);
    public final IntentSender alpha;
    public final Intent purple;
    public final int red;
    public final int silver;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i4, int i5) {
        Intrinsics.echo(intentSender, "intentSender");
        this.alpha = intentSender;
        this.purple = intent;
        this.red = i4;
        this.silver = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        Intrinsics.echo(dest, "dest");
        dest.writeParcelable(this.alpha, i4);
        dest.writeParcelable(this.purple, i4);
        dest.writeInt(this.red);
        dest.writeInt(this.silver);
    }
}
