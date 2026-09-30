package com.clevertap.android.sdk.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes3.dex */
public class GifImageView extends AppCompatImageView implements Runnable {
    private static final String TAG = "GifDecoderView";
    private boolean animating;
    private OnAnimationStart animationStartCallback;
    private OnAnimationStop animationStopCallback;
    private Thread animationThread;
    private final Runnable cleanupRunnable;
    private OnFrameAvailable frameCallback;
    private long framesDisplayDuration;
    private GifDecoder gifDecoder;
    private final Handler handler;
    private boolean renderFrame;
    private boolean shouldClear;
    private Bitmap tmpBitmap;
    private final Runnable updateResults;

    /* loaded from: classes3.dex */
    public interface OnAnimationStart {
        void onAnimationStart();
    }

    /* loaded from: classes3.dex */
    public interface OnAnimationStop {
        void onAnimationStop();
    }

    /* loaded from: classes3.dex */
    public interface OnFrameAvailable {
        Bitmap onFrameAvailable(Bitmap bitmap);
    }

    public GifImageView(Context context) {
        super(context, null);
        this.animationStartCallback = null;
        this.animationStopCallback = null;
        this.frameCallback = null;
        this.framesDisplayDuration = -1L;
        this.handler = new Handler(Looper.getMainLooper());
        this.cleanupRunnable = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GifImageView.this.tmpBitmap = null;
                GifImageView.this.gifDecoder = null;
                GifImageView.this.animationThread = null;
                GifImageView.this.shouldClear = false;
            }
        };
        this.updateResults = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.2
            @Override // java.lang.Runnable
            public void run() {
                if (GifImageView.this.tmpBitmap != null && !GifImageView.this.tmpBitmap.isRecycled()) {
                    GifImageView gifImageView = GifImageView.this;
                    gifImageView.setImageBitmap(gifImageView.tmpBitmap);
                    GifImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        };
    }

    private boolean canStart() {
        if ((this.animating || this.renderFrame) && this.gifDecoder != null && this.animationThread == null) {
            return true;
        }
        return false;
    }

    private void startAnimationThread() {
        if (canStart()) {
            Thread thread = new Thread(this);
            this.animationThread = thread;
            thread.start();
        }
    }

    public void clear() {
        this.animating = false;
        this.renderFrame = false;
        this.shouldClear = true;
        stopAnimation();
        this.handler.post(this.cleanupRunnable);
    }

    public int getFrameCount() {
        return this.gifDecoder.getFrameCount();
    }

    public long getFramesDisplayDuration() {
        return this.framesDisplayDuration;
    }

    public int getGifHeight() {
        return this.gifDecoder.getHeight();
    }

    public int getGifWidth() {
        return this.gifDecoder.getWidth();
    }

    public OnAnimationStop getOnAnimationStop() {
        return this.animationStopCallback;
    }

    public OnFrameAvailable getOnFrameAvailable() {
        return this.frameCallback;
    }

    public void gotoFrame(int i4) {
        if (this.gifDecoder.getCurrentFrameIndex() != i4 && this.gifDecoder.setFrameIndex(i4 - 1) && !this.animating) {
            this.renderFrame = true;
            startAnimationThread();
        }
    }

    public boolean isAnimating() {
        return this.animating;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clear();
    }

    public void resetAnimation() {
        this.gifDecoder.resetLoopIndex();
        gotoFrame(0);
    }

    @Override // java.lang.Runnable
    public void run() {
        long j5;
        OnAnimationStart onAnimationStart = this.animationStartCallback;
        if (onAnimationStart != null) {
            onAnimationStart.onAnimationStart();
        }
        do {
            if (!this.animating && !this.renderFrame) {
                break;
            }
            boolean advance = this.gifDecoder.advance();
            try {
                long nanoTime = System.nanoTime();
                Bitmap nextFrame = this.gifDecoder.getNextFrame();
                this.tmpBitmap = nextFrame;
                OnFrameAvailable onFrameAvailable = this.frameCallback;
                if (onFrameAvailable != null) {
                    this.tmpBitmap = onFrameAvailable.onFrameAvailable(nextFrame);
                }
                j5 = (System.nanoTime() - nanoTime) / 1000000;
                try {
                    this.handler.post(this.updateResults);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
                }
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                j5 = 0;
            }
            this.renderFrame = false;
            if (this.animating && advance) {
                try {
                    int nextDelay = (int) (this.gifDecoder.getNextDelay() - j5);
                    if (nextDelay > 0) {
                        long j6 = this.framesDisplayDuration;
                        if (j6 <= 0) {
                            j6 = nextDelay;
                        }
                        Thread.sleep(j6);
                    }
                } catch (InterruptedException unused3) {
                }
            } else {
                this.animating = false;
                break;
            }
        } while (this.animating);
        if (this.shouldClear) {
            this.handler.post(this.cleanupRunnable);
        }
        this.animationThread = null;
        OnAnimationStop onAnimationStop = this.animationStopCallback;
        if (onAnimationStop != null) {
            onAnimationStop.onAnimationStop();
        }
    }

    public void setBytes(byte[] bArr) {
        GifDecoder gifDecoder = new GifDecoder();
        this.gifDecoder = gifDecoder;
        try {
            gifDecoder.read(bArr);
            if (this.animating) {
                startAnimationThread();
            } else {
                gotoFrame(0);
            }
        } catch (Exception unused) {
            this.gifDecoder = null;
        }
    }

    public void setFramesDisplayDuration(long j5) {
        this.framesDisplayDuration = j5;
    }

    public void setOnAnimationStart(OnAnimationStart onAnimationStart) {
        this.animationStartCallback = onAnimationStart;
    }

    public void setOnAnimationStop(OnAnimationStop onAnimationStop) {
        this.animationStopCallback = onAnimationStop;
    }

    public void setOnFrameAvailable(OnFrameAvailable onFrameAvailable) {
        this.frameCallback = onFrameAvailable;
    }

    public void startAnimation() {
        this.animating = true;
        startAnimationThread();
    }

    public void stopAnimation() {
        this.animating = false;
        Thread thread = this.animationThread;
        if (thread != null) {
            thread.interrupt();
            this.animationThread = null;
        }
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animationStartCallback = null;
        this.animationStopCallback = null;
        this.frameCallback = null;
        this.framesDisplayDuration = -1L;
        this.handler = new Handler(Looper.getMainLooper());
        this.cleanupRunnable = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.1
            @Override // java.lang.Runnable
            public void run() {
                GifImageView.this.tmpBitmap = null;
                GifImageView.this.gifDecoder = null;
                GifImageView.this.animationThread = null;
                GifImageView.this.shouldClear = false;
            }
        };
        this.updateResults = new Runnable() { // from class: com.clevertap.android.sdk.gif.GifImageView.2
            @Override // java.lang.Runnable
            public void run() {
                if (GifImageView.this.tmpBitmap != null && !GifImageView.this.tmpBitmap.isRecycled()) {
                    GifImageView gifImageView = GifImageView.this;
                    gifImageView.setImageBitmap(gifImageView.tmpBitmap);
                    GifImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
        };
    }
}
