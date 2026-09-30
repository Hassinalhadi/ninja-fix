package a4;

import android.graphics.Rect;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f2618a;
    public final Uri alpha;
    public final Uri purple;
    public final Exception red;
    public final float[] silver;
    public final Rect teal;
    public final Rect white;
    public final int yellow;

    public w(Uri uri, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i4, int i5) {
        Intrinsics.echo(cropPoints, "cropPoints");
        this.alpha = uri;
        this.purple = uri2;
        this.red = exc;
        this.silver = cropPoints;
        this.teal = rect;
        this.white = rect2;
        this.yellow = i4;
        this.f2618a = i5;
    }
}
