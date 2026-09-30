package s6;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import com.google.firebase.components.DependencyCycleException;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class E5 {
    public static void alpha(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean bravo(File file, Resources resources, int i4) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i4);
            try {
                boolean charlie = charlie(file, inputStream);
                alpha(inputStream);
                return charlie;
            } catch (Throwable th) {
                th = th;
                alpha(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean charlie(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    alpha(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            alpha(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            alpha(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static void delta(ArrayList arrayList) {
        boolean z2;
        boolean z10;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i4 = 0;
            if (it.hasNext()) {
                I7.b bVar = (I7.b) it.next();
                I7.h hVar = new I7.h(bVar);
                for (I7.p pVar : bVar.bravo) {
                    if (bVar.echo == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    I7.i iVar = new I7.i(pVar, !z10);
                    if (!hashMap.containsKey(iVar)) {
                        hashMap.put(iVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(iVar);
                    if (!set.isEmpty() && z10) {
                        throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                    }
                    set.add(hVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (I7.h hVar2 : (Set) it2.next()) {
                        for (I7.j jVar : hVar2.alpha.charlie) {
                            if (jVar.charlie == 0) {
                                if (jVar.bravo == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Set<I7.h> set2 = (Set) hashMap.get(new I7.i(jVar.alpha, z2));
                                if (set2 != null) {
                                    for (I7.h hVar3 : set2) {
                                        hVar2.bravo.add(hVar3);
                                        hVar3.charlie.add(hVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    I7.h hVar4 = (I7.h) it4.next();
                    if (hVar4.charlie.isEmpty()) {
                        hashSet2.add(hVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    I7.h hVar5 = (I7.h) hashSet2.iterator().next();
                    hashSet2.remove(hVar5);
                    i4++;
                    Iterator it5 = hVar5.bravo.iterator();
                    while (it5.hasNext()) {
                        I7.h hVar6 = (I7.h) it5.next();
                        hVar6.charlie.remove(hVar5);
                        if (hVar6.charlie.isEmpty()) {
                            hashSet2.add(hVar6);
                        }
                    }
                }
                if (i4 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    I7.h hVar7 = (I7.h) it6.next();
                    if (!hVar7.charlie.isEmpty() && !hVar7.bravo.isEmpty()) {
                        arrayList2.add(hVar7.alpha);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
        }
    }

    public static File echo(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer foxtrot(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }
}
