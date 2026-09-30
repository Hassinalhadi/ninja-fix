package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RemoteViewsAction;
import com.squareup.picasso.Request;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class RequestCreator {
    private static final AtomicInteger nextId = new AtomicInteger();
    private final Request.Builder data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    public RequestCreator(Picasso picasso, Uri uri, int i4) {
        this.setPlaceholder = true;
        if (!picasso.shutdown) {
            this.picasso = picasso;
            this.data = new Request.Builder(uri, i4, picasso.defaultBitmapConfig);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private Request createRequest(long j5) {
        int andIncrement = nextId.getAndIncrement();
        Request build = this.data.build();
        build.f11971id = andIncrement;
        build.started = j5;
        boolean z2 = this.picasso.loggingEnabled;
        if (z2) {
            Utils.log("Main", "created", build.plainId(), build.toString());
        }
        Request transformRequest = this.picasso.transformRequest(build);
        if (transformRequest != build) {
            transformRequest.f11971id = andIncrement;
            transformRequest.started = j5;
            if (z2) {
                Utils.log("Main", "changed", transformRequest.logId(), "into " + transformRequest);
            }
        }
        return transformRequest;
    }

    private Drawable getPlaceholderDrawable() {
        int i4 = this.placeholderResId;
        if (i4 != 0) {
            return this.picasso.context.getDrawable(i4);
        }
        return this.placeholderDrawable;
    }

    private void performRemoteViewInto(RemoteViewsAction remoteViewsAction) {
        Bitmap quickMemoryCacheCheck;
        if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(remoteViewsAction.getKey())) != null) {
            remoteViewsAction.complete(quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
            return;
        }
        int i4 = this.placeholderResId;
        if (i4 != 0) {
            remoteViewsAction.setImageResource(i4);
        }
        this.picasso.enqueueAndSubmit(remoteViewsAction);
    }

    public RequestCreator centerCrop() {
        this.data.centerCrop(17);
        return this;
    }

    public RequestCreator centerInside() {
        this.data.centerInside();
        return this;
    }

    public RequestCreator clearTag() {
        this.tag = null;
        return this;
    }

    public RequestCreator config(Bitmap.Config config) {
        this.data.config(config);
        return this;
    }

    public RequestCreator error(int i4) {
        if (i4 != 0) {
            if (this.errorDrawable == null) {
                this.errorResId = i4;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image resource invalid.");
    }

    public void fetch() {
        fetch(null);
    }

    public RequestCreator fit() {
        this.deferred = true;
        return this;
    }

    public Bitmap get() throws IOException {
        long nanoTime = System.nanoTime();
        Utils.checkNotMain();
        if (!this.deferred) {
            if (!this.data.hasImage()) {
                return null;
            }
            Request createRequest = createRequest(nanoTime);
            GetAction getAction = new GetAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, Utils.createKey(createRequest, new StringBuilder()));
            Picasso picasso = this.picasso;
            return BitmapHunter.forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, getAction).hunt();
        }
        throw new IllegalStateException("Fit cannot be used with get.");
    }

    public Object getTag() {
        return this.tag;
    }

    public void into(Target target) {
        Bitmap quickMemoryCacheCheck;
        long nanoTime = System.nanoTime();
        Utils.checkMain();
        if (target != null) {
            if (!this.deferred) {
                if (!this.data.hasImage()) {
                    this.picasso.cancelRequest(target);
                    target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
                    return;
                }
                Request createRequest = createRequest(nanoTime);
                String createKey = Utils.createKey(createRequest);
                if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) != null) {
                    this.picasso.cancelRequest(target);
                    target.onBitmapLoaded(quickMemoryCacheCheck, Picasso.LoadedFrom.MEMORY);
                    return;
                } else {
                    target.onPrepareLoad(this.setPlaceholder ? getPlaceholderDrawable() : null);
                    this.picasso.enqueueAndSubmit(new TargetAction(this.picasso, target, createRequest, this.memoryPolicy, this.networkPolicy, this.errorDrawable, createKey, this.tag, this.errorResId));
                    return;
                }
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public RequestCreator memoryPolicy(MemoryPolicy memoryPolicy, MemoryPolicy... memoryPolicyArr) {
        if (memoryPolicy != null) {
            this.memoryPolicy = memoryPolicy.index | this.memoryPolicy;
            if (memoryPolicyArr != null) {
                if (memoryPolicyArr.length > 0) {
                    for (MemoryPolicy memoryPolicy2 : memoryPolicyArr) {
                        if (memoryPolicy2 != null) {
                            this.memoryPolicy = memoryPolicy2.index | this.memoryPolicy;
                        } else {
                            throw new IllegalArgumentException("Memory policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        throw new IllegalArgumentException("Memory policy cannot be null.");
    }

    public RequestCreator networkPolicy(NetworkPolicy networkPolicy, NetworkPolicy... networkPolicyArr) {
        if (networkPolicy != null) {
            this.networkPolicy = networkPolicy.index | this.networkPolicy;
            if (networkPolicyArr != null) {
                if (networkPolicyArr.length > 0) {
                    for (NetworkPolicy networkPolicy2 : networkPolicyArr) {
                        if (networkPolicy2 != null) {
                            this.networkPolicy = networkPolicy2.index | this.networkPolicy;
                        } else {
                            throw new IllegalArgumentException("Network policy cannot be null.");
                        }
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        throw new IllegalArgumentException("Network policy cannot be null.");
    }

    public RequestCreator noFade() {
        this.noFade = true;
        return this;
    }

    public RequestCreator noPlaceholder() {
        if (this.placeholderResId == 0) {
            if (this.placeholderDrawable == null) {
                this.setPlaceholder = false;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Placeholder resource already set.");
    }

    public RequestCreator onlyScaleDown() {
        this.data.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(int i4) {
        if (!this.setPlaceholder) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i4 != 0) {
            if (this.placeholderDrawable == null) {
                this.placeholderResId = i4;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalArgumentException("Placeholder image resource invalid.");
    }

    public RequestCreator priority(Picasso.Priority priority) {
        this.data.priority(priority);
        return this;
    }

    public RequestCreator purgeable() {
        this.data.purgeable();
        return this;
    }

    public RequestCreator resize(int i4, int i5) {
        this.data.resize(i4, i5);
        return this;
    }

    public RequestCreator resizeDimen(int i4, int i5) {
        Resources resources = this.picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i4), resources.getDimensionPixelSize(i5));
    }

    public RequestCreator rotate(float f5) {
        this.data.rotate(f5);
        return this;
    }

    public RequestCreator stableKey(String str) {
        this.data.stableKey(str);
        return this;
    }

    public RequestCreator tag(Object obj) {
        if (obj != null) {
            if (this.tag == null) {
                this.tag = obj;
                return this;
            }
            throw new IllegalStateException("Tag already set.");
        }
        throw new IllegalArgumentException("Tag invalid.");
    }

    public RequestCreator transform(Transformation transformation) {
        this.data.transform(transformation);
        return this;
    }

    public RequestCreator unfit() {
        this.deferred = false;
        return this;
    }

    public RequestCreator centerCrop(int i4) {
        this.data.centerCrop(i4);
        return this;
    }

    public void fetch(Callback callback) {
        long nanoTime = System.nanoTime();
        if (!this.deferred) {
            if (this.data.hasImage()) {
                if (!this.data.hasPriority()) {
                    this.data.priority(Picasso.Priority.LOW);
                }
                Request createRequest = createRequest(nanoTime);
                String createKey = Utils.createKey(createRequest, new StringBuilder());
                if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && this.picasso.quickMemoryCacheCheck(createKey) != null) {
                    if (this.picasso.loggingEnabled) {
                        Utils.log("Main", "completed", createRequest.plainId(), "from " + Picasso.LoadedFrom.MEMORY);
                    }
                    if (callback != null) {
                        callback.onSuccess();
                        return;
                    }
                    return;
                }
                this.picasso.submit(new FetchAction(this.picasso, createRequest, this.memoryPolicy, this.networkPolicy, this.tag, createKey, callback));
                return;
            }
            return;
        }
        throw new IllegalStateException("Fit cannot be used with fetch.");
    }

    public RequestCreator rotate(float f5, float f10, float f11) {
        this.data.rotate(f5, f10, f11);
        return this;
    }

    public RequestCreator transform(List<? extends Transformation> list) {
        this.data.transform(list);
        return this;
    }

    public RequestCreator error(Drawable drawable) {
        if (drawable != null) {
            if (this.errorResId == 0) {
                this.errorDrawable = drawable;
                return this;
            }
            throw new IllegalStateException("Error image already set.");
        }
        throw new IllegalArgumentException("Error image may not be null.");
    }

    public RequestCreator() {
        this.setPlaceholder = true;
        this.picasso = null;
        this.data = new Request.Builder(null, 0, null);
    }

    public RequestCreator placeholder(Drawable drawable) {
        if (this.setPlaceholder) {
            if (this.placeholderResId == 0) {
                this.placeholderDrawable = drawable;
                return this;
            }
            throw new IllegalStateException("Placeholder image already set.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public void into(RemoteViews remoteViews, int i4, int i5, Notification notification) {
        into(remoteViews, i4, i5, notification, null);
    }

    public void into(RemoteViews remoteViews, int i4, int i5, Notification notification, String str) {
        into(remoteViews, i4, i5, notification, str, null);
    }

    public void into(RemoteViews remoteViews, int i4, int i5, Notification notification, String str, Callback callback) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request createRequest = createRequest(nanoTime);
                    performRemoteViewInto(new RemoteViewsAction.NotificationAction(this.picasso, createRequest, remoteViews, i4, i5, notification, str, this.memoryPolicy, this.networkPolicy, Utils.createKey(createRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        throw new IllegalArgumentException("Notification must not be null.");
    }

    public void into(RemoteViews remoteViews, int i4, int[] iArr) {
        into(remoteViews, i4, iArr, (Callback) null);
    }

    public void into(RemoteViews remoteViews, int i4, int[] iArr, Callback callback) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr != null) {
            if (!this.deferred) {
                if (this.placeholderDrawable == null && this.placeholderResId == 0 && this.errorDrawable == null) {
                    Request createRequest = createRequest(nanoTime);
                    performRemoteViewInto(new RemoteViewsAction.AppWidgetAction(this.picasso, createRequest, remoteViews, i4, iArr, this.memoryPolicy, this.networkPolicy, Utils.createKey(createRequest, new StringBuilder()), this.tag, this.errorResId, callback));
                    return;
                }
                throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
            }
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        throw new IllegalArgumentException("appWidgetIds must not be null.");
    }

    public void into(ImageView imageView) {
        into(imageView, null);
    }

    public void into(ImageView imageView, Callback callback) {
        Bitmap quickMemoryCacheCheck;
        long nanoTime = System.nanoTime();
        Utils.checkMain();
        if (imageView != null) {
            if (!this.data.hasImage()) {
                this.picasso.cancelRequest(imageView);
                if (this.setPlaceholder) {
                    PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                    return;
                }
                return;
            }
            if (this.deferred) {
                if (!this.data.hasSize()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.data.resize(width, height);
                    } else {
                        if (this.setPlaceholder) {
                            PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
                        }
                        this.picasso.defer(imageView, new DeferredRequestCreator(this, imageView, callback));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            Request createRequest = createRequest(nanoTime);
            String createKey = Utils.createKey(createRequest);
            if (MemoryPolicy.shouldReadFromMemoryCache(this.memoryPolicy) && (quickMemoryCacheCheck = this.picasso.quickMemoryCacheCheck(createKey)) != null) {
                this.picasso.cancelRequest(imageView);
                Picasso picasso = this.picasso;
                Context context = picasso.context;
                Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
                PicassoDrawable.setBitmap(imageView, context, quickMemoryCacheCheck, loadedFrom, this.noFade, picasso.indicatorsEnabled);
                if (this.picasso.loggingEnabled) {
                    Utils.log("Main", "completed", createRequest.plainId(), "from " + loadedFrom);
                }
                if (callback != null) {
                    callback.onSuccess();
                    return;
                }
                return;
            }
            if (this.setPlaceholder) {
                PicassoDrawable.setPlaceholder(imageView, getPlaceholderDrawable());
            }
            this.picasso.enqueueAndSubmit(new ImageViewAction(this.picasso, imageView, createRequest, this.memoryPolicy, this.networkPolicy, this.errorResId, this.errorDrawable, createKey, this.tag, callback, this.noFade));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }
}
