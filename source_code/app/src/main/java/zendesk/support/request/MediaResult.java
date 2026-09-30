package zendesk.support.request;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: classes.dex */
public class MediaResult implements Parcelable, Comparable<MediaResult> {
    public static final Parcelable.Creator<MediaResult> CREATOR = new Parcelable.Creator<MediaResult>() { // from class: zendesk.support.request.MediaResult.1
        @Override // android.os.Parcelable.Creator
        public MediaResult createFromParcel(Parcel parcel) {
            return new MediaResult(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public MediaResult[] newArray(int i4) {
            return new MediaResult[i4];
        }
    };
    public static final long UNKNOWN_VALUE = -1;
    private final File file;
    private final long height;
    private final String mimeType;
    private final String name;
    private final Uri originalUri;
    private final long size;
    private final Uri uri;
    private final long width;

    public /* synthetic */ MediaResult(Parcel parcel, int i4) {
        this(parcel);
    }

    public static MediaResult empty() {
        return new MediaResult(null, null, null, null, null, -1L, -1L, -1L);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        File file;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MediaResult mediaResult = (MediaResult) obj;
            if (this.size != mediaResult.size || this.width != mediaResult.width || this.height != mediaResult.height || ((file = this.file) == null ? mediaResult.file != null : !file.equals(mediaResult.file))) {
                return false;
            }
            Uri uri = this.uri;
            if (uri == null ? mediaResult.uri != null : !uri.equals(mediaResult.uri)) {
                return false;
            }
            Uri uri2 = this.originalUri;
            if (uri2 == null ? mediaResult.originalUri != null : !uri2.equals(mediaResult.originalUri)) {
                return false;
            }
            String str = this.name;
            if (str == null ? mediaResult.name != null : !str.equals(mediaResult.name)) {
                return false;
            }
            String str2 = this.mimeType;
            String str3 = mediaResult.mimeType;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public File getFile() {
        return this.file;
    }

    public long getHeight() {
        return this.height;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getName() {
        return this.name;
    }

    public Uri getOriginalUri() {
        return this.originalUri;
    }

    public long getSize() {
        return this.size;
    }

    public Uri getUri() {
        return this.uri;
    }

    public long getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        File file = this.file;
        int i12 = 0;
        if (file != null) {
            i4 = file.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = i4 * 31;
        Uri uri = this.uri;
        if (uri != null) {
            i5 = uri.hashCode();
        } else {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        Uri uri2 = this.originalUri;
        if (uri2 != null) {
            i10 = uri2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str = this.name;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str2 = this.mimeType;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        long j5 = this.size;
        int i18 = (i17 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.width;
        int i19 = (i18 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.height;
        return i19 + ((int) (j7 ^ (j7 >>> 32)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeSerializable(this.file);
        parcel.writeParcelable(this.uri, i4);
        parcel.writeString(this.name);
        parcel.writeString(this.mimeType);
        parcel.writeParcelable(this.originalUri, i4);
        parcel.writeLong(this.size);
        parcel.writeLong(this.width);
        parcel.writeLong(this.height);
    }

    public MediaResult(File file, Uri uri, Uri uri2, String str, String str2, long j5, long j6, long j7) {
        this.file = file;
        this.uri = uri;
        this.originalUri = uri2;
        this.mimeType = str2;
        this.name = str;
        this.size = j5;
        this.width = j6;
        this.height = j7;
    }

    @Override // java.lang.Comparable
    public int compareTo(MediaResult mediaResult) {
        return this.originalUri.compareTo(mediaResult.getOriginalUri());
    }

    private MediaResult(Parcel parcel) {
        this.file = (File) parcel.readSerializable();
        this.uri = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.name = parcel.readString();
        this.mimeType = parcel.readString();
        this.originalUri = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.size = parcel.readLong();
        this.width = parcel.readLong();
        this.height = parcel.readLong();
    }
}
