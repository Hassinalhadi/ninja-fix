package F9;

import H9.k;
import H9.m;
import J2.n;
import Xd.l;
import android.content.Context;
import android.util.Log;
import ao.ad;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;
import s6.G5;
import vf.ab;
import vf.ao;

/* loaded from: classes2.dex */
public final class h extends Pd.i implements l {
    public String alpha;
    public int purple;
    public final /* synthetic */ File red;
    public final /* synthetic */ n silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file, n nVar, Nd.c cVar) {
        super(2, cVar);
        this.red = file;
        this.silver = nVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new h(this.red, this.silver, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        char c3;
        Object blue;
        String operationType;
        String str;
        String str2;
        Od.a aVar = Od.a.alpha;
        int i4 = this.purple;
        H9.a aVar2 = null;
        File sourceFile = this.red;
        n nVar = this.silver;
        if (i4 != 0) {
            if (i4 == 1) {
                operationType = this.alpha;
                ResultKt.alpha(obj);
                blue = obj;
                c3 = 0;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            Intrinsics.echo(sourceFile, "sourceFile");
            Log.d("ImageUpload", "   Step 1: Validating basic properties...");
            m alpha = ((j) ((E9.d) nVar.purple)).alpha(sourceFile);
            if (alpha instanceof k) {
                Log.e("ImageUpload", "   ❌ Basic validation failed: " + ((k) alpha).alpha);
                return alpha;
            }
            Log.d("ImageUpload", "   ✅ Basic validation passed");
            Log.d("ImageUpload", "   Step 2: Getting storage directory...");
            File alpha2 = ((i) ((E9.c) nVar.silver)).alpha((Context) nVar.alpha);
            if (alpha2 == null) {
                Log.e("ImageUpload", "   ❌ Storage unavailable");
                sourceFile.getAbsolutePath();
                return new k(H9.h.alpha);
            }
            Log.d("ImageUpload", "   ✅ Storage directory: " + alpha2.getAbsolutePath());
            String format = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.getDefault()).format(new Date());
            File file = new File(alpha2, ad.gray("DELIVERY_", format, ".jpg"));
            for (int i5 = 0; file.exists() && i5 < 100; i5++) {
                file = new File(alpha2, "DELIVERY_" + format + "_" + i5 + ".jpg");
            }
            c3 = 0;
            Log.d("ImageUpload", "   Step 3: Compressing image...");
            Log.d("ImageUpload", "   Target file: " + file.getName());
            this.alpha = "delivery_proof";
            this.purple = 1;
            Cf.e eVar = ao.alpha;
            blue = vf.ad.blue(Cf.d.purple, new g(nVar, sourceFile, file, null), this);
            if (blue != aVar) {
                operationType = "delivery_proof";
            } else {
                return aVar;
            }
        }
        m mVar = (m) blue;
        if (mVar instanceof k) {
            k kVar = (k) mVar;
            H9.j jVar = kVar.alpha;
            if (jVar instanceof H9.a) {
                aVar2 = (H9.a) jVar;
            }
            if (aVar2 != null) {
                str2 = "All compression attempts failed";
            } else {
                str2 = "Unknown";
            }
            Log.e("ImageUpload", "   ❌ Compression failed: ".concat(str2));
            boolean z2 = kVar.alpha instanceof H9.a;
            Intrinsics.echo(sourceFile, "sourceFile");
            Intrinsics.echo(operationType, "operationType");
            return mVar;
        }
        if (mVar instanceof H9.l) {
            H9.l lVar = (H9.l) mVar;
            long length = ((File) lVar.alpha).length();
            nVar.getClass();
            if (length >= 1048576) {
                Double valueOf = Double.valueOf(length / 1048576.0d);
                Object[] objArr = new Object[1];
                objArr[c3] = valueOf;
                str = String.format("%.2f MB", Arrays.copyOf(objArr, 1));
            } else if (length >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                Double valueOf2 = Double.valueOf(length / 1024.0d);
                Object[] objArr2 = new Object[1];
                objArr2[c3] = valueOf2;
                str = String.format("%.2f KB", Arrays.copyOf(objArr2, 1));
            } else {
                str = length + " bytes";
            }
            Log.i("ImageUpload", "   ✅ Compression successful: " + str);
            File file2 = (File) lVar.alpha;
            Log.d("ImageUpload", "   Step 4: Final validation...");
            m bravo = ((j) ((E9.d) nVar.purple)).bravo(file2);
            if (bravo instanceof k) {
                Log.e("ImageUpload", "   ❌ Final validation failed: " + ((k) bravo).alpha);
                Intrinsics.echo(operationType, "operationType");
                G5.bravo(file2, "ImagePreparer_validation_failed");
                return bravo;
            }
            Log.i("ImageUpload", "   ✅ Image preparation complete");
            Log.i("ImageUpload", "═══════════════════════════════════════════════════════════");
            return new H9.l(file2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
