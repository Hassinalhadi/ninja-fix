package com.squareup.picasso;

import Q0.c;
import Tf.ak;
import Tf.ap;
import Tf.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BitmapHunter implements Runnable {
    Action action;
    List<Action> actions;
    final Cache cache;
    final Request data;
    final Dispatcher dispatcher;
    Exception exception;
    int exifOrientation;
    Future<?> future;
    final String key;
    Picasso.LoadedFrom loadedFrom;
    final int memoryPolicy;
    int networkPolicy;
    final Picasso picasso;
    Picasso.Priority priority;
    final RequestHandler requestHandler;
    Bitmap result;
    int retryCount;
    final int sequence = SEQUENCE_GENERATOR.incrementAndGet();
    final Stats stats;
    private static final Object DECODE_LOCK = new Object();
    private static final ThreadLocal<StringBuilder> NAME_BUILDER = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger SEQUENCE_GENERATOR = new AtomicInteger();
    private static final RequestHandler ERRORING_HANDLER = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        public boolean canHandleRequest(Request request) {
            return true;
        }

        @Override // com.squareup.picasso.RequestHandler
        public RequestHandler.Result load(Request request, int i4) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    };

    public BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
        this.picasso = picasso;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.stats = stats;
        this.action = action;
        this.key = action.getKey();
        this.data = action.getRequest();
        this.priority = action.getPriority();
        this.memoryPolicy = action.getMemoryPolicy();
        this.networkPolicy = action.getNetworkPolicy();
        this.requestHandler = requestHandler;
        this.retryCount = requestHandler.getRetryCount();
    }

    public static Bitmap applyCustomTransformations(List<Transformation> list, Bitmap bitmap) {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            final Transformation transformation = list.get(i4);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    final StringBuilder tango = c.tango("Transformation ");
                    tango.append(transformation.key());
                    tango.append(" returned null after ");
                    tango.append(i4);
                    tango.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<Transformation> it = list.iterator();
                    while (it.hasNext()) {
                        tango.append(it.next().key());
                        tango.append('\n');
                    }
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new NullPointerException(tango.toString());
                        }
                    });
                    return null;
                }
                if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.5
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                }
                if (transform != bitmap && !bitmap.isRecycled()) {
                    Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.6
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new IllegalStateException("Transformation " + Transformation.this.key() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
                i4++;
                bitmap = transform;
            } catch (RuntimeException e) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.BitmapHunter.3
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new RuntimeException("Transformation " + Transformation.this.key() + " crashed with exception.", e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    private Picasso.Priority computeNewPriority() {
        boolean z2;
        Picasso.Priority priority = Picasso.Priority.LOW;
        List<Action> list = this.actions;
        if (list != null && !list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        Action action = this.action;
        if (action == null && !z2) {
            return priority;
        }
        if (action != null) {
            priority = action.getPriority();
        }
        if (z2) {
            int size = this.actions.size();
            for (int i4 = 0; i4 < size; i4++) {
                Picasso.Priority priority2 = this.actions.get(i4).getPriority();
                if (priority2.ordinal() > priority.ordinal()) {
                    priority = priority2;
                }
            }
        }
        return priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap decodeStream(ap apVar, Request request) throws IOException {
        ak charlie = b.charlie(apVar);
        boolean isWebPFile = Utils.isWebPFile(charlie);
        boolean z2 = request.purgeable;
        BitmapFactory.Options createBitmapOptions = RequestHandler.createBitmapOptions(request);
        boolean requiresInSampleSize = RequestHandler.requiresInSampleSize(createBitmapOptions);
        if (!isWebPFile) {
            Hd.b bVar = new Hd.b(2, charlie);
            if (requiresInSampleSize) {
                MarkableInputStream markableInputStream = new MarkableInputStream(bVar);
                markableInputStream.allowMarksToExpire(false);
                long savePosition = markableInputStream.savePosition(Barcode.FORMAT_UPC_E);
                BitmapFactory.decodeStream(markableInputStream, null, createBitmapOptions);
                RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
                markableInputStream.reset(savePosition);
                markableInputStream.allowMarksToExpire(true);
                bVar = markableInputStream;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(bVar, null, createBitmapOptions);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] amber = charlie.amber();
        if (requiresInSampleSize) {
            BitmapFactory.decodeByteArray(amber, 0, amber.length, createBitmapOptions);
            RequestHandler.calculateInSampleSize(request.targetWidth, request.targetHeight, createBitmapOptions, request);
        }
        return BitmapFactory.decodeByteArray(amber, 0, amber.length, createBitmapOptions);
    }

    public static BitmapHunter forRequest(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        Request request = action.getRequest();
        List<RequestHandler> requestHandlers = picasso.getRequestHandlers();
        int size = requestHandlers.size();
        for (int i4 = 0; i4 < size; i4++) {
            RequestHandler requestHandler = requestHandlers.get(i4);
            if (requestHandler.canHandleRequest(request)) {
                return new BitmapHunter(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new BitmapHunter(picasso, dispatcher, cache, stats, action, ERRORING_HANDLER);
    }

    public static int getExifRotation(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int getExifTranslation(int i4) {
        return (i4 == 2 || i4 == 7 || i4 == 4 || i4 == 5) ? -1 : 1;
    }

    private static boolean shouldResize(boolean z2, int i4, int i5, int i10, int i11) {
        if (!z2) {
            return true;
        }
        if (i10 == 0 || i4 <= i10) {
            return i11 != 0 && i5 > i11;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap transformResult(Request request, Bitmap bitmap, int i4) {
        int i5;
        int i10;
        boolean z2;
        Matrix matrix;
        int i11;
        float f5;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i12;
        float f17;
        float f18;
        float f19;
        float f20;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Bitmap createBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z10 = request.onlyScaleDown;
        Matrix matrix2 = new Matrix();
        if (!request.needsMatrixTransform() && i4 == 0) {
            i11 = width;
            i10 = height;
        } else {
            int i22 = request.targetWidth;
            int i23 = request.targetHeight;
            float f21 = request.rotationDegrees;
            if (f21 != 0.0f) {
                double d4 = f21;
                double cos = Math.cos(Math.toRadians(d4));
                double sin = Math.sin(Math.toRadians(d4));
                if (request.hasRotationPivot) {
                    matrix2.setRotate(f21, request.rotationPivotX, request.rotationPivotY);
                    float f22 = request.rotationPivotX;
                    double d9 = 1.0d - cos;
                    float f23 = request.rotationPivotY;
                    double d10 = (f23 * sin) + (f22 * d9);
                    double d11 = (f23 * d9) - (f22 * sin);
                    int i24 = request.targetWidth;
                    double d12 = (i24 * cos) + d10;
                    double d13 = (i24 * sin) + d11;
                    i10 = height;
                    z2 = z10;
                    int i25 = request.targetHeight;
                    double d14 = ((i24 * cos) + d10) - (i25 * sin);
                    i5 = width;
                    double d15 = (i25 * cos) + (i24 * sin) + d11;
                    double d16 = d10 - (i25 * sin);
                    double d17 = (i25 * cos) + d11;
                    double max = Math.max(d16, Math.max(d14, Math.max(d10, d12)));
                    double min = Math.min(d16, Math.min(d14, Math.min(d10, d12)));
                    double max2 = Math.max(d17, Math.max(d15, Math.max(d11, d13)));
                    double min2 = Math.min(d17, Math.min(d15, Math.min(d11, d13)));
                    i22 = (int) Math.floor(max - min);
                    i23 = (int) Math.floor(max2 - min2);
                } else {
                    i5 = width;
                    z2 = z10;
                    i10 = height;
                    matrix2.setRotate(f21);
                    int i26 = request.targetWidth;
                    double d18 = i26 * cos;
                    double d19 = i26 * sin;
                    int i27 = request.targetHeight;
                    double d20 = (i26 * cos) - (i27 * sin);
                    double d21 = (i27 * cos) + (i26 * sin);
                    double d22 = -(i27 * sin);
                    double d23 = i27 * cos;
                    matrix = matrix2;
                    double max3 = Math.max(d22, Math.max(d20, Math.max(0.0d, d18)));
                    double min3 = Math.min(d22, Math.min(d20, Math.min(0.0d, d18)));
                    double max4 = Math.max(d23, Math.max(d21, Math.max(0.0d, d19)));
                    double min4 = Math.min(d23, Math.min(d21, Math.min(0.0d, d19)));
                    int floor = (int) Math.floor(max3 - min3);
                    i23 = (int) Math.floor(max4 - min4);
                    i22 = floor;
                    if (i4 == 0) {
                        int exifRotation = getExifRotation(i4);
                        int exifTranslation = getExifTranslation(i4);
                        if (exifRotation != 0) {
                            matrix2 = matrix;
                            matrix2.preRotate(exifRotation);
                            if (exifRotation == 90 || exifRotation == 270) {
                                int i28 = i23;
                                i23 = i22;
                                i22 = i28;
                            }
                        } else {
                            matrix2 = matrix;
                        }
                        if (exifTranslation != 1) {
                            matrix2.postScale(exifTranslation, 1.0f);
                        }
                    } else {
                        matrix2 = matrix;
                    }
                    if (!request.centerCrop) {
                        if (i22 != 0) {
                            f17 = i22;
                            i12 = i5;
                            f18 = i12;
                        } else {
                            i12 = i5;
                            f17 = i23;
                            f18 = i10;
                        }
                        float f24 = f17 / f18;
                        if (i23 != 0) {
                            f19 = i23;
                            f20 = i10;
                        } else {
                            f19 = i22;
                            f20 = i12;
                        }
                        float f25 = f19 / f20;
                        if (f24 > f25) {
                            int ceil = (int) Math.ceil((f25 / f24) * i10);
                            int i29 = request.centerCropGravity;
                            if ((i29 & 48) == 48) {
                                i21 = 0;
                            } else if ((i29 & 80) == 80) {
                                i21 = i10 - ceil;
                            } else {
                                i21 = (i10 - ceil) / 2;
                            }
                            i16 = i21;
                            i14 = ceil;
                            i13 = i12;
                            f25 = i23 / ceil;
                            i15 = 0;
                        } else if (f24 < f25) {
                            int ceil2 = (int) Math.ceil((f24 / f25) * i12);
                            int i30 = request.centerCropGravity;
                            if ((i30 & 3) == 3) {
                                i17 = 0;
                            } else if ((i30 & 5) == 5) {
                                i17 = i12 - ceil2;
                            } else {
                                i17 = (i12 - ceil2) / 2;
                            }
                            i13 = ceil2;
                            f24 = i22 / ceil2;
                            i16 = 0;
                            i15 = i17;
                            i14 = i10;
                        } else {
                            f24 = f25;
                            i13 = i12;
                            i14 = i10;
                            i15 = 0;
                            i16 = 0;
                        }
                        if (shouldResize(z2, i12, i10, i22, i23)) {
                            matrix2.preScale(f24, f25);
                        }
                        i18 = i14;
                        i19 = i15;
                        i20 = i16;
                        i11 = i13;
                        createBitmap = Bitmap.createBitmap(bitmap, i19, i20, i11, i18, matrix2, true);
                        if (createBitmap != bitmap) {
                            return bitmap;
                        }
                        bitmap.recycle();
                        return createBitmap;
                    }
                    i11 = i5;
                    if (request.centerInside) {
                        if (i22 != 0) {
                            f13 = i22;
                            f14 = i11;
                        } else {
                            f13 = i23;
                            f14 = i10;
                        }
                        float f26 = f13 / f14;
                        if (i23 != 0) {
                            f15 = i23;
                            f16 = i10;
                        } else {
                            f15 = i22;
                            f16 = i11;
                        }
                        float f27 = f15 / f16;
                        if (f26 >= f27) {
                            f26 = f27;
                        }
                        if (shouldResize(z2, i11, i10, i22, i23)) {
                            matrix2.preScale(f26, f26);
                        }
                    } else if ((i22 != 0 || i23 != 0) && (i22 != i11 || i23 != i10)) {
                        if (i22 != 0) {
                            f5 = i22;
                            f10 = i11;
                        } else {
                            f5 = i23;
                            f10 = i10;
                        }
                        float f28 = f5 / f10;
                        if (i23 != 0) {
                            f11 = i23;
                            f12 = i10;
                        } else {
                            f11 = i22;
                            f12 = i11;
                        }
                        float f29 = f11 / f12;
                        if (shouldResize(z2, i11, i10, i22, i23)) {
                            matrix2.preScale(f28, f29);
                        }
                    }
                }
            } else {
                i5 = width;
                i10 = height;
                z2 = z10;
            }
            matrix = matrix2;
            if (i4 == 0) {
            }
            if (!request.centerCrop) {
            }
        }
        i18 = i10;
        i19 = 0;
        i20 = 0;
        createBitmap = Bitmap.createBitmap(bitmap, i19, i20, i11, i18, matrix2, true);
        if (createBitmap != bitmap) {
        }
    }

    public static void updateThreadName(Request request) {
        String name = request.getName();
        StringBuilder sb2 = NAME_BUILDER.get();
        sb2.ensureCapacity(name.length() + 8);
        sb2.replace(8, sb2.length(), name);
        Thread.currentThread().setName(sb2.toString());
    }

    public void attach(Action action) {
        boolean z2 = this.picasso.loggingEnabled;
        Request request = action.request;
        if (this.action == null) {
            this.action = action;
            if (z2) {
                List<Action> list = this.actions;
                if (list != null && !list.isEmpty()) {
                    Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
                    return;
                } else {
                    Utils.log("Hunter", "joined", request.logId(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.actions == null) {
            this.actions = new ArrayList(3);
        }
        this.actions.add(action);
        if (z2) {
            Utils.log("Hunter", "joined", request.logId(), Utils.getLogIdsForHunter(this, "to "));
        }
        Picasso.Priority priority = action.getPriority();
        if (priority.ordinal() > this.priority.ordinal()) {
            this.priority = priority;
        }
    }

    public boolean cancel() {
        List<Action> list;
        Future<?> future;
        if (this.action != null || (((list = this.actions) != null && !list.isEmpty()) || (future = this.future) == null || !future.cancel(false))) {
            return false;
        }
        return true;
    }

    public void detach(Action action) {
        boolean z2;
        if (this.action == action) {
            this.action = null;
            z2 = true;
        } else {
            List<Action> list = this.actions;
            if (list != null) {
                z2 = list.remove(action);
            } else {
                z2 = false;
            }
        }
        if (z2 && action.getPriority() == this.priority) {
            this.priority = computeNewPriority();
        }
        if (this.picasso.loggingEnabled) {
            Utils.log("Hunter", "removed", action.request.logId(), Utils.getLogIdsForHunter(this, "from "));
        }
    }

    public Action getAction() {
        return this.action;
    }

    public List<Action> getActions() {
        return this.actions;
    }

    public Request getData() {
        return this.data;
    }

    public Exception getException() {
        return this.exception;
    }

    public String getKey() {
        return this.key;
    }

    public Picasso.LoadedFrom getLoadedFrom() {
        return this.loadedFrom;
    }

    public int getMemoryPolicy() {
        return this.memoryPolicy;
    }

    public Picasso getPicasso() {
        return this.picasso;
    }

    public Picasso.Priority getPriority() {
        return this.priority;
    }

    public Bitmap getResult() {
        return this.result;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bitmap hunt() throws IOException {
        Bitmap bitmap;
        int i4;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy)) {
            bitmap = this.cache.get(this.key);
            if (bitmap != null) {
                this.stats.dispatchCacheHit();
                this.loadedFrom = Picasso.LoadedFrom.MEMORY;
                if (this.picasso.loggingEnabled) {
                    Utils.log("Hunter", "decoded", this.data.logId(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        if (this.retryCount == 0) {
            i4 = NetworkPolicy.OFFLINE.index;
        } else {
            i4 = this.networkPolicy;
        }
        this.networkPolicy = i4;
        RequestHandler.Result load = this.requestHandler.load(this.data, i4);
        if (load != null) {
            this.loadedFrom = load.getLoadedFrom();
            this.exifOrientation = load.getExifOrientation();
            bitmap = load.getBitmap();
            if (bitmap == null) {
                ap source = load.getSource();
                try {
                    bitmap = decodeStream(source, this.data);
                } finally {
                    try {
                        source.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.picasso.loggingEnabled) {
                Utils.log("Hunter", "decoded", this.data.logId());
            }
            this.stats.dispatchBitmapDecoded(bitmap);
            if (this.data.needsTransformation() || this.exifOrientation != 0) {
                synchronized (DECODE_LOCK) {
                    try {
                        if (!this.data.needsMatrixTransform()) {
                            if (this.exifOrientation != 0) {
                            }
                            if (this.data.hasCustomTransformations()) {
                                bitmap = applyCustomTransformations(this.data.transformations, bitmap);
                                if (this.picasso.loggingEnabled) {
                                    Utils.log("Hunter", "transformed", this.data.logId(), "from custom transformations");
                                }
                            }
                        }
                        bitmap = transformResult(this.data, bitmap, this.exifOrientation);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "transformed", this.data.logId());
                        }
                        if (this.data.hasCustomTransformations()) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    this.stats.dispatchBitmapTransformed(bitmap);
                }
            }
        }
        return bitmap;
    }

    public boolean isCancelled() {
        Future<?> future = this.future;
        if (future != null && future.isCancelled()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        updateThreadName(this.data);
                        if (this.picasso.loggingEnabled) {
                            Utils.log("Hunter", "executing", Utils.getLogIdsForHunter(this));
                        }
                        Bitmap hunt = hunt();
                        this.result = hunt;
                        if (hunt == null) {
                            this.dispatcher.dispatchFailed(this);
                        } else {
                            this.dispatcher.dispatchComplete(this);
                        }
                        Thread.currentThread().setName("Picasso-Idle");
                    } catch (IOException e) {
                        this.exception = e;
                        this.dispatcher.dispatchRetry(this);
                        Thread.currentThread().setName("Picasso-Idle");
                    }
                } catch (NetworkRequestHandler.ResponseException e4) {
                    if (!NetworkPolicy.isOfflineOnly(e4.networkPolicy) || e4.code != 504) {
                        this.exception = e4;
                    }
                    this.dispatcher.dispatchFailed(this);
                    Thread.currentThread().setName("Picasso-Idle");
                }
            } catch (Exception e5) {
                this.exception = e5;
                this.dispatcher.dispatchFailed(this);
                Thread.currentThread().setName("Picasso-Idle");
            } catch (OutOfMemoryError e10) {
                StringWriter stringWriter = new StringWriter();
                this.stats.createSnapshot().dump(new PrintWriter(stringWriter));
                this.exception = new RuntimeException(stringWriter.toString(), e10);
                this.dispatcher.dispatchFailed(this);
                Thread.currentThread().setName("Picasso-Idle");
            }
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    public boolean shouldRetry(boolean z2, NetworkInfo networkInfo) {
        int i4 = this.retryCount;
        if (i4 > 0) {
            this.retryCount = i4 - 1;
            return this.requestHandler.shouldRetry(z2, networkInfo);
        }
        return false;
    }

    public boolean supportsReplay() {
        return this.requestHandler.supportsReplay();
    }
}
