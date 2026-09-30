package a4;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.P;
import vf.ao;

/* loaded from: classes3.dex */
public final class e implements vf.ab {

    /* renamed from: a, reason: collision with root package name */
    public final int f2604a;
    public final Context alpha;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2606c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2607d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2608f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2609g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2610h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2611i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap.CompressFormat f2612j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2613k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f2614l;

    /* renamed from: m, reason: collision with root package name */
    public P f2615m;
    public final WeakReference purple;
    public final Uri red;
    public final Bitmap silver;
    public final float[] teal;
    public final int white;
    public final int yellow;

    public e(Context context, WeakReference weakReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i4, int i5, int i10, boolean z2, int i11, int i12, int i13, int i14, boolean z10, boolean z11, int i15, Bitmap.CompressFormat saveCompressFormat, int i16, Uri uri2) {
        Intrinsics.echo(cropPoints, "cropPoints");
        com.google.android.material.datepicker.j.papa(i15, "options");
        Intrinsics.echo(saveCompressFormat, "saveCompressFormat");
        this.alpha = context;
        this.purple = weakReference;
        this.red = uri;
        this.silver = bitmap;
        this.teal = cropPoints;
        this.white = i4;
        this.yellow = i5;
        this.f2604a = i10;
        this.f2605b = z2;
        this.f2606c = i11;
        this.f2607d = i12;
        this.e = i13;
        this.f2608f = i14;
        this.f2609g = z10;
        this.f2610h = z11;
        this.f2611i = i15;
        this.f2612j = saveCompressFormat;
        this.f2613k = i16;
        this.f2614l = uri2;
        this.f2615m = vf.ad.delta();
    }

    public static final Object alpha(e eVar, C0403a c0403a, Pd.i iVar) {
        Cf.e eVar2 = ao.alpha;
        Object blue = vf.ad.blue(Af.n.alpha, new C0404b(eVar, c0403a, null), iVar);
        if (blue == Od.a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        Cf.e eVar = ao.alpha;
        return Af.n.alpha.plus(this.f2615m);
    }
}
