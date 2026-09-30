package U7;

import D5.s;
import E0.k;
import F8.q;
import O7.g;
import O7.i;
import R7.k0;
import android.util.Log;
import ao.ad;
import com.clevertap.android.sdk.leanplum.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class a {
    public static final Charset echo = Charset.forName("UTF-8");
    public static final int foxtrot = 15;
    public static final S7.c golf = new Object();
    public static final k hotel = new k(3);
    public static final g india = new g(2);
    public final AtomicInteger alpha = new AtomicInteger(0);
    public final c bravo;
    public final s charlie;
    public final i delta;

    public a(c cVar, s sVar, i iVar) {
        this.bravo = cVar;
        this.charlie = sVar;
        this.delta = iVar;
    }

    public static void alpha(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String echo(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), echo);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void foxtrot(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), echo);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList bravo() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.bravo;
        arrayList.addAll(c.india(((File) cVar.white).listFiles()));
        arrayList.addAll(c.india(((File) cVar.yellow).listFiles()));
        k kVar = hotel;
        Collections.sort(arrayList, kVar);
        List india2 = c.india(((File) cVar.teal).listFiles());
        Collections.sort(india2, kVar);
        arrayList.addAll(india2);
        return arrayList;
    }

    public final NavigableSet charlie() {
        return new TreeSet(c.india(((File) this.bravo.silver).list())).descendingSet();
    }

    public final void delta(k0 k0Var, String str, boolean z2) {
        String str2;
        c cVar = this.bravo;
        q qVar = this.charlie.delta().alpha;
        golf.getClass();
        String amber = S7.c.alpha.amber(k0Var);
        String format = String.format(Locale.US, "%010d", Integer.valueOf(this.alpha.getAndIncrement()));
        if (z2) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            foxtrot(cVar.charlie(str, ad.gray(Constants.CHARGED_EVENT_PARAM, format, str2)), amber);
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        g gVar = new g(3);
        cVar.getClass();
        File file = new File((File) cVar.silver, str);
        file.mkdirs();
        List<File> india2 = c.india(file.listFiles(gVar));
        Collections.sort(india2, new k(4));
        int size = india2.size();
        for (File file2 : india2) {
            if (size > qVar.alpha) {
                c.hotel(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
