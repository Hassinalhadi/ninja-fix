package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.widget.P0;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class a extends b {
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ContentResolver contentResolver, Uri uri, int i4) {
        super(1, uri, contentResolver);
        this.teal = i4;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        switch (this.teal) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void foxtrot(Object obj) {
        switch (this.teal) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((ParcelFileDescriptor) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object golf(ContentResolver contentResolver, Uri uri) {
        switch (this.teal) {
            case 0:
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    return openAssetFileDescriptor;
                }
                throw new FileNotFoundException(P0.beige(uri, "FileDescriptor is null for: "));
            default:
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor2 != null) {
                    return openAssetFileDescriptor2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(P0.beige(uri, "FileDescriptor is null for: "));
        }
    }
}
