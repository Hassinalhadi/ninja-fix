package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class j extends b {
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AssetManager assetManager, String str, int i4) {
        super(0, str, assetManager);
        this.teal = i4;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        switch (this.teal) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void foxtrot(Object obj) {
        switch (this.teal) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object hotel(AssetManager assetManager, String str) {
        switch (this.teal) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
