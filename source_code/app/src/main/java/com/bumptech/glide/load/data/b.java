package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b implements e {
    public final /* synthetic */ int alpha;
    public Object purple;
    public final Comparable red;
    public final Object silver;

    public /* synthetic */ b(int i4, Comparable comparable, Object obj) {
        this.alpha = i4;
        this.silver = obj;
        this.red = comparable;
    }

    private final void bravo() {
    }

    private final void echo() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i4 = this.alpha;
    }

    @Override // com.bumptech.glide.load.data.e
    public final E3.a charlie() {
        switch (this.alpha) {
            case 0:
                return E3.a.alpha;
            default:
                return E3.a.alpha;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cleanup() {
        switch (this.alpha) {
            case 0:
                Object obj = this.purple;
                if (obj != null) {
                    try {
                        foxtrot(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.purple;
                if (obj2 != null) {
                    try {
                        foxtrot(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void delta(com.bumptech.glide.g gVar, d dVar) {
        switch (this.alpha) {
            case 0:
                try {
                    Object hotel = hotel((AssetManager) this.silver, (String) this.red);
                    this.purple = hotel;
                    dVar.echo(hotel);
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    dVar.bravo(e);
                    return;
                }
            default:
                try {
                    Object golf = golf((ContentResolver) this.silver, (Uri) this.red);
                    this.purple = golf;
                    dVar.echo(golf);
                    return;
                } catch (FileNotFoundException e4) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e4);
                    }
                    dVar.bravo(e4);
                    return;
                }
        }
    }

    public abstract void foxtrot(Object obj);

    public abstract Object golf(ContentResolver contentResolver, Uri uri);

    public abstract Object hotel(AssetManager assetManager, String str);
}
