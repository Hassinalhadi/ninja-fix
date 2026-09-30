package t6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import delivery.samurai.android.R;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import pf.C2359i;
import s6.AbstractC2770s7;
import s6.E6;
import x1.C3279a;

/* renamed from: t6.c3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2977c3 {
    public static final void alpha(View view) {
        Intrinsics.echo(view, "<this>");
        C2359i bravo = AbstractC2770s7.bravo(new s1.ax(view, null));
        while (bravo.hasNext()) {
            ArrayList arrayList = charlie((View) bravo.next()).alpha;
            for (int ivory = CollectionsKt.ivory(arrayList); -1 < ivory; ivory--) {
                ((t0.x0) arrayList.get(ivory)).alpha.delta();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (s6.E6.bravo(r9, r1, r3, r2, r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap bravo(Drawable drawable, Bitmap.Config config, Y2.h hVar, Y2.g gVar, boolean z2) {
        BitmapDrawable bitmapDrawable;
        int intrinsicWidth;
        int intrinsicHeight;
        int delta;
        int delta2;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap.Config config2;
        int delta3;
        int delta4;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config config3 = bitmap3.getConfig();
            if (config != null && !Z2.charlie(config)) {
                config2 = config;
            } else {
                config2 = Bitmap.Config.ARGB_8888;
            }
            if (config3 == config2) {
                if (!z2) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    Y2.h hVar2 = Y2.h.charlie;
                    if (Intrinsics.areEqual(hVar, hVar2)) {
                        delta3 = bitmap3.getWidth();
                    } else {
                        delta3 = a3.h.delta(hVar.alpha, gVar);
                    }
                    if (Intrinsics.areEqual(hVar, hVar2)) {
                        delta4 = bitmap3.getHeight();
                    } else {
                        delta4 = a3.h.delta(hVar.bravo, gVar);
                    }
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = a3.h.alpha;
        boolean z10 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable2 = null;
        if (z10) {
            bitmapDrawable = (BitmapDrawable) mutate;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap2 = bitmapDrawable.getBitmap()) != null) {
            intrinsicWidth = bitmap2.getWidth();
        } else {
            intrinsicWidth = mutate.getIntrinsicWidth();
        }
        int i4 = 512;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        if (z10) {
            bitmapDrawable2 = (BitmapDrawable) mutate;
        }
        if (bitmapDrawable2 != null && (bitmap = bitmapDrawable2.getBitmap()) != null) {
            intrinsicHeight = bitmap.getHeight();
        } else {
            intrinsicHeight = mutate.getIntrinsicHeight();
        }
        if (intrinsicHeight > 0) {
            i4 = intrinsicHeight;
        }
        Y2.h hVar3 = Y2.h.charlie;
        if (Intrinsics.areEqual(hVar, hVar3)) {
            delta = intrinsicWidth;
        } else {
            delta = a3.h.delta(hVar.alpha, gVar);
        }
        if (Intrinsics.areEqual(hVar, hVar3)) {
            delta2 = i4;
        } else {
            delta2 = a3.h.delta(hVar.bravo, gVar);
        }
        double bravo = E6.bravo(intrinsicWidth, i4, delta, delta2, gVar);
        int charlie = Zd.a.charlie(intrinsicWidth * bravo);
        int charlie2 = Zd.a.charlie(bravo * i4);
        if (config == null || Z2.charlie(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(charlie, charlie2, config);
        Rect bounds = mutate.getBounds();
        int i5 = bounds.left;
        int i10 = bounds.top;
        int i11 = bounds.right;
        int i12 = bounds.bottom;
        mutate.setBounds(0, 0, charlie, charlie2);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i5, i10, i11, i12);
        return createBitmap;
    }

    public static final C3279a charlie(View view) {
        C3279a c3279a = (C3279a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c3279a == null) {
            C3279a c3279a2 = new C3279a();
            view.setTag(R.id.pooling_container_listener_holder_tag, c3279a2);
            return c3279a2;
        }
        return c3279a;
    }
}
