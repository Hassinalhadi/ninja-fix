package R2;

import Jb.C0201i;
import O2.q;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.webkit.MimeTypeMap;
import androidx.appcompat.widget.P0;
import androidx.vectordrawable.graphics.drawable.p;
import ao.ad;
import com.clevertap.android.sdk.Constants;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.xmlpull.v1.XmlPullParserException;
import t6.AbstractC2977c3;
import t6.AbstractC3001h2;
import t6.AbstractC3032n3;

/* loaded from: classes3.dex */
public final class b implements g {
    public final /* synthetic */ int alpha;
    public final Uri bravo;
    public final X2.k charlie;

    public /* synthetic */ b(Uri uri, X2.k kVar, int i4) {
        this.alpha = i4;
        this.bravo = uri;
        this.charlie = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0238  */
    /* JADX WARN: Type inference failed for: r1v12, types: [s6.F6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [s6.F6, java.lang.Object] */
    @Override // R2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Nd.c cVar) {
        List<String> pathSegments;
        int size;
        Y2.a aVar;
        Bundle bundle;
        AssetFileDescriptor openTypedAssetFile;
        Y2.a aVar2;
        Integer tango;
        Resources resourcesForApplication;
        Drawable drawable;
        Drawable eVar;
        boolean z2 = true;
        InputStream inputStream = null;
        String str = null;
        inputStream = null;
        X2.k kVar = this.charlie;
        Uri uri = this.bravo;
        int i4 = 2;
        switch (this.alpha) {
            case 0:
                String maroon = CollectionsKt.maroon(CollectionsKt.crimson(uri.getPathSegments()), "/", null, null, null, 62);
                return new m(new q(Tf.b.charlie(Tf.b.juliet(kVar.alpha.getAssets().open(maroon))), new C0201i(kVar.alpha, i4), new Object()), a3.h.bravo(MimeTypeMap.getSingleton(), maroon), O2.f.red);
            case 1:
                ContentResolver contentResolver = kVar.alpha.getContentResolver();
                if (Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (openAssetFileDescriptor != null) {
                        inputStream = openAssetFileDescriptor.createInputStream();
                    }
                    if (inputStream == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.areEqual(uri.getAuthority(), Constants.KEY_MEDIA) && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.areEqual(pathSegments.get(size - 3), "audio") && Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
                    Y2.h hVar = kVar.delta;
                    AbstractC3001h2 abstractC3001h2 = hVar.alpha;
                    if (abstractC3001h2 instanceof Y2.a) {
                        aVar = (Y2.a) abstractC3001h2;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        AbstractC3001h2 abstractC3001h22 = hVar.bravo;
                        if (abstractC3001h22 instanceof Y2.a) {
                            aVar2 = (Y2.a) abstractC3001h22;
                        } else {
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(aVar.alpha, aVar2.alpha));
                            openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                            if (openTypedAssetFile != null) {
                                inputStream = openTypedAssetFile.createInputStream();
                            }
                            if (inputStream == null) {
                                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                            }
                        }
                    }
                    bundle = null;
                    openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    if (openTypedAssetFile != null) {
                    }
                    if (inputStream == null) {
                    }
                } else {
                    inputStream = contentResolver.openInputStream(uri);
                    if (inputStream == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new m(new q(Tf.b.charlie(Tf.b.juliet(inputStream)), new C0201i(kVar.alpha, i4), new Object()), contentResolver.getType(uri), O2.f.red);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    if (!StringsKt.gray(authority)) {
                        str = authority;
                    }
                    if (str != null) {
                        String str2 = (String) CollectionsKt.olive(uri.getPathSegments());
                        if (str2 != null && (tango = r.tango(str2)) != null) {
                            int intValue = tango.intValue();
                            Context context = kVar.alpha;
                            if (Intrinsics.areEqual(str, context.getPackageName())) {
                                resourcesForApplication = context.getResources();
                            } else {
                                resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
                            }
                            TypedValue typedValue = new TypedValue();
                            resourcesForApplication.getValue(intValue, typedValue, true);
                            CharSequence charSequence = typedValue.string;
                            String bravo = a3.h.bravo(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.ivory(charSequence, '/', 0, 6), charSequence.length()).toString());
                            if (Intrinsics.areEqual(bravo, "text/xml")) {
                                if (Intrinsics.areEqual(str, context.getPackageName())) {
                                    drawable = AbstractC3032n3.echo(intValue, context);
                                    if (drawable == null) {
                                        throw new IllegalStateException(ad.zulu(intValue, "Invalid resource ID: ").toString());
                                    }
                                } else {
                                    XmlResourceParser xml = resourcesForApplication.getXml(intValue);
                                    int next = xml.next();
                                    while (next != 2 && next != 1) {
                                        next = xml.next();
                                    }
                                    if (next == 2) {
                                        if (Build.VERSION.SDK_INT < 24) {
                                            String name = xml.getName();
                                            if (Intrinsics.areEqual(name, "vector")) {
                                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                                Resources.Theme theme = context.getTheme();
                                                eVar = new p();
                                                eVar.inflate(resourcesForApplication, xml, asAttributeSet, theme);
                                            } else if (Intrinsics.areEqual(name, "animated-vector")) {
                                                AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml);
                                                Resources.Theme theme2 = context.getTheme();
                                                eVar = new androidx.vectordrawable.graphics.drawable.e(context);
                                                eVar.inflate(resourcesForApplication, xml, asAttributeSet2, theme2);
                                            }
                                            drawable = eVar;
                                        }
                                        Resources.Theme theme3 = context.getTheme();
                                        ThreadLocal threadLocal = i1.k.alpha;
                                        drawable = resourcesForApplication.getDrawable(intValue, theme3);
                                        if (drawable == null) {
                                            throw new IllegalStateException(ad.zulu(intValue, "Invalid resource ID: ").toString());
                                        }
                                    } else {
                                        throw new XmlPullParserException("No start tag found.");
                                    }
                                }
                                if (!(drawable instanceof VectorDrawable) && !(drawable instanceof p)) {
                                    z2 = false;
                                }
                                if (z2) {
                                    drawable = new BitmapDrawable(context.getResources(), AbstractC2977c3.bravo(drawable, kVar.bravo, kVar.delta, kVar.echo, kVar.foxtrot));
                                }
                                return new d(drawable, z2, O2.f.red);
                            }
                            TypedValue typedValue2 = new TypedValue();
                            return new m(new q(Tf.b.charlie(Tf.b.juliet(resourcesForApplication.openRawResource(intValue, typedValue2))), new C0201i(context, i4), new O2.p(typedValue2.density)), bravo, O2.f.red);
                        }
                        throw new IllegalStateException(P0.beige(uri, "Invalid android.resource URI: "));
                    }
                }
                throw new IllegalStateException(P0.beige(uri, "Invalid android.resource URI: "));
        }
    }
}
