package J8;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import e6.AbstractC1630b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class q extends Lambda implements Function1 {
    public static final q purple = new q(1, 0);
    public static final q red = new q(1, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r1 = android.app.Application.getProcessName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = android.app.Application.getProcessName();
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String bravo;
        String bravo2;
        switch (this.alpha) {
            case 0:
                CorruptionException ex = (CorruptionException) obj;
                Intrinsics.echo(ex, "ex");
                StringBuilder sb2 = new StringBuilder("CorruptionException in settings DataStore in ");
                int i4 = Build.VERSION.SDK_INT;
                if (i4 > 33) {
                    bravo = Process.myProcessName();
                    Intrinsics.delta(bravo, "myProcessName()");
                } else if ((i4 < 28 || bravo == null) && (bravo = AbstractC1630b.bravo()) == null) {
                    bravo = "";
                }
                sb2.append(bravo);
                sb2.append('.');
                Log.w(FirebaseSessionsRegistrar.TAG, sb2.toString(), ex);
                return new G1.b(true);
            default:
                CorruptionException ex2 = (CorruptionException) obj;
                Intrinsics.echo(ex2, "ex");
                StringBuilder sb3 = new StringBuilder("CorruptionException in sessions DataStore in ");
                int i5 = Build.VERSION.SDK_INT;
                if (i5 > 33) {
                    bravo2 = Process.myProcessName();
                    Intrinsics.delta(bravo2, "myProcessName()");
                } else if ((i5 < 28 || bravo2 == null) && (bravo2 = AbstractC1630b.bravo()) == null) {
                    bravo2 = "";
                }
                sb3.append(bravo2);
                sb3.append('.');
                Log.w(FirebaseSessionsRegistrar.TAG, sb3.toString(), ex2);
                return new G1.b(true);
        }
    }
}
