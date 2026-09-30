package android.support.v4.media.session;

import Q0.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Y5.a(9);

    /* renamed from: a, reason: collision with root package name */
    public final long f2698a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2699b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2700c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2701d;
    public final long purple;
    public final long red;
    public final float silver;
    public final long teal;
    public final int white;
    public final CharSequence yellow;

    /* loaded from: classes3.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();
        public final String alpha;
        public final CharSequence purple;
        public final int red;
        public final Bundle silver;

        public CustomAction(Parcel parcel) {
            this.alpha = parcel.readString();
            this.purple = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.red = parcel.readInt();
            this.silver = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.purple) + ", mIcon=" + this.red + ", mExtras=" + this.silver;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.alpha);
            TextUtils.writeToParcel(this.purple, parcel, i4);
            parcel.writeInt(this.red);
            parcel.writeBundle(this.silver);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.alpha = parcel.readInt();
        this.purple = parcel.readLong();
        this.silver = parcel.readFloat();
        this.f2698a = parcel.readLong();
        this.red = parcel.readLong();
        this.teal = parcel.readLong();
        this.yellow = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2699b = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f2700c = parcel.readLong();
        this.f2701d = parcel.readBundle(a.class.getClassLoader());
        this.white = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.alpha);
        sb2.append(", position=");
        sb2.append(this.purple);
        sb2.append(", buffered position=");
        sb2.append(this.red);
        sb2.append(", speed=");
        sb2.append(this.silver);
        sb2.append(", updated=");
        sb2.append(this.f2698a);
        sb2.append(", actions=");
        sb2.append(this.teal);
        sb2.append(", error code=");
        sb2.append(this.white);
        sb2.append(", error message=");
        sb2.append(this.yellow);
        sb2.append(", custom actions=");
        sb2.append(this.f2699b);
        sb2.append(", active item id=");
        return c.mike(this.f2700c, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.alpha);
        parcel.writeLong(this.purple);
        parcel.writeFloat(this.silver);
        parcel.writeLong(this.f2698a);
        parcel.writeLong(this.red);
        parcel.writeLong(this.teal);
        TextUtils.writeToParcel(this.yellow, parcel, i4);
        parcel.writeTypedList(this.f2699b);
        parcel.writeLong(this.f2700c);
        parcel.writeBundle(this.f2701d);
        parcel.writeInt(this.white);
    }
}
