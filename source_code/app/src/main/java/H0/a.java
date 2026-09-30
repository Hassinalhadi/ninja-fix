package H0;

import android.app.Service;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.TypedValue;
import com.clevertap.android.sdk.Constants;
import e6.AbstractC1630b;
import g6.AbstractC1753a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2805w6;
import s6.J4;
import s6.W6;

/* loaded from: classes3.dex */
public final class a implements J3.s, J3.f, Y3.g {
    public final /* synthetic */ int alpha;
    public final Context purple;

    public /* synthetic */ a(Context context, int i4) {
        this.alpha = i4;
        this.purple = context;
    }

    @Override // J3.f
    public Class alpha() {
        return Drawable.class;
    }

    public ApplicationInfo bravo(int i4, String str) {
        return this.purple.getPackageManager().getApplicationInfo(str, i4);
    }

    public PackageInfo charlie(int i4, String str) {
        return this.purple.getPackageManager().getPackageInfo(str, i4);
    }

    @Override // J3.f
    public Object delta(int i4, Resources.Theme theme, Resources resources) {
        Context context = this.purple;
        return AbstractC2805w6.alpha(context, context, i4, theme);
    }

    @Override // J3.f
    public /* bridge */ /* synthetic */ void echo(Object obj) {
    }

    public boolean foxtrot() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.purple;
        if (callingUid == myUid) {
            return AbstractC1753a.alpha(context);
        }
        if (AbstractC1630b.delta() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @Override // Y3.g
    public Object get() {
        return (ConnectivityManager) this.purple.getSystemService("connectivity");
    }

    public Typeface golf(i iVar) {
        Typeface bravo;
        int i4;
        String str;
        String str2;
        if (!(iVar instanceof z)) {
            return null;
        }
        z zVar = (z) iVar;
        zVar.getClass();
        ThreadLocal threadLocal = i1.k.alpha;
        Context context = this.purple;
        if (context.isRestricted()) {
            bravo = null;
        } else {
            bravo = i1.k.bravo(context, zVar.alpha, new TypedValue(), 0, null, false, false);
        }
        Intrinsics.checkNotNull(bravo);
        u uVar = zVar.delta;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            ThreadLocal threadLocal2 = ab.alpha;
            if (bravo == null) {
                return null;
            }
            ArrayList arrayList = uVar.alpha;
            if (!arrayList.isEmpty()) {
                ThreadLocal threadLocal3 = ab.alpha;
                Paint paint = (Paint) threadLocal3.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal3.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(bravo);
                Q0.f alpha = W6.alpha(context);
                if (i5 < 31 || g3.z.charlie(context.getResources().getConfiguration()) == Integer.MAX_VALUE) {
                    i4 = 0;
                } else {
                    i4 = g3.z.charlie(context.getResources().getConfiguration());
                }
                if (i4 == 0) {
                    str2 = S0.a.alpha(arrayList, null, new D0.z(alpha), 31);
                } else if (arrayList.size() <= 0) {
                    float charlie = J4.charlie(i4 + 400.0f, 1.0f, 1000.0f);
                    if (!arrayList.isEmpty()) {
                        str = Constants.SEPARATOR_COMMA;
                    } else {
                        str = "";
                    }
                    str2 = str + "'wght' " + charlie;
                } else {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
                paint.setFontVariationSettings(str2);
                return paint.getTypeface();
            }
        }
        return bravo;
    }

    @Override // J3.s
    public J3.r sierra(J3.x xVar) {
        switch (this.alpha) {
            case 1:
                return new J3.b(this.purple, this);
            case 2:
                return new J3.n(this.purple, 0);
            case 3:
                return new J3.b(this.purple, xVar.bravo(Integer.class, AssetFileDescriptor.class));
            default:
                return new J3.n(this.purple, 1);
        }
    }

    public a(Service service) {
        this.alpha = 7;
        V5.x.hotel(service);
        Context applicationContext = service.getApplicationContext();
        V5.x.hotel(applicationContext);
        this.purple = applicationContext;
    }

    public a(Context context) {
        this.alpha = 0;
        this.purple = context.getApplicationContext();
    }
}
