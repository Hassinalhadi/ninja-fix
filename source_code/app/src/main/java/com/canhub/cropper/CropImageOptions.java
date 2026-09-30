package com.canhub.cropper;

import a4.ae;
import a4.v;
import a4.x;
import a4.y;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import ao.ad;
import av.q;
import com.google.android.material.datepicker.j;
import com.google.maps.android.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageOptions;", "Landroid/os/Parcelable;", "cropper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CropImageOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CropImageOptions> CREATOR = new Y5.b(2);
    public final int A;
    public final int B;
    public final int C;

    /* renamed from: D, reason: collision with root package name */
    public final int f3612D;

    /* renamed from: E, reason: collision with root package name */
    public final CharSequence f3613E;

    /* renamed from: F, reason: collision with root package name */
    public final int f3614F;

    /* renamed from: G, reason: collision with root package name */
    public final Integer f3615G;

    /* renamed from: H, reason: collision with root package name */
    public final Uri f3616H;

    /* renamed from: I, reason: collision with root package name */
    public final Bitmap.CompressFormat f3617I;

    /* renamed from: J, reason: collision with root package name */
    public final int f3618J;

    /* renamed from: K, reason: collision with root package name */
    public final int f3619K;

    /* renamed from: L, reason: collision with root package name */
    public final int f3620L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f3621M;

    /* renamed from: N, reason: collision with root package name */
    public final Rect f3622N;

    /* renamed from: O, reason: collision with root package name */
    public final int f3623O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f3624P;
    public final boolean Q;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f3625R;

    /* renamed from: S, reason: collision with root package name */
    public final int f3626S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f3627T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f3628U;

    /* renamed from: V, reason: collision with root package name */
    public final CharSequence f3629V;

    /* renamed from: W, reason: collision with root package name */
    public final int f3630W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f3631X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f3632Y;

    /* renamed from: Z, reason: collision with root package name */
    public final String f3633Z;

    /* renamed from: a, reason: collision with root package name */
    public final y f3634a;

    /* renamed from: a0, reason: collision with root package name */
    public final List f3635a0;
    public boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ae f3636b;

    /* renamed from: b0, reason: collision with root package name */
    public final float f3637b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3638c;

    /* renamed from: c0, reason: collision with root package name */
    public final int f3639c0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3640d;

    /* renamed from: d0, reason: collision with root package name */
    public final String f3641d0;
    public final boolean e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f3642e0;

    /* renamed from: f, reason: collision with root package name */
    public final int f3643f;

    /* renamed from: f0, reason: collision with root package name */
    public final Integer f3644f0;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3645g;

    /* renamed from: g0, reason: collision with root package name */
    public final Integer f3646g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3647h;

    /* renamed from: h0, reason: collision with root package name */
    public final Integer f3648h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3649i;

    /* renamed from: i0, reason: collision with root package name */
    public final Integer f3650i0;

    /* renamed from: j, reason: collision with root package name */
    public final int f3651j;

    /* renamed from: j0, reason: collision with root package name */
    public final int f3652j0;

    /* renamed from: k, reason: collision with root package name */
    public final float f3653k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3654l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3655m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3656n;

    /* renamed from: o, reason: collision with root package name */
    public final float f3657o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3658p;
    public boolean purple;

    /* renamed from: q, reason: collision with root package name */
    public final float f3659q;

    /* renamed from: r, reason: collision with root package name */
    public final float f3660r;
    public final x red;

    /* renamed from: s, reason: collision with root package name */
    public final float f3661s;
    public final v silver;

    /* renamed from: t, reason: collision with root package name */
    public final int f3662t;
    public final float teal;

    /* renamed from: u, reason: collision with root package name */
    public final int f3663u;

    /* renamed from: v, reason: collision with root package name */
    public final float f3664v;

    /* renamed from: w, reason: collision with root package name */
    public final int f3665w;
    public final float white;

    /* renamed from: x, reason: collision with root package name */
    public final int f3666x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3667y;
    public final float yellow;

    /* renamed from: z, reason: collision with root package name */
    public final int f3668z;

    public CropImageOptions(boolean z2, boolean z10, x cropShape, v cornerShape, float f5, float f10, float f11, y guidelines, ae scaleType, boolean z11, boolean z12, boolean z13, int i4, boolean z14, boolean z15, boolean z16, int i5, float f12, boolean z17, int i10, int i11, float f13, int i12, float f14, float f15, float f16, int i13, int i14, float f17, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, CharSequence activityTitle, int i23, Integer num, Uri uri, Bitmap.CompressFormat outputCompressFormat, int i24, int i25, int i26, int i27, boolean z18, Rect rect, int i28, boolean z19, boolean z20, boolean z21, int i29, boolean z22, boolean z23, CharSequence charSequence, int i30, boolean z24, boolean z25, String str, List list, float f18, int i31, String str2, int i32, Integer num2, Integer num3, Integer num4, Integer num5) {
        Intrinsics.echo(cropShape, "cropShape");
        Intrinsics.echo(cornerShape, "cornerShape");
        Intrinsics.echo(guidelines, "guidelines");
        Intrinsics.echo(scaleType, "scaleType");
        Intrinsics.echo(activityTitle, "activityTitle");
        Intrinsics.echo(outputCompressFormat, "outputCompressFormat");
        j.papa(i27, "outputRequestSizeOptions");
        this.alpha = z2;
        this.purple = z10;
        this.red = cropShape;
        this.silver = cornerShape;
        this.teal = f5;
        this.white = f10;
        this.yellow = f11;
        this.f3634a = guidelines;
        this.f3636b = scaleType;
        this.f3638c = z11;
        this.f3640d = z12;
        this.e = z13;
        this.f3643f = i4;
        this.f3645g = z14;
        this.f3647h = z15;
        this.f3649i = z16;
        this.f3651j = i5;
        this.f3653k = f12;
        this.f3654l = z17;
        this.f3655m = i10;
        this.f3656n = i11;
        this.f3657o = f13;
        this.f3658p = i12;
        this.f3659q = f14;
        this.f3660r = f15;
        this.f3661s = f16;
        this.f3662t = i13;
        this.f3663u = i14;
        this.f3664v = f17;
        this.f3665w = i15;
        this.f3666x = i16;
        this.f3667y = i17;
        this.f3668z = i18;
        this.A = i19;
        this.B = i20;
        this.C = i21;
        this.f3612D = i22;
        this.f3613E = activityTitle;
        this.f3614F = i23;
        this.f3615G = num;
        this.f3616H = uri;
        this.f3617I = outputCompressFormat;
        this.f3618J = i24;
        this.f3619K = i25;
        this.f3620L = i26;
        this.f3652j0 = i27;
        this.f3621M = z18;
        this.f3622N = rect;
        this.f3623O = i28;
        this.f3624P = z19;
        this.Q = z20;
        this.f3625R = z21;
        this.f3626S = i29;
        this.f3627T = z22;
        this.f3628U = z23;
        this.f3629V = charSequence;
        this.f3630W = i30;
        this.f3631X = z24;
        this.f3632Y = z25;
        this.f3633Z = str;
        this.f3635a0 = list;
        this.f3637b0 = f18;
        this.f3639c0 = i31;
        this.f3641d0 = str2;
        this.f3642e0 = i32;
        this.f3644f0 = num2;
        this.f3646g0 = num3;
        this.f3648h0 = num4;
        this.f3650i0 = num5;
        if (i5 < 0) {
            throw new IllegalArgumentException("Cannot set max zoom to a number < 1");
        }
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("Cannot set touch radius value to a number <= 0 ");
        }
        if (f12 < 0.0f || f12 >= 0.5d) {
            throw new IllegalArgumentException("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Cannot set line thickness value to a number less than 0.");
        }
        if (f14 < 0.0f) {
            throw new IllegalArgumentException("Cannot set corner thickness value to a number less than 0.");
        }
        if (f17 < 0.0f) {
            throw new IllegalArgumentException("Cannot set guidelines thickness value to a number less than 0.");
        }
        if (i18 < 0) {
            throw new IllegalArgumentException("Cannot set min crop window height value to a number < 0 ");
        }
        if (i19 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result width value to a number < 0 ");
        }
        if (i20 < 0) {
            throw new IllegalArgumentException("Cannot set min crop result height value to a number < 0 ");
        }
        if (i21 < i19) {
            throw new IllegalArgumentException("Cannot set max crop result width to smaller value than min crop result width");
        }
        if (i22 < i20) {
            throw new IllegalArgumentException("Cannot set max crop result height to smaller value than min crop result height");
        }
        if (i25 < 0) {
            throw new IllegalArgumentException("Cannot set request width value to a number < 0 ");
        }
        if (i26 < 0) {
            throw new IllegalArgumentException("Cannot set request height value to a number < 0 ");
        }
        if (i29 < 0 || i29 > 360) {
            throw new IllegalArgumentException("Cannot set rotation degrees value to a number < 0 or > 360");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CropImageOptions)) {
            return false;
        }
        CropImageOptions cropImageOptions = (CropImageOptions) obj;
        return this.alpha == cropImageOptions.alpha && this.purple == cropImageOptions.purple && this.red == cropImageOptions.red && this.silver == cropImageOptions.silver && Float.compare(this.teal, cropImageOptions.teal) == 0 && Float.compare(this.white, cropImageOptions.white) == 0 && Float.compare(this.yellow, cropImageOptions.yellow) == 0 && this.f3634a == cropImageOptions.f3634a && this.f3636b == cropImageOptions.f3636b && this.f3638c == cropImageOptions.f3638c && this.f3640d == cropImageOptions.f3640d && this.e == cropImageOptions.e && this.f3643f == cropImageOptions.f3643f && this.f3645g == cropImageOptions.f3645g && this.f3647h == cropImageOptions.f3647h && this.f3649i == cropImageOptions.f3649i && this.f3651j == cropImageOptions.f3651j && Float.compare(this.f3653k, cropImageOptions.f3653k) == 0 && this.f3654l == cropImageOptions.f3654l && this.f3655m == cropImageOptions.f3655m && this.f3656n == cropImageOptions.f3656n && Float.compare(this.f3657o, cropImageOptions.f3657o) == 0 && this.f3658p == cropImageOptions.f3658p && Float.compare(this.f3659q, cropImageOptions.f3659q) == 0 && Float.compare(this.f3660r, cropImageOptions.f3660r) == 0 && Float.compare(this.f3661s, cropImageOptions.f3661s) == 0 && this.f3662t == cropImageOptions.f3662t && this.f3663u == cropImageOptions.f3663u && Float.compare(this.f3664v, cropImageOptions.f3664v) == 0 && this.f3665w == cropImageOptions.f3665w && this.f3666x == cropImageOptions.f3666x && this.f3667y == cropImageOptions.f3667y && this.f3668z == cropImageOptions.f3668z && this.A == cropImageOptions.A && this.B == cropImageOptions.B && this.C == cropImageOptions.C && this.f3612D == cropImageOptions.f3612D && Intrinsics.areEqual(this.f3613E, cropImageOptions.f3613E) && this.f3614F == cropImageOptions.f3614F && Intrinsics.areEqual(this.f3615G, cropImageOptions.f3615G) && Intrinsics.areEqual(this.f3616H, cropImageOptions.f3616H) && this.f3617I == cropImageOptions.f3617I && this.f3618J == cropImageOptions.f3618J && this.f3619K == cropImageOptions.f3619K && this.f3620L == cropImageOptions.f3620L && this.f3652j0 == cropImageOptions.f3652j0 && this.f3621M == cropImageOptions.f3621M && Intrinsics.areEqual(this.f3622N, cropImageOptions.f3622N) && this.f3623O == cropImageOptions.f3623O && this.f3624P == cropImageOptions.f3624P && this.Q == cropImageOptions.Q && this.f3625R == cropImageOptions.f3625R && this.f3626S == cropImageOptions.f3626S && this.f3627T == cropImageOptions.f3627T && this.f3628U == cropImageOptions.f3628U && Intrinsics.areEqual(this.f3629V, cropImageOptions.f3629V) && this.f3630W == cropImageOptions.f3630W && this.f3631X == cropImageOptions.f3631X && this.f3632Y == cropImageOptions.f3632Y && Intrinsics.areEqual(this.f3633Z, cropImageOptions.f3633Z) && Intrinsics.areEqual(this.f3635a0, cropImageOptions.f3635a0) && Float.compare(this.f3637b0, cropImageOptions.f3637b0) == 0 && this.f3639c0 == cropImageOptions.f3639c0 && Intrinsics.areEqual(this.f3641d0, cropImageOptions.f3641d0) && this.f3642e0 == cropImageOptions.f3642e0 && Intrinsics.areEqual(this.f3644f0, cropImageOptions.f3644f0) && Intrinsics.areEqual(this.f3646g0, cropImageOptions.f3646g0) && Intrinsics.areEqual(this.f3648h0, cropImageOptions.f3648h0) && Intrinsics.areEqual(this.f3650i0, cropImageOptions.f3650i0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v93, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        boolean z2 = this.alpha;
        int i4 = 1;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i5 = r02 * 31;
        ?? r32 = this.purple;
        int i10 = r32;
        if (r32 != 0) {
            i10 = 1;
        }
        int hashCode11 = (this.f3636b.hashCode() + ((this.f3634a.hashCode() + ad.sierra(this.yellow, ad.sierra(this.white, ad.sierra(this.teal, (this.silver.hashCode() + ((this.red.hashCode() + ((i5 + i10) * 31)) * 31)) * 31, 31), 31), 31)) * 31)) * 31;
        ?? r33 = this.f3638c;
        int i11 = r33;
        if (r33 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode11 + i11) * 31;
        ?? r34 = this.f3640d;
        int i13 = r34;
        if (r34 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        ?? r35 = this.e;
        int i15 = r35;
        if (r35 != 0) {
            i15 = 1;
        }
        int i16 = (((i14 + i15) * 31) + this.f3643f) * 31;
        ?? r36 = this.f3645g;
        int i17 = r36;
        if (r36 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        ?? r37 = this.f3647h;
        int i19 = r37;
        if (r37 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        ?? r38 = this.f3649i;
        int i21 = r38;
        if (r38 != 0) {
            i21 = 1;
        }
        int sierra = ad.sierra(this.f3653k, (((i20 + i21) * 31) + this.f3651j) * 31, 31);
        ?? r39 = this.f3654l;
        int i22 = r39;
        if (r39 != 0) {
            i22 = 1;
        }
        int hashCode12 = (((this.f3613E.hashCode() + ((((((((((((((((ad.sierra(this.f3664v, (((ad.sierra(this.f3661s, ad.sierra(this.f3660r, ad.sierra(this.f3659q, (ad.sierra(this.f3657o, (((((sierra + i22) * 31) + this.f3655m) * 31) + this.f3656n) * 31, 31) + this.f3658p) * 31, 31), 31), 31) + this.f3662t) * 31) + this.f3663u) * 31, 31) + this.f3665w) * 31) + this.f3666x) * 31) + this.f3667y) * 31) + this.f3668z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.f3612D) * 31)) * 31) + this.f3614F) * 31;
        Integer num = this.f3615G;
        int i23 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i24 = (hashCode12 + hashCode) * 31;
        Uri uri = this.f3616H;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int mike = (q.mike(this.f3652j0) + ((((((((this.f3617I.hashCode() + ((i24 + hashCode2) * 31)) * 31) + this.f3618J) * 31) + this.f3619K) * 31) + this.f3620L) * 31)) * 31;
        ?? r03 = this.f3621M;
        int i25 = r03;
        if (r03 != 0) {
            i25 = 1;
        }
        int i26 = (mike + i25) * 31;
        Rect rect = this.f3622N;
        if (rect == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = rect.hashCode();
        }
        int i27 = (((i26 + hashCode3) * 31) + this.f3623O) * 31;
        ?? r04 = this.f3624P;
        int i28 = r04;
        if (r04 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        ?? r05 = this.Q;
        int i30 = r05;
        if (r05 != 0) {
            i30 = 1;
        }
        int i31 = (i29 + i30) * 31;
        ?? r06 = this.f3625R;
        int i32 = r06;
        if (r06 != 0) {
            i32 = 1;
        }
        int i33 = (((i31 + i32) * 31) + this.f3626S) * 31;
        ?? r07 = this.f3627T;
        int i34 = r07;
        if (r07 != 0) {
            i34 = 1;
        }
        int i35 = (i33 + i34) * 31;
        ?? r08 = this.f3628U;
        int i36 = r08;
        if (r08 != 0) {
            i36 = 1;
        }
        int i37 = (i35 + i36) * 31;
        CharSequence charSequence = this.f3629V;
        if (charSequence == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = charSequence.hashCode();
        }
        int i38 = (((i37 + hashCode4) * 31) + this.f3630W) * 31;
        ?? r09 = this.f3631X;
        int i39 = r09;
        if (r09 != 0) {
            i39 = 1;
        }
        int i40 = (i38 + i39) * 31;
        boolean z10 = this.f3632Y;
        if (!z10) {
            i4 = z10 ? 1 : 0;
        }
        int i41 = (i40 + i4) * 31;
        String str = this.f3633Z;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i42 = (i41 + hashCode5) * 31;
        List list = this.f3635a0;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int sierra2 = (ad.sierra(this.f3637b0, (i42 + hashCode6) * 31, 31) + this.f3639c0) * 31;
        String str2 = this.f3641d0;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i43 = (((sierra2 + hashCode7) * 31) + this.f3642e0) * 31;
        Integer num2 = this.f3644f0;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i44 = (i43 + hashCode8) * 31;
        Integer num3 = this.f3646g0;
        if (num3 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num3.hashCode();
        }
        int i45 = (i44 + hashCode9) * 31;
        Integer num4 = this.f3648h0;
        if (num4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num4.hashCode();
        }
        int i46 = (i45 + hashCode10) * 31;
        Integer num5 = this.f3650i0;
        if (num5 != null) {
            i23 = num5.hashCode();
        }
        return i46 + i23;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CropImageOptions(imageSourceIncludeGallery=");
        sb2.append(this.alpha);
        sb2.append(", imageSourceIncludeCamera=");
        sb2.append(this.purple);
        sb2.append(", cropShape=");
        sb2.append(this.red);
        sb2.append(", cornerShape=");
        sb2.append(this.silver);
        sb2.append(", cropCornerRadius=");
        sb2.append(this.teal);
        sb2.append(", snapRadius=");
        sb2.append(this.white);
        sb2.append(", touchRadius=");
        sb2.append(this.yellow);
        sb2.append(", guidelines=");
        sb2.append(this.f3634a);
        sb2.append(", scaleType=");
        sb2.append(this.f3636b);
        sb2.append(", showCropOverlay=");
        sb2.append(this.f3638c);
        sb2.append(", showCropLabel=");
        sb2.append(this.f3640d);
        sb2.append(", showProgressBar=");
        sb2.append(this.e);
        sb2.append(", progressBarColor=");
        sb2.append(this.f3643f);
        sb2.append(", autoZoomEnabled=");
        sb2.append(this.f3645g);
        sb2.append(", multiTouchEnabled=");
        sb2.append(this.f3647h);
        sb2.append(", centerMoveEnabled=");
        sb2.append(this.f3649i);
        sb2.append(", maxZoom=");
        sb2.append(this.f3651j);
        sb2.append(", initialCropWindowPaddingRatio=");
        sb2.append(this.f3653k);
        sb2.append(", fixAspectRatio=");
        sb2.append(this.f3654l);
        sb2.append(", aspectRatioX=");
        sb2.append(this.f3655m);
        sb2.append(", aspectRatioY=");
        sb2.append(this.f3656n);
        sb2.append(", borderLineThickness=");
        sb2.append(this.f3657o);
        sb2.append(", borderLineColor=");
        sb2.append(this.f3658p);
        sb2.append(", borderCornerThickness=");
        sb2.append(this.f3659q);
        sb2.append(", borderCornerOffset=");
        sb2.append(this.f3660r);
        sb2.append(", borderCornerLength=");
        sb2.append(this.f3661s);
        sb2.append(", borderCornerColor=");
        sb2.append(this.f3662t);
        sb2.append(", circleCornerFillColorHexValue=");
        sb2.append(this.f3663u);
        sb2.append(", guidelinesThickness=");
        sb2.append(this.f3664v);
        sb2.append(", guidelinesColor=");
        sb2.append(this.f3665w);
        sb2.append(", backgroundColor=");
        sb2.append(this.f3666x);
        sb2.append(", minCropWindowWidth=");
        sb2.append(this.f3667y);
        sb2.append(", minCropWindowHeight=");
        sb2.append(this.f3668z);
        sb2.append(", minCropResultWidth=");
        sb2.append(this.A);
        sb2.append(", minCropResultHeight=");
        sb2.append(this.B);
        sb2.append(", maxCropResultWidth=");
        sb2.append(this.C);
        sb2.append(", maxCropResultHeight=");
        sb2.append(this.f3612D);
        sb2.append(", activityTitle=");
        sb2.append((Object) this.f3613E);
        sb2.append(", activityMenuIconColor=");
        sb2.append(this.f3614F);
        sb2.append(", activityMenuTextColor=");
        sb2.append(this.f3615G);
        sb2.append(", customOutputUri=");
        sb2.append(this.f3616H);
        sb2.append(", outputCompressFormat=");
        sb2.append(this.f3617I);
        sb2.append(", outputCompressQuality=");
        sb2.append(this.f3618J);
        sb2.append(", outputRequestWidth=");
        sb2.append(this.f3619K);
        sb2.append(", outputRequestHeight=");
        sb2.append(this.f3620L);
        sb2.append(", outputRequestSizeOptions=");
        int i4 = this.f3652j0;
        sb2.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? BuildConfig.TRAVIS : "RESIZE_EXACT" : "RESIZE_FIT" : "RESIZE_INSIDE" : "SAMPLING" : "NONE");
        sb2.append(", noOutputImage=");
        sb2.append(this.f3621M);
        sb2.append(", initialCropWindowRectangle=");
        sb2.append(this.f3622N);
        sb2.append(", initialRotation=");
        sb2.append(this.f3623O);
        sb2.append(", allowRotation=");
        sb2.append(this.f3624P);
        sb2.append(", allowFlipping=");
        sb2.append(this.Q);
        sb2.append(", allowCounterRotation=");
        sb2.append(this.f3625R);
        sb2.append(", rotationDegrees=");
        sb2.append(this.f3626S);
        sb2.append(", flipHorizontally=");
        sb2.append(this.f3627T);
        sb2.append(", flipVertically=");
        sb2.append(this.f3628U);
        sb2.append(", cropMenuCropButtonTitle=");
        sb2.append((Object) this.f3629V);
        sb2.append(", cropMenuCropButtonIcon=");
        sb2.append(this.f3630W);
        sb2.append(", skipEditing=");
        sb2.append(this.f3631X);
        sb2.append(", showIntentChooser=");
        sb2.append(this.f3632Y);
        sb2.append(", intentChooserTitle=");
        sb2.append(this.f3633Z);
        sb2.append(", intentChooserPriorityList=");
        sb2.append(this.f3635a0);
        sb2.append(", cropperLabelTextSize=");
        sb2.append(this.f3637b0);
        sb2.append(", cropperLabelTextColor=");
        sb2.append(this.f3639c0);
        sb2.append(", cropperLabelText=");
        sb2.append(this.f3641d0);
        sb2.append(", activityBackgroundColor=");
        sb2.append(this.f3642e0);
        sb2.append(", toolbarColor=");
        sb2.append(this.f3644f0);
        sb2.append(", toolbarTitleColor=");
        sb2.append(this.f3646g0);
        sb2.append(", toolbarBackButtonColor=");
        sb2.append(this.f3648h0);
        sb2.append(", toolbarTintColor=");
        sb2.append(this.f3650i0);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i4) {
        String str;
        Intrinsics.echo(out, "out");
        out.writeInt(this.alpha ? 1 : 0);
        out.writeInt(this.purple ? 1 : 0);
        out.writeString(this.red.name());
        out.writeString(this.silver.name());
        out.writeFloat(this.teal);
        out.writeFloat(this.white);
        out.writeFloat(this.yellow);
        out.writeString(this.f3634a.name());
        out.writeString(this.f3636b.name());
        out.writeInt(this.f3638c ? 1 : 0);
        out.writeInt(this.f3640d ? 1 : 0);
        out.writeInt(this.e ? 1 : 0);
        out.writeInt(this.f3643f);
        out.writeInt(this.f3645g ? 1 : 0);
        out.writeInt(this.f3647h ? 1 : 0);
        out.writeInt(this.f3649i ? 1 : 0);
        out.writeInt(this.f3651j);
        out.writeFloat(this.f3653k);
        out.writeInt(this.f3654l ? 1 : 0);
        out.writeInt(this.f3655m);
        out.writeInt(this.f3656n);
        out.writeFloat(this.f3657o);
        out.writeInt(this.f3658p);
        out.writeFloat(this.f3659q);
        out.writeFloat(this.f3660r);
        out.writeFloat(this.f3661s);
        out.writeInt(this.f3662t);
        out.writeInt(this.f3663u);
        out.writeFloat(this.f3664v);
        out.writeInt(this.f3665w);
        out.writeInt(this.f3666x);
        out.writeInt(this.f3667y);
        out.writeInt(this.f3668z);
        out.writeInt(this.A);
        out.writeInt(this.B);
        out.writeInt(this.C);
        out.writeInt(this.f3612D);
        TextUtils.writeToParcel(this.f3613E, out, i4);
        out.writeInt(this.f3614F);
        Integer num = this.f3615G;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeParcelable(this.f3616H, i4);
        out.writeString(this.f3617I.name());
        out.writeInt(this.f3618J);
        out.writeInt(this.f3619K);
        out.writeInt(this.f3620L);
        int i5 = this.f3652j0;
        if (i5 == 1) {
            str = "NONE";
        } else if (i5 == 2) {
            str = "SAMPLING";
        } else if (i5 == 3) {
            str = "RESIZE_INSIDE";
        } else if (i5 == 4) {
            str = "RESIZE_FIT";
        } else {
            if (i5 != 5) {
                throw null;
            }
            str = "RESIZE_EXACT";
        }
        out.writeString(str);
        out.writeInt(this.f3621M ? 1 : 0);
        out.writeParcelable(this.f3622N, i4);
        out.writeInt(this.f3623O);
        out.writeInt(this.f3624P ? 1 : 0);
        out.writeInt(this.Q ? 1 : 0);
        out.writeInt(this.f3625R ? 1 : 0);
        out.writeInt(this.f3626S);
        out.writeInt(this.f3627T ? 1 : 0);
        out.writeInt(this.f3628U ? 1 : 0);
        TextUtils.writeToParcel(this.f3629V, out, i4);
        out.writeInt(this.f3630W);
        out.writeInt(this.f3631X ? 1 : 0);
        out.writeInt(this.f3632Y ? 1 : 0);
        out.writeString(this.f3633Z);
        out.writeStringList(this.f3635a0);
        out.writeFloat(this.f3637b0);
        out.writeInt(this.f3639c0);
        out.writeString(this.f3641d0);
        out.writeInt(this.f3642e0);
        Integer num2 = this.f3644f0;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f3646g0;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.f3648h0;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f3650i0;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CropImageOptions(x xVar, v vVar, float f5, float f10, float f11, y yVar, ae aeVar, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i4, float f12, boolean z15, int i5, int i10, float f13, int i11, float f14, float f15, float f16, int i12, int i13, float f17, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, boolean z16, boolean z17, float f18, int i22, String str, int i23, int i24) {
        this(true, true, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, (i23 & RecyclerView.UNDEFINED_DURATION) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i16, (i24 & 1) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i17, (i24 & 2) != 0 ? 40 : i18, (i24 & 4) != 0 ? 40 : i19, (i24 & 8) != 0 ? 99999 : i20, (i24 & 16) != 0 ? 99999 : i21, "", 0, null, null, Bitmap.CompressFormat.JPEG, 90, 0, 0, 1, false, null, -1, true, true, false, 90, (i24 & r73) != 0 ? false : z16, (i24 & 4194304) != 0 ? false : z17, null, 0, false, false, null, CollectionsKt.emptyList(), (i24 & r76) != 0 ? TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics()) : f18, (i24 & 1073741824) != 0 ? -1 : i22, (i24 & RecyclerView.UNDEFINED_DURATION) != 0 ? "" : str, -1, null, null, null, null);
        int i25;
        float f19;
        int i26;
        int i27;
        x xVar2 = (i23 & 4) != 0 ? x.alpha : xVar;
        v vVar2 = (i23 & 8) != 0 ? v.alpha : vVar;
        float applyDimension = (i23 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f5;
        float applyDimension2 = (i23 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f10;
        float applyDimension3 = (i23 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f11;
        y yVar2 = (i23 & 128) != 0 ? y.purple : yVar;
        ae aeVar2 = (i23 & Barcode.FORMAT_QR_CODE) != 0 ? ae.alpha : aeVar;
        boolean z18 = (i23 & 512) != 0 ? true : z2;
        boolean z19 = (i23 & Barcode.FORMAT_UPC_E) != 0 ? false : z10;
        boolean z20 = (i23 & 2048) != 0 ? true : z11;
        int rgb = Color.rgb(153, 51, 153);
        boolean z21 = (i23 & 8192) != 0 ? true : z12;
        boolean z22 = (i23 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z13;
        boolean z23 = (32768 & i23) != 0 ? true : z14;
        int i28 = (65536 & i23) != 0 ? 4 : i4;
        float f20 = (131072 & i23) != 0 ? 0.0f : f12;
        boolean z24 = (262144 & i23) != 0 ? false : z15;
        int i29 = (524288 & i23) != 0 ? 1 : i5;
        int i30 = (1048576 & i23) != 0 ? 1 : i10;
        if ((i23 & 2097152) != 0) {
            i25 = 2097152;
            f19 = TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics());
        } else {
            i25 = 2097152;
            f19 = f13;
        }
        int argb = (i23 & 4194304) != 0 ? Color.argb(170, 255, 255, 255) : i11;
        float applyDimension4 = (8388608 & i23) != 0 ? TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics()) : f14;
        float applyDimension5 = (16777216 & i23) != 0 ? TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics()) : f15;
        float applyDimension6 = (33554432 & i23) != 0 ? TypedValue.applyDimension(1, 14.0f, Resources.getSystem().getDisplayMetrics()) : f16;
        int i31 = (67108864 & i23) != 0 ? -1 : i12;
        int i32 = (134217728 & i23) != 0 ? -1 : i13;
        float applyDimension7 = (268435456 & i23) != 0 ? TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics()) : f17;
        int argb2 = (i23 & 536870912) != 0 ? Color.argb(170, 255, 255, 255) : i14;
        if ((i23 & 1073741824) != 0) {
            i26 = 536870912;
            i27 = Color.argb(119, 0, 0, 0);
        } else {
            i26 = 536870912;
            i27 = i15;
        }
    }
}
