package com.squareup.picasso;

import Tf.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AssetRequestHandler extends RequestHandler {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    public AssetRequestHandler(Context context) {
        this.context = context;
    }

    public static String getFilePath(Request request) {
        return request.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        if (!CTVariableUtils.FILE.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !ANDROID_ASSET.equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i4) throws IOException {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                try {
                    if (this.assetManager == null) {
                        this.assetManager = this.context.getAssets();
                    }
                } finally {
                }
            }
        }
        return new RequestHandler.Result(b.juliet(this.assetManager.open(getFilePath(request))), Picasso.LoadedFrom.DISK);
    }
}
