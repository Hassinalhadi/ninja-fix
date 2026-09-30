package org.jetbrains.compose.resources;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lorg/jetbrains/compose/resources/AndroidContextProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AndroidContextProvider extends ContentProvider {
    public static Context alpha;

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Intrinsics.echo(context, "context");
        if (providerInfo != null) {
            if (!Intrinsics.areEqual("org.jetbrains.compose.components.resources.resources.AndroidContextProvider", providerInfo.authority)) {
                super.attachInfo(context, providerInfo);
                return;
            }
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable your application's build.gradle.");
        }
        throw new NullPointerException("AndroidContextProvider ProviderInfo cannot be null.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.echo(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        Intrinsics.echo(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        Intrinsics.echo(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        alpha = getContext();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.echo(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.echo(uri, "uri");
        return 0;
    }
}
