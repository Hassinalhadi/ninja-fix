package P3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import av.q;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.clevertap.android.sdk.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s6.H4;

/* loaded from: classes3.dex */
public final class a implements E3.k {
    public static final com.google.mlkit.common.sdkinternal.b foxtrot = new com.google.mlkit.common.sdkinternal.b(7);
    public static final O7.j golf = new O7.j(2);
    public final Context alpha;
    public final ArrayList bravo;
    public final O7.j charlie;
    public final com.google.mlkit.common.sdkinternal.b delta;
    public final J2.c echo;

    public a(Context context, ArrayList arrayList, G3.b bVar, G3.g gVar) {
        com.google.mlkit.common.sdkinternal.b bVar2 = foxtrot;
        this.alpha = context.getApplicationContext();
        this.bravo = arrayList;
        this.delta = bVar2;
        this.echo = new J2.c(12, bVar, gVar);
        this.charlie = golf;
    }

    public static int delta(D3.b bVar, int i4, int i5) {
        int highestOneBit;
        int min = Math.min(bVar.golf / i5, bVar.foxtrot / i4);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder hotel = q.hotel(max, i4, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            hotel.append(i5);
            hotel.append("], actual dimens: [");
            hotel.append(bVar.foxtrot);
            hotel.append("x");
            hotel.append(bVar.golf);
            hotel.append(Constants.AES_SUFFIX);
            Log.v("BufferGifDecoder", hotel.toString());
        }
        return max;
    }

    @Override // E3.k
    public final boolean alpha(Object obj, E3.i iVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) iVar.charlie(j.bravo)).booleanValue() && H4.delta(this.bravo, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x005b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // E3.k
    public final com.bumptech.glide.load.engine.w bravo(java.lang.Object r8, int r9, int r10, E3.i r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            O7.j r8 = r7.charlie
            monitor-enter(r8)
            java.lang.Object r0 = r8.purple     // Catch: java.lang.Throwable -> L56
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L56
            D3.c r0 = (D3.c) r0     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L17
            D3.c r0 = new D3.c     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L59
        L1d:
            r0 = 0
            r5.bravo = r0     // Catch: java.lang.Throwable -> L56
            byte[] r0 = r5.alpha     // Catch: java.lang.Throwable -> L56
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L56
            D3.b r0 = new D3.b     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            r5.charlie = r0     // Catch: java.lang.Throwable -> L56
            r5.delta = r1     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L56
            r5.bravo = r0     // Catch: java.lang.Throwable -> L56
            r0.position(r1)     // Catch: java.lang.Throwable -> L56
            java.nio.ByteBuffer r0 = r5.bravo     // Catch: java.lang.Throwable -> L56
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L56
            r0.order(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            N3.b r8 = r1.charlie(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e
            O7.j r9 = r1.charlie
            r9.juliet(r5)
            return r8
        L4e:
            r0 = move-exception
            r8 = r0
            O7.j r9 = r1.charlie
            r9.juliet(r5)
            throw r8
        L56:
            r0 = move-exception
            r1 = r7
        L58:
            r9 = r0
        L59:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L5b
            throw r9
        L5b:
            r0 = move-exception
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.a.bravo(java.lang.Object, int, int, E3.i):com.bumptech.glide.load.engine.w");
    }

    public final N3.b charlie(ByteBuffer byteBuffer, int i4, int i5, D3.c cVar, E3.i iVar) {
        StringBuilder sb2;
        Bitmap.Config config;
        int i10 = Y3.h.bravo;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            D3.b bravo = cVar.bravo();
            if (bravo.charlie > 0 && bravo.bravo == 0) {
                if (iVar.charlie(j.alpha) == E3.b.purple) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int delta = delta(bravo, i4, i5);
                com.google.mlkit.common.sdkinternal.b bVar = this.delta;
                J2.c cVar2 = this.echo;
                bVar.getClass();
                D3.d dVar = new D3.d(cVar2, bravo, byteBuffer, delta);
                dVar.charlie(config);
                dVar.kilo = (dVar.kilo + 1) % dVar.lima.charlie;
                Bitmap bravo2 = dVar.bravo();
                if (bravo2 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder("Decoded GIF from stream in ");
                        sb2.append(Y3.h.alpha(elapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb2.toString());
                        return null;
                    }
                    return null;
                }
                N3.b bVar2 = new N3.b(new c(new b(0, new h(com.bumptech.glide.b.alpha(this.alpha), dVar, i4, i5, bravo2))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + Y3.h.alpha(elapsedRealtimeNanos));
                }
                return bVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb2 = new StringBuilder("Decoded GIF from stream in ");
                sb2.append(Y3.h.alpha(elapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb2.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + Y3.h.alpha(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
