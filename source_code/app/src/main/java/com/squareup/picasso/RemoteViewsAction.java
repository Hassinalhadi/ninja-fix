package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class RemoteViewsAction extends Action<RemoteViewsTarget> {
    Callback callback;
    final RemoteViews remoteViews;
    private RemoteViewsTarget target;
    final int viewId;

    /* loaded from: classes2.dex */
    public static class AppWidgetAction extends RemoteViewsAction {
        private final int[] appWidgetIds;

        public AppWidgetAction(Picasso picasso, Request request, RemoteViews remoteViews, int i4, int[] iArr, int i5, int i10, String str, Object obj, int i11, Callback callback) {
            super(picasso, request, remoteViews, i4, i11, i5, i10, obj, str, callback);
            this.appWidgetIds = iArr;
        }

        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        public /* bridge */ /* synthetic */ RemoteViewsTarget getTarget() {
            return super.getTarget();
        }

        @Override // com.squareup.picasso.RemoteViewsAction
        public void update() {
            AppWidgetManager.getInstance(this.picasso.context).updateAppWidget(this.appWidgetIds, this.remoteViews);
        }
    }

    /* loaded from: classes2.dex */
    public static class NotificationAction extends RemoteViewsAction {
        private final Notification notification;
        private final int notificationId;
        private final String notificationTag;

        public NotificationAction(Picasso picasso, Request request, RemoteViews remoteViews, int i4, int i5, Notification notification, String str, int i10, int i11, String str2, Object obj, int i12, Callback callback) {
            super(picasso, request, remoteViews, i4, i12, i10, i11, obj, str2, callback);
            this.notificationId = i5;
            this.notificationTag = str;
            this.notification = notification;
        }

        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        public /* bridge */ /* synthetic */ RemoteViewsTarget getTarget() {
            return super.getTarget();
        }

        @Override // com.squareup.picasso.RemoteViewsAction
        public void update() {
            ((NotificationManager) Utils.getService(this.picasso.context, "notification")).notify(this.notificationTag, this.notificationId, this.notification);
        }
    }

    /* loaded from: classes2.dex */
    public static class RemoteViewsTarget {
        final RemoteViews remoteViews;
        final int viewId;

        public RemoteViewsTarget(RemoteViews remoteViews, int i4) {
            this.remoteViews = remoteViews;
            this.viewId = i4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                RemoteViewsTarget remoteViewsTarget = (RemoteViewsTarget) obj;
                if (this.viewId == remoteViewsTarget.viewId && this.remoteViews.equals(remoteViewsTarget.remoteViews)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.remoteViews.hashCode() * 31) + this.viewId;
        }
    }

    public RemoteViewsAction(Picasso picasso, Request request, RemoteViews remoteViews, int i4, int i5, int i10, int i11, Object obj, String str, Callback callback) {
        super(picasso, null, request, i10, i11, i5, null, str, obj, false);
        this.remoteViews = remoteViews;
        this.viewId = i4;
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    public void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
        Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
        int i4 = this.errorResId;
        if (i4 != 0) {
            setImageResource(i4);
        }
        Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    public void setImageResource(int i4) {
        this.remoteViews.setImageViewResource(this.viewId, i4);
        update();
    }

    public abstract void update();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.picasso.Action
    public RemoteViewsTarget getTarget() {
        if (this.target == null) {
            this.target = new RemoteViewsTarget(this.remoteViews, this.viewId);
        }
        return this.target;
    }
}
