package com.squareup.picasso;

import M1.g;
import Tf.b;
import android.content.Context;
import android.net.Uri;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FileRequestHandler extends ContentStreamRequestHandler {
    public FileRequestHandler(Context context) {
        super(context);
    }

    public static int getFileExifRotation(Uri uri) throws IOException {
        return new g(uri.getPath()).charlie(1, "Orientation");
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        return CTVariableUtils.FILE.equals(request.uri.getScheme());
    }

    @Override // com.squareup.picasso.ContentStreamRequestHandler, com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i4) throws IOException {
        return new RequestHandler.Result(null, b.juliet(getInputStream(request)), Picasso.LoadedFrom.DISK, getFileExifRotation(request.uri));
    }
}
