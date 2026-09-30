package G3;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public final class h implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final Bitmap.Config f1350c = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public int f1351a;
    public final l alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f1352b;
    public final Set purple;
    public final g7.f red;
    public final long silver;
    public long teal;
    public int white;
    public int yellow;

    public h(long j5) {
        Bitmap.Config config;
        l lVar = new l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i4 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i4 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.silver = j5;
        this.alpha = lVar;
        this.purple = unmodifiableSet;
        this.red = new g7.f(3);
    }

    @Override // G3.b
    public final void alpha(int i4) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i4);
        }
        if (i4 < 40 && i4 < 20) {
            if (i4 < 20 && i4 != 15) {
                return;
            }
            foxtrot(this.silver / 2);
            return;
        }
        india();
    }

    @Override // G3.b
    public final Bitmap bravo(int i4, int i5, Bitmap.Config config) {
        Bitmap echo = echo(i4, i5, config);
        if (echo == null) {
            if (config == null) {
                config = f1350c;
            }
            return Bitmap.createBitmap(i4, i5, config);
        }
        return echo;
    }

    public final void charlie() {
        Log.v("LruBitmapPool", "Hits=" + this.white + ", misses=" + this.yellow + ", puts=" + this.f1351a + ", evictions=" + this.f1352b + ", currentSize=" + this.teal + ", maxSize=" + this.silver + "\nStrategy=" + this.alpha);
    }

    @Override // G3.b
    public final synchronized void delta(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        this.alpha.getClass();
                        if (Y3.l.charlie(bitmap) <= this.silver && this.purple.contains(bitmap.getConfig())) {
                            this.alpha.getClass();
                            int charlie = Y3.l.charlie(bitmap);
                            this.alpha.echo(bitmap);
                            this.red.getClass();
                            this.f1351a++;
                            this.teal += charlie;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb2 = new StringBuilder("Put bitmap in pool=");
                                this.alpha.getClass();
                                sb2.append(l.charlie(Y3.l.charlie(bitmap), bitmap.getConfig()));
                                Log.v("LruBitmapPool", sb2.toString());
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                charlie();
                            }
                            foxtrot(this.silver);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb3 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                        this.alpha.getClass();
                        sb3.append(l.charlie(Y3.l.charlie(bitmap), bitmap.getConfig()));
                        sb3.append(", is mutable: ");
                        sb3.append(bitmap.isMutable());
                        sb3.append(", is allowed config: ");
                        sb3.append(this.purple.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb3.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap echo(int i4, int i5, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap bravo;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            l lVar = this.alpha;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f1350c;
            }
            bravo = lVar.bravo(i4, i5, config3);
            if (bravo == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    this.alpha.getClass();
                    sb2.append(l.charlie(Y3.l.delta(config) * i4 * i5, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.yellow++;
            } else {
                this.white++;
                long j5 = this.teal;
                this.alpha.getClass();
                this.teal = j5 - Y3.l.charlie(bravo);
                this.red.getClass();
                bravo.setHasAlpha(true);
                bravo.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                this.alpha.getClass();
                sb3.append(l.charlie(Y3.l.delta(config) * i4 * i5, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                charlie();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bravo;
    }

    public final synchronized void foxtrot(long j5) {
        while (this.teal > j5) {
            try {
                l lVar = this.alpha;
                Bitmap bitmap = (Bitmap) lVar.bravo.J();
                if (bitmap != null) {
                    lVar.alpha(Integer.valueOf(Y3.l.charlie(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        charlie();
                    }
                    this.teal = 0L;
                    return;
                }
                this.red.getClass();
                long j6 = this.teal;
                this.alpha.getClass();
                this.teal = j6 - Y3.l.charlie(bitmap);
                this.f1352b++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Evicting bitmap=");
                    this.alpha.getClass();
                    sb2.append(l.charlie(Y3.l.charlie(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    charlie();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G3.b
    public final Bitmap hotel(int i4, int i5, Bitmap.Config config) {
        Bitmap echo = echo(i4, i5, config);
        if (echo != null) {
            echo.eraseColor(0);
            return echo;
        }
        if (config == null) {
            config = f1350c;
        }
        return Bitmap.createBitmap(i4, i5, config);
    }

    @Override // G3.b
    public final void india() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        foxtrot(0L);
    }
}
