package R3;

import I.al;
import android.content.Context;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.camera.core.C0494a;
import androidx.camera.core.impl.aq;
import androidx.camera.core.impl.ar;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import y.C3383w;
import y.EnumC3370j;

/* loaded from: classes3.dex */
public final class s implements ar {
    public static volatile s teal;
    public final /* synthetic */ int alpha;
    public boolean purple;
    public final Object red;
    public Object silver;

    public s(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 2:
                this.red = Collections.newSetFromMap(new WeakHashMap());
                this.silver = new HashSet();
                return;
            default:
                this.red = new Object();
                return;
        }
    }

    public static s delta(Context context) {
        if (teal == null) {
            synchronized (s.class) {
                try {
                    if (teal == null) {
                        teal = new s(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return teal;
    }

    @Override // androidx.camera.core.impl.ar
    public int alpha() {
        int height;
        synchronized (this.silver) {
            height = ((ImageReader) this.red).getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ar
    public int bravo() {
        int width;
        synchronized (this.silver) {
            width = ((ImageReader) this.red).getWidth();
        }
        return width;
    }

    public boolean charlie(U3.c cVar) {
        boolean z2 = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = ((Set) this.red).remove(cVar);
        if (!((HashSet) this.silver).remove(cVar) && !remove) {
            z2 = false;
        }
        if (z2) {
            cVar.clear();
        }
        return z2;
    }

    @Override // androidx.camera.core.impl.ar
    public void close() {
        synchronized (this.silver) {
            ((ImageReader) this.red).close();
        }
    }

    public EnumC3370j echo() {
        al alVar = (al) this.silver;
        int i4 = alVar.bravo;
        int i5 = alVar.charlie;
        if (i4 < i5) {
            return EnumC3370j.purple;
        }
        if (i4 > i5) {
            return EnumC3370j.alpha;
        }
        return EnumC3370j.red;
    }

    @Override // androidx.camera.core.impl.ar
    public androidx.camera.core.ar foxtrot() {
        Image image;
        synchronized (this.silver) {
            try {
                image = ((ImageReader) this.red).acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new C0494a(image);
        }
    }

    @Override // androidx.camera.core.impl.ar
    public int golf() {
        int imageFormat;
        synchronized (this.silver) {
            imageFormat = ((ImageReader) this.red).getImageFormat();
        }
        return imageFormat;
    }

    public void hotel(G6.o oVar) {
        synchronized (this.red) {
            try {
                if (((ArrayDeque) this.silver) == null) {
                    this.silver = new ArrayDeque();
                }
                ((ArrayDeque) this.silver).add(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void india(Task task) {
        G6.o oVar;
        synchronized (this.red) {
            if (((ArrayDeque) this.silver) != null && !this.purple) {
                this.purple = true;
                while (true) {
                    synchronized (this.red) {
                        try {
                            oVar = (G6.o) ((ArrayDeque) this.silver).poll();
                            if (oVar == null) {
                                this.purple = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    oVar.bravo(task);
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.ar
    public void lima() {
        synchronized (this.silver) {
            this.purple = true;
            ((ImageReader) this.red).setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.ar
    public Surface romeo() {
        Surface surface;
        synchronized (this.silver) {
            surface = ((ImageReader) this.red).getSurface();
        }
        return surface;
    }

    public String toString() {
        switch (this.alpha) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                sb2.append("{numRequests=");
                sb2.append(((Set) this.red).size());
                sb2.append(", isPaused=");
                return Q0.c.romeo(sb2, this.purple, "}");
            case 5:
                return "SingleSelectionLayout(isStartHandle=" + this.purple + ", crossed=" + echo() + ", info=\n\t" + ((al) this.silver) + ')';
            default:
                return super.toString();
        }
    }

    @Override // androidx.camera.core.impl.ar
    public int uniform() {
        int maxImages;
        synchronized (this.silver) {
            maxImages = ((ImageReader) this.red).getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ar
    public androidx.camera.core.ar victor() {
        Image image;
        synchronized (this.silver) {
            try {
                image = ((ImageReader) this.red).acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new C0494a(image);
        }
    }

    @Override // androidx.camera.core.impl.ar
    public void yankee(final aq aqVar, final Executor executor) {
        synchronized (this.silver) {
            this.purple = false;
            ((ImageReader) this.red).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.camera.core.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    R3.s sVar = R3.s.this;
                    Executor executor2 = executor;
                    androidx.camera.core.impl.aq aqVar2 = aqVar;
                    synchronized (sVar.silver) {
                        try {
                            if (!sVar.purple) {
                                executor2.execute(new A8.g(23, sVar, aqVar2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, bc.e.alpha());
        }
    }

    public s(ImageReader imageReader) {
        this.alpha = 3;
        this.silver = new Object();
        this.purple = true;
        this.red = imageReader;
    }

    public s(Executor executor) {
        this.alpha = 4;
        Q3.c cVar = bg.a.alpha;
        if (bg.a.alpha.delta(LowMemoryQuirk.class) != null) {
            this.red = new bd.h(executor);
        } else {
            this.red = executor;
        }
        this.silver = cVar;
        this.purple = cVar.alpha(IncorrectJpegMetadataQuirk.class);
    }

    public s(Context context) {
        Object rVar;
        this.alpha = 0;
        this.silver = new HashSet();
        com.google.android.gms.common.f fVar = new com.google.android.gms.common.f(new H0.a(context, 5));
        n nVar = new n(this);
        if (Build.VERSION.SDK_INT >= 24) {
            rVar = new C3.d(fVar, nVar);
        } else {
            rVar = new r(context, fVar, nVar);
        }
        this.red = rVar;
    }

    public s(boolean z2, C3383w c3383w, al alVar) {
        this.alpha = 5;
        this.purple = z2;
        this.red = c3383w;
        this.silver = alVar;
    }
}
