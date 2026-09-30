package g7;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.L;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1327h3;
import com.google.android.gms.internal.measurement.C1358o2;
import com.google.android.gms.internal.measurement.C1362p2;
import com.google.android.gms.internal.measurement.C1369r2;
import com.google.android.gms.internal.measurement.G2;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.z3;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC2593a;
import s2.InterfaceC2594b;
import s6.AbstractC2679i5;

/* loaded from: classes2.dex */
public class f implements H0.y, M7.a, E3.l, R3.m, I7.e, kotlin.time.a, W2.f, X7.a, Z3.c, T1.b, InterfaceC2593a, com.google.android.gms.measurement.internal.aa {
    public final /* synthetic */ int alpha;

    public /* synthetic */ f(int i4) {
        this.alpha = i4;
    }

    public static Typeface foxtrot(String str, H0.v vVar, int i4) {
        if (i4 == 0 && Intrinsics.areEqual(vVar, H0.v.yellow) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int alpha = AbstractC2679i5.alpha(vVar, i4);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, alpha);
        }
        return Typeface.defaultFromStyle(alpha);
    }

    @Override // s2.InterfaceC2593a
    public InterfaceC2594b alpha(Fe.u uVar) {
        return new androidx.sqlite.db.framework.g((Context) uVar.charlie, (String) uVar.delta, (B0.a) uVar.echo, uVar.alpha, uVar.bravo);
    }

    @Override // E3.c
    public boolean azure(Object obj, File file, E3.i iVar) {
        try {
            Y3.b.delta(((P3.h) ((P3.c) ((com.bumptech.glide.load.engine.w) obj).get()).alpha.bravo).alpha.delta.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
                return false;
            }
            return false;
        }
    }

    @Override // E3.l
    public int beige(E3.i iVar) {
        return 1;
    }

    @Override // W2.f
    public boolean bravo() {
        return true;
    }

    @Override // H0.y
    public Typeface charlie(H0.x xVar, H0.v vVar, int i4) {
        String str = xVar.white;
        int i5 = vVar.alpha / 100;
        if (i5 >= 0 && i5 < 2) {
            str = str.concat("-thin");
        } else if (2 <= i5 && i5 < 4) {
            str = str.concat("-light");
        } else if (i5 != 4) {
            if (i5 == 5) {
                str = str.concat("-medium");
            } else if ((6 > i5 || i5 >= 8) && 8 <= i5 && i5 < 11) {
                str = str.concat("-black");
            }
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface foxtrot = foxtrot(str, vVar, i4);
            if (!Intrinsics.areEqual(foxtrot, Typeface.create(Typeface.DEFAULT, AbstractC2679i5.alpha(vVar, i4))) && !Intrinsics.areEqual(foxtrot, foxtrot(null, vVar, i4))) {
                typeface = foxtrot;
            }
        }
        if (typeface == null) {
            return foxtrot(xVar.white, vVar, i4);
        }
        return typeface;
    }

    @Override // I7.e
    public Object create(I7.c cVar) {
        return new V8.c(((B9.ab) cVar).maroon(V8.b.class));
    }

    @Override // Z3.c
    public void delta(Object obj) {
        ((List) obj).clear();
    }

    @Override // H0.y
    public Typeface echo(H0.v vVar, int i4) {
        return foxtrot(null, vVar, i4);
    }

    @Override // X7.a
    public StackTraceElement[] emerald(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[Barcode.FORMAT_UPC_E];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // kotlin.time.a
    public kotlin.time.e golf() {
        kotlin.time.e eVar = kotlin.time.e.red;
        long currentTimeMillis = System.currentTimeMillis();
        long j5 = currentTimeMillis / 1000;
        if ((currentTimeMillis ^ 1000) < 0 && j5 * 1000 != currentTimeMillis) {
            j5--;
        }
        long j6 = currentTimeMillis % 1000;
        int i4 = (int) ((j6 + (1000 & (((j6 ^ 1000) & ((-j6) | j6)) >> 63))) * 1000000);
        if (j5 < -31557014167219200L) {
            return kotlin.time.e.red;
        }
        if (j5 > 31556889864403199L) {
            return kotlin.time.e.silver;
        }
        return kotlin.time.g.india(i4, j5);
    }

    public boolean hotel(CharSequence charSequence) {
        return false;
    }

    @Override // M7.a
    public void juliet(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // W2.f
    public void shutdown() {
    }

    @Override // com.google.android.gms.measurement.internal.aa
    public Object zza() {
        switch (this.alpha) {
            case 20:
                List list = com.google.android.gms.measurement.internal.ac.alpha;
                Boolean bool = (Boolean) G2.charlie.bravo();
                bool.getClass();
                return bool;
            case 21:
                List list2 = com.google.android.gms.measurement.internal.ac.alpha;
                Boolean bool2 = (Boolean) C1358o2.alpha.bravo();
                bool2.getClass();
                return bool2;
            case 22:
                List list3 = com.google.android.gms.measurement.internal.ac.alpha;
                x3.purple.get();
                Boolean bool3 = (Boolean) z3.foxtrot.bravo();
                bool3.getClass();
                return bool3;
            case 23:
                List list4 = com.google.android.gms.measurement.internal.ac.alpha;
                C1317f3.purple.get();
                Boolean bool4 = (Boolean) C1327h3.alpha.bravo();
                bool4.getClass();
                return bool4;
            case 24:
                Boolean bool5 = (Boolean) q3.alpha.bravo();
                bool5.getClass();
                return bool5;
            case 25:
                Boolean bool6 = (Boolean) P2.alpha.bravo();
                bool6.getClass();
                return bool6;
            case 26:
                List list5 = com.google.android.gms.measurement.internal.ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.yellow.bravo()).longValue());
            case 27:
                List list6 = com.google.android.gms.measurement.internal.ac.alpha;
                C1362p2.purple.get();
                return (String) C1369r2.fuchsia.bravo();
            case 28:
                List list7 = com.google.android.gms.measurement.internal.ac.alpha;
                C1362p2.purple.get();
                return Integer.valueOf((int) ((Long) C1369r2.crimson.bravo()).longValue());
            default:
                List list8 = com.google.android.gms.measurement.internal.ac.alpha;
                C1362p2.purple.get();
                Long l10 = (Long) C1369r2.purple.bravo();
                l10.getClass();
                return l10;
        }
    }

    public f(w.o oVar, L l10) {
        this.alpha = 8;
    }
}
