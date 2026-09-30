package android.support.v4.media.session;

import Aa.m;
import E3.k;
import E5.j;
import G3.g;
import J3.ad;
import J3.y;
import J3.z;
import P3.i;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import av.ah;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.l;
import com.bumptech.glide.load.resource.bitmap.ab;
import com.bumptech.glide.load.resource.bitmap.e;
import com.bumptech.glide.load.resource.bitmap.o;
import g8.d;
import id.C1915c;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [E3.e, java.lang.Object] */
    public static h alpha(com.bumptech.glide.b bVar, List list, S3.a aVar) {
        k eVar;
        k aVar2;
        int i4;
        Resources resources;
        String str;
        String str2;
        G3.b bVar2 = bVar.alpha;
        f fVar = bVar.red;
        Context applicationContext = fVar.getApplicationContext();
        ah ahVar = fVar.hotel;
        h hVar = new h();
        Object obj = new Object();
        T3.b bVar3 = hVar.golf;
        synchronized (bVar3) {
            bVar3.alpha.add(obj);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 27) {
            hVar.india(new Object());
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList foxtrot = hVar.foxtrot();
        g gVar = bVar.silver;
        P3.a aVar3 = new P3.a(applicationContext, foxtrot, bVar2, gVar);
        ab abVar = new ab(bVar2, new d(19));
        o oVar = new o(hVar.foxtrot(), resources2.getDisplayMetrics(), bVar2, gVar);
        if (i5 >= 28 && ((Map) ahVar.purple).containsKey(c.class)) {
            aVar2 = new com.bumptech.glide.load.resource.bitmap.g(1);
            eVar = new com.bumptech.glide.load.resource.bitmap.g(0);
        } else {
            eVar = new e(oVar, 0);
            aVar2 = new com.bumptech.glide.load.resource.bitmap.a(2, oVar, gVar);
        }
        if (i5 >= 28) {
            i4 = i5;
            resources = resources2;
            hVar.delta("Animation", InputStream.class, Drawable.class, new N3.a(new w.o(11, foxtrot, gVar), 1));
            hVar.delta("Animation", ByteBuffer.class, Drawable.class, new N3.a(new w.o(11, foxtrot, gVar), 0));
        } else {
            i4 = i5;
            resources = resources2;
        }
        N3.c cVar = new N3.c(applicationContext);
        com.bumptech.glide.load.resource.bitmap.b bVar4 = new com.bumptech.glide.load.resource.bitmap.b(gVar);
        Fe.c cVar2 = new Fe.c(3);
        Q3.d dVar = new Q3.d(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        hVar.alpha(ByteBuffer.class, new J3.ab(5));
        hVar.alpha(InputStream.class, new D8.c(21, gVar));
        hVar.delta("Bitmap", ByteBuffer.class, Bitmap.class, eVar);
        hVar.delta("Bitmap", InputStream.class, Bitmap.class, aVar2);
        String str3 = Build.FINGERPRINT;
        if (!"robolectric".equals(str3)) {
            str = str3;
            str2 = "Animation";
            hVar.delta("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new e(oVar, 1));
        } else {
            str = str3;
            str2 = "Animation";
        }
        hVar.delta("Bitmap", AssetFileDescriptor.class, Bitmap.class, new ab(bVar2, new W8.a(19)));
        hVar.delta("Bitmap", ParcelFileDescriptor.class, Bitmap.class, abVar);
        J3.ab abVar2 = J3.ab.purple;
        hVar.charlie(Bitmap.class, Bitmap.class, abVar2);
        hVar.delta("Bitmap", Bitmap.class, Bitmap.class, new N3.d(2));
        hVar.bravo(Bitmap.class, bVar4);
        Resources resources3 = resources;
        hVar.delta("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources3, eVar));
        hVar.delta("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources3, aVar2));
        hVar.delta("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources3, abVar));
        hVar.bravo(BitmapDrawable.class, new J2.e(28, bVar2, bVar4));
        String str4 = str2;
        hVar.delta(str4, InputStream.class, P3.c.class, new P3.k(foxtrot, aVar3, gVar));
        hVar.delta(str4, ByteBuffer.class, P3.c.class, aVar3);
        hVar.bravo(P3.c.class, new g7.f(7));
        hVar.charlie(D3.d.class, D3.d.class, abVar2);
        hVar.delta("Bitmap", D3.d.class, Bitmap.class, new i(bVar2));
        hVar.delta("legacy_append", Uri.class, Drawable.class, cVar);
        hVar.delta("legacy_append", Uri.class, Bitmap.class, new com.bumptech.glide.load.resource.bitmap.a(1, cVar, bVar2));
        hVar.juliet(new M3.a(0));
        hVar.charlie(File.class, ByteBuffer.class, new J3.ab(6));
        hVar.charlie(File.class, InputStream.class, new G3.a(new J3.ab(9)));
        hVar.delta("legacy_append", File.class, File.class, new N3.d(1));
        hVar.charlie(File.class, ParcelFileDescriptor.class, new G3.a(new J3.ab(8)));
        hVar.charlie(File.class, File.class, abVar2);
        hVar.juliet(new l(gVar));
        if (!"robolectric".equals(str)) {
            hVar.juliet(new M3.a(2));
        }
        j jVar = new j(applicationContext, 3);
        j jVar2 = new j(applicationContext, 2);
        H0.a aVar4 = new H0.a(applicationContext, 1);
        Class cls = Integer.TYPE;
        hVar.charlie(cls, InputStream.class, jVar);
        hVar.charlie(Integer.class, InputStream.class, jVar);
        hVar.charlie(cls, AssetFileDescriptor.class, jVar2);
        hVar.charlie(Integer.class, AssetFileDescriptor.class, jVar2);
        hVar.charlie(cls, Drawable.class, aVar4);
        hVar.charlie(Integer.class, Drawable.class, aVar4);
        hVar.charlie(Uri.class, InputStream.class, new j(applicationContext, 4));
        hVar.charlie(Uri.class, AssetFileDescriptor.class, new H0.a(applicationContext, 3));
        y yVar = new y(resources3, 1);
        y yVar2 = new y(resources3, 0);
        z zVar = new z(resources3);
        hVar.charlie(Integer.class, Uri.class, yVar);
        hVar.charlie(cls, Uri.class, yVar);
        hVar.charlie(Integer.class, AssetFileDescriptor.class, yVar2);
        hVar.charlie(cls, AssetFileDescriptor.class, yVar2);
        hVar.charlie(Integer.class, InputStream.class, zVar);
        hVar.charlie(cls, InputStream.class, zVar);
        hVar.charlie(String.class, InputStream.class, new D8.c(19));
        hVar.charlie(Uri.class, InputStream.class, new D8.c(19));
        hVar.charlie(String.class, InputStream.class, new J3.ab(13));
        hVar.charlie(String.class, ParcelFileDescriptor.class, new J3.ab(12));
        hVar.charlie(String.class, AssetFileDescriptor.class, new J3.ab(11));
        hVar.charlie(Uri.class, InputStream.class, new m(21, applicationContext.getAssets()));
        hVar.charlie(Uri.class, AssetFileDescriptor.class, new D8.c(18, applicationContext.getAssets()));
        hVar.charlie(Uri.class, InputStream.class, new H0.a(applicationContext, 4));
        hVar.charlie(Uri.class, InputStream.class, new j(applicationContext, 6));
        if (i4 >= 29) {
            hVar.charlie(Uri.class, InputStream.class, new K3.b(applicationContext, InputStream.class));
            hVar.charlie(Uri.class, ParcelFileDescriptor.class, new K3.b(applicationContext, ParcelFileDescriptor.class));
        }
        hVar.charlie(Uri.class, InputStream.class, new ad(contentResolver, 1));
        hVar.charlie(Uri.class, ParcelFileDescriptor.class, new D8.c(22, contentResolver));
        hVar.charlie(Uri.class, AssetFileDescriptor.class, new ad(contentResolver, 0));
        hVar.charlie(Uri.class, InputStream.class, new J3.ab(14));
        hVar.charlie(URL.class, InputStream.class, new d(5));
        hVar.charlie(Uri.class, File.class, new H0.a(applicationContext, 2));
        hVar.charlie(J3.h.class, InputStream.class, new m(24));
        hVar.charlie(byte[].class, ByteBuffer.class, new J3.ab(2));
        hVar.charlie(byte[].class, InputStream.class, new J3.ab(4));
        hVar.charlie(Uri.class, Uri.class, abVar2);
        hVar.charlie(Drawable.class, Drawable.class, abVar2);
        hVar.delta("legacy_append", Drawable.class, Drawable.class, new N3.d(0));
        hVar.kilo(Bitmap.class, BitmapDrawable.class, new z(resources3));
        hVar.kilo(Bitmap.class, byte[].class, cVar2);
        hVar.kilo(Drawable.class, byte[].class, new C1915c(bVar2, cVar2, dVar, 16));
        hVar.kilo(P3.c.class, byte[].class, dVar);
        ab abVar3 = new ab(bVar2, new com.google.mlkit.common.sdkinternal.b(19));
        hVar.delta("legacy_append", ByteBuffer.class, Bitmap.class, abVar3);
        hVar.delta("legacy_append", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources3, abVar3));
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            if (aVar != null) {
                aVar.alpha(applicationContext, bVar, hVar);
            }
            return hVar;
        }
        throw ao.ad.yankee(it);
    }
}
