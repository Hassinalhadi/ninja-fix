package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0607b(4);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3113a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3114b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3115c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3116d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3117f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3118g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3119h;
    public final String purple;
    public final boolean red;
    public final boolean silver;
    public final int teal;
    public final int white;
    public final String yellow;

    public FragmentState(ai aiVar) {
        this.alpha = aiVar.getClass().getName();
        this.purple = aiVar.mWho;
        this.red = aiVar.mFromLayout;
        this.silver = aiVar.mInDynamicContainer;
        this.teal = aiVar.mFragmentId;
        this.white = aiVar.mContainerId;
        this.yellow = aiVar.mTag;
        this.f3113a = aiVar.mRetainInstance;
        this.f3114b = aiVar.mRemoving;
        this.f3115c = aiVar.mDetached;
        this.f3116d = aiVar.mHidden;
        this.e = aiVar.mMaxState.ordinal();
        this.f3117f = aiVar.mTargetWho;
        this.f3118g = aiVar.mTargetRequestCode;
        this.f3119h = aiVar.mUserVisibleHint;
    }

    public final ai charlie(A a6) {
        ai alpha = a6.alpha(this.alpha);
        alpha.mWho = this.purple;
        alpha.mFromLayout = this.red;
        alpha.mInDynamicContainer = this.silver;
        alpha.mRestored = true;
        alpha.mFragmentId = this.teal;
        alpha.mContainerId = this.white;
        alpha.mTag = this.yellow;
        alpha.mRetainInstance = this.f3113a;
        alpha.mRemoving = this.f3114b;
        alpha.mDetached = this.f3115c;
        alpha.mHidden = this.f3116d;
        alpha.mMaxState = androidx.lifecycle.ab.values()[this.e];
        alpha.mTargetWho = this.f3117f;
        alpha.mTargetRequestCode = this.f3118g;
        alpha.mUserVisibleHint = this.f3119h;
        return alpha;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.alpha);
        sb2.append(" (");
        sb2.append(this.purple);
        sb2.append(")}:");
        if (this.red) {
            sb2.append(" fromLayout");
        }
        if (this.silver) {
            sb2.append(" dynamicContainer");
        }
        int i4 = this.white;
        if (i4 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i4));
        }
        String str = this.yellow;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f3113a) {
            sb2.append(" retainInstance");
        }
        if (this.f3114b) {
            sb2.append(" removing");
        }
        if (this.f3115c) {
            sb2.append(" detached");
        }
        if (this.f3116d) {
            sb2.append(" hidden");
        }
        String str2 = this.f3117f;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f3118g);
        }
        if (this.f3119h) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.alpha);
        parcel.writeString(this.purple);
        parcel.writeInt(this.red ? 1 : 0);
        parcel.writeInt(this.silver ? 1 : 0);
        parcel.writeInt(this.teal);
        parcel.writeInt(this.white);
        parcel.writeString(this.yellow);
        parcel.writeInt(this.f3113a ? 1 : 0);
        parcel.writeInt(this.f3114b ? 1 : 0);
        parcel.writeInt(this.f3115c ? 1 : 0);
        parcel.writeInt(this.f3116d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeString(this.f3117f);
        parcel.writeInt(this.f3118g);
        parcel.writeInt(this.f3119h ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.alpha = parcel.readString();
        this.purple = parcel.readString();
        this.red = parcel.readInt() != 0;
        this.silver = parcel.readInt() != 0;
        this.teal = parcel.readInt();
        this.white = parcel.readInt();
        this.yellow = parcel.readString();
        this.f3113a = parcel.readInt() != 0;
        this.f3114b = parcel.readInt() != 0;
        this.f3115c = parcel.readInt() != 0;
        this.f3116d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f3117f = parcel.readString();
        this.f3118g = parcel.readInt();
        this.f3119h = parcel.readInt() != 0;
    }
}
