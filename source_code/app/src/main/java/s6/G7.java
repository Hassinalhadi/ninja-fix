package s6;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public abstract class G7 {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object alpha(m0.af r8, Pd.a r9) {
        /*
            boolean r0 = r9 instanceof r.C2477a
            if (r0 == 0) goto L13
            r0 = r9
            r.a r0 = (r.C2477a) r0
            int r1 = r0.red
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.red = r1
            goto L18
        L13:
            r.a r0 = new r.a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.purple
            Od.a r1 = Od.a.alpha
            int r2 = r0.red
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            m0.af r8 = r0.alpha
            kotlin.ResultKt.alpha(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.ResultKt.alpha(r9)
        L34:
            r0.alpha = r8
            r0.red = r3
            java.lang.Object r9 = com.google.android.material.datepicker.j.alpha(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            m0.k r9 = (m0.k) r9
            int r2 = r9.delta
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r9 = r9.alpha
            int r2 = r9.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L68
            java.lang.Object r6 = r9.get(r5)
            m0.r r6 = (m0.r) r6
            boolean r7 = r6.bravo()
            if (r7 != 0) goto L34
            boolean r7 = r6.hotel
            if (r7 != 0) goto L34
            boolean r6 = r6.delta
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L4f
        L68:
            java.lang.Object r8 = r9.get(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.G7.alpha(m0.af, Pd.a):java.lang.Object");
    }

    public static ColorStateList bravo(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && E0.d.uniform(drawable)) {
            colorStateList = E0.d.echo(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static void charlie(Outline outline, Path path) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            U6.b.alpha(outline, path);
            return;
        }
        if (i4 >= 29) {
            try {
                U6.a.alpha(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            U6.a.alpha(outline, path);
        }
    }
}
