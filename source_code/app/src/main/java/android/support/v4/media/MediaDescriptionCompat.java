package android.support.v4.media;

import Y5.b;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new b(5);

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2696a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public Object f2697b;
    public final CharSequence purple;
    public final CharSequence red;
    public final CharSequence silver;
    public final Bitmap teal;
    public final Uri white;
    public final Bundle yellow;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.alpha = str;
        this.purple = charSequence;
        this.red = charSequence2;
        this.silver = charSequence3;
        this.teal = bitmap;
        this.white = uri;
        this.yellow = bundle;
        this.f2696a = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.purple) + ", " + ((Object) this.red) + ", " + ((Object) this.silver);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Object obj = this.f2697b;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.alpha);
            builder.setTitle(this.purple);
            builder.setSubtitle(this.red);
            builder.setDescription(this.silver);
            builder.setIconBitmap(this.teal);
            builder.setIconUri(this.white);
            builder.setExtras(this.yellow);
            builder.setMediaUri(this.f2696a);
            obj = builder.build();
            this.f2697b = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i4);
    }
}
