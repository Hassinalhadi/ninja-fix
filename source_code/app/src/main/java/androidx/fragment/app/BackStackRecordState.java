package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes3.dex */
public final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0607b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3106a;
    public final int[] alpha;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f3107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3108c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f3109d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3110f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3111g;
    public final ArrayList purple;
    public final int[] red;
    public final int[] silver;
    public final int teal;
    public final String white;
    public final int yellow;

    public BackStackRecordState(C0606a c0606a) {
        int size = c0606a.alpha.size();
        this.alpha = new int[size * 6];
        if (c0606a.golf) {
            this.purple = new ArrayList(size);
            this.red = new int[size];
            this.silver = new int[size];
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                U u4 = (U) c0606a.alpha.get(i5);
                int i10 = i4 + 1;
                this.alpha[i4] = u4.alpha;
                ArrayList arrayList = this.purple;
                ai aiVar = u4.bravo;
                arrayList.add(aiVar != null ? aiVar.mWho : null);
                int[] iArr = this.alpha;
                iArr[i10] = u4.charlie ? 1 : 0;
                iArr[i4 + 2] = u4.delta;
                iArr[i4 + 3] = u4.echo;
                int i11 = i4 + 5;
                iArr[i4 + 4] = u4.foxtrot;
                i4 += 6;
                iArr[i11] = u4.golf;
                this.red[i5] = u4.hotel.ordinal();
                this.silver[i5] = u4.india.ordinal();
            }
            this.teal = c0606a.foxtrot;
            this.white = c0606a.india;
            this.yellow = c0606a.tango;
            this.f3106a = c0606a.juliet;
            this.f3107b = c0606a.kilo;
            this.f3108c = c0606a.lima;
            this.f3109d = c0606a.mike;
            this.e = c0606a.november;
            this.f3110f = c0606a.oscar;
            this.f3111g = c0606a.papa;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.fragment.app.U, java.lang.Object] */
    public final void charlie(C0606a c0606a) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.alpha;
            boolean z2 = true;
            if (i4 < iArr.length) {
                ?? obj = new Object();
                int i10 = i4 + 1;
                obj.alpha = iArr[i4];
                if (L.gray(2)) {
                    Log.v("FragmentManager", "Instantiate " + c0606a + " op #" + i5 + " base fragment #" + iArr[i10]);
                }
                obj.hotel = androidx.lifecycle.ab.values()[this.red[i5]];
                obj.india = androidx.lifecycle.ab.values()[this.silver[i5]];
                int i11 = i4 + 2;
                if (iArr[i10] == 0) {
                    z2 = false;
                }
                obj.charlie = z2;
                int i12 = iArr[i11];
                obj.delta = i12;
                int i13 = iArr[i4 + 3];
                obj.echo = i13;
                int i14 = i4 + 5;
                int i15 = iArr[i4 + 4];
                obj.foxtrot = i15;
                i4 += 6;
                int i16 = iArr[i14];
                obj.golf = i16;
                c0606a.bravo = i12;
                c0606a.charlie = i13;
                c0606a.delta = i15;
                c0606a.echo = i16;
                c0606a.bravo(obj);
                i5++;
            } else {
                c0606a.foxtrot = this.teal;
                c0606a.india = this.white;
                c0606a.golf = true;
                c0606a.juliet = this.f3106a;
                c0606a.kilo = this.f3107b;
                c0606a.lima = this.f3108c;
                c0606a.mike = this.f3109d;
                c0606a.november = this.e;
                c0606a.oscar = this.f3110f;
                c0606a.papa = this.f3111g;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.alpha);
        parcel.writeStringList(this.purple);
        parcel.writeIntArray(this.red);
        parcel.writeIntArray(this.silver);
        parcel.writeInt(this.teal);
        parcel.writeString(this.white);
        parcel.writeInt(this.yellow);
        parcel.writeInt(this.f3106a);
        TextUtils.writeToParcel(this.f3107b, parcel, 0);
        parcel.writeInt(this.f3108c);
        TextUtils.writeToParcel(this.f3109d, parcel, 0);
        parcel.writeStringList(this.e);
        parcel.writeStringList(this.f3110f);
        parcel.writeInt(this.f3111g ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.alpha = parcel.createIntArray();
        this.purple = parcel.createStringArrayList();
        this.red = parcel.createIntArray();
        this.silver = parcel.createIntArray();
        this.teal = parcel.readInt();
        this.white = parcel.readString();
        this.yellow = parcel.readInt();
        this.f3106a = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3107b = (CharSequence) creator.createFromParcel(parcel);
        this.f3108c = parcel.readInt();
        this.f3109d = (CharSequence) creator.createFromParcel(parcel);
        this.e = parcel.createStringArrayList();
        this.f3110f = parcel.createStringArrayList();
        this.f3111g = parcel.readInt() != 0;
    }
}
